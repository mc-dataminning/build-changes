import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class amm {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ee.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ee.a("from", ga.a())
                                 .executes($$0x -> a((ed)$$0x.getSource(), ga.a($$0x, "from"), ga.a($$0x, "from"), true)))
                              .then(ee.a("to", ga.a()).executes($$0x -> a((ed)$$0x.getSource(), ga.a($$0x, "from"), ga.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ee.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ee.a("from", ga.a())
                                 .executes($$0x -> a((ed)$$0x.getSource(), ga.a($$0x, "from"), ga.a($$0x, "from"), false)))
                              .then(ee.a("to", ga.a()).executes($$0x -> a((ed)$$0x.getSource(), ga.a($$0x, "from"), ga.a($$0x, "to"), false)))
                        ))
                     .then(ee.a("all").executes($$0x -> b((ed)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ee.a("query").executes($$0x -> a((ed)$$0x.getSource())))
                  .then(ee.a("pos", ga.a()).executes($$0x -> a((ed)$$0x.getSource(), ga.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ed $$0, apx $$1) throws CommandSyntaxException {
      czk $$2 = $$1.a();
      aqh $$3 = $$0.e();
      akg<dad> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wu.a("commands.forceload.query.success", wu.a($$2), wu.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ed $$0) {
      aqh $$1 = $$0.e();
      akg<dad> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(czk::new).map(czk::toString).iterator());
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

   private static int b(ed $$0) {
      aqh $$1 = $$0.e();
      akg<dad> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(czk.a($$1x), czk.b($$1x), false));
      $$0.a(() -> wu.a("commands.forceload.removed.all", wu.a($$2.a())), true);
      return 0;
   }

   private static int a(ed $$0, apx $$1, apx $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jp.a($$4);
         int $$9 = jp.a($$5);
         int $$10 = jp.a($$6);
         int $$11 = jp.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqh $$13 = $$0.e();
            akg<dad> $$14 = $$13.ae();
            czk $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new czk($$17, $$18);
                     }
                  }
               }
            }

            czk $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> wu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wu.a($$20), wu.a($$14.a())), true);
               } else {
                  czk $$21 = new czk($$8, $$9);
                  czk $$22 = new czk($$10, $$11);
                  $$0.a(() -> wu.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", wu.a($$20), wu.a($$14.a()), wu.a($$21), wu.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fz.b.create();
      }
   }
}
