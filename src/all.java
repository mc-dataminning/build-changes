import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class all {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vu.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vu.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("add")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("from", fp.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fp.a($$0x, "from"), fp.a($$0x, "from"), true)))
                              .then(dv.a("to", fp.a()).executes($$0x -> a((du)$$0x.getSource(), fp.a($$0x, "from"), fp.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)dv.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("from", fp.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fp.a($$0x, "from"), fp.a($$0x, "from"), false)))
                              .then(dv.a("to", fp.a()).executes($$0x -> a((du)$$0x.getSource(), fp.a($$0x, "from"), fp.a($$0x, "to"), false)))
                        ))
                     .then(dv.a("all").executes($$0x -> b((du)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)dv.a("query").executes($$0x -> a((du)$$0x.getSource())))
                  .then(dv.a("pos", fp.a()).executes($$0x -> a((du)$$0x.getSource(), fp.a($$0x, "pos"))))
            )
      );
   }

   private static int a(du $$0, aov $$1) throws CommandSyntaxException {
      cwg $$2 = $$1.a();
      apf $$3 = $$0.e();
      ajg<cwz> $$4 = $$3.ad();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> vu.a("commands.forceload.query.success", vu.a($$2), vu.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(du $$0) {
      apf $$1 = $$0.e();
      ajg<cwz> $$2 = $$1.ad();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cwg::new).map(cwg::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> vu.a("commands.forceload.list.single", vu.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> vu.a("commands.forceload.list.multiple", $$4, vu.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(vu.a("commands.forceload.added.none", vu.a($$2.a())));
      }

      return $$4;
   }

   private static int b(du $$0) {
      apf $$1 = $$0.e();
      ajg<cwz> $$2 = $$1.ad();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(cwg.a($$1x), cwg.b($$1x), false));
      $$0.a(() -> vu.a("commands.forceload.removed.all", vu.a($$2.a())), true);
      return 0;
   }

   private static int a(du $$0, aov $$1, aov $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = je.a($$4);
         int $$9 = je.a($$5);
         int $$10 = je.a($$6);
         int $$11 = je.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            apf $$13 = $$0.e();
            ajg<cwz> $$14 = $$13.ad();
            cwg $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cwg($$17, $$18);
                     }
                  }
               }
            }

            cwg $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> vu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", vu.a($$20), vu.a($$14.a())), true);
               } else {
                  cwg $$21 = new cwg($$8, $$9);
                  cwg $$22 = new cwg($$10, $$11);
                  $$0.a(() -> vu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", vu.a($$20), vu.a($$14.a()), vu.a($$21), vu.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fo.b.create();
      }
   }
}
