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

public class ano {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      ale.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(mc.bg), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wo.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wo.b("commands.drop.no_loot_table.block", $$0));

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
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), cwn.j, $$2)))
                                          .then(
                                             ey.a("tool", hg.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ey.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bur.a), $$2))
                                       ))
                                    .then(
                                       ey.a("offhand")
                                          .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bur.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), cwn.j, $$2)))
                                    .then(ey.a("tool", hg.a($$1)).executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ey.a("mainhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bur.a), $$2))))
                              .then(ey.a("offhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bur.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ex, T>> T a(T $$0, ano.c $$1) {
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

   private static bsb a(ex $$0, ji $$1) throws CommandSyntaxException {
      dtx $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsb)) {
         throw anh.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsb)$$2;
      }
   }

   private static int a(ex $$0, ji $$1, List<cwn> $$2, ano.a $$3) throws CommandSyntaxException {
      bsb $$4 = a($$0, $$1);
      List<cwn> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cwn $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsb $$0, cwn $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cwn $$4 = $$0.a($$3);
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

   private static int a(ex $$0, ji $$1, int $$2, int $$3, List<cwn> $$4, ano.a $$5) throws CommandSyntaxException {
      bsb $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cwn> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cwn $$11 = $$9 < $$4.size() ? $$4.get($$9) : cwn.j;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anh.c.create($$2);
      }
   }

   private static boolean a(cwn $$0, cwn $$1) {
      return $$0.M() <= $$0.k() && cwn.c($$0, $$1);
   }

   private static int a(Collection<ard> $$0, List<cwn> $$1, ano.a $$2) throws CommandSyntaxException {
      List<cwn> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cwn $$4 : $$1) {
         for (ard $$5 : $$0) {
            if ($$5.gi().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(buj $$0, List<cwn> $$1, int $$2, int $$3, List<cwn> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cwn $$6 = $$5 < $$1.size() ? $$1.get($$5) : cwn.j;
         bvx $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvx.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends buj> $$0, int $$1, int $$2, List<cwn> $$3, ano.a $$4) throws CommandSyntaxException {
      List<cwn> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (buj $$6 : $$0) {
         if ($$6 instanceof ard $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ex $$0, fay $$1, List<cwn> $$2, ano.a $$3) throws CommandSyntaxException {
      arc $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cla $$3x = new cla($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.s();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ex $$0, List<cwn> $$1) {
      if ($$1.size() == 1) {
         cwn $$2 = $$1.get(0);
         $$0.a(() -> wo.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wo.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ex $$0, List<cwn> $$1, akt<evu> $$2) {
      if ($$1.size() == 1) {
         cwn $$3 = $$1.get(0);
         $$0.a(() -> wo.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wo.a($$2.a())), false);
      } else {
         $$0.a(() -> wo.a("commands.drop.success.multiple_with_table", $$1.size(), wo.a($$2.a())), false);
      }
   }

   private static cwn a(ex $$0, bur $$1) throws CommandSyntaxException {
      buj $$2 = $$0.g();
      if ($$2 instanceof bvf) {
         return ((bvf)$$2).a($$1);
      } else {
         throw b.create($$2.p_());
      }
   }

   private static int a(CommandContext<ex> $$0, ji $$1, cwn $$2, ano.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      arc $$5 = $$4.e();
      dwv $$6 = $$5.a_($$1);
      dtx $$7 = $$5.c_($$1);
      Optional<akt<evu>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         evs.a $$9 = new evs.a($$5).a(eyj.f, fay.b($$1)).a(eyj.g, $$6).b(eyj.h, $$7).b(eyj.a, $$4.f()).a(eyj.i, $$2);
         List<cwn> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, buj $$1, ano.b $$2) throws CommandSyntaxException {
      Optional<akt<evu>> $$3 = $$1.eb();
      if ($$3.isEmpty()) {
         throw c.create($$1.p_());
      } else {
         ex $$4 = (ex)$$0.getSource();
         evs.a $$5 = new evs.a($$4.e());
         buj $$6 = $$4.f();
         if ($$6 instanceof cov $$7) {
            $$5.a(eyj.b, $$7);
         }

         $$5.a(eyj.c, $$1.dX().q());
         $$5.b(eyj.e, $$6);
         $$5.b(eyj.d, $$6);
         $$5.a(eyj.a, $$1);
         $$5.a(eyj.f, $$4.d());
         evs $$8 = $$5.a(eyi.g);
         evu $$9 = $$4.l().bc().b($$3.get());
         List<cwn> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, jr<evu> $$1, ano.b $$2) throws CommandSyntaxException {
      ex $$3 = (ex)$$0.getSource();
      evs $$4 = new evs.a($$3.e()).b(eyj.a, $$3.f()).a(eyj.f, $$3.d()).a(eyi.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ex> $$0, jr<evu> $$1, ji $$2, cwn $$3, ano.b $$4) throws CommandSyntaxException {
      ex $$5 = (ex)$$0.getSource();
      evs $$6 = new evs.a($$5.e()).a(eyj.f, fay.b($$2)).a(eyj.i, $$3).b(eyj.a, $$5.f()).a(eyi.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ex> $$0, jr<evu> $$1, evs $$2, ano.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      List<cwn> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cwn> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ex> var1, List<cwn> var2, ano.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ex, ?> construct(ArgumentBuilder<ex, ?> var1, ano.b var2);
   }
}
