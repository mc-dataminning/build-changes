import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ank {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     eq.a("add")
                        .then(
                           ((RequiredArgumentBuilder)eq.a("from", gm.a())
                                 .executes($$0x -> a((ep)$$0x.getSource(), gm.a($$0x, "from"), gm.a($$0x, "from"), true)))
                              .then(eq.a("to", gm.a()).executes($$0x -> a((ep)$$0x.getSource(), gm.a($$0x, "from"), gm.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)eq.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)eq.a("from", gm.a())
                                 .executes($$0x -> a((ep)$$0x.getSource(), gm.a($$0x, "from"), gm.a($$0x, "from"), false)))
                              .then(eq.a("to", gm.a()).executes($$0x -> a((ep)$$0x.getSource(), gm.a($$0x, "from"), gm.a($$0x, "to"), false)))
                        ))
                     .then(eq.a("all").executes($$0x -> b((ep)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)eq.a("query").executes($$0x -> a((ep)$$0x.getSource())))
                  .then(eq.a("pos", gm.a()).executes($$0x -> a((ep)$$0x.getSource(), gm.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ep $$0, aqv $$1) throws CommandSyntaxException {
      dbh $$2 = $$1.a();
      arf $$3 = $$0.e();
      ale<dca> $$4 = $$3.af();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xp.a("commands.forceload.query.success", xp.a($$2), xp.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ep $$0) {
      arf $$1 = $$0.e();
      ale<dca> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dbh::new).map(dbh::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xp.a("commands.forceload.list.single", xp.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xp.a("commands.forceload.list.multiple", $$4, xp.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xp.a("commands.forceload.added.none", xp.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ep $$0) {
      arf $$1 = $$0.e();
      ale<dca> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(dbh.a($$1x), dbh.b($$1x), false));
      $$0.a(() -> xp.a("commands.forceload.removed.all", xp.a($$2.a())), true);
      return 0;
   }

   private static int a(ep $$0, aqv $$1, aqv $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kb.a($$4);
         int $$9 = kb.a($$5);
         int $$10 = kb.a($$6);
         int $$11 = kb.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            arf $$13 = $$0.e();
            ale<dca> $$14 = $$13.af();
            dbh $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dbh($$17, $$18);
                     }
                  }
               }
            }

            dbh $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xp.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xp.a($$20), xp.a($$14.a())), true);
               } else {
                  dbh $$22 = new dbh($$8, $$9);
                  dbh $$23 = new dbh($$10, $$11);
                  $$0.a(() -> xp.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xp.a($$14.a()), xp.a($$22), xp.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gl.b.create();
      }
   }
}
