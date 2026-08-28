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

public class ans {
   public static final SuggestionProvider<ep> a = ($$0, $$1) -> {
      all.b $$2 = ((ep)$$0.getSource()).l().be();
      return eu.a($$2.a(lq.aU), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xl.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), cuk.l, $$2)))
                                          .then(
                                             eq.a("tool", gy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), gy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          eq.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), bsw.a), $$2))
                                       ))
                                    .then(
                                       eq.a("offhand")
                                          .executes($$1xx -> a($$1xx, fr.a($$1xx, "loot_table"), gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), bsw.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), cuk.l, $$2)))
                                    .then(eq.a("tool", gy.a($$1)).executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), gy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(eq.a("mainhand").executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), bsw.a), $$2))))
                              .then(eq.a("offhand").executes($$1xx -> a($$1xx, gl.a($$1xx, "pos"), a((ep)$$1xx.getSource(), bsw.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ep, T>> T a(T $$0, ans.c $$1) {
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

   private static bqi a(ep $$0, iz $$1) throws CommandSyntaxException {
      dpc $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bqi)) {
         throw anm.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqi)$$2;
      }
   }

   private static int a(ep $$0, iz $$1, List<cuk> $$2, ans.a $$3) throws CommandSyntaxException {
      bqi $$4 = a($$0, $$1);
      List<cuk> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cuk $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bqi $$0, cuk $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cuk $$4 = $$0.a($$3);
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

   private static int a(ep $$0, iz $$1, int $$2, int $$3, List<cuk> $$4, ans.a $$5) throws CommandSyntaxException {
      bqi $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cuk> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cuk $$11 = $$9 < $$4.size() ? $$4.get($$9) : cuk.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anm.c.create($$2);
      }
   }

   private static boolean a(cuk $$0, cuk $$1) {
      return $$0.I() <= $$0.j() && cuk.c($$0, $$1);
   }

   private static int a(Collection<arc> $$0, List<cuk> $$1, ans.a $$2) throws CommandSyntaxException {
      List<cuk> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cuk $$4 : $$1) {
         for (arc $$5 : $$0) {
            if ($$5.gc().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsp $$0, List<cuk> $$1, int $$2, int $$3, List<cuk> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cuk $$6 = $$5 < $$1.size() ? $$1.get($$5) : cuk.l;
         buc $$7 = $$0.a_($$2 + $$5);
         if ($$7 != buc.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsp> $$0, int $$1, int $$2, List<cuk> $$3, ans.a $$4) throws CommandSyntaxException {
      List<cuk> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsp $$6 : $$0) {
         if ($$6 instanceof arc $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cb.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ep $$0, evm $$1, List<cuk> $$2, ans.a $$3) throws CommandSyntaxException {
      arb $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cjc $$3x = new cjc($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ep $$0, List<cuk> $$1) {
      if ($$1.size() == 1) {
         cuk $$2 = $$1.get(0);
         $$0.a(() -> xl.a("commands.drop.success.single", $$2.I(), $$2.G()), false);
      } else {
         $$0.a(() -> xl.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ep $$0, List<cuk> $$1, ala<eqi> $$2) {
      if ($$1.size() == 1) {
         cuk $$3 = $$1.get(0);
         $$0.a(() -> xl.a("commands.drop.success.single_with_table", $$3.I(), $$3.G(), xl.a($$2.a())), false);
      } else {
         $$0.a(() -> xl.a("commands.drop.success.multiple_with_table", $$1.size(), xl.a($$2.a())), false);
      }
   }

   private static cuk a(ep $$0, bsw $$1) throws CommandSyntaxException {
      bsp $$2 = $$0.g();
      if ($$2 instanceof btk) {
         return ((btk)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ep> $$0, iz $$1, cuk $$2, ans.b $$3) throws CommandSyntaxException {
      ep $$4 = (ep)$$0.getSource();
      arb $$5 = $$4.e();
      drx $$6 = $$5.a_($$1);
      dpc $$7 = $$5.c_($$1);
      eqg.a $$8 = new eqg.a($$5).a(esz.f, evm.b($$1)).a(esz.g, $$6).b(esz.h, $$7).b(esz.a, $$4.f()).a(esz.i, $$2);
      List<cuk> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ep> $$0, bsp $$1, ans.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btk)) {
         throw c.create($$1.O_());
      } else {
         ala<eqi> $$3 = ((btk)$$1).eF();
         ep $$4 = (ep)$$0.getSource();
         eqg.a $$5 = new eqg.a($$4.e());
         bsp $$6 = $$4.f();
         if ($$6 instanceof cms $$7) {
            $$5.a(esz.b, $$7);
         }

         $$5.a(esz.c, $$1.dQ().o());
         $$5.b(esz.e, $$6);
         $$5.b(esz.d, $$6);
         $$5.a(esz.a, $$1);
         $$5.a(esz.f, $$4.d());
         eqg $$8 = $$5.a(esy.g);
         eqi $$9 = $$4.l().be().b($$3);
         List<cuk> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ep> $$0, ji<eqi> $$1, ans.b $$2) throws CommandSyntaxException {
      ep $$3 = (ep)$$0.getSource();
      eqg $$4 = new eqg.a($$3.e()).b(esz.a, $$3.f()).a(esz.f, $$3.d()).a(esy.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ep> $$0, ji<eqi> $$1, iz $$2, cuk $$3, ans.b $$4) throws CommandSyntaxException {
      ep $$5 = (ep)$$0.getSource();
      eqg $$6 = new eqg.a($$5.e()).a(esz.f, evm.b($$2)).a(esz.i, $$3).b(esz.a, $$5.f()).a(esy.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ep> $$0, ji<eqi> $$1, eqg $$2, ans.b $$3) throws CommandSyntaxException {
      ep $$4 = (ep)$$0.getSource();
      List<cuk> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cuk> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ep> var1, List<cuk> var2, ans.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ep, ?> construct(ArgumentBuilder<ep, ?> var1, ans.b var2);
   }
}
