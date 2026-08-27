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

public class ajx {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      ehi $$2 = ((ds)$$0.getSource()).l().aJ();
      return dx.a($$2.a(ehk.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vg.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vg.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dt.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dt.a("fish")
                        .then(
                           dt.a("loot_table", et.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fm.a())
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), cng.f, $$2)))
                                          .then(
                                             dt.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bmd.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bmd.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dt.a("loot").then(dt.a("loot_table", et.a()).suggests(a).executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), $$2))))
                  .then(dt.a("kill").then(dt.a("target", ef.a()).executes($$1xx -> a($$1xx, ef.a($$1xx, "target"), $$2))))
                  .then(
                     dt.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fm.a())
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), cng.f, $$2)))
                                    .then(dt.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bmd.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bmd.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, ajx.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dt.a("replace")
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("entities", ef.b())
                              .then(
                                 $$1.construct(dt.a("slot", ez.a()), ($$0x, $$1x, $$2) -> a(ef.b($$0x, "entities"), ez.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dt.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ef.b($$0x, "entities"), ez.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("block")
                     .then(
                        dt.a("targetPos", fm.a())
                           .then(
                              $$1.construct(
                                    dt.a("slot", ez.a()),
                                    ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fm.a($$0x, "targetPos"), ez.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dt.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ds)$$0x.getSource(),
                                             fm.a($$0x, "targetPos"),
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
         .then(dt.a("insert").then($$1.construct(dt.a("targetPos", fm.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fm.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dt.a("give").then($$1.construct(dt.a("players", ef.d()), ($$0x, $$1x, $$2) -> a(ef.f($$0x, "players"), $$1x, $$2))))
         .then(dt.a("spawn").then($$1.construct(dt.a("targetPos", ft.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), ft.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bjv a(ds $$0, hx $$1) throws CommandSyntaxException {
      dhd $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bjv)) {
         throw ajr.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bjv)$$2;
      }
   }

   private static int a(ds $$0, hx $$1, List<cng> $$2, ajx.a $$3) throws CommandSyntaxException {
      bjv $$4 = a($$0, $$1);
      List<cng> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cng $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bjv $$0, cng $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cng $$4 = $$0.a($$3);
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

   private static int a(ds $$0, hx $$1, int $$2, int $$3, List<cng> $$4, ajx.a $$5) throws CommandSyntaxException {
      bjv $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cng> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cng $$11 = $$9 < $$4.size() ? $$4.get($$9) : cng.f;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ajr.b.create($$2);
      }
   }

   private static boolean a(cng $$0, cng $$1) {
      return $$0.L() <= $$0.g() && cng.c($$0, $$1);
   }

   private static int a(Collection<anf> $$0, List<cng> $$1, ajx.a $$2) throws CommandSyntaxException {
      List<cng> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cng $$4 : $$1) {
         for (anf $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(blw $$0, List<cng> $$1, int $$2, int $$3, List<cng> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cng $$6 = $$5 < $$1.size() ? $$1.get($$5) : cng.f;
         bng $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bng.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends blw> $$0, int $$1, int $$2, List<cng> $$3, ajx.a $$4) throws CommandSyntaxException {
      List<cng> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (blw $$6 : $$0) {
         if ($$6 instanceof anf $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bW.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, emc $$1, List<cng> $$2, ajx.a $$3) throws CommandSyntaxException {
      ane $$4 = $$0.e();
      $$2.forEach($$2x -> {
         ccb $$3x = new ccb($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<cng> $$1) {
      if ($$1.size() == 1) {
         cng $$2 = $$1.get(0);
         $$0.a(() -> vg.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> vg.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<cng> $$1, ahh $$2) {
      if ($$1.size() == 1) {
         cng $$3 = $$1.get(0);
         $$0.a(() -> vg.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), vg.a($$2)), false);
      } else {
         $$0.a(() -> vg.a("commands.drop.success.multiple_with_table", $$1.size(), vg.a($$2)), false);
      }
   }

   private static cng a(ds $$0, bmd $$1) throws CommandSyntaxException {
      blw $$2 = $$0.g();
      if ($$2 instanceof bmo) {
         return ((bmo)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<ds> $$0, hx $$1, cng $$2, ajx.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      ane $$5 = $$4.e();
      djp $$6 = $$5.a_($$1);
      dhd $$7 = $$5.c_($$1);
      ehl.a $$8 = new ehl.a($$5).a(ejq.f, emc.b($$1)).a(ejq.g, $$6).b(ejq.h, $$7).b(ejq.a, $$4.f()).a(ejq.i, $$2);
      List<cng> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ds> $$0, blw $$1, ajx.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bmo)) {
         throw c.create($$1.Q_());
      } else {
         ahh $$3 = ((bmo)$$1).eA();
         ds $$4 = (ds)$$0.getSource();
         ehl.a $$5 = new ehl.a($$4.e());
         blw $$6 = $$4.f();
         if ($$6 instanceof cfq $$7) {
            $$5.a(ejq.b, $$7);
         }

         $$5.a(ejq.c, $$1.dM().o());
         $$5.b(ejq.e, $$6);
         $$5.b(ejq.d, $$6);
         $$5.a(ejq.a, $$1);
         $$5.a(ejq.f, $$4.d());
         ehl $$8 = $$5.a(ejp.g);
         ehn $$9 = $$4.l().aJ().getLootTable($$3);
         List<cng> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, ahh $$1, ajx.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      ehl $$4 = new ehl.a($$3.e()).b(ejq.a, $$3.f()).a(ejq.f, $$3.d()).a(ejp.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, ahh $$1, hx $$2, cng $$3, ajx.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      ehl $$6 = new ehl.a($$5.e()).a(ejq.f, emc.b($$2)).a(ejq.i, $$3).b(ejq.a, $$5.f()).a(ejp.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, ahh $$1, ehl $$2, ajx.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      ehn $$5 = $$4.l().aJ().getLootTable($$1);
      List<cng> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cng> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<cng> var2, ajx.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, ajx.b var2);
   }
}
