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

public class anw {
   public static final SuggestionProvider<ep> a = ($$0, $$1) -> {
      alp.b $$2 = ((ep)$$0.getSource()).l().be();
      return eu.a($$2.a(lq.aU), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)eq.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     eq.a("fish")
                        .then(
                           eq.a("loot_table", fr.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("pos", gl.a())
                                             .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), cur.l, $$2)))
                                          .then(
                                             eq.a("tool", gy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), gy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          eq.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), btd.a), $$2))
                                       ))
                                    .then(
                                       eq.a("offhand")
                                          .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), btd.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(eq.a("loot").then(eq.a("loot_table", fr.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), $$2))))
                  .then(eq.a("kill").then(eq.a("target", fc.a()).executes($$1xx -> a($$1xx, fc.a($$1xx, "target"), $$2))))
                  .then(
                     eq.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("pos", gl.a())
                                       .executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), cur.l, $$2)))
                                    .then(eq.a("tool", gy.a($$1)).executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), gy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(eq.a("mainhand").executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), btd.a), $$2))))
                              .then(eq.a("offhand").executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), btd.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ep, T>> T a(T $$0, anw.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)eq.a("replace")
                  .then(
                     eq.a("entity")
                        .then(
                           eq.a("entities", fc.b())
                              .then(
                                 $$1.construct(eq.a("slot", fx.a()), ($$0x, $$1x, $$2) -> a(fc.b($$0x, "entities"), fx.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          eq.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fc.b($$0x, "entities"), fx.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  eq.a("block")
                     .then(
                        eq.a("targetPos", gl.a())
                           .then(
                              $$1.construct(
                                    eq.a("slot", fx.a()),
                                    ($$0x, $$1x, $$2) -> a((ep)$$0x.getSource(), gl.a($$0x, "targetPos"), fx.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       eq.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ep)$$0x.getSource(),
                                             gl.a($$0x, "targetPos"),
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
         .then(eq.a("insert").then($$1.construct(eq.a("targetPos", gl.a()), ($$0x, $$1x, $$2) -> a((ep)$$0x.getSource(), gl.a($$0x, "targetPos"), $$1x, $$2))))
         .then(eq.a("give").then($$1.construct(eq.a("players", fc.d()), ($$0x, $$1x, $$2) -> a(fc.f($$0x, "players"), $$1x, $$2))))
         .then(eq.a("spawn").then($$1.construct(eq.a("targetPos", gs.a()), ($$0x, $$1x, $$2) -> a((ep)$$0x.getSource(), gs.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bqp a(ep $$0, iz $$1) throws CommandSyntaxException {
      dpj $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bqp)) {
         throw anq.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqp)$$2;
      }
   }

   private static int a(ep $$0, iz $$1, List<cur> $$2, anw.a $$3) throws CommandSyntaxException {
      bqp $$4 = a($$0, $$1);
      List<cur> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cur $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bqp $$0, cur $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cur $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.e()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.j() - $$4.I();
               int $$6 = Math.min($$1.I(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ep $$0, iz $$1, int $$2, int $$3, List<cur> $$4, anw.a $$5) throws CommandSyntaxException {
      bqp $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cur> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cur $$11 = $$9 < $$4.size() ? $$4.get($$9) : cur.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anq.c.create($$2);
      }
   }

   private static boolean a(cur $$0, cur $$1) {
      return $$0.I() <= $$0.j() && cur.c($$0, $$1);
   }

   private static int a(Collection<arg> $$0, List<cur> $$1, anw.a $$2) throws CommandSyntaxException {
      List<cur> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cur $$4 : $$1) {
         for (arg $$5 : $$0) {
            if ($$5.gc().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsw $$0, List<cur> $$1, int $$2, int $$3, List<cur> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cur $$6 = $$5 < $$1.size() ? $$1.get($$5) : cur.l;
         buj $$7 = $$0.a_($$2 + $$5);
         if ($$7 != buj.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsw> $$0, int $$1, int $$2, List<cur> $$3, anw.a $$4) throws CommandSyntaxException {
      List<cur> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsw $$6 : $$0) {
         if ($$6 instanceof arg $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cb.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ep $$0, evt $$1, List<cur> $$2, anw.a $$3) throws CommandSyntaxException {
      arf $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cjj $$3x = new cjj($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ep $$0, List<cur> $$1) {
      if ($$1.size() == 1) {
         cur $$2 = $$1.get(0);
         $$0.a(() -> xp.a("commands.drop.success.single", $$2.I(), $$2.G()), false);
      } else {
         $$0.a(() -> xp.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ep $$0, List<cur> $$1, ale<eqp> $$2) {
      if ($$1.size() == 1) {
         cur $$3 = $$1.get(0);
         $$0.a(() -> xp.a("commands.drop.success.single_with_table", $$3.I(), $$3.G(), xp.a($$2.a())), false);
      } else {
         $$0.a(() -> xp.a("commands.drop.success.multiple_with_table", $$1.size(), xp.a($$2.a())), false);
      }
   }

   private static cur a(ep $$0, btd $$1) throws CommandSyntaxException {
      bsw $$2 = $$0.g();
      if ($$2 instanceof btr) {
         return ((btr)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ep> $$0, iz $$1, cur $$2, anw.b $$3) throws CommandSyntaxException {
      ep $$4 = (ep)$$0.getSource();
      arf $$5 = $$4.e();
      dse $$6 = $$5.a_($$1);
      dpj $$7 = $$5.c_($$1);
      eqn.a $$8 = new eqn.a($$5).a(etg.f, evt.b($$1)).a(etg.g, $$6).b(etg.h, $$7).b(etg.a, $$4.f()).a(etg.i, $$2);
      List<cur> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ep> $$0, bsw $$1, anw.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btr)) {
         throw c.create($$1.O_());
      } else {
         ale<eqp> $$3 = ((btr)$$1).eF();
         ep $$4 = (ep)$$0.getSource();
         eqn.a $$5 = new eqn.a($$4.e());
         bsw $$6 = $$4.f();
         if ($$6 instanceof cmz $$7) {
            $$5.a(etg.b, $$7);
         }

         $$5.a(etg.c, $$1.dQ().o());
         $$5.b(etg.e, $$6);
         $$5.b(etg.d, $$6);
         $$5.a(etg.a, $$1);
         $$5.a(etg.f, $$4.d());
         eqn $$8 = $$5.a(etf.g);
         eqp $$9 = $$4.l().be().b($$3);
         List<cur> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ep> $$0, ji<eqp> $$1, anw.b $$2) throws CommandSyntaxException {
      ep $$3 = (ep)$$0.getSource();
      eqn $$4 = new eqn.a($$3.e()).b(etg.a, $$3.f()).a(etg.f, $$3.d()).a(etf.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ep> $$0, ji<eqp> $$1, iz $$2, cur $$3, anw.b $$4) throws CommandSyntaxException {
      ep $$5 = (ep)$$0.getSource();
      eqn $$6 = new eqn.a($$5.e()).a(etg.f, evt.b($$2)).a(etg.i, $$3).b(etg.a, $$5.f()).a(etf.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ep> $$0, ji<eqp> $$1, eqn $$2, anw.b $$3) throws CommandSyntaxException {
      ep $$4 = (ep)$$0.getSource();
      List<cur> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cur> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ep> var1, List<cur> var2, anw.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ep, ?> construct(ArgumentBuilder<ep, ?> var1, anw.b var2);
   }
}
