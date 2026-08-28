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

public class ani {
   public static final SuggestionProvider<et> a = ($$0, $$1) -> {
      ala.b $$2 = ((et)$$0.getSource()).l().be();
      return ey.a($$2.a(lu.bc), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)eu.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     eu.a("fish")
                        .then(
                           eu.a("loot_table", fv.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("pos", gp.a())
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), cuo.l, $$2)))
                                          .then(
                                             eu.a("tool", hc.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          eu.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsx.a), $$2))
                                       ))
                                    .then(
                                       eu.a("offhand")
                                          .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsx.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(eu.a("loot").then(eu.a("loot_table", fv.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), $$2))))
                  .then(eu.a("kill").then(eu.a("target", fg.a()).executes($$1xx -> a($$1xx, fg.a($$1xx, "target"), $$2))))
                  .then(
                     eu.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("pos", gp.a())
                                       .executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), cuo.l, $$2)))
                                    .then(eu.a("tool", hc.a($$1)).executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(eu.a("mainhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsx.a), $$2))))
                              .then(eu.a("offhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsx.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<et, T>> T a(T $$0, ani.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)eu.a("replace")
                  .then(
                     eu.a("entity")
                        .then(
                           eu.a("entities", fg.b())
                              .then(
                                 $$1.construct(eu.a("slot", gb.a()), ($$0x, $$1x, $$2) -> a(fg.b($$0x, "entities"), gb.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          eu.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fg.b($$0x, "entities"), gb.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  eu.a("block")
                     .then(
                        eu.a("targetPos", gp.a())
                           .then(
                              $$1.construct(
                                    eu.a("slot", gb.a()),
                                    ($$0x, $$1x, $$2) -> a((et)$$0x.getSource(), gp.a($$0x, "targetPos"), gb.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       eu.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (et)$$0x.getSource(),
                                             gp.a($$0x, "targetPos"),
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
         .then(eu.a("insert").then($$1.construct(eu.a("targetPos", gp.a()), ($$0x, $$1x, $$2) -> a((et)$$0x.getSource(), gp.a($$0x, "targetPos"), $$1x, $$2))))
         .then(eu.a("give").then($$1.construct(eu.a("players", fg.d()), ($$0x, $$1x, $$2) -> a(fg.f($$0x, "players"), $$1x, $$2))))
         .then(eu.a("spawn").then($$1.construct(eu.a("targetPos", gw.a()), ($$0x, $$1x, $$2) -> a((et)$$0x.getSource(), gw.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bqj a(et $$0, jd $$1) throws CommandSyntaxException {
      dqf $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bqj)) {
         throw anc.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqj)$$2;
      }
   }

   private static int a(et $$0, jd $$1, List<cuo> $$2, ani.a $$3) throws CommandSyntaxException {
      bqj $$4 = a($$0, $$1);
      List<cuo> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cuo $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bqj $$0, cuo $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cuo $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.e()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.j() - $$4.H();
               int $$6 = Math.min($$1.H(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(et $$0, jd $$1, int $$2, int $$3, List<cuo> $$4, ani.a $$5) throws CommandSyntaxException {
      bqj $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cuo> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cuo $$11 = $$9 < $$4.size() ? $$4.get($$9) : cuo.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anc.c.create($$2);
      }
   }

   private static boolean a(cuo $$0, cuo $$1) {
      return $$0.H() <= $$0.j() && cuo.c($$0, $$1);
   }

   private static int a(Collection<aqu> $$0, List<cuo> $$1, ani.a $$2) throws CommandSyntaxException {
      List<cuo> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cuo $$4 : $$1) {
         for (aqu $$5 : $$0) {
            if ($$5.fZ().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsq $$0, List<cuo> $$1, int $$2, int $$3, List<cuo> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cuo $$6 = $$5 < $$1.size() ? $$1.get($$5) : cuo.l;
         bue $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bue.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsq> $$0, int $$1, int $$2, List<cuo> $$3, ani.a $$4) throws CommandSyntaxException {
      List<cuo> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsq $$6 : $$0) {
         if ($$6 instanceof aqu $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(et $$0, eww $$1, List<cuo> $$2, ani.a $$3) throws CommandSyntaxException {
      aqt $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cjf $$3x = new cjf($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(et $$0, List<cuo> $$1) {
      if ($$1.size() == 1) {
         cuo $$2 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single", $$2.H(), $$2.F()), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(et $$0, List<cuo> $$1, akp<erq> $$2) {
      if ($$1.size() == 1) {
         cuo $$3 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single_with_table", $$3.H(), $$3.F(), wy.a($$2.a())), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple_with_table", $$1.size(), wy.a($$2.a())), false);
      }
   }

   private static cuo a(et $$0, bsx $$1) throws CommandSyntaxException {
      bsq $$2 = $$0.g();
      if ($$2 instanceof btl) {
         return ((btl)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<et> $$0, jd $$1, cuo $$2, ani.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      aqt $$5 = $$4.e();
      dta $$6 = $$5.a_($$1);
      dqf $$7 = $$5.c_($$1);
      ero.a $$8 = new ero.a($$5).a(euh.f, eww.b($$1)).a(euh.g, $$6).b(euh.h, $$7).b(euh.a, $$4.f()).a(euh.i, $$2);
      List<cuo> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<et> $$0, bsq $$1, ani.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btl)) {
         throw c.create($$1.O_());
      } else {
         akp<erq> $$3 = ((btl)$$1).eB();
         et $$4 = (et)$$0.getSource();
         ero.a $$5 = new ero.a($$4.e());
         bsq $$6 = $$4.f();
         if ($$6 instanceof cmv $$7) {
            $$5.a(euh.b, $$7);
         }

         $$5.a(euh.c, $$1.dR().p());
         $$5.b(euh.e, $$6);
         $$5.b(euh.d, $$6);
         $$5.a(euh.a, $$1);
         $$5.a(euh.f, $$4.d());
         ero $$8 = $$5.a(eug.g);
         erq $$9 = $$4.l().be().b($$3);
         List<cuo> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<et> $$0, jm<erq> $$1, ani.b $$2) throws CommandSyntaxException {
      et $$3 = (et)$$0.getSource();
      ero $$4 = new ero.a($$3.e()).b(euh.a, $$3.f()).a(euh.f, $$3.d()).a(eug.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<et> $$0, jm<erq> $$1, jd $$2, cuo $$3, ani.b $$4) throws CommandSyntaxException {
      et $$5 = (et)$$0.getSource();
      ero $$6 = new ero.a($$5.e()).a(euh.f, eww.b($$2)).a(euh.i, $$3).b(euh.a, $$5.f()).a(eug.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<et> $$0, jm<erq> $$1, ero $$2, ani.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      List<cuo> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cuo> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<et> var1, List<cuo> var2, ani.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<et, ?> construct(ArgumentBuilder<et, ?> var1, ani.b var2);
   }
}
