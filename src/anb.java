import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class anb {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ey.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ey.a("from", gu.a())
                                 .executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "from"), gu.a($$0x, "from"), true)))
                              .then(ey.a("to", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "from"), gu.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ey.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ey.a("from", gu.a())
                                 .executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "from"), gu.a($$0x, "from"), false)))
                              .then(ey.a("to", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "from"), gu.a($$0x, "to"), false)))
                        ))
                     .then(ey.a("all").executes($$0x -> b((ex)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ey.a("query").executes($$0x -> a((ex)$$0x.getSource())))
                  .then(ey.a("pos", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ex $$0, aqo $$1) throws CommandSyntaxException {
      dgg $$2 = $$1.a();
      ard $$3 = $$0.e();
      akt<dgz> $$4 = $$3.aj();
      boolean $$5 = $$3.y().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wp.a("commands.forceload.query.success", wp.a($$2), wp.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ex $$0) {
      ard $$1 = $$0.e();
      akt<dgz> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dgg::new).map(dgg::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wp.a("commands.forceload.list.single", wp.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wp.a("commands.forceload.list.multiple", $$4, wp.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wp.a("commands.forceload.added.none", wp.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ex $$0) {
      ard $$1 = $$0.e();
      akt<dgz> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      $$3.forEach($$1x -> $$1.a(dgg.a($$1x), dgg.b($$1x), false));
      $$0.a(() -> wp.a("commands.forceload.removed.all", wp.a($$2.a())), true);
      return 0;
   }

   private static int a(ex $$0, aqo $$1, aqo $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kk.a($$4);
         int $$9 = kk.a($$5);
         int $$10 = kk.a($$6);
         int $$11 = kk.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            ard $$13 = $$0.e();
            akt<dgz> $$14 = $$13.aj();
            dgg $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dgg($$17, $$18);
                     }
                  }
               }
            }

            dgg $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> wp.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wp.a($$20), wp.a($$14.a())), true);
               } else {
                  dgg $$22 = new dgg($$8, $$9);
                  dgg $$23 = new dgg($$10, $$11);
                  $$0.a(() -> wp.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, wp.a($$14.a()), wp.a($$22), wp.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gt.b.create();
      }
   }
}
