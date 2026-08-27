import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class alc {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vq.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vq.c("commands.forceload.removed.failure"));

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

   private static int a(du $$0, aol $$1) throws CommandSyntaxException {
      cuu $$2 = $$1.a();
      aov $$3 = $$0.e();
      aix<cvn> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> vq.a("commands.forceload.query.success", vq.a($$2), vq.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(du $$0) {
      aov $$1 = $$0.e();
      aix<cvn> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cuu::new).map(cuu::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> vq.a("commands.forceload.list.single", vq.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> vq.a("commands.forceload.list.multiple", $$4, vq.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(vq.a("commands.forceload.added.none", vq.a($$2.a())));
      }

      return $$4;
   }

   private static int b(du $$0) {
      aov $$1 = $$0.e();
      aix<cvn> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(cuu.a($$1x), cuu.b($$1x), false));
      $$0.a(() -> vq.a("commands.forceload.removed.all", vq.a($$2.a())), true);
      return 0;
   }

   private static int a(du $$0, aol $$1, aol $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jb.a($$4);
         int $$9 = jb.a($$5);
         int $$10 = jb.a($$6);
         int $$11 = jb.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aov $$13 = $$0.e();
            aix<cvn> $$14 = $$13.ae();
            cuu $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cuu($$17, $$18);
                     }
                  }
               }
            }

            cuu $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> vq.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", vq.a($$20), vq.a($$14.a())), true);
               } else {
                  cuu $$21 = new cuu($$8, $$9);
                  cuu $$22 = new cuu($$10, $$11);
                  $$0.a(() -> vq.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", vq.a($$20), vq.a($$14.a()), vq.a($$21), vq.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fo.b.create();
      }
   }
}
