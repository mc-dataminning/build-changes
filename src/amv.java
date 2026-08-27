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

public class amv {
   public static final SuggestionProvider<ec> a = ($$0, $$1) -> {
      eod $$2 = ((ec)$$0.getSource()).l().aM();
      return eh.a($$2.a(eof.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ed.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ed.a("fish")
                        .then(
                           ed.a("loot_table", fd.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("pos", fx.a())
                                             .executes($$1xx -> a($$1xx, fd.e($$1xx, "loot_table"), fx.a($$1xx, "pos"), csd.i, $$2)))
                                          .then(
                                             ed.a("tool", gj.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fd.e($$1xx, "loot_table"), fx.a($$1xx, "pos"), gj.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ed.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fd.e($$1xx, "loot_table"), fx.a($$1xx, "pos"), a((ec)$$1xx.getSource(), bqs.a), $$2))
                                       ))
                                    .then(
                                       ed.a("offhand")
                                          .executes($$1xx -> a($$1xx, fd.e($$1xx, "loot_table"), fx.a($$1xx, "pos"), a((ec)$$1xx.getSource(), bqs.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ed.a("loot").then(ed.a("loot_table", fd.a()).suggests(a).executes($$1xx -> a($$1xx, fd.e($$1xx, "loot_table"), $$2))))
                  .then(ed.a("kill").then(ed.a("target", ep.a()).executes($$1xx -> a($$1xx, ep.a($$1xx, "target"), $$2))))
                  .then(
                     ed.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("pos", fx.a())
                                       .executes($$1xx -> a($$1xx, fx.a($$1xx, "pos"), csd.i, $$2)))
                                    .then(ed.a("tool", gj.a($$1)).executes($$1xx -> a($$1xx, fx.a($$1xx, "pos"), gj.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ed.a("mainhand").executes($$1xx -> a($$1xx, fx.a($$1xx, "pos"), a((ec)$$1xx.getSource(), bqs.a), $$2))))
                              .then(ed.a("offhand").executes($$1xx -> a($$1xx, fx.a($$1xx, "pos"), a((ec)$$1xx.getSource(), bqs.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ec, T>> T a(T $$0, amv.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ed.a("replace")
                  .then(
                     ed.a("entity")
                        .then(
                           ed.a("entities", ep.b())
                              .then(
                                 $$1.construct(ed.a("slot", fj.a()), ($$0x, $$1x, $$2) -> a(ep.b($$0x, "entities"), fj.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ed.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ep.b($$0x, "entities"), fj.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ed.a("block")
                     .then(
                        ed.a("targetPos", fx.a())
                           .then(
                              $$1.construct(
                                    ed.a("slot", fj.a()),
                                    ($$0x, $$1x, $$2) -> a((ec)$$0x.getSource(), fx.a($$0x, "targetPos"), fj.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ed.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ec)$$0x.getSource(),
                                             fx.a($$0x, "targetPos"),
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
         .then(ed.a("insert").then($$1.construct(ed.a("targetPos", fx.a()), ($$0x, $$1x, $$2) -> a((ec)$$0x.getSource(), fx.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ed.a("give").then($$1.construct(ed.a("players", ep.d()), ($$0x, $$1x, $$2) -> a(ep.f($$0x, "players"), $$1x, $$2))))
         .then(ed.a("spawn").then($$1.construct(ed.a("targetPos", ge.a()), ($$0x, $$1x, $$2) -> a((ec)$$0x.getSource(), ge.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static boj a(ec $$0, im $$1) throws CommandSyntaxException {
      dnd $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof boj)) {
         throw amp.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (boj)$$2;
      }
   }

   private static int a(ec $$0, im $$1, List<csd> $$2, amv.a $$3) throws CommandSyntaxException {
      boj $$4 = a($$0, $$1);
      List<csd> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (csd $$6 : $$2) {
         if (a($$4, $$6.r())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(boj $$0, csd $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.d(); $$3++) {
         csd $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.d()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.i() - $$4.G();
               int $$6 = Math.min($$1.G(), $$5);
               $$1.g($$6);
               $$4.f($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ec $$0, im $$1, int $$2, int $$3, List<csd> $$4, amv.a $$5) throws CommandSyntaxException {
      boj $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<csd> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            csd $$11 = $$9 < $$4.size() ? $$4.get($$9) : csd.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amp.c.create($$2);
      }
   }

   private static boolean a(csd $$0, csd $$1) {
      return $$0.G() <= $$0.i() && csd.c($$0, $$1);
   }

   private static int a(Collection<aqf> $$0, List<csd> $$1, amv.a $$2) throws CommandSyntaxException {
      List<csd> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (csd $$4 : $$1) {
         for (aqf $$5 : $$0) {
            if ($$5.ga().e($$4.r())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bql $$0, List<csd> $$1, int $$2, int $$3, List<csd> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         csd $$6 = $$5 < $$1.size() ? $$1.get($$5) : csd.i;
         brv $$7 = $$0.a_($$2 + $$5);
         if ($$7 != brv.b && $$7.a($$6.r())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bql> $$0, int $$1, int $$2, List<csd> $$3, amv.a $$4) throws CommandSyntaxException {
      List<csd> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bql $$6 : $$0) {
         if ($$6 instanceof aqf $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cc.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ec $$0, etf $$1, List<csd> $$2, amv.a $$3) throws CommandSyntaxException {
      aqe $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cgv $$3x = new cgv($$4, $$1.c, $$1.d, $$1.e, $$2x.r());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ec $$0, List<csd> $$1) {
      if ($$1.size() == 1) {
         csd $$2 = $$1.get(0);
         $$0.a(() -> ws.a("commands.drop.success.single", $$2.G(), $$2.E()), false);
      } else {
         $$0.a(() -> ws.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ec $$0, List<csd> $$1, akf $$2) {
      if ($$1.size() == 1) {
         csd $$3 = $$1.get(0);
         $$0.a(() -> ws.a("commands.drop.success.single_with_table", $$3.G(), $$3.E(), ws.a($$2)), false);
      } else {
         $$0.a(() -> ws.a("commands.drop.success.multiple_with_table", $$1.size(), ws.a($$2)), false);
      }
   }

   private static csd a(ec $$0, bqs $$1) throws CommandSyntaxException {
      bql $$2 = $$0.g();
      if ($$2 instanceof bre) {
         return ((bre)$$2).d($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ec> $$0, im $$1, csd $$2, amv.b $$3) throws CommandSyntaxException {
      ec $$4 = (ec)$$0.getSource();
      aqe $$5 = $$4.e();
      dpy $$6 = $$5.a_($$1);
      dnd $$7 = $$5.c_($$1);
      eog.a $$8 = new eog.a($$5).a(eqt.f, etf.b($$1)).a(eqt.g, $$6).b(eqt.h, $$7).b(eqt.a, $$4.f()).a(eqt.i, $$2);
      List<csd> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ec> $$0, bql $$1, amv.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bre)) {
         throw c.create($$1.O_());
      } else {
         akf $$3 = ((bre)$$1).eD();
         ec $$4 = (ec)$$0.getSource();
         eog.a $$5 = new eog.a($$4.e());
         bql $$6 = $$4.f();
         if ($$6 instanceof ckl $$7) {
            $$5.a(eqt.b, $$7);
         }

         $$5.a(eqt.c, $$1.dO().o());
         $$5.b(eqt.e, $$6);
         $$5.b(eqt.d, $$6);
         $$5.a(eqt.a, $$1);
         $$5.a(eqt.f, $$4.d());
         eog $$8 = $$5.a(eqs.g);
         eoi $$9 = $$4.l().aM().getLootTable($$3);
         List<csd> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ec> $$0, akf $$1, amv.b $$2) throws CommandSyntaxException {
      ec $$3 = (ec)$$0.getSource();
      eog $$4 = new eog.a($$3.e()).b(eqt.a, $$3.f()).a(eqt.f, $$3.d()).a(eqs.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ec> $$0, akf $$1, im $$2, csd $$3, amv.b $$4) throws CommandSyntaxException {
      ec $$5 = (ec)$$0.getSource();
      eog $$6 = new eog.a($$5.e()).a(eqt.f, etf.b($$2)).a(eqt.i, $$3).b(eqt.a, $$5.f()).a(eqs.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ec> $$0, akf $$1, eog $$2, amv.b $$3) throws CommandSyntaxException {
      ec $$4 = (ec)$$0.getSource();
      eoi $$5 = $$4.l().aM().getLootTable($$1);
      List<csd> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<csd> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ec> var1, List<csd> var2, amv.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ec, ?> construct(ArgumentBuilder<ec, ?> var1, amv.b var2);
   }
}
