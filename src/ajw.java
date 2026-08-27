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

public class ajw {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      egz $$2 = ((ds)$$0.getSource()).l().aJ();
      return dx.a($$2.a(ehb.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vf.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), cmy.f, $$2)))
                                          .then(
                                             dt.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bma.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, et.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bma.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), cmy.f, $$2)))
                                    .then(dt.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bma.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bma.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, ajw.c $$1) {
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

   private static bju a(ds $$0, hx $$1) throws CommandSyntaxException {
      dgv $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bju)) {
         throw ajq.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bju)$$2;
      }
   }

   private static int a(ds $$0, hx $$1, List<cmy> $$2, ajw.a $$3) throws CommandSyntaxException {
      bju $$4 = a($$0, $$1);
      List<cmy> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cmy $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bju $$0, cmy $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cmy $$4 = $$0.a($$3);
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

   private static int a(ds $$0, hx $$1, int $$2, int $$3, List<cmy> $$4, ajw.a $$5) throws CommandSyntaxException {
      bju $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cmy> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cmy $$11 = $$9 < $$4.size() ? $$4.get($$9) : cmy.f;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ajq.b.create($$2);
      }
   }

   private static boolean a(cmy $$0, cmy $$1) {
      return $$0.L() <= $$0.g() && cmy.c($$0, $$1);
   }

   private static int a(Collection<ane> $$0, List<cmy> $$1, ajw.a $$2) throws CommandSyntaxException {
      List<cmy> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cmy $$4 : $$1) {
         for (ane $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(blv $$0, List<cmy> $$1, int $$2, int $$3, List<cmy> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cmy $$6 = $$5 < $$1.size() ? $$1.get($$5) : cmy.f;
         bnd $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bnd.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends blv> $$0, int $$1, int $$2, List<cmy> $$3, ajw.a $$4) throws CommandSyntaxException {
      List<cmy> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (blv $$6 : $$0) {
         if ($$6 instanceof ane $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, elt $$1, List<cmy> $$2, ajw.a $$3) throws CommandSyntaxException {
      and $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cbu $$3x = new cbu($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<cmy> $$1) {
      if ($$1.size() == 1) {
         cmy $$2 = $$1.get(0);
         $$0.a(() -> vf.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> vf.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<cmy> $$1, ahg $$2) {
      if ($$1.size() == 1) {
         cmy $$3 = $$1.get(0);
         $$0.a(() -> vf.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), vf.a($$2)), false);
      } else {
         $$0.a(() -> vf.a("commands.drop.success.multiple_with_table", $$1.size(), vf.a($$2)), false);
      }
   }

   private static cmy a(ds $$0, bma $$1) throws CommandSyntaxException {
      blv $$2 = $$0.g();
      if ($$2 instanceof bml) {
         return ((bml)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<ds> $$0, hx $$1, cmy $$2, ajw.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      and $$5 = $$4.e();
      djh $$6 = $$5.a_($$1);
      dgv $$7 = $$5.c_($$1);
      ehc.a $$8 = new ehc.a($$5).a(ejh.f, elt.b($$1)).a(ejh.g, $$6).b(ejh.h, $$7).b(ejh.a, $$4.f()).a(ejh.i, $$2);
      List<cmy> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ds> $$0, blv $$1, ajw.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bml)) {
         throw c.create($$1.Q_());
      } else {
         ahg $$3 = ((bml)$$1).eA();
         ds $$4 = (ds)$$0.getSource();
         ehc.a $$5 = new ehc.a($$4.e());
         blv $$6 = $$4.f();
         if ($$6 instanceof cfi $$7) {
            $$5.a(ejh.b, $$7);
         }

         $$5.a(ejh.c, $$1.dN().o());
         $$5.b(ejh.e, $$6);
         $$5.b(ejh.d, $$6);
         $$5.a(ejh.a, $$1);
         $$5.a(ejh.f, $$4.d());
         ehc $$8 = $$5.a(ejg.g);
         ehe $$9 = $$4.l().aJ().getLootTable($$3);
         List<cmy> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, ahg $$1, ajw.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      ehc $$4 = new ehc.a($$3.e()).b(ejh.a, $$3.f()).a(ejh.f, $$3.d()).a(ejg.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, ahg $$1, hx $$2, cmy $$3, ajw.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      ehc $$6 = new ehc.a($$5.e()).a(ejh.f, elt.b($$2)).a(ejh.i, $$3).b(ejh.a, $$5.f()).a(ejg.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, ahg $$1, ehc $$2, ajw.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      ehe $$5 = $$4.l().aJ().getLootTable($$1);
      List<cmy> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cmy> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<cmy> var2, ajw.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, ajw.b var2);
   }
}
