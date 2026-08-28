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

public class aom {
   public static final SuggestionProvider<ek> a = ($$0, $$1) -> {
      amb.a $$2 = ((ek)$$0.getSource()).l().bc();
      return ep.a($$2.a(mi.br), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xg.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)el.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     el.a("fish")
                        .then(
                           el.a("loot_table", fm.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("pos", gh.a())
                                             .executes($$1xx -> a($$1xx, fm.a($$1xx, "loot_table"), gh.a($$1xx, "pos"), dak.l, $$2)))
                                          .then(
                                             el.a("tool", gu.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fm.a($$1xx, "loot_table"), gh.a($$1xx, "pos"), gu.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          el.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fm.a($$1xx, "loot_table"), gh.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bxo.a), $$2))
                                       ))
                                    .then(
                                       el.a("offhand")
                                          .executes($$1xx -> a($$1xx, fm.a($$1xx, "loot_table"), gh.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bxo.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(el.a("loot").then(el.a("loot_table", fm.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fm.a($$1xx, "loot_table"), $$2))))
                  .then(el.a("kill").then(el.a("target", ex.a()).executes($$1xx -> a($$1xx, ex.a($$1xx, "target"), $$2))))
                  .then(
                     el.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("pos", gh.a())
                                       .executes($$1xx -> a($$1xx, gh.a($$1xx, "pos"), dak.l, $$2)))
                                    .then(el.a("tool", gu.a($$1)).executes($$1xx -> a($$1xx, gh.a($$1xx, "pos"), gu.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(el.a("mainhand").executes($$1xx -> a($$1xx, gh.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bxo.a), $$2))))
                              .then(el.a("offhand").executes($$1xx -> a($$1xx, gh.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bxo.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ek, T>> T a(T $$0, aom.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)el.a("replace")
                  .then(
                     el.a("entity")
                        .then(
                           el.a("entities", ex.b())
                              .then(
                                 $$1.construct(el.a("slot", ft.a()), ($$0x, $$1x, $$2) -> a(ex.b($$0x, "entities"), ft.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          el.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ex.b($$0x, "entities"), ft.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  el.a("block")
                     .then(
                        el.a("targetPos", gh.a())
                           .then(
                              $$1.construct(
                                    el.a("slot", ft.a()),
                                    ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), gh.a($$0x, "targetPos"), ft.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       el.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ek)$$0x.getSource(),
                                             gh.a($$0x, "targetPos"),
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
         .then(el.a("insert").then($$1.construct(el.a("targetPos", gh.a()), ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), gh.a($$0x, "targetPos"), $$1x, $$2))))
         .then(el.a("give").then($$1.construct(el.a("players", ex.d()), ($$0x, $$1x, $$2) -> a(ex.f($$0x, "players"), $$1x, $$2))))
         .then(el.a("spawn").then($$1.construct(el.a("targetPos", go.a()), ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), go.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static buv a(ek $$0, iw $$1) throws CommandSyntaxException {
      dyo $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof buv)) {
         throw aof.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (buv)$$2;
      }
   }

   private static int a(ek $$0, iw $$1, List<dak> $$2, aom.a $$3) throws CommandSyntaxException {
      buv $$4 = a($$0, $$1);
      List<dak> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (dak $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(buv $$0, dak $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         dak $$4 = $$0.a($$3);
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

   private static int a(ek $$0, iw $$1, int $$2, int $$3, List<dak> $$4, aom.a $$5) throws CommandSyntaxException {
      buv $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<dak> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            dak $$11 = $$9 < $$4.size() ? $$4.get($$9) : dak.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aof.c.create($$2);
      }
   }

   private static boolean a(dak $$0, dak $$1) {
      return $$0.M() <= $$0.k() && dak.c($$0, $$1);
   }

   private static int a(Collection<asc> $$0, List<dak> $$1, aom.a $$2) throws CommandSyntaxException {
      List<dak> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (dak $$4 : $$1) {
         for (asc $$5 : $$0) {
            if ($$5.gj().g($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bxe $$0, List<dak> $$1, int $$2, int $$3, List<dak> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         dak $$6 = $$5 < $$1.size() ? $$1.get($$5) : dak.l;
         byw $$7 = $$0.a_($$2 + $$5);
         if ($$7 != byw.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bxe> $$0, int $$1, int $$2, List<dak> $$3, aom.a $$4) throws CommandSyntaxException {
      List<dak> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bxe $$6 : $$0) {
         if ($$6 instanceof asc $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bR.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ek $$0, fgc $$1, List<dak> $$2, aom.a $$3) throws CommandSyntaxException {
      asb $$4 = $$0.e();
      $$2.forEach($$2x -> {
         coo $$3x = new coo($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ek $$0, List<dak> $$1) {
      if ($$1.size() == 1) {
         dak $$2 = $$1.get(0);
         $$0.a(() -> xg.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> xg.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ek $$0, List<dak> $$1, alq<fay> $$2) {
      if ($$1.size() == 1) {
         dak $$3 = $$1.get(0);
         $$0.a(() -> xg.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), xg.a($$2.a())), false);
      } else {
         $$0.a(() -> xg.a("commands.drop.success.multiple_with_table", $$1.size(), xg.a($$2.a())), false);
      }
   }

   private static dak a(ek $$0, bxo $$1) throws CommandSyntaxException {
      bxe $$2 = $$0.g();
      if ($$2 instanceof byf) {
         return ((byf)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ek> $$0, iw $$1, dak $$2, aom.b $$3) throws CommandSyntaxException {
      ek $$4 = (ek)$$0.getSource();
      asb $$5 = $$4.e();
      ebq $$6 = $$5.a_($$1);
      dyo $$7 = $$5.c_($$1);
      Optional<alq<fay>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         faw.a $$9 = new faw.a($$5).a(fdn.f, fgc.b($$1)).a(fdn.g, $$6).b(fdn.h, $$7).b(fdn.a, $$4.f()).a(fdn.i, $$2);
         List<dak> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ek> $$0, bxe $$1, aom.b $$2) throws CommandSyntaxException {
      Optional<alq<fay>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ek $$4 = (ek)$$0.getSource();
         faw.a $$5 = new faw.a($$4.e());
         bxe $$6 = $$4.f();
         if ($$6 instanceof csi $$7) {
            $$5.a(fdn.b, $$7);
         }

         $$5.a(fdn.c, $$1.dW().q());
         $$5.b(fdn.e, $$6);
         $$5.b(fdn.d, $$6);
         $$5.a(fdn.a, $$1);
         $$5.a(fdn.f, $$4.d());
         faw $$8 = $$5.a(fdm.g);
         fay $$9 = $$4.l().bc().b($$3.get());
         List<dak> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ek> $$0, jg<fay> $$1, aom.b $$2) throws CommandSyntaxException {
      ek $$3 = (ek)$$0.getSource();
      faw $$4 = new faw.a($$3.e()).b(fdn.a, $$3.f()).a(fdn.f, $$3.d()).a(fdm.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ek> $$0, jg<fay> $$1, iw $$2, dak $$3, aom.b $$4) throws CommandSyntaxException {
      ek $$5 = (ek)$$0.getSource();
      faw $$6 = new faw.a($$5.e()).a(fdn.f, fgc.b($$2)).a(fdn.i, $$3).b(fdn.a, $$5.f()).a(fdm.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ek> $$0, jg<fay> $$1, faw $$2, aom.b $$3) throws CommandSyntaxException {
      ek $$4 = (ek)$$0.getSource();
      List<dak> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<dak> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ek> var1, List<dak> var2, aom.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ek, ?> construct(ArgumentBuilder<ek, ?> var1, aom.b var2);
   }
}
