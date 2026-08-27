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

public class als {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      ekb $$2 = ((du)$$0.getSource()).l().aM();
      return dz.a($$2.a(ekd.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dv.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dv.a("fish")
                        .then(
                           dv.a("loot_table", ev.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fo.a())
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), cpq.h, $$2)))
                                          .then(
                                             dv.a("tool", ga.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bom.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bom.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dv.a("loot").then(dv.a("loot_table", ev.a()).suggests(a).executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), $$2))))
                  .then(dv.a("kill").then(dv.a("target", eh.a()).executes($$1xx -> a($$1xx, eh.a($$1xx, "target"), $$2))))
                  .then(
                     dv.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fo.a())
                                       .executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), cpq.h, $$2)))
                                    .then(dv.a("tool", ga.a($$1)).executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bom.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bom.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, als.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dv.a("replace")
                  .then(
                     dv.a("entity")
                        .then(
                           dv.a("entities", eh.b())
                              .then(
                                 $$1.construct(dv.a("slot", fb.a()), ($$0x, $$1x, $$2) -> a(eh.b($$0x, "entities"), fb.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dv.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                eh.b($$0x, "entities"), fb.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("block")
                     .then(
                        dv.a("targetPos", fo.a())
                           .then(
                              $$1.construct(
                                    dv.a("slot", fb.a()),
                                    ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fo.a($$0x, "targetPos"), fb.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dv.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (du)$$0x.getSource(),
                                             fo.a($$0x, "targetPos"),
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
         .then(dv.a("insert").then($$1.construct(dv.a("targetPos", fo.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fo.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dv.a("give").then($$1.construct(dv.a("players", eh.d()), ($$0x, $$1x, $$2) -> a(eh.f($$0x, "players"), $$1x, $$2))))
         .then(dv.a("spawn").then($$1.construct(dv.a("targetPos", fv.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fv.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bme a(du $$0, ib $$1) throws CommandSyntaxException {
      djl $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bme)) {
         throw alm.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bme)$$2;
      }
   }

   private static int a(du $$0, ib $$1, List<cpq> $$2, als.a $$3) throws CommandSyntaxException {
      bme $$4 = a($$0, $$1);
      List<cpq> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cpq $$6 : $$2) {
         if (a($$4, $$6.q())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bme $$0, cpq $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cpq $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.b()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.g() - $$4.M();
               int $$6 = Math.min($$1.M(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(du $$0, ib $$1, int $$2, int $$3, List<cpq> $$4, als.a $$5) throws CommandSyntaxException {
      bme $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cpq> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cpq $$11 = $$9 < $$4.size() ? $$4.get($$9) : cpq.h;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw alm.b.create($$2);
      }
   }

   private static boolean a(cpq $$0, cpq $$1) {
      return $$0.M() <= $$0.g() && cpq.c($$0, $$1);
   }

   private static int a(Collection<apb> $$0, List<cpq> $$1, als.a $$2) throws CommandSyntaxException {
      List<cpq> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cpq $$4 : $$1) {
         for (apb $$5 : $$0) {
            if ($$5.fV().e($$4.q())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bof $$0, List<cpq> $$1, int $$2, int $$3, List<cpq> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cpq $$6 = $$5 < $$1.size() ? $$1.get($$5) : cpq.h;
         bpo $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bpo.b && $$7.a($$6.q())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bof> $$0, int $$1, int $$2, List<cpq> $$3, als.a $$4) throws CommandSyntaxException {
      List<cpq> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bof $$6 : $$0) {
         if ($$6 instanceof apb $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bX.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, eov $$1, List<cpq> $$2, als.a $$3) throws CommandSyntaxException {
      apa $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cel $$3x = new cel($$4, $$1.c, $$1.d, $$1.e, $$2x.q());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<cpq> $$1) {
      if ($$1.size() == 1) {
         cpq $$2 = $$1.get(0);
         $$0.a(() -> vs.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> vs.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<cpq> $$1, ajc $$2) {
      if ($$1.size() == 1) {
         cpq $$3 = $$1.get(0);
         $$0.a(() -> vs.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), vs.a($$2)), false);
      } else {
         $$0.a(() -> vs.a("commands.drop.success.multiple_with_table", $$1.size(), vs.a($$2)), false);
      }
   }

   private static cpq a(du $$0, bom $$1) throws CommandSyntaxException {
      bof $$2 = $$0.g();
      if ($$2 instanceof box) {
         return ((box)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<du> $$0, ib $$1, cpq $$2, als.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      apa $$5 = $$4.e();
      dme $$6 = $$5.a_($$1);
      djl $$7 = $$5.c_($$1);
      eke.a $$8 = new eke.a($$5).a(emj.f, eov.b($$1)).a(emj.g, $$6).b(emj.h, $$7).b(emj.a, $$4.f()).a(emj.i, $$2);
      List<cpq> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bof $$1, als.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof box)) {
         throw c.create($$1.Q_());
      } else {
         ajc $$3 = ((box)$$1).ez();
         du $$4 = (du)$$0.getSource();
         eke.a $$5 = new eke.a($$4.e());
         bof $$6 = $$4.f();
         if ($$6 instanceof cia $$7) {
            $$5.a(emj.b, $$7);
         }

         $$5.a(emj.c, $$1.dK().o());
         $$5.b(emj.e, $$6);
         $$5.b(emj.d, $$6);
         $$5.a(emj.a, $$1);
         $$5.a(emj.f, $$4.d());
         eke $$8 = $$5.a(emi.g);
         ekg $$9 = $$4.l().aM().getLootTable($$3);
         List<cpq> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, ajc $$1, als.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      eke $$4 = new eke.a($$3.e()).b(emj.a, $$3.f()).a(emj.f, $$3.d()).a(emi.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, ajc $$1, ib $$2, cpq $$3, als.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      eke $$6 = new eke.a($$5.e()).a(emj.f, eov.b($$2)).a(emj.i, $$3).b(emj.a, $$5.f()).a(emi.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, ajc $$1, eke $$2, als.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      ekg $$5 = $$4.l().aM().getLootTable($$1);
      List<cpq> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cpq> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<cpq> var2, als.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, als.b var2);
   }
}
