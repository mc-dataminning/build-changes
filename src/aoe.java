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

public class aoe {
   public static final SuggestionProvider<ew> a = ($$0, $$1) -> {
      alv.a $$2 = ((ew)$$0.getSource()).l().bc();
      return fb.a($$2.a(ma.bd), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xl.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xl.b("commands.drop.no_loot_table.block", $$0));

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
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), cwf.k, $$2)))
                                          .then(
                                             ex.a("tool", hf.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ex.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), buq.a), $$2))
                                       ))
                                    .then(
                                       ex.a("offhand")
                                          .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), buq.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), cwf.k, $$2)))
                                    .then(ex.a("tool", hf.a($$1)).executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ex.a("mainhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), buq.a), $$2))))
                              .then(ex.a("offhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), buq.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ew, T>> T a(T $$0, aoe.c $$1) {
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

   private static bsa a(ew $$0, jh $$1) throws CommandSyntaxException {
      dsr $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsa)) {
         throw any.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsa)$$2;
      }
   }

   private static int a(ew $$0, jh $$1, List<cwf> $$2, aoe.a $$3) throws CommandSyntaxException {
      bsa $$4 = a($$0, $$1);
      List<cwf> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cwf $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsa $$0, cwf $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cwf $$4 = $$0.a($$3);
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

   private static int a(ew $$0, jh $$1, int $$2, int $$3, List<cwf> $$4, aoe.a $$5) throws CommandSyntaxException {
      bsa $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cwf> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cwf $$11 = $$9 < $$4.size() ? $$4.get($$9) : cwf.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw any.c.create($$2);
      }
   }

   private static boolean a(cwf $$0, cwf $$1) {
      return $$0.L() <= $$0.k() && cwf.c($$0, $$1);
   }

   private static int a(Collection<arr> $$0, List<cwf> $$1, aoe.a $$2) throws CommandSyntaxException {
      List<cwf> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cwf $$4 : $$1) {
         for (arr $$5 : $$0) {
            if ($$5.gl().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bui $$0, List<cwf> $$1, int $$2, int $$3, List<cwf> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cwf $$6 = $$5 < $$1.size() ? $$1.get($$5) : cwf.k;
         bvw $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvw.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bui> $$0, int $$1, int $$2, List<cwf> $$3, aoe.a $$4) throws CommandSyntaxException {
      List<cwf> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bui $$6 : $$0) {
         if ($$6 instanceof arr $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ew $$0, ezr $$1, List<cwf> $$2, aoe.a $$3) throws CommandSyntaxException {
      arq $$4 = $$0.e();
      $$2.forEach($$2x -> {
         ckz $$3x = new ckz($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.q();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ew $$0, List<cwf> $$1) {
      if ($$1.size() == 1) {
         cwf $$2 = $$1.get(0);
         $$0.a(() -> xl.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> xl.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ew $$0, List<cwf> $$1, alk<eul> $$2) {
      if ($$1.size() == 1) {
         cwf $$3 = $$1.get(0);
         $$0.a(() -> xl.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), xl.a($$2.a())), false);
      } else {
         $$0.a(() -> xl.a("commands.drop.success.multiple_with_table", $$1.size(), xl.a($$2.a())), false);
      }
   }

   private static cwf a(ew $$0, buq $$1) throws CommandSyntaxException {
      bui $$2 = $$0.g();
      if ($$2 instanceof bve) {
         return ((bve)$$2).a($$1);
      } else {
         throw b.create($$2.S_());
      }
   }

   private static int a(CommandContext<ew> $$0, jh $$1, cwf $$2, aoe.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      arq $$5 = $$4.e();
      dvo $$6 = $$5.a_($$1);
      dsr $$7 = $$5.c_($$1);
      Optional<alk<eul>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         euj.a $$9 = new euj.a($$5).a(exc.f, ezr.b($$1)).a(exc.g, $$6).b(exc.h, $$7).b(exc.a, $$4.f()).a(exc.i, $$2);
         List<cwf> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, bui $$1, aoe.b $$2) throws CommandSyntaxException {
      Optional<alk<eul>> $$3 = $$1.ed();
      if ($$3.isEmpty()) {
         throw c.create($$1.S_());
      } else {
         ew $$4 = (ew)$$0.getSource();
         euj.a $$5 = new euj.a($$4.e());
         bui $$6 = $$4.f();
         if ($$6 instanceof cor $$7) {
            $$5.a(exc.b, $$7);
         }

         $$5.a(exc.c, $$1.dZ().q());
         $$5.b(exc.e, $$6);
         $$5.b(exc.d, $$6);
         $$5.a(exc.a, $$1);
         $$5.a(exc.f, $$4.d());
         euj $$8 = $$5.a(exb.g);
         eul $$9 = $$4.l().bc().b($$3.get());
         List<cwf> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, jq<eul> $$1, aoe.b $$2) throws CommandSyntaxException {
      ew $$3 = (ew)$$0.getSource();
      euj $$4 = new euj.a($$3.e()).b(exc.a, $$3.f()).a(exc.f, $$3.d()).a(exb.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ew> $$0, jq<eul> $$1, jh $$2, cwf $$3, aoe.b $$4) throws CommandSyntaxException {
      ew $$5 = (ew)$$0.getSource();
      euj $$6 = new euj.a($$5.e()).a(exc.f, ezr.b($$2)).a(exc.i, $$3).b(exc.a, $$5.f()).a(exb.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ew> $$0, jq<eul> $$1, euj $$2, aoe.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      List<cwf> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cwf> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ew> var1, List<cwf> var2, aoe.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ew, ?> construct(ArgumentBuilder<ew, ?> var1, aoe.b var2);
   }
}
