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
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), cwo.j, $$2)))
                                          .then(
                                             ey.a("tool", hg.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ey.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bus.a), $$2))
                                       ))
                                    .then(
                                       ey.a("offhand")
                                          .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bus.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), cwo.j, $$2)))
                                    .then(ey.a("tool", hg.a($$1)).executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ey.a("mainhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bus.a), $$2))))
                              .then(ey.a("offhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bus.b), $$2)))
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

   private static bsc a(ex $$0, ji $$1) throws CommandSyntaxException {
      dty $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsc)) {
         throw ani.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsc)$$2;
      }
   }

   private static int a(ex $$0, ji $$1, List<cwo> $$2, anp.a $$3) throws CommandSyntaxException {
      bsc $$4 = a($$0, $$1);
      List<cwo> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cwo $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsc $$0, cwo $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cwo $$4 = $$0.a($$3);
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

   private static int a(ex $$0, ji $$1, int $$2, int $$3, List<cwo> $$4, anp.a $$5) throws CommandSyntaxException {
      bsc $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cwo> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cwo $$11 = $$9 < $$4.size() ? $$4.get($$9) : cwo.j;
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

   private static boolean a(cwo $$0, cwo $$1) {
      return $$0.M() <= $$0.k() && cwo.c($$0, $$1);
   }

   private static int a(Collection<are> $$0, List<cwo> $$1, anp.a $$2) throws CommandSyntaxException {
      List<cwo> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cwo $$4 : $$1) {
         for (are $$5 : $$0) {
            if ($$5.gi().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(buk $$0, List<cwo> $$1, int $$2, int $$3, List<cwo> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cwo $$6 = $$5 < $$1.size() ? $$1.get($$5) : cwo.j;
         bvy $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvy.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends buk> $$0, int $$1, int $$2, List<cwo> $$3, anp.a $$4) throws CommandSyntaxException {
      List<cwo> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (buk $$6 : $$0) {
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

   private static int a(ex $$0, faz $$1, List<cwo> $$2, anp.a $$3) throws CommandSyntaxException {
      ard $$4 = $$0.e();
      $$2.forEach($$2x -> {
         clb $$3x = new clb($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.s();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ex $$0, List<cwo> $$1) {
      if ($$1.size() == 1) {
         cwo $$2 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ex $$0, List<cwo> $$1, aku<evv> $$2) {
      if ($$1.size() == 1) {
         cwo $$3 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wp.a($$2.a())), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple_with_table", $$1.size(), wp.a($$2.a())), false);
      }
   }

   private static cwo a(ex $$0, bus $$1) throws CommandSyntaxException {
      buk $$2 = $$0.g();
      if ($$2 instanceof bvg) {
         return ((bvg)$$2).a($$1);
      } else {
         throw b.create($$2.p_());
      }
   }

   private static int a(CommandContext<ex> $$0, ji $$1, cwo $$2, anp.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      ard $$5 = $$4.e();
      dww $$6 = $$5.a_($$1);
      dty $$7 = $$5.c_($$1);
      Optional<aku<evv>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         evt.a $$9 = new evt.a($$5).a(eyk.f, faz.b($$1)).a(eyk.g, $$6).b(eyk.h, $$7).b(eyk.a, $$4.f()).a(eyk.i, $$2);
         List<cwo> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, buk $$1, anp.b $$2) throws CommandSyntaxException {
      Optional<aku<evv>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.p_());
      } else {
         ex $$4 = (ex)$$0.getSource();
         evt.a $$5 = new evt.a($$4.e());
         buk $$6 = $$4.f();
         if ($$6 instanceof cow $$7) {
            $$5.a(eyk.b, $$7);
         }

         $$5.a(eyk.c, $$1.dW().q());
         $$5.b(eyk.e, $$6);
         $$5.b(eyk.d, $$6);
         $$5.a(eyk.a, $$1);
         $$5.a(eyk.f, $$4.d());
         evt $$8 = $$5.a(eyj.g);
         evv $$9 = $$4.l().bc().b($$3.get());
         List<cwo> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, jr<evv> $$1, anp.b $$2) throws CommandSyntaxException {
      ex $$3 = (ex)$$0.getSource();
      evt $$4 = new evt.a($$3.e()).b(eyk.a, $$3.f()).a(eyk.f, $$3.d()).a(eyj.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ex> $$0, jr<evv> $$1, ji $$2, cwo $$3, anp.b $$4) throws CommandSyntaxException {
      ex $$5 = (ex)$$0.getSource();
      evt $$6 = new evt.a($$5.e()).a(eyk.f, faz.b($$2)).a(eyk.i, $$3).b(eyk.a, $$5.f()).a(eyj.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ex> $$0, jr<evv> $$1, evt $$2, anp.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      List<cwo> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cwo> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ex> var1, List<cwo> var2, anp.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ex, ?> construct(ArgumentBuilder<ex, ?> var1, anp.b var2);
   }
}
