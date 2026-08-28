import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class amp {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     er.a("add")
                        .then(
                           ((RequiredArgumentBuilder)er.a("from", gn.a())
                                 .executes($$0x -> a((eq)$$0x.getSource(), gn.a($$0x, "from"), gn.a($$0x, "from"), true)))
                              .then(er.a("to", gn.a()).executes($$0x -> a((eq)$$0x.getSource(), gn.a($$0x, "from"), gn.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)er.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)er.a("from", gn.a())
                                 .executes($$0x -> a((eq)$$0x.getSource(), gn.a($$0x, "from"), gn.a($$0x, "from"), false)))
                              .then(er.a("to", gn.a()).executes($$0x -> a((eq)$$0x.getSource(), gn.a($$0x, "from"), gn.a($$0x, "to"), false)))
                        ))
                     .then(er.a("all").executes($$0x -> b((eq)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)er.a("query").executes($$0x -> a((eq)$$0x.getSource())))
                  .then(er.a("pos", gn.a()).executes($$0x -> a((eq)$$0x.getSource(), gn.a($$0x, "pos"))))
            )
      );
   }

   private static int a(eq $$0, aqa $$1) throws CommandSyntaxException {
      dbm $$2 = $$1.a();
      aqm $$3 = $$0.e();
      akj<dcf> $$4 = $$3.af();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wu.a("commands.forceload.query.success", wu.a($$2), wu.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(eq $$0) {
      aqm $$1 = $$0.e();
      akj<dcf> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dbm::new).map(dbm::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wu.a("commands.forceload.list.single", wu.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wu.a("commands.forceload.list.multiple", $$4, wu.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wu.a("commands.forceload.added.none", wu.a($$2.a())));
      }

      return $$4;
   }

   private static int b(eq $$0) {
      aqm $$1 = $$0.e();
      akj<dcf> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(dbm.a($$1x), dbm.b($$1x), false));
      $$0.a(() -> wu.a("commands.forceload.removed.all", wu.a($$2.a())), true);
      return 0;
   }

   private static int a(eq $$0, aqa $$1, aqa $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kc.a($$4);
         int $$9 = kc.a($$5);
         int $$10 = kc.a($$6);
         int $$11 = kc.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqm $$13 = $$0.e();
            akj<dcf> $$14 = $$13.af();
            dbm $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dbm($$17, $$18);
                     }
                  }
               }
            }

            dbm $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> wu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wu.a($$20), wu.a($$14.a())), true);
               } else {
                  dbm $$22 = new dbm($$8, $$9);
                  dbm $$23 = new dbm($$10, $$11);
                  $$0.a(() -> wu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, wu.a($$14.a()), wu.a($$22), wu.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gm.b.create();
      }
   }
}
