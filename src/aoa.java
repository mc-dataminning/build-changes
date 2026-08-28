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

public class aoa {
   public static final SuggestionProvider<ev> a = ($$0, $$1) -> {
      alr.a $$2 = ((ev)$$0.getSource()).l().bd();
      return fa.a($$2.a(ly.bd), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ew.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ew.a("fish")
                        .then(
                           ew.a("loot_table", fx.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("pos", gr.a())
                                             .executes($$1xx -> a($$1xx, fx.a($$1xx, "loot_table"), gr.a($$1xx, "pos"), cvx.k, $$2)))
                                          .then(
                                             ew.a("tool", he.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fx.a($$1xx, "loot_table"), gr.a($$1xx, "pos"), he.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ew.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fx.a($$1xx, "loot_table"), gr.a($$1xx, "pos"), a((ev)$$1xx.getSource(), buh.a), $$2))
                                       ))
                                    .then(
                                       ew.a("offhand")
                                          .executes($$1xx -> a($$1xx, fx.a($$1xx, "loot_table"), gr.a($$1xx, "pos"), a((ev)$$1xx.getSource(), buh.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ew.a("loot").then(ew.a("loot_table", fx.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fx.a($$1xx, "loot_table"), $$2))))
                  .then(ew.a("kill").then(ew.a("target", fi.a()).executes($$1xx -> a($$1xx, fi.a($$1xx, "target"), $$2))))
                  .then(
                     ew.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("pos", gr.a())
                                       .executes($$1xx -> a($$1xx, gr.a($$1xx, "pos"), cvx.k, $$2)))
                                    .then(ew.a("tool", he.a($$1)).executes($$1xx -> a($$1xx, gr.a($$1xx, "pos"), he.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ew.a("mainhand").executes($$1xx -> a($$1xx, gr.a($$1xx, "pos"), a((ev)$$1xx.getSource(), buh.a), $$2))))
                              .then(ew.a("offhand").executes($$1xx -> a($$1xx, gr.a($$1xx, "pos"), a((ev)$$1xx.getSource(), buh.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ev, T>> T a(T $$0, aoa.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ew.a("replace")
                  .then(
                     ew.a("entity")
                        .then(
                           ew.a("entities", fi.b())
                              .then(
                                 $$1.construct(ew.a("slot", gd.a()), ($$0x, $$1x, $$2) -> a(fi.b($$0x, "entities"), gd.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ew.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fi.b($$0x, "entities"), gd.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ew.a("block")
                     .then(
                        ew.a("targetPos", gr.a())
                           .then(
                              $$1.construct(
                                    ew.a("slot", gd.a()),
                                    ($$0x, $$1x, $$2) -> a((ev)$$0x.getSource(), gr.a($$0x, "targetPos"), gd.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ew.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ev)$$0x.getSource(),
                                             gr.a($$0x, "targetPos"),
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
         .then(ew.a("insert").then($$1.construct(ew.a("targetPos", gr.a()), ($$0x, $$1x, $$2) -> a((ev)$$0x.getSource(), gr.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ew.a("give").then($$1.construct(ew.a("players", fi.d()), ($$0x, $$1x, $$2) -> a(fi.f($$0x, "players"), $$1x, $$2))))
         .then(ew.a("spawn").then($$1.construct(ew.a("targetPos", gy.a()), ($$0x, $$1x, $$2) -> a((ev)$$0x.getSource(), gy.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static brr a(ev $$0, jg $$1) throws CommandSyntaxException {
      dsg $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof brr)) {
         throw anu.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (brr)$$2;
      }
   }

   private static int a(ev $$0, jg $$1, List<cvx> $$2, aoa.a $$3) throws CommandSyntaxException {
      brr $$4 = a($$0, $$1);
      List<cvx> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cvx $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(brr $$0, cvx $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cvx $$4 = $$0.a($$3);
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

   private static int a(ev $$0, jg $$1, int $$2, int $$3, List<cvx> $$4, aoa.a $$5) throws CommandSyntaxException {
      brr $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cvx> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cvx $$11 = $$9 < $$4.size() ? $$4.get($$9) : cvx.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anu.c.create($$2);
      }
   }

   private static boolean a(cvx $$0, cvx $$1) {
      return $$0.L() <= $$0.k() && cvx.c($$0, $$1);
   }

   private static int a(Collection<arn> $$0, List<cvx> $$1, aoa.a $$2) throws CommandSyntaxException {
      List<cvx> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cvx $$4 : $$1) {
         for (arn $$5 : $$0) {
            if ($$5.gk().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(btz $$0, List<cvx> $$1, int $$2, int $$3, List<cvx> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cvx $$6 = $$5 < $$1.size() ? $$1.get($$5) : cvx.k;
         bvn $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bvn.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends btz> $$0, int $$1, int $$2, List<cvx> $$3, aoa.a $$4) throws CommandSyntaxException {
      List<cvx> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (btz $$6 : $$0) {
         if ($$6 instanceof arn $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.ca.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ev $$0, ezh $$1, List<cvx> $$2, aoa.a $$3) throws CommandSyntaxException {
      arm $$4 = $$0.e();
      $$2.forEach($$2x -> {
         ckq $$3x = new ckq($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.q();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ev $$0, List<cvx> $$1) {
      if ($$1.size() == 1) {
         cvx $$2 = $$1.get(0);
         $$0.a(() -> xh.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> xh.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ev $$0, List<cvx> $$1, alg<eub> $$2) {
      if ($$1.size() == 1) {
         cvx $$3 = $$1.get(0);
         $$0.a(() -> xh.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), xh.a($$2.a())), false);
      } else {
         $$0.a(() -> xh.a("commands.drop.success.multiple_with_table", $$1.size(), xh.a($$2.a())), false);
      }
   }

   private static cvx a(ev $$0, buh $$1) throws CommandSyntaxException {
      btz $$2 = $$0.g();
      if ($$2 instanceof buv) {
         return ((buv)$$2).a($$1);
      } else {
         throw b.create($$2.S_());
      }
   }

   private static int a(CommandContext<ev> $$0, jg $$1, cvx $$2, aoa.b $$3) throws CommandSyntaxException {
      ev $$4 = (ev)$$0.getSource();
      arm $$5 = $$4.e();
      dvd $$6 = $$5.a_($$1);
      dsg $$7 = $$5.c_($$1);
      Optional<alg<eub>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         etz.a $$9 = new etz.a($$5).a(ews.f, ezh.b($$1)).a(ews.g, $$6).b(ews.h, $$7).b(ews.a, $$4.f()).a(ews.i, $$2);
         List<cvx> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ev> $$0, btz $$1, aoa.b $$2) throws CommandSyntaxException {
      Optional<alg<eub>> $$3 = $$1.ec();
      if ($$3.isEmpty()) {
         throw c.create($$1.S_());
      } else {
         ev $$4 = (ev)$$0.getSource();
         etz.a $$5 = new etz.a($$4.e());
         btz $$6 = $$4.f();
         if ($$6 instanceof coh $$7) {
            $$5.a(ews.b, $$7);
         }

         $$5.a(ews.c, $$1.dY().q());
         $$5.b(ews.e, $$6);
         $$5.b(ews.d, $$6);
         $$5.a(ews.a, $$1);
         $$5.a(ews.f, $$4.d());
         etz $$8 = $$5.a(ewr.g);
         eub $$9 = $$4.l().bd().b($$3.get());
         List<cvx> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ev> $$0, jp<eub> $$1, aoa.b $$2) throws CommandSyntaxException {
      ev $$3 = (ev)$$0.getSource();
      etz $$4 = new etz.a($$3.e()).b(ews.a, $$3.f()).a(ews.f, $$3.d()).a(ewr.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ev> $$0, jp<eub> $$1, jg $$2, cvx $$3, aoa.b $$4) throws CommandSyntaxException {
      ev $$5 = (ev)$$0.getSource();
      etz $$6 = new etz.a($$5.e()).a(ews.f, ezh.b($$2)).a(ews.i, $$3).b(ews.a, $$5.f()).a(ewr.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ev> $$0, jp<eub> $$1, etz $$2, aoa.b $$3) throws CommandSyntaxException {
      ev $$4 = (ev)$$0.getSource();
      List<cvx> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cvx> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ev> var1, List<cvx> var2, aoa.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ev, ?> construct(ArgumentBuilder<ev, ?> var1, aoa.b var2);
   }
}
