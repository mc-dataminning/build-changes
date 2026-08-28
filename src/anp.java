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
import java.util.Optional;

public class anp {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      alf.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(mc.bg), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ey.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ey.a("fish")
                        .then(
                           ey.a("loot_table", fz.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gt.a())
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), cwp.j, $$2)))
                                          .then(
                                             ey.a("tool", hg.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ey.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), but.a), $$2))
                                       ))
                                    .then(
                                       ey.a("offhand")
                                          .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), but.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ey.a("loot").then(ey.a("loot_table", fz.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), $$2))))
                  .then(ey.a("kill").then(ey.a("target", fk.a()).executes($$1xx -> a($$1xx, fk.a($$1xx, "target"), $$2))))
                  .then(
                     ey.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gt.a())
                                       .executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), cwp.j, $$2)))
                                    .then(ey.a("tool", hg.a($$1)).executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ey.a("mainhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), but.a), $$2))))
                              .then(ey.a("offhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), but.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ex, T>> T a(T $$0, anp.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ey.a("replace")
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("entities", fk.b())
                              .then(
                                 $$1.construct(ey.a("slot", gf.a()), ($$0x, $$1x, $$2) -> a(fk.b($$0x, "entities"), gf.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ey.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fk.b($$0x, "entities"), gf.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("block")
                     .then(
                        ey.a("targetPos", gt.a())
                           .then(
                              $$1.construct(
                                    ey.a("slot", gf.a()),
                                    ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gt.a($$0x, "targetPos"), gf.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ey.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ex)$$0x.getSource(),
                                             gt.a($$0x, "targetPos"),
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
         .then(ey.a("insert").then($$1.construct(ey.a("targetPos", gt.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gt.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ey.a("give").then($$1.construct(ey.a("players", fk.d()), ($$0x, $$1x, $$2) -> a(fk.f($$0x, "players"), $$1x, $$2))))
         .then(ey.a("spawn").then($$1.construct(ey.a("targetPos", ha.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), ha.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bsd a(ex $$0, ji $$1) throws CommandSyntaxException {
      dtz $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsd)) {
         throw ani.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsd)$$2;
      }
   }

   private static int a(ex $$0, ji $$1, List<cwp> $$2, anp.a $$3) throws CommandSyntaxException {
      bsd $$4 = a($$0, $$1);
      List<cwp> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cwp $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsd $$0, cwp $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cwp $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.M();
               int $$6 = Math.min($$1.M(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ex $$0, ji $$1, int $$2, int $$3, List<cwp> $$4, anp.a $$5) throws CommandSyntaxException {
      bsd $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cwp> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cwp $$11 = $$9 < $$4.size() ? $$4.get($$9) : cwp.j;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ani.c.create($$2);
      }
   }

   private static boolean a(cwp $$0, cwp $$1) {
      return $$0.M() <= $$0.k() && cwp.c($$0, $$1);
   }

   private static int a(Collection<are> $$0, List<cwp> $$1, anp.a $$2) throws CommandSyntaxException {
      List<cwp> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cwp $$4 : $$1) {
         for (are $$5 : $$0) {
            if ($$5.gi().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bul $$0, List<cwp> $$1, int $$2, int $$3, List<cwp> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cwp $$6 = $$5 < $$1.size() ? $$1.get($$5) : cwp.j;
         bvz $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvz.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bul> $$0, int $$1, int $$2, List<cwp> $$3, anp.a $$4) throws CommandSyntaxException {
      List<cwp> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bul $$6 : $$0) {
         if ($$6 instanceof are $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ex $$0, fba $$1, List<cwp> $$2, anp.a $$3) throws CommandSyntaxException {
      ard $$4 = $$0.e();
      $$2.forEach($$2x -> {
         clc $$3x = new clc($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.s();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ex $$0, List<cwp> $$1) {
      if ($$1.size() == 1) {
         cwp $$2 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ex $$0, List<cwp> $$1, aku<evw> $$2) {
      if ($$1.size() == 1) {
         cwp $$3 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wp.a($$2.a())), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple_with_table", $$1.size(), wp.a($$2.a())), false);
      }
   }

   private static cwp a(ex $$0, but $$1) throws CommandSyntaxException {
      bul $$2 = $$0.g();
      if ($$2 instanceof bvh) {
         return ((bvh)$$2).a($$1);
      } else {
         throw b.create($$2.p_());
      }
   }

   private static int a(CommandContext<ex> $$0, ji $$1, cwp $$2, anp.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      ard $$5 = $$4.e();
      dwx $$6 = $$5.a_($$1);
      dtz $$7 = $$5.c_($$1);
      Optional<aku<evw>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         evu.a $$9 = new evu.a($$5).a(eyl.f, fba.b($$1)).a(eyl.g, $$6).b(eyl.h, $$7).b(eyl.a, $$4.f()).a(eyl.i, $$2);
         List<cwp> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, bul $$1, anp.b $$2) throws CommandSyntaxException {
      Optional<aku<evw>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.p_());
      } else {
         ex $$4 = (ex)$$0.getSource();
         evu.a $$5 = new evu.a($$4.e());
         bul $$6 = $$4.f();
         if ($$6 instanceof cox $$7) {
            $$5.a(eyl.b, $$7);
         }

         $$5.a(eyl.c, $$1.dW().q());
         $$5.b(eyl.e, $$6);
         $$5.b(eyl.d, $$6);
         $$5.a(eyl.a, $$1);
         $$5.a(eyl.f, $$4.d());
         evu $$8 = $$5.a(eyk.g);
         evw $$9 = $$4.l().bc().b($$3.get());
         List<cwp> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, jr<evw> $$1, anp.b $$2) throws CommandSyntaxException {
      ex $$3 = (ex)$$0.getSource();
      evu $$4 = new evu.a($$3.e()).b(eyl.a, $$3.f()).a(eyl.f, $$3.d()).a(eyk.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ex> $$0, jr<evw> $$1, ji $$2, cwp $$3, anp.b $$4) throws CommandSyntaxException {
      ex $$5 = (ex)$$0.getSource();
      evu $$6 = new evu.a($$5.e()).a(eyl.f, fba.b($$2)).a(eyl.i, $$3).b(eyl.a, $$5.f()).a(eyk.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ex> $$0, jr<evw> $$1, evu $$2, anp.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      List<cwp> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cwp> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ex> var1, List<cwp> var2, anp.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ex, ?> construct(ArgumentBuilder<ex, ?> var1, anp.b var2);
   }
}
