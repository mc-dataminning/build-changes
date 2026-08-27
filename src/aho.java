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

public class aho {
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> {
      ecn $$2 = ((dt)$$0.getSource()).l().aH();
      return dw.a($$2.a(ecp.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tl.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), cjl.b, $$2)))
                                          .then(
                                             du.a("tool", fw.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          du.a("mainhand")
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bjb.a), $$2))
                                       ))
                                    .then(
                                       du.a("offhand")
                                          .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bjb.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), cjl.b, $$2)))
                                    .then(du.a("tool", fw.a($$1)).executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(du.a("mainhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bjb.a), $$2))))
                              .then(du.a("offhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((dt)$$1xx.getSource(), bjb.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<dt, T>> T a(T $$0, aho.c $$1) {
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

   private static bgx a(dt $$0, gw $$1) throws CommandSyntaxException {
      dcz $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bgx)) {
         throw ahi.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgx)$$2;
      }
   }

   private static int a(dt $$0, gw $$1, List<cjl> $$2, aho.a $$3) throws CommandSyntaxException {
      bgx $$4 = a($$0, $$1);
      List<cjl> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cjl $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bgx $$0, cjl $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cjl $$4 = $$0.a($$3);
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

   private static int a(dt $$0, gw $$1, int $$2, int $$3, List<cjl> $$4, aho.a $$5) throws CommandSyntaxException {
      bgx $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cjl> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cjl $$11 = $$9 < $$4.size() ? $$4.get($$9) : cjl.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ahi.b.create($$2);
      }
   }

   private static boolean a(cjl $$0, cjl $$1) {
      return $$0.L() <= $$0.g() && cjl.c($$0, $$1);
   }

   private static int a(Collection<aku> $$0, List<cjl> $$1, aho.a $$2) throws CommandSyntaxException {
      List<cjl> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cjl $$4 : $$1) {
         for (aku $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(biw $$0, List<cjl> $$1, int $$2, int $$3, List<cjl> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cjl $$6 = $$5 < $$1.size() ? $$1.get($$5) : cjl.b;
         bke $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bke.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends biw> $$0, int $$1, int $$2, List<cjl> $$3, aho.a $$4) throws CommandSyntaxException {
      List<cjl> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (biw $$6 : $$0) {
         if ($$6 instanceof aku $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(dt $$0, ehh $$1, List<cjl> $$2, aho.a $$3) throws CommandSyntaxException {
      akt $$4 = $$0.e();
      $$2.forEach($$2x -> {
         byt $$3x = new byt($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.t();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(dt $$0, List<cjl> $$1) {
      if ($$1.size() == 1) {
         cjl $$2 = $$1.get(0);
         $$0.a(() -> tl.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> tl.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(dt $$0, List<cjl> $$1, aez $$2) {
      if ($$1.size() == 1) {
         cjl $$3 = $$1.get(0);
         $$0.a(() -> tl.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), tl.a($$2)), false);
      } else {
         $$0.a(() -> tl.a("commands.drop.success.multiple_with_table", $$1.size(), tl.a($$2)), false);
      }
   }

   private static cjl a(dt $$0, bjb $$1) throws CommandSyntaxException {
      biw $$2 = $$0.g();
      if ($$2 instanceof bjm) {
         return ((bjm)$$2).c($$1);
      } else {
         throw b.create($$2.N_());
      }
   }

   private static int a(CommandContext<dt> $$0, gw $$1, cjl $$2, aho.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      akt $$5 = $$4.e();
      dfd $$6 = $$5.a_($$1);
      dcz $$7 = $$5.c_($$1);
      ecq.a $$8 = new ecq.a($$5).a(eev.f, ehh.b($$1)).a(eev.g, $$6).b(eev.h, $$7).b(eev.a, $$4.f()).a(eev.i, $$2);
      List<cjl> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().u()));
   }

   private static int a(CommandContext<dt> $$0, biw $$1, aho.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bjm)) {
         throw c.create($$1.N_());
      } else {
         aez $$3 = ((bjm)$$1).ez();
         dt $$4 = (dt)$$0.getSource();
         ecq.a $$5 = new ecq.a($$4.e());
         biw $$6 = $$4.f();
         if ($$6 instanceof cca $$7) {
            $$5.a(eev.b, $$7);
         }

         $$5.a(eev.c, $$1.dM().o());
         $$5.b(eev.e, $$6);
         $$5.b(eev.d, $$6);
         $$5.a(eev.a, $$1);
         $$5.a(eev.f, $$4.d());
         ecq $$8 = $$5.a(eeu.g);
         ecs $$9 = $$4.l().aH().getLootTable($$3);
         List<cjl> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<dt> $$0, aez $$1, aho.b $$2) throws CommandSyntaxException {
      dt $$3 = (dt)$$0.getSource();
      ecq $$4 = new ecq.a($$3.e()).b(eev.a, $$3.f()).a(eev.f, $$3.d()).a(eeu.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<dt> $$0, aez $$1, gw $$2, cjl $$3, aho.b $$4) throws CommandSyntaxException {
      dt $$5 = (dt)$$0.getSource();
      ecq $$6 = new ecq.a($$5.e()).a(eev.f, ehh.b($$2)).a(eev.i, $$3).b(eev.a, $$5.f()).a(eeu.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<dt> $$0, aez $$1, ecq $$2, aho.b $$3) throws CommandSyntaxException {
      dt $$4 = (dt)$$0.getSource();
      ecs $$5 = $$4.l().aH().getLootTable($$1);
      List<cjl> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cjl> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<dt> var1, List<cjl> var2, aho.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<dt, ?> construct(ArgumentBuilder<dt, ?> var1, aho.b var2);
   }
}
