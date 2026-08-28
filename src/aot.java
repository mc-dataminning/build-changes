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

public class aot {
   public static final SuggestionProvider<ew> a = ($$0, $$1) -> {
      amj.a $$2 = ((ew)$$0.getSource()).l().bc();
      return fb.a($$2.a(mb.bg), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xv.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xv.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xv.b("commands.drop.no_loot_table.block", $$0));

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
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), cxp.j, $$2)))
                                          .then(
                                             ex.a("tool", hf.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ex.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), bvs.a), $$2))
                                       ))
                                    .then(
                                       ex.a("offhand")
                                          .executes($$1xx -> a($$1xx, fy.a($$1xx, "loot_table"), gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), bvs.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), cxp.j, $$2)))
                                    .then(ex.a("tool", hf.a($$1)).executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), hf.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ex.a("mainhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), bvs.a), $$2))))
                              .then(ex.a("offhand").executes($$1xx -> a($$1xx, gs.a($$1xx, "pos"), a((ew)$$1xx.getSource(), bvs.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ew, T>> T a(T $$0, aot.c $$1) {
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

   private static btc a(ew $$0, jh $$1) throws CommandSyntaxException {
      dux $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof btc)) {
         throw aom.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btc)$$2;
      }
   }

   private static int a(ew $$0, jh $$1, List<cxp> $$2, aot.a $$3) throws CommandSyntaxException {
      btc $$4 = a($$0, $$1);
      List<cxp> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cxp $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(btc $$0, cxp $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cxp $$4 = $$0.a($$3);
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

   private static int a(ew $$0, jh $$1, int $$2, int $$3, List<cxp> $$4, aot.a $$5) throws CommandSyntaxException {
      btc $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cxp> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cxp $$11 = $$9 < $$4.size() ? $$4.get($$9) : cxp.j;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aom.c.create($$2);
      }
   }

   private static boolean a(cxp $$0, cxp $$1) {
      return $$0.L() <= $$0.k() && cxp.c($$0, $$1);
   }

   private static int a(Collection<asi> $$0, List<cxp> $$1, aot.a $$2) throws CommandSyntaxException {
      List<cxp> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cxp $$4 : $$1) {
         for (asi $$5 : $$0) {
            if ($$5.gi().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bvk $$0, List<cxp> $$1, int $$2, int $$3, List<cxp> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cxp $$6 = $$5 < $$1.size() ? $$1.get($$5) : cxp.j;
         bwy $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bwy.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bvk> $$0, int $$1, int $$2, List<cxp> $$3, aot.a $$4) throws CommandSyntaxException {
      List<cxp> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bvk $$6 : $$0) {
         if ($$6 instanceof asi $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ew $$0, fby $$1, List<cxp> $$2, aot.a $$3) throws CommandSyntaxException {
      ash $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cmb $$3x = new cmb($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.s();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ew $$0, List<cxp> $$1) {
      if ($$1.size() == 1) {
         cxp $$2 = $$1.get(0);
         $$0.a(() -> xv.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> xv.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ew $$0, List<cxp> $$1, aly<ewu> $$2) {
      if ($$1.size() == 1) {
         cxp $$3 = $$1.get(0);
         $$0.a(() -> xv.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), xv.a($$2.a())), false);
      } else {
         $$0.a(() -> xv.a("commands.drop.success.multiple_with_table", $$1.size(), xv.a($$2.a())), false);
      }
   }

   private static cxp a(ew $$0, bvs $$1) throws CommandSyntaxException {
      bvk $$2 = $$0.g();
      if ($$2 instanceof bwg) {
         return ((bwg)$$2).a($$1);
      } else {
         throw b.create($$2.p_());
      }
   }

   private static int a(CommandContext<ew> $$0, jh $$1, cxp $$2, aot.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      ash $$5 = $$4.e();
      dxv $$6 = $$5.a_($$1);
      dux $$7 = $$5.c_($$1);
      Optional<aly<ewu>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         ews.a $$9 = new ews.a($$5).a(ezj.f, fby.b($$1)).a(ezj.g, $$6).b(ezj.h, $$7).b(ezj.a, $$4.f()).a(ezj.i, $$2);
         List<cxp> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, bvk $$1, aot.b $$2) throws CommandSyntaxException {
      Optional<aly<ewu>> $$3 = $$1.eb();
      if ($$3.isEmpty()) {
         throw c.create($$1.p_());
      } else {
         ew $$4 = (ew)$$0.getSource();
         ews.a $$5 = new ews.a($$4.e());
         bvk $$6 = $$4.f();
         if ($$6 instanceof cpx $$7) {
            $$5.a(ezj.b, $$7);
         }

         $$5.a(ezj.c, $$1.dX().q());
         $$5.b(ezj.e, $$6);
         $$5.b(ezj.d, $$6);
         $$5.a(ezj.a, $$1);
         $$5.a(ezj.f, $$4.d());
         ews $$8 = $$5.a(ezi.g);
         ewu $$9 = $$4.l().bc().b($$3.get());
         List<cxp> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ew> $$0, jq<ewu> $$1, aot.b $$2) throws CommandSyntaxException {
      ew $$3 = (ew)$$0.getSource();
      ews $$4 = new ews.a($$3.e()).b(ezj.a, $$3.f()).a(ezj.f, $$3.d()).a(ezi.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ew> $$0, jq<ewu> $$1, jh $$2, cxp $$3, aot.b $$4) throws CommandSyntaxException {
      ew $$5 = (ew)$$0.getSource();
      ews $$6 = new ews.a($$5.e()).a(ezj.f, fby.b($$2)).a(ezj.i, $$3).b(ezj.a, $$5.f()).a(ezi.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ew> $$0, jq<ewu> $$1, ews $$2, aot.b $$3) throws CommandSyntaxException {
      ew $$4 = (ew)$$0.getSource();
      List<cxp> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cxp> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ew> var1, List<cxp> var2, aot.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ew, ?> construct(ArgumentBuilder<ew, ?> var1, aot.b var2);
   }
}
