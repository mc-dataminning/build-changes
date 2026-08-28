import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class anp {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xa.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ek.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ek.a("from", gh.a())
                                 .executes($$0x -> a((ej)$$0x.getSource(), gh.a($$0x, "from"), gh.a($$0x, "from"), true)))
                              .then(ek.a("to", gh.a()).executes($$0x -> a((ej)$$0x.getSource(), gh.a($$0x, "from"), gh.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ek.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ek.a("from", gh.a())
                                 .executes($$0x -> a((ej)$$0x.getSource(), gh.a($$0x, "from"), gh.a($$0x, "from"), false)))
                              .then(ek.a("to", gh.a()).executes($$0x -> a((ej)$$0x.getSource(), gh.a($$0x, "from"), gh.a($$0x, "to"), false)))
                        ))
                     .then(ek.a("all").executes($$0x -> b((ej)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ek.a("query").executes($$0x -> a((ej)$$0x.getSource())))
                  .then(ek.a("pos", gh.a()).executes($$0x -> a((ej)$$0x.getSource(), gh.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ej $$0, ard $$1) throws CommandSyntaxException {
      djc $$2 = $$1.a();
      ars $$3 = $$0.e();
      alh<djx> $$4 = $$3.aj();
      boolean $$5 = $$3.y().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xa.a("commands.forceload.query.success", xa.a($$2), xa.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ej $$0) {
      ars $$1 = $$0.e();
      alh<djx> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(djc::new).map(djc::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xa.a("commands.forceload.list.single", xa.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xa.a("commands.forceload.list.multiple", $$4, xa.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xa.a("commands.forceload.added.none", xa.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ej $$0) {
      ars $$1 = $$0.e();
      alh<djx> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      $$3.forEach($$1x -> $$1.a(djc.a($$1x), djc.b($$1x), false));
      $$0.a(() -> xa.a("commands.forceload.removed.all", xa.a($$2.a())), true);
      return 0;
   }

   private static int a(ej $$0, ard $$1, ard $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jy.a($$4);
         int $$9 = jy.a($$5);
         int $$10 = jy.a($$6);
         int $$11 = jy.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            ars $$13 = $$0.e();
            alh<djx> $$14 = $$13.aj();
            djc $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new djc($$17, $$18);
                     }
                  }
               }
            }

            djc $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xa.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xa.a($$20), xa.a($$14.a())), true);
               } else {
                  djc $$22 = new djc($$8, $$9);
                  djc $$23 = new djc($$10, $$11);
                  $$0.a(() -> xa.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xa.a($$14.a()), xa.a($$22), xa.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gg.b.create();
      }
   }
}
