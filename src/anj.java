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

public class anj {
   public static final SuggestionProvider<et> a = ($$0, $$1) -> {
      alb.b $$2 = ((et)$$0.getSource()).l().be();
      return ey.a($$2.a(lu.bc), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wz.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wz.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), cuq.l, $$2)))
                                          .then(
                                             eu.a("tool", hc.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          eu.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsy.a), $$2))
                                       ))
                                    .then(
                                       eu.a("offhand")
                                          .executes($$1xx -> a($$1xx, fv.a($$1xx, "loot_table"), gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsy.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), cuq.l, $$2)))
                                    .then(eu.a("tool", hc.a($$1)).executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), hc.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(eu.a("mainhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsy.a), $$2))))
                              .then(eu.a("offhand").executes($$1xx -> a($$1xx, gp.a($$1xx, "pos"), a((et)$$1xx.getSource(), bsy.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<et, T>> T a(T $$0, anj.c $$1) {
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

   private static bqk a(et $$0, jd $$1) throws CommandSyntaxException {
      dqh $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bqk)) {
         throw and.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqk)$$2;
      }
   }

   private static int a(et $$0, jd $$1, List<cuq> $$2, anj.a $$3) throws CommandSyntaxException {
      bqk $$4 = a($$0, $$1);
      List<cuq> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cuq $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bqk $$0, cuq $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cuq $$4 = $$0.a($$3);
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

   private static int a(et $$0, jd $$1, int $$2, int $$3, List<cuq> $$4, anj.a $$5) throws CommandSyntaxException {
      bqk $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cuq> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cuq $$11 = $$9 < $$4.size() ? $$4.get($$9) : cuq.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw and.c.create($$2);
      }
   }

   private static boolean a(cuq $$0, cuq $$1) {
      return $$0.H() <= $$0.j() && cuq.c($$0, $$1);
   }

   private static int a(Collection<aqv> $$0, List<cuq> $$1, anj.a $$2) throws CommandSyntaxException {
      List<cuq> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cuq $$4 : $$1) {
         for (aqv $$5 : $$0) {
            if ($$5.fZ().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsr $$0, List<cuq> $$1, int $$2, int $$3, List<cuq> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cuq $$6 = $$5 < $$1.size() ? $$1.get($$5) : cuq.l;
         bug $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bug.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsr> $$0, int $$1, int $$2, List<cuq> $$3, anj.a $$4) throws CommandSyntaxException {
      List<cuq> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsr $$6 : $$0) {
         if ($$6 instanceof aqv $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(et $$0, exa $$1, List<cuq> $$2, anj.a $$3) throws CommandSyntaxException {
      aqu $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cjh $$3x = new cjh($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(et $$0, List<cuq> $$1) {
      if ($$1.size() == 1) {
         cuq $$2 = $$1.get(0);
         $$0.a(() -> wz.a("commands.drop.success.single", $$2.H(), $$2.F()), false);
      } else {
         $$0.a(() -> wz.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(et $$0, List<cuq> $$1, akq<eru> $$2) {
      if ($$1.size() == 1) {
         cuq $$3 = $$1.get(0);
         $$0.a(() -> wz.a("commands.drop.success.single_with_table", $$3.H(), $$3.F(), wz.a($$2.a())), false);
      } else {
         $$0.a(() -> wz.a("commands.drop.success.multiple_with_table", $$1.size(), wz.a($$2.a())), false);
      }
   }

   private static cuq a(et $$0, bsy $$1) throws CommandSyntaxException {
      bsr $$2 = $$0.g();
      if ($$2 instanceof btn) {
         return ((btn)$$2).a($$1);
      } else {
         throw b.create($$2.S_());
      }
   }

   private static int a(CommandContext<et> $$0, jd $$1, cuq $$2, anj.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      aqu $$5 = $$4.e();
      dtc $$6 = $$5.a_($$1);
      dqh $$7 = $$5.c_($$1);
      ers.a $$8 = new ers.a($$5).a(eul.f, exa.b($$1)).a(eul.g, $$6).b(eul.h, $$7).b(eul.a, $$4.f()).a(eul.i, $$2);
      List<cuq> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<et> $$0, bsr $$1, anj.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btn)) {
         throw c.create($$1.S_());
      } else {
         akq<eru> $$3 = ((btn)$$1).eB();
         et $$4 = (et)$$0.getSource();
         ers.a $$5 = new ers.a($$4.e());
         bsr $$6 = $$4.f();
         if ($$6 instanceof cmx $$7) {
            $$5.a(eul.b, $$7);
         }

         $$5.a(eul.c, $$1.dQ().p());
         $$5.b(eul.e, $$6);
         $$5.b(eul.d, $$6);
         $$5.a(eul.a, $$1);
         $$5.a(eul.f, $$4.d());
         ers $$8 = $$5.a(euk.g);
         eru $$9 = $$4.l().be().b($$3);
         List<cuq> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<et> $$0, jm<eru> $$1, anj.b $$2) throws CommandSyntaxException {
      et $$3 = (et)$$0.getSource();
      ers $$4 = new ers.a($$3.e()).b(eul.a, $$3.f()).a(eul.f, $$3.d()).a(euk.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<et> $$0, jm<eru> $$1, jd $$2, cuq $$3, anj.b $$4) throws CommandSyntaxException {
      et $$5 = (et)$$0.getSource();
      ers $$6 = new ers.a($$5.e()).a(eul.f, exa.b($$2)).a(eul.i, $$3).b(eul.a, $$5.f()).a(euk.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<et> $$0, jm<eru> $$1, ers $$2, anj.b $$3) throws CommandSyntaxException {
      et $$4 = (et)$$0.getSource();
      List<cuq> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cuq> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<et> var1, List<cuq> var2, anj.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<et, ?> construct(ArgumentBuilder<et, ?> var1, anj.b var2);
   }
}
