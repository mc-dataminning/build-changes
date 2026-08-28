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

public class anv {
   public static final SuggestionProvider<et> a = ($$0, $$1) -> {
      alm.a $$2 = ((et)$$0.getSource()).l().bd();
      return ey.a($$2.a(lv.bd), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), cvp.k, $$2)))
                                          .then(
                                             eu.a("tool", hc.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          eu.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), btw.a), $$2))
                                       ))
                                    .then(
                                       eu.a("offhand")
                                          .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), btw.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), cvp.k, $$2)))
                                    .then(eu.a("tool", hc.a($$1)).executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(eu.a("mainhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), btw.a), $$2))))
                              .then(eu.a("offhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), btw.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<et, T>> T a(T $$0, anv.c $$1) {
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

   private static bri a(et $$0, je $$1) throws CommandSyntaxException {
      drs $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bri)) {
         throw anp.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bri)$$2;
      }
   }

   private static int a(et $$0, je $$1, List<cvp> $$2, anv.a $$3) throws CommandSyntaxException {
      bri $$4 = a($$0, $$1);
      List<cvp> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cvp $$6 : $$2) {
         if (a($$4, $$6.u())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bri $$0, cvp $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cvp $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.J();
               int $$6 = Math.min($$1.J(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(et $$0, je $$1, int $$2, int $$3, List<cvp> $$4, anv.a $$5) throws CommandSyntaxException {
      bri $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cvp> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cvp $$11 = $$9 < $$4.size() ? $$4.get($$9) : cvp.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anp.c.create($$2);
      }
   }

   private static boolean a(cvp $$0, cvp $$1) {
      return $$0.J() <= $$0.k() && cvp.c($$0, $$1);
   }

   private static int a(Collection<ari> $$0, List<cvp> $$1, anv.a $$2) throws CommandSyntaxException {
      List<cvp> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cvp $$4 : $$1) {
         for (ari $$5 : $$0) {
            if ($$5.gc().f($$4.u())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bto $$0, List<cvp> $$1, int $$2, int $$3, List<cvp> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cvp $$6 = $$5 < $$1.size() ? $$1.get($$5) : cvp.k;
         bvb $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvb.a && $$7.a($$6.u())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bto> $$0, int $$1, int $$2, List<cvp> $$3, anv.a $$4) throws CommandSyntaxException {
      List<cvp> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bto $$6 : $$0) {
         if ($$6 instanceof ari $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bZ.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(et $$0, eys $$1, List<cvp> $$2, anv.a $$3) throws CommandSyntaxException {
      arh $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cke $$3x = new cke($$4, $$1.d, $$1.e, $$1.f, $$2x.u());
         $$3x.q();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(et $$0, List<cvp> $$1) {
      if ($$1.size() == 1) {
         cvp $$2 = $$1.get(0);
         $$0.a(() -> xd.a("commands.drop.success.single", $$2.J(), $$2.H()), false);
      } else {
         $$0.a(() -> xd.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(et $$0, List<cvp> $$1, alb<etm> $$2) {
      if ($$1.size() == 1) {
         cvp $$3 = $$1.get(0);
         $$0.a(() -> xd.a("commands.drop.success.single_with_table", $$3.J(), $$3.H(), xd.a($$2.a())), false);
      } else {
         $$0.a(() -> xd.a("commands.drop.success.multiple_with_table", $$1.size(), xd.a($$2.a())), false);
      }
   }

   private static cvp a(et $$0, btw $$1) throws CommandSyntaxException {
      bto $$2 = $$0.g();
      if ($$2 instanceof buk) {
         return ((buk)$$2).a($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<et> $$0, je $$1, cvp $$2, anv.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      arh $$5 = $$4.e();
      duo $$6 = $$5.a_($$1);
      drs $$7 = $$5.c_($$1);
      etk.a $$8 = new etk.a($$5).a(ewd.f, eys.b($$1)).a(ewd.g, $$6).b(ewd.h, $$7).b(ewd.a, $$4.f()).a(ewd.i, $$2);
      List<cvp> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<et> $$0, bto $$1, anv.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof buk)) {
         throw c.create($$1.Q_());
      } else {
         alb<etm> $$3 = ((buk)$$1).eE();
         et $$4 = (et)$$0.getSource();
         etk.a $$5 = new etk.a($$4.e());
         bto $$6 = $$4.f();
         if ($$6 instanceof cnu $$7) {
            $$5.a(ewd.b, $$7);
         }

         $$5.a(ewd.c, $$1.dT().q());
         $$5.b(ewd.e, $$6);
         $$5.b(ewd.d, $$6);
         $$5.a(ewd.a, $$1);
         $$5.a(ewd.f, $$4.d());
         etk $$8 = $$5.a(ewc.g);
         etm $$9 = $$4.l().bd().b($$3);
         List<cvp> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<et> $$0, jn<etm> $$1, anv.b $$2) throws CommandSyntaxException {
      et $$3 = (et)$$0.getSource();
      etk $$4 = new etk.a($$3.e()).b(ewd.a, $$3.f()).a(ewd.f, $$3.d()).a(ewc.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<et> $$0, jn<etm> $$1, je $$2, cvp $$3, anv.b $$4) throws CommandSyntaxException {
      et $$5 = (et)$$0.getSource();
      etk $$6 = new etk.a($$5.e()).a(ewd.f, eys.b($$2)).a(ewd.i, $$3).b(ewd.a, $$5.f()).a(ewc.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<et> $$0, jn<etm> $$1, etk $$2, anv.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      List<cvp> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cvp> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<et> var1, List<cvp> var2, anv.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<et, ?> construct(ArgumentBuilder<et, ?> var1, anv.b var2);
   }
}
