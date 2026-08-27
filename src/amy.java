import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class amy {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ei.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ei.a("from", ge.a())
                                 .executes($$0x -> a((eh)$$0x.getSource(), ge.a($$0x, "from"), ge.a($$0x, "from"), true)))
                              .then(ei.a("to", ge.a()).executes($$0x -> a((eh)$$0x.getSource(), ge.a($$0x, "from"), ge.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ei.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ei.a("from", ge.a())
                                 .executes($$0x -> a((eh)$$0x.getSource(), ge.a($$0x, "from"), ge.a($$0x, "from"), false)))
                              .then(ei.a("to", ge.a()).executes($$0x -> a((eh)$$0x.getSource(), ge.a($$0x, "from"), ge.a($$0x, "to"), false)))
                        ))
                     .then(ei.a("all").executes($$0x -> b((eh)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ei.a("query").executes($$0x -> a((eh)$$0x.getSource())))
                  .then(ei.a("pos", ge.a()).executes($$0x -> a((eh)$$0x.getSource(), ge.a($$0x, "pos"))))
            )
      );
   }

   private static int a(eh $$0, aqj $$1) throws CommandSyntaxException {
      dbh $$2 = $$1.a();
      aqt $$3 = $$0.e();
      aks<dca> $$4 = $$3.af();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xe.a("commands.forceload.query.success", xe.a($$2), xe.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(eh $$0) {
      aqt $$1 = $$0.e();
      aks<dca> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dbh::new).map(dbh::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xe.a("commands.forceload.list.single", xe.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xe.a("commands.forceload.list.multiple", $$4, xe.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xe.a("commands.forceload.added.none", xe.a($$2.a())));
      }

      return $$4;
   }

   private static int b(eh $$0) {
      aqt $$1 = $$0.e();
      aks<dca> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(dbh.a($$1x), dbh.b($$1x), false));
      $$0.a(() -> xe.a("commands.forceload.removed.all", xe.a($$2.a())), true);
      return 0;
   }

   private static int a(eh $$0, aqj $$1, aqj $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jt.a($$4);
         int $$9 = jt.a($$5);
         int $$10 = jt.a($$6);
         int $$11 = jt.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqt $$13 = $$0.e();
            aks<dca> $$14 = $$13.af();
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
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> xe.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xe.a($$20), xe.a($$14.a())), true);
               } else {
                  dbh $$21 = new dbh($$8, $$9);
                  dbh $$22 = new dbh($$10, $$11);
                  $$0.a(() -> xe.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", xe.a($$20), xe.a($$14.a()), xe.a($$21), xe.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw gd.b.create();
      }
   }
}
