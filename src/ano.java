import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ano {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ew.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ew.a("from", gs.a())
                                 .executes($$0x -> a((ev)$$0x.getSource(), gs.a($$0x, "from"), gs.a($$0x, "from"), true)))
                              .then(ew.a("to", gs.a()).executes($$0x -> a((ev)$$0x.getSource(), gs.a($$0x, "from"), gs.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ew.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ew.a("from", gs.a())
                                 .executes($$0x -> a((ev)$$0x.getSource(), gs.a($$0x, "from"), gs.a($$0x, "from"), false)))
                              .then(ew.a("to", gs.a()).executes($$0x -> a((ev)$$0x.getSource(), gs.a($$0x, "from"), gs.a($$0x, "to"), false)))
                        ))
                     .then(ew.a("all").executes($$0x -> b((ev)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ew.a("query").executes($$0x -> a((ev)$$0x.getSource())))
                  .then(ew.a("pos", gs.a()).executes($$0x -> a((ev)$$0x.getSource(), gs.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ev $$0, aqz $$1) throws CommandSyntaxException {
      deb $$2 = $$1.a();
      arm $$3 = $$0.e();
      alg<dev> $$4 = $$3.ag();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xh.a("commands.forceload.query.success", xh.a($$2), xh.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ev $$0) {
      arm $$1 = $$0.e();
      alg<dev> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(deb::new).map(deb::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xh.a("commands.forceload.list.single", xh.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xh.a("commands.forceload.list.multiple", $$4, xh.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xh.a("commands.forceload.added.none", xh.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ev $$0) {
      arm $$1 = $$0.e();
      alg<dev> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(deb.a($$1x), deb.b($$1x), false));
      $$0.a(() -> xh.a("commands.forceload.removed.all", xh.a($$2.a())), true);
      return 0;
   }

   private static int a(ev $$0, aqz $$1, aqz $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = ki.a($$4);
         int $$9 = ki.a($$5);
         int $$10 = ki.a($$6);
         int $$11 = ki.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            arm $$13 = $$0.e();
            alg<dev> $$14 = $$13.ag();
            deb $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new deb($$17, $$18);
                     }
                  }
               }
            }

            deb $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xh.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xh.a($$20), xh.a($$14.a())), true);
               } else {
                  deb $$22 = new deb($$8, $$9);
                  deb $$23 = new deb($$10, $$11);
                  $$0.a(() -> xh.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xh.a($$14.a()), xh.a($$22), xh.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gr.b.create();
      }
   }
}
