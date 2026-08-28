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

public class any {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      aln.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(me.bn), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("commands.drop.no_loot_table.block", $$0));

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
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gu.a())
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gu.a($$1xx, "pos"), cxy.k, $$2)))
                                          .then(
                                             ey.a("tool", hh.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gu.a($$1xx, "pos"), hh.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ey.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gu.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bwc.a), $$2))
                                       ))
                                    .then(
                                       ey.a("offhand")
                                          .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gu.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bwc.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ey.a("loot").then(ey.a("loot_table", fz.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), $$2))))
                  .then(ey.a("kill").then(ey.a("target", fk.a()).executes($$1xx -> a($$1xx, fk.a($$1xx, "target"), $$2))))
                  .then(
                     ey.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gu.a())
                                       .executes($$1xx -> a($$1xx, gu.a($$1xx, "pos"), cxy.k, $$2)))
                                    .then(ey.a("tool", hh.a($$1)).executes($$1xx -> a($$1xx, gu.a($$1xx, "pos"), hh.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ey.a("mainhand").executes($$1xx -> a($$1xx, gu.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bwc.a), $$2))))
                              .then(ey.a("offhand").executes($$1xx -> a($$1xx, gu.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bwc.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ex, T>> T a(T $$0, any.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ey.a("replace")
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("entities", fk.b())
                              .then(
                                 $$1.construct(ey.a("slot", gg.a()), ($$0x, $$1x, $$2) -> a(fk.b($$0x, "entities"), gg.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ey.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fk.b($$0x, "entities"), gg.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("block")
                     .then(
                        ey.a("targetPos", gu.a())
                           .then(
                              $$1.construct(
                                    ey.a("slot", gg.a()),
                                    ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gu.a($$0x, "targetPos"), gg.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ey.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ex)$$0x.getSource(),
                                             gu.a($$0x, "targetPos"),
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
         .then(ey.a("insert").then($$1.construct(ey.a("targetPos", gu.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gu.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ey.a("give").then($$1.construct(ey.a("players", fk.d()), ($$0x, $$1x, $$2) -> a(fk.f($$0x, "players"), $$1x, $$2))))
         .then(ey.a("spawn").then($$1.construct(ey.a("targetPos", hb.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), hb.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static btj a(ex $$0, jj $$1) throws CommandSyntaxException {
      dvl $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof btj)) {
         throw anr.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btj)$$2;
      }
   }

   private static int a(ex $$0, jj $$1, List<cxy> $$2, any.a $$3) throws CommandSyntaxException {
      btj $$4 = a($$0, $$1);
      List<cxy> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cxy $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(btj $$0, cxy $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cxy $$4 = $$0.a($$3);
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

   private static int a(ex $$0, jj $$1, int $$2, int $$3, List<cxy> $$4, any.a $$5) throws CommandSyntaxException {
      btj $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cxy> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cxy $$11 = $$9 < $$4.size() ? $$4.get($$9) : cxy.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anr.c.create($$2);
      }
   }

   private static boolean a(cxy $$0, cxy $$1) {
      return $$0.M() <= $$0.k() && cxy.c($$0, $$1);
   }

   private static int a(Collection<aro> $$0, List<cxy> $$1, any.a $$2) throws CommandSyntaxException {
      List<cxy> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cxy $$4 : $$1) {
         for (aro $$5 : $$0) {
            if ($$5.gi().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bvs $$0, List<cxy> $$1, int $$2, int $$3, List<cxy> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cxy $$6 = $$5 < $$1.size() ? $$1.get($$5) : cxy.k;
         bxi $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bxi.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bvs> $$0, int $$1, int $$2, List<cxy> $$3, any.a $$4) throws CommandSyntaxException {
      List<cxy> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bvs $$6 : $$0) {
         if ($$6 instanceof aro $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bP.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ex $$0, fcu $$1, List<cxy> $$2, any.a $$3) throws CommandSyntaxException {
      arn $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cmn $$3x = new cmn($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ex $$0, List<cxy> $$1) {
      if ($$1.size() == 1) {
         cxy $$2 = $$1.get(0);
         $$0.a(() -> wv.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wv.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ex $$0, List<cxy> $$1, alc<exq> $$2) {
      if ($$1.size() == 1) {
         cxy $$3 = $$1.get(0);
         $$0.a(() -> wv.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wv.a($$2.a())), false);
      } else {
         $$0.a(() -> wv.a("commands.drop.success.multiple_with_table", $$1.size(), wv.a($$2.a())), false);
      }
   }

   private static cxy a(ex $$0, bwc $$1) throws CommandSyntaxException {
      bvs $$2 = $$0.g();
      if ($$2 instanceof bwr) {
         return ((bwr)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ex> $$0, jj $$1, cxy $$2, any.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      arn $$5 = $$4.e();
      dym $$6 = $$5.a_($$1);
      dvl $$7 = $$5.c_($$1);
      Optional<alc<exq>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         exo.a $$9 = new exo.a($$5).a(faf.f, fcu.b($$1)).a(faf.g, $$6).b(faf.h, $$7).b(faf.a, $$4.f()).a(faf.i, $$2);
         List<cxy> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, bvs $$1, any.b $$2) throws CommandSyntaxException {
      Optional<alc<exq>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ex $$4 = (ex)$$0.getSource();
         exo.a $$5 = new exo.a($$4.e());
         bvs $$6 = $$4.f();
         if ($$6 instanceof cqi $$7) {
            $$5.a(faf.b, $$7);
         }

         $$5.a(faf.c, $$1.dW().q());
         $$5.b(faf.e, $$6);
         $$5.b(faf.d, $$6);
         $$5.a(faf.a, $$1);
         $$5.a(faf.f, $$4.d());
         exo $$8 = $$5.a(fae.g);
         exq $$9 = $$4.l().bc().b($$3.get());
         List<cxy> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, js<exq> $$1, any.b $$2) throws CommandSyntaxException {
      ex $$3 = (ex)$$0.getSource();
      exo $$4 = new exo.a($$3.e()).b(faf.a, $$3.f()).a(faf.f, $$3.d()).a(fae.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ex> $$0, js<exq> $$1, jj $$2, cxy $$3, any.b $$4) throws CommandSyntaxException {
      ex $$5 = (ex)$$0.getSource();
      exo $$6 = new exo.a($$5.e()).a(faf.f, fcu.b($$2)).a(faf.i, $$3).b(faf.a, $$5.f()).a(fae.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ex> $$0, js<exq> $$1, exo $$2, any.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      List<cxy> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cxy> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ex> var1, List<cxy> var2, any.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ex, ?> construct(ArgumentBuilder<ex, ?> var1, any.b var2);
   }
}
