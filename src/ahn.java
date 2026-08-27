import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.List;

public class ahn {
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> {
      ecv $$2 = ((dt)$$0.getSource()).l().aH();
      return dw.a($$2.a(ecx.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tn.a("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tn.a("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)du.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     du.a("fish")
                        .then(
                           du.a("loot_table", es.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("pos", fk.a())
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), cjh.b, $$2)))
                                          .then(
                                             du.a("tool", fw.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          du.a("mainhand")
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bix.a), $$2))
                                       ))
                                    .then(
                                       du.a("offhand")
                                          .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bix.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(du.a("loot").then(du.a("loot_table", es.a()).suggests(a).executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), $$2))))
                  .then(du.a("kill").then(du.a("target", ee.a()).executes($$1xx -> a($$1xx, ee.a($$1xx, "target"), $$2))))
                  .then(
                     du.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("pos", fk.a())
                                       .executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), cjh.b, $$2)))
                                    .then(du.a("tool", fw.a($$1)).executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(du.a("mainhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bix.a), $$2))))
                              .then(du.a("offhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bix.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<dt, T>> T a(T $$0, ahn.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)du.a("replace")
                  .then(
                     du.a("entity")
                        .then(
                           du.a("entities", ee.b())
                              .then(
                                 $$1.construct(du.a("slot", ey.a()), ($$0x, $$1x, $$2) -> a(ee.b($$0x, "entities"), ey.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          du.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ee.b($$0x, "entities"), ey.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  du.a("block")
                     .then(
                        du.a("targetPos", fk.a())
                           .then(
                              $$1.construct(
                                    du.a("slot", ey.a()),
                                    ($$0x, $$1x, $$2) -> a((dt)$$0x.getSource(), fk.a($$0x, "targetPos"), ey.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       du.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (dt)$$0x.getSource(),
                                             fk.a($$0x, "targetPos"),
                                             IntegerArgumentType.getInteger($$0x, "slot"),
                                             IntegerArgumentType.getInteger($$0x, "count"),
                                             $$1x,
                                             $$2
                                          )
                                    )
                                 )
                           )
                     )
               )
         )
         .then(du.a("insert").then($$1.construct(du.a("targetPos", fk.a()), ($$0x, $$1x, $$2) -> a((dt)$$0x.getSource(), fk.a($$0x, "targetPos"), $$1x, $$2))))
         .then(du.a("give").then($$1.construct(du.a("players", ee.d()), ($$0x, $$1x, $$2) -> a(ee.f($$0x, "players"), $$1x, $$2))))
         .then(du.a("spawn").then($$1.construct(du.a("targetPos", fr.a()), ($$0x, $$1x, $$2) -> a((dt)$$0x.getSource(), fr.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bgt a(dt $$0, gw $$1) throws CommandSyntaxException {
      dcx $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bgt)) {
         throw ahh.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgt)$$2;
      }
   }

   private static int a(dt $$0, gw $$1, List<cjh> $$2, ahn.a $$3) throws CommandSyntaxException {
      bgt $$4 = a($$0, $$1);
      List<cjh> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cjh $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bgt $$0, cjh $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cjh $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.b()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.g() - $$4.L();
               int $$6 = Math.min($$1.L(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(dt $$0, gw $$1, int $$2, int $$3, List<cjh> $$4, ahn.a $$5) throws CommandSyntaxException {
      bgt $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cjh> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cjh $$11 = $$9 < $$4.size() ? $$4.get($$9) : cjh.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ahh.b.create($$2);
      }
   }

   private static boolean a(cjh $$0, cjh $$1) {
      return $$0.L() <= $$0.g() && cjh.c($$0, $$1);
   }

   private static int a(Collection<akt> $$0, List<cjh> $$1, ahn.a $$2) throws CommandSyntaxException {
      List<cjh> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cjh $$4 : $$1) {
         for (akt $$5 : $$0) {
            if ($$5.fR().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bis $$0, List<cjh> $$1, int $$2, int $$3, List<cjh> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cjh $$6 = $$5 < $$1.size() ? $$1.get($$5) : cjh.b;
         bka $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bka.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bis> $$0, int $$1, int $$2, List<cjh> $$3, ahn.a $$4) throws CommandSyntaxException {
      List<cjh> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bis $$6 : $$0) {
         if ($$6 instanceof akt $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(dt $$0, ehp $$1, List<cjh> $$2, ahn.a $$3) throws CommandSyntaxException {
      aks $$4 = $$0.e();
      $$2.forEach($$2x -> {
         byp $$3x = new byp($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.t();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(dt $$0, List<cjh> $$1) {
      if ($$1.size() == 1) {
         cjh $$2 = $$1.get(0);
         $$0.a(() -> tn.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> tn.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(dt $$0, List<cjh> $$1, aey $$2) {
      if ($$1.size() == 1) {
         cjh $$3 = $$1.get(0);
         $$0.a(() -> tn.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), $$2), false);
      } else {
         $$0.a(() -> tn.a("commands.drop.success.multiple_with_table", $$1.size(), $$2), false);
      }
   }

   private static cjh a(dt $$0, bix $$1) throws CommandSyntaxException {
      bis $$2 = $$0.g();
      if ($$2 instanceof bji) {
         return ((bji)$$2).c($$1);
      } else {
         throw b.create($$2.N_());
      }
   }

   private static int a(CommandContext<dt> $$0, gw $$1, cjh $$2, ahn.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      aks $$5 = $$4.e();
      dfl $$6 = $$5.a_($$1);
      dcx $$7 = $$5.c_($$1);
      ecy.a $$8 = new ecy.a($$5).a(efd.f, ehp.b($$1)).a(efd.g, $$6).b(efd.h, $$7).b(efd.a, $$4.f()).a(efd.i, $$2);
      List<cjh> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().r()));
   }

   private static int a(CommandContext<dt> $$0, bis $$1, ahn.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bji)) {
         throw c.create($$1.N_());
      } else {
         aey $$3 = ((bji)$$1).ez();
         dt $$4 = (dt)$$0.getSource();
         ecy.a $$5 = new ecy.a($$4.e());
         bis $$6 = $$4.f();
         if ($$6 instanceof cbw $$7) {
            $$5.a(efd.b, $$7);
         }

         $$5.a(efd.c, $$1.dM().o());
         $$5.b(efd.e, $$6);
         $$5.b(efd.d, $$6);
         $$5.a(efd.a, $$1);
         $$5.a(efd.f, $$4.d());
         ecy $$8 = $$5.a(efc.g);
         eda $$9 = $$4.l().aH().getLootTable($$3);
         List<cjh> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<dt> $$0, aey $$1, ahn.b $$2) throws CommandSyntaxException {
      dt $$3 = (dt)$$0.getSource();
      ecy $$4 = new ecy.a($$3.e()).b(efd.a, $$3.f()).a(efd.f, $$3.d()).a(efc.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<dt> $$0, aey $$1, gw $$2, cjh $$3, ahn.b $$4) throws CommandSyntaxException {
      dt $$5 = (dt)$$0.getSource();
      ecy $$6 = new ecy.a($$5.e()).a(efd.f, ehp.b($$2)).a(efd.i, $$3).b(efd.a, $$5.f()).a(efc.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<dt> $$0, aey $$1, ecy $$2, ahn.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      eda $$5 = $$4.l().aH().getLootTable($$1);
      List<cjh> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cjh> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<dt> var1, List<cjh> var2, ahn.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<dt, ?> construct(ArgumentBuilder<dt, ?> var1, ahn.b var2);
   }
}
