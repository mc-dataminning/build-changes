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

public class aoc {
   public static final SuggestionProvider<ew> a = ($$0, $$1) -> {
      alt.a $$2 = ((ew)$$0.getSource()).l().bc();
      return fb.a($$2.a(ma.bd), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xj.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xj.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xj.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ex.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ex.a("fish")
                        .then(
                           ex.a("loot_table", fy.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("pos", gs.a())
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), cwm.k, $$2)))
                                          .then(
                                             ex.a("tool", hf.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ex.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), but.a), $$2))
                                       ))
                                    .then(
                                       ex.a("offhand")
                                          .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), but.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ex.a("loot").then(ex.a("loot_table", fy.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), $$2))))
                  .then(ex.a("kill").then(ex.a("target", fj.a()).executes($$1xx -> a($$1xx, fj.a($$1xx, "target"), $$2))))
                  .then(
                     ex.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("pos", gs.a())
                                       .executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), cwm.k, $$2)))
                                    .then(ex.a("tool", hf.a($$1)).executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ex.a("mainhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), but.a), $$2))))
                              .then(ex.a("offhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), but.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ew, T>> T a(T $$0, aoc.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ex.a("replace")
                  .then(
                     ex.a("entity")
                        .then(
                           ex.a("entities", fj.b())
                              .then(
                                 $$1.construct(ex.a("slot", ge.a()), ($$0x, $$1x, $$2) -> a(fj.b($$0x, "entities"), ge.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ex.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fj.b($$0x, "entities"), ge.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ex.a("block")
                     .then(
                        ex.a("targetPos", gs.a())
                           .then(
                              $$1.construct(
                                    ex.a("slot", ge.a()),
                                    ($$0x, $$1x, $$2) -> a((ew)$$0x.getSource(), gs.a($$0x, "targetPos"), ge.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ex.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ew)$$0x.getSource(),
                                             gs.a($$0x, "targetPos"),
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
         .then(ex.a("insert").then($$1.construct(ex.a("targetPos", gs.a()), ($$0x, $$1x, $$2) -> a((ew)$$0x.getSource(), gs.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ex.a("give").then($$1.construct(ex.a("players", fj.d()), ($$0x, $$1x, $$2) -> a(fj.f($$0x, "players"), $$1x, $$2))))
         .then(ex.a("spawn").then($$1.construct(ex.a("targetPos", gz.a()), ($$0x, $$1x, $$2) -> a((ew)$$0x.getSource(), gz.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bsd a(ew $$0, jh $$1) throws CommandSyntaxException {
      dsy $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsd)) {
         throw anw.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsd)$$2;
      }
   }

   private static int a(ew $$0, jh $$1, List<cwm> $$2, aoc.a $$3) throws CommandSyntaxException {
      bsd $$4 = a($$0, $$1);
      List<cwm> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cwm $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsd $$0, cwm $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cwm $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.L();
               int $$6 = Math.min($$1.L(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ew $$0, jh $$1, int $$2, int $$3, List<cwm> $$4, aoc.a $$5) throws CommandSyntaxException {
      bsd $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cwm> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cwm $$11 = $$9 < $$4.size() ? $$4.get($$9) : cwm.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anw.c.create($$2);
      }
   }

   private static boolean a(cwm $$0, cwm $$1) {
      return $$0.L() <= $$0.k() && cwm.c($$0, $$1);
   }

   private static int a(Collection<arq> $$0, List<cwm> $$1, aoc.a $$2) throws CommandSyntaxException {
      List<cwm> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cwm $$4 : $$1) {
         for (arq $$5 : $$0) {
            if ($$5.gg().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bul $$0, List<cwm> $$1, int $$2, int $$3, List<cwm> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cwm $$6 = $$5 < $$1.size() ? $$1.get($$5) : cwm.k;
         bvz $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvz.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bul> $$0, int $$1, int $$2, List<cwm> $$3, aoc.a $$4) throws CommandSyntaxException {
      List<cwm> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bul $$6 : $$0) {
         if ($$6 instanceof arq $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cc.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ew $$0, ezy $$1, List<cwm> $$2, aoc.a $$3) throws CommandSyntaxException {
      arp $$4 = $$0.e();
      $$2.forEach($$2x -> {
         clc $$3x = new clc($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.n();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ew $$0, List<cwm> $$1) {
      if ($$1.size() == 1) {
         cwm $$2 = $$1.get(0);
         $$0.a(() -> xj.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> xj.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ew $$0, List<cwm> $$1, ali<eus> $$2) {
      if ($$1.size() == 1) {
         cwm $$3 = $$1.get(0);
         $$0.a(() -> xj.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), xj.a($$2.a())), false);
      } else {
         $$0.a(() -> xj.a("commands.drop.success.multiple_with_table", $$1.size(), xj.a($$2.a())), false);
      }
   }

   private static cwm a(ew $$0, but $$1) throws CommandSyntaxException {
      bul $$2 = $$0.g();
      if ($$2 instanceof bvh) {
         return ((bvh)$$2).a($$1);
      } else {
         throw b.create($$2.o_());
      }
   }

   private static int a(CommandContext<ew> $$0, jh $$1, cwm $$2, aoc.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      arp $$5 = $$4.e();
      dvv $$6 = $$5.a_($$1);
      dsy $$7 = $$5.c_($$1);
      Optional<ali<eus>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         euq.a $$9 = new euq.a($$5).a(exj.f, ezy.b($$1)).a(exj.g, $$6).b(exj.h, $$7).b(exj.a, $$4.f()).a(exj.i, $$2);
         List<cwm> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, bul $$1, aoc.b $$2) throws CommandSyntaxException {
      Optional<ali<eus>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.o_());
      } else {
         ew $$4 = (ew)$$0.getSource();
         euq.a $$5 = new euq.a($$4.e());
         bul $$6 = $$4.f();
         if ($$6 instanceof cou $$7) {
            $$5.a(exj.b, $$7);
         }

         $$5.a(exj.c, $$1.dW().q());
         $$5.b(exj.e, $$6);
         $$5.b(exj.d, $$6);
         $$5.a(exj.a, $$1);
         $$5.a(exj.f, $$4.d());
         euq $$8 = $$5.a(exi.g);
         eus $$9 = $$4.l().bc().b($$3.get());
         List<cwm> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, jq<eus> $$1, aoc.b $$2) throws CommandSyntaxException {
      ew $$3 = (ew)$$0.getSource();
      euq $$4 = new euq.a($$3.e()).b(exj.a, $$3.f()).a(exj.f, $$3.d()).a(exi.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ew> $$0, jq<eus> $$1, jh $$2, cwm $$3, aoc.b $$4) throws CommandSyntaxException {
      ew $$5 = (ew)$$0.getSource();
      euq $$6 = new euq.a($$5.e()).a(exj.f, ezy.b($$2)).a(exj.i, $$3).b(exj.a, $$5.f()).a(exi.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ew> $$0, jq<eus> $$1, euq $$2, aoc.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      List<cwm> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cwm> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ew> var1, List<cwm> var2, aoc.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ew, ?> construct(ArgumentBuilder<ew, ?> var1, aoc.b var2);
   }
}
