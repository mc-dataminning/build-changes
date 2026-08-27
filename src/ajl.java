import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ajl {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vg.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vg.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("add")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("from", fn.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "from"), true)))
                              .then(dt.a("to", fn.a()).executes($$0x -> a((ds)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)dt.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("from", fn.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "from"), false)))
                              .then(dt.a("to", fn.a()).executes($$0x -> a((ds)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "to"), false)))
                        ))
                     .then(dt.a("all").executes($$0x -> b((ds)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)dt.a("query").executes($$0x -> a((ds)$$0x.getSource())))
                  .then(dt.a("pos", fn.a()).executes($$0x -> a((ds)$$0x.getSource(), fn.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ds $$0, amu $$1) throws CommandSyntaxException {
      cte $$2 = $$1.a();
      ane $$3 = $$0.e();
      ahg<ctx> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> vg.a("commands.forceload.query.success", vg.a($$2), vg.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ds $$0) {
      ane $$1 = $$0.e();
      ahg<ctx> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cte::new).map(cte::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> vg.a("commands.forceload.list.single", vg.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> vg.a("commands.forceload.list.multiple", $$4, vg.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(vg.a("commands.forceload.added.none", vg.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ds $$0) {
      ane $$1 = $$0.e();
      ahg<ctx> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(cte.a($$1x), cte.b($$1x), false));
      $$0.a(() -> vg.a("commands.forceload.removed.all", vg.a($$2.a())), true);
      return 0;
   }

   private static int a(ds $$0, amu $$1, amu $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = iz.a($$4);
         int $$9 = iz.a($$5);
         int $$10 = iz.a($$6);
         int $$11 = iz.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            ane $$13 = $$0.e();
            ahg<ctx> $$14 = $$13.ae();
            cte $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cte($$17, $$18);
                     }
                  }
               }
            }

            cte $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> vg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", vg.a($$20), vg.a($$14.a())), true);
               } else {
                  cte $$21 = new cte($$8, $$9);
                  cte $$22 = new cte($$10, $$11);
                  $$0.a(() -> vg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", vg.a($$20), vg.a($$14.a()), vg.a($$21), vg.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fm.b.create();
      }
   }
}
