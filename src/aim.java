import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class aim {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ur.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ur.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("add")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("from", fn.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "from"), true)))
                              .then(dv.a("to", fn.a()).executes($$0x -> a((du)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)dv.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("from", fn.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "from"), false)))
                              .then(dv.a("to", fn.a()).executes($$0x -> a((du)$$0x.getSource(), fn.a($$0x, "from"), fn.a($$0x, "to"), false)))
                        ))
                     .then(dv.a("all").executes($$0x -> b((du)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)dv.a("query").executes($$0x -> a((du)$$0x.getSource())))
                  .then(dv.a("pos", fn.a()).executes($$0x -> a((du)$$0x.getSource(), fn.a($$0x, "pos"))))
            )
      );
   }

   private static int a(du $$0, alu $$1) throws CommandSyntaxException {
      crh $$2 = $$1.a();
      ame $$3 = $$0.f();
      agh<csa> $$4 = $$3.ad();
      boolean $$5 = $$3.v().contains($$2.a());
      if ($$5) {
         $$0.a(() -> ur.a("commands.forceload.query.success", ur.a($$2), ur.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(du $$0) {
      ame $$1 = $$0.f();
      agh<csa> $$2 = $$1.ad();
      LongSet $$3 = $$1.v();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(crh::new).map(crh::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> ur.a("commands.forceload.list.single", ur.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> ur.a("commands.forceload.list.multiple", $$4, ur.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(ur.a("commands.forceload.added.none", ur.a($$2.a())));
      }

      return $$4;
   }

   private static int b(du $$0) {
      ame $$1 = $$0.f();
      agh<csa> $$2 = $$1.ad();
      LongSet $$3 = $$1.v();
      $$3.forEach($$1x -> $$1.a(crh.a($$1x), crh.b($$1x), false));
      $$0.a(() -> ur.a("commands.forceload.removed.all", ur.a($$2.a())), true);
      return 0;
   }

   private static int a(du $$0, alu $$1, alu $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = iu.a($$4);
         int $$9 = iu.a($$5);
         int $$10 = iu.a($$6);
         int $$11 = iu.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            ame $$13 = $$0.f();
            agh<csa> $$14 = $$13.ad();
            crh $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new crh($$17, $$18);
                     }
                  }
               }
            }

            crh $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> ur.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", ur.a($$20), ur.a($$14.a())), true);
               } else {
                  crh $$21 = new crh($$8, $$9);
                  crh $$22 = new crh($$10, $$11);
                  $$0.a(() -> ur.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", ur.a($$20), ur.a($$14.a()), ur.a($$21), ur.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fm.b.create();
      }
   }
}
