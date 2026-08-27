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

public class ajt {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      egs $$2 = ((ds)$$0.getSource()).l().aJ();
      return dx.a($$2.a(egu.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vd.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), cmr.f, $$2)))
                                          .then(
                                             dt.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blu.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blu.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), cmr.f, $$2)))
                                    .then(dt.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blu.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blu.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, ajt.c $$1) {
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

   private static bjo a(ds $$0, hx $$1) throws CommandSyntaxException {
      dgo $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bjo)) {
         throw ajn.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bjo)$$2;
      }
   }

   private static int a(ds $$0, hx $$1, List<cmr> $$2, ajt.a $$3) throws CommandSyntaxException {
      bjo $$4 = a($$0, $$1);
      List<cmr> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cmr $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bjo $$0, cmr $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cmr $$4 = $$0.a($$3);
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

   private static int a(ds $$0, hx $$1, int $$2, int $$3, List<cmr> $$4, ajt.a $$5) throws CommandSyntaxException {
      bjo $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cmr> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cmr $$11 = $$9 < $$4.size() ? $$4.get($$9) : cmr.f;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ajn.b.create($$2);
      }
   }

   private static boolean a(cmr $$0, cmr $$1) {
      return $$0.L() <= $$0.g() && cmr.c($$0, $$1);
   }

   private static int a(Collection<ana> $$0, List<cmr> $$1, ajt.a $$2) throws CommandSyntaxException {
      List<cmr> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cmr $$4 : $$1) {
         for (ana $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(blp $$0, List<cmr> $$1, int $$2, int $$3, List<cmr> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cmr $$6 = $$5 < $$1.size() ? $$1.get($$5) : cmr.f;
         bmx $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bmx.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends blp> $$0, int $$1, int $$2, List<cmr> $$3, ajt.a $$4) throws CommandSyntaxException {
      List<cmr> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (blp $$6 : $$0) {
         if ($$6 instanceof ana $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, elm $$1, List<cmr> $$2, ajt.a $$3) throws CommandSyntaxException {
      amz $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cbo $$3x = new cbo($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<cmr> $$1) {
      if ($$1.size() == 1) {
         cmr $$2 = $$1.get(0);
         $$0.a(() -> vd.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> vd.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<cmr> $$1, ahd $$2) {
      if ($$1.size() == 1) {
         cmr $$3 = $$1.get(0);
         $$0.a(() -> vd.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), vd.a($$2)), false);
      } else {
         $$0.a(() -> vd.a("commands.drop.success.multiple_with_table", $$1.size(), vd.a($$2)), false);
      }
   }

   private static cmr a(ds $$0, blu $$1) throws CommandSyntaxException {
      blp $$2 = $$0.g();
      if ($$2 instanceof bmf) {
         return ((bmf)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<ds> $$0, hx $$1, cmr $$2, ajt.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      amz $$5 = $$4.e();
      dja $$6 = $$5.a_($$1);
      dgo $$7 = $$5.c_($$1);
      egv.a $$8 = new egv.a($$5).a(eja.f, elm.b($$1)).a(eja.g, $$6).b(eja.h, $$7).b(eja.a, $$4.f()).a(eja.i, $$2);
      List<cmr> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ds> $$0, blp $$1, ajt.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bmf)) {
         throw c.create($$1.Q_());
      } else {
         ahd $$3 = ((bmf)$$1).eA();
         ds $$4 = (ds)$$0.getSource();
         egv.a $$5 = new egv.a($$4.e());
         blp $$6 = $$4.f();
         if ($$6 instanceof cfb $$7) {
            $$5.a(eja.b, $$7);
         }

         $$5.a(eja.c, $$1.dN().o());
         $$5.b(eja.e, $$6);
         $$5.b(eja.d, $$6);
         $$5.a(eja.a, $$1);
         $$5.a(eja.f, $$4.d());
         egv $$8 = $$5.a(eiz.g);
         egx $$9 = $$4.l().aJ().getLootTable($$3);
         List<cmr> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, ahd $$1, ajt.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      egv $$4 = new egv.a($$3.e()).b(eja.a, $$3.f()).a(eja.f, $$3.d()).a(eiz.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, ahd $$1, hx $$2, cmr $$3, ajt.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      egv $$6 = new egv.a($$5.e()).a(eja.f, elm.b($$2)).a(eja.i, $$3).b(eja.a, $$5.f()).a(eiz.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, ahd $$1, egv $$2, ajt.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      egx $$5 = $$4.l().aJ().getLootTable($$1);
      List<cmr> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cmr> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<cmr> var2, ajt.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, ajt.b var2);
   }
}
