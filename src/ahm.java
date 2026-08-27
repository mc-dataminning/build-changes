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

public class ahm {
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> {
      ect $$2 = ((dt)$$0.getSource()).l().aH();
      return dw.a($$2.a(ecv.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.a("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tl.a("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), cjf.b, $$2)))
                                          .then(
                                             du.a("tool", fw.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          du.a("mainhand")
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), biv.a), $$2))
                                       ))
                                    .then(
                                       du.a("offhand")
                                          .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), biv.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), cjf.b, $$2)))
                                    .then(du.a("tool", fw.a($$1)).executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(du.a("mainhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), biv.a), $$2))))
                              .then(du.a("offhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), biv.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<dt, T>> T a(T $$0, ahm.c $$1) {
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

   private static bgr a(dt $$0, gw $$1) throws CommandSyntaxException {
      dcv $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bgr)) {
         throw ahg.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgr)$$2;
      }
   }

   private static int a(dt $$0, gw $$1, List<cjf> $$2, ahm.a $$3) throws CommandSyntaxException {
      bgr $$4 = a($$0, $$1);
      List<cjf> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cjf $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bgr $$0, cjf $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cjf $$4 = $$0.a($$3);
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

   private static int a(dt $$0, gw $$1, int $$2, int $$3, List<cjf> $$4, ahm.a $$5) throws CommandSyntaxException {
      bgr $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cjf> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cjf $$11 = $$9 < $$4.size() ? $$4.get($$9) : cjf.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ahg.b.create($$2);
      }
   }

   private static boolean a(cjf $$0, cjf $$1) {
      return $$0.L() <= $$0.g() && cjf.c($$0, $$1);
   }

   private static int a(Collection<aks> $$0, List<cjf> $$1, ahm.a $$2) throws CommandSyntaxException {
      List<cjf> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cjf $$4 : $$1) {
         for (aks $$5 : $$0) {
            if ($$5.fR().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(biq $$0, List<cjf> $$1, int $$2, int $$3, List<cjf> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cjf $$6 = $$5 < $$1.size() ? $$1.get($$5) : cjf.b;
         bjy $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bjy.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends biq> $$0, int $$1, int $$2, List<cjf> $$3, ahm.a $$4) throws CommandSyntaxException {
      List<cjf> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (biq $$6 : $$0) {
         if ($$6 instanceof aks $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(dt $$0, ehn $$1, List<cjf> $$2, ahm.a $$3) throws CommandSyntaxException {
      akr $$4 = $$0.e();
      $$2.forEach($$2x -> {
         byn $$3x = new byn($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.t();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(dt $$0, List<cjf> $$1) {
      if ($$1.size() == 1) {
         cjf $$2 = $$1.get(0);
         $$0.a(() -> tl.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> tl.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(dt $$0, List<cjf> $$1, aex $$2) {
      if ($$1.size() == 1) {
         cjf $$3 = $$1.get(0);
         $$0.a(() -> tl.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), $$2), false);
      } else {
         $$0.a(() -> tl.a("commands.drop.success.multiple_with_table", $$1.size(), $$2), false);
      }
   }

   private static cjf a(dt $$0, biv $$1) throws CommandSyntaxException {
      biq $$2 = $$0.g();
      if ($$2 instanceof bjg) {
         return ((bjg)$$2).c($$1);
      } else {
         throw b.create($$2.N_());
      }
   }

   private static int a(CommandContext<dt> $$0, gw $$1, cjf $$2, ahm.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      akr $$5 = $$4.e();
      dfj $$6 = $$5.a_($$1);
      dcv $$7 = $$5.c_($$1);
      ecw.a $$8 = new ecw.a($$5).a(efb.f, ehn.b($$1)).a(efb.g, $$6).b(efb.h, $$7).b(efb.a, $$4.f()).a(efb.i, $$2);
      List<cjf> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().r()));
   }

   private static int a(CommandContext<dt> $$0, biq $$1, ahm.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bjg)) {
         throw c.create($$1.N_());
      } else {
         aex $$3 = ((bjg)$$1).ez();
         dt $$4 = (dt)$$0.getSource();
         ecw.a $$5 = new ecw.a($$4.e());
         biq $$6 = $$4.f();
         if ($$6 instanceof cbu $$7) {
            $$5.a(efb.b, $$7);
         }

         $$5.a(efb.c, $$1.dM().o());
         $$5.b(efb.e, $$6);
         $$5.b(efb.d, $$6);
         $$5.a(efb.a, $$1);
         $$5.a(efb.f, $$4.d());
         ecw $$8 = $$5.a(efa.g);
         ecy $$9 = $$4.l().aH().getLootTable($$3);
         List<cjf> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<dt> $$0, aex $$1, ahm.b $$2) throws CommandSyntaxException {
      dt $$3 = (dt)$$0.getSource();
      ecw $$4 = new ecw.a($$3.e()).b(efb.a, $$3.f()).a(efb.f, $$3.d()).a(efa.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<dt> $$0, aex $$1, gw $$2, cjf $$3, ahm.b $$4) throws CommandSyntaxException {
      dt $$5 = (dt)$$0.getSource();
      ecw $$6 = new ecw.a($$5.e()).a(efb.f, ehn.b($$2)).a(efb.i, $$3).b(efb.a, $$5.f()).a(efa.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<dt> $$0, aex $$1, ecw $$2, ahm.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      ecy $$5 = $$4.l().aH().getLootTable($$1);
      List<cjf> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cjf> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<dt> var1, List<cjf> var2, ahm.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<dt, ?> construct(ArgumentBuilder<dt, ?> var1, ahm.b var2);
   }
}
