import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class amw {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     eu.a("add")
                        .then(
                           ((RequiredArgumentBuilder)eu.a("from", gq.a())
                                 .executes($$0x -> a((et)$$0x.getSource(), gq.a($$0x, "from"), gq.a($$0x, "from"), true)))
                              .then(eu.a("to", gq.a()).executes($$0x -> a((et)$$0x.getSource(), gq.a($$0x, "from"), gq.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)eu.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)eu.a("from", gq.a())
                                 .executes($$0x -> a((et)$$0x.getSource(), gq.a($$0x, "from"), gq.a($$0x, "from"), false)))
                              .then(eu.a("to", gq.a()).executes($$0x -> a((et)$$0x.getSource(), gq.a($$0x, "from"), gq.a($$0x, "to"), false)))
                        ))
                     .then(eu.a("all").executes($$0x -> b((et)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)eu.a("query").executes($$0x -> a((et)$$0x.getSource())))
                  .then(eu.a("pos", gq.a()).executes($$0x -> a((et)$$0x.getSource(), gq.a($$0x, "pos"))))
            )
      );
   }

   private static int a(et $$0, aqh $$1) throws CommandSyntaxException {
      dcb $$2 = $$1.a();
      aqt $$3 = $$0.e();
      akp<dcu> $$4 = $$3.af();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wy.a("commands.forceload.query.success", wy.a($$2), wy.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(et $$0) {
      aqt $$1 = $$0.e();
      akp<dcu> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dcb::new).map(dcb::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wy.a("commands.forceload.list.single", wy.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wy.a("commands.forceload.list.multiple", $$4, wy.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wy.a("commands.forceload.added.none", wy.a($$2.a())));
      }

      return $$4;
   }

   private static int b(et $$0) {
      aqt $$1 = $$0.e();
      akp<dcu> $$2 = $$1.af();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(dcb.a($$1x), dcb.b($$1x), false));
      $$0.a(() -> wy.a("commands.forceload.removed.all", wy.a($$2.a())), true);
      return 0;
   }

   private static int a(et $$0, aqh $$1, aqh $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kf.a($$4);
         int $$9 = kf.a($$5);
         int $$10 = kf.a($$6);
         int $$11 = kf.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqt $$13 = $$0.e();
            akp<dcu> $$14 = $$13.af();
            dcb $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dcb($$17, $$18);
                     }
                  }
               }
            }

            dcb $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> wy.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wy.a($$20), wy.a($$14.a())), true);
               } else {
                  dcb $$22 = new dcb($$8, $$9);
                  dcb $$23 = new dcb($$10, $$11);
                  $$0.a(() -> wy.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, wy.a($$14.a()), wy.a($$22), wy.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gp.b.create();
      }
   }
}
