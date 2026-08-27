import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class alx {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wg.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wg.c("commands.forceload.removed.failure"));

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

   private static int a(du $$0, api $$1) throws CommandSyntaxException {
      cye $$2 = $$1.a();
      aps $$3 = $$0.e();
      ajs<cyx> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wg.a("commands.forceload.query.success", wg.a($$2), wg.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(du $$0) {
      aps $$1 = $$0.e();
      ajs<cyx> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cye::new).map(cye::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wg.a("commands.forceload.list.single", wg.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wg.a("commands.forceload.list.multiple", $$4, wg.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wg.a("commands.forceload.added.none", wg.a($$2.a())));
      }

      return $$4;
   }

   private static int b(du $$0) {
      aps $$1 = $$0.e();
      ajs<cyx> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(cye.a($$1x), cye.b($$1x), false));
      $$0.a(() -> wg.a("commands.forceload.removed.all", wg.a($$2.a())), true);
      return 0;
   }

   private static int a(du $$0, api $$1, api $$2, boolean $$3) throws CommandSyntaxException {
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
            aps $$13 = $$0.e();
            ajs<cyx> $$14 = $$13.ae();
            cye $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cye($$17, $$18);
                     }
                  }
               }
            }

            cye $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> wg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wg.a($$20), wg.a($$14.a())), true);
               } else {
                  cye $$21 = new cye($$8, $$9);
                  cye $$22 = new cye($$10, $$11);
                  $$0.a(() -> wg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", wg.a($$20), wg.a($$14.a()), wg.a($$21), wg.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fo.b.create();
      }
   }
}
