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

public class alx {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      ekx $$2 = ((du)$$0.getSource()).l().aM();
      return dz.a($$2.a(ekz.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vu.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vu.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), cqk.h, $$2)))
                                          .then(
                                             dv.a("tool", ga.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bpd.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bpd.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), cqk.h, $$2)))
                                    .then(dv.a("tool", ga.a($$1)).executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bpd.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bpd.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, alx.c $$1) {
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

   private static bmv a(du $$0, ib $$1) throws CommandSyntaxException {
      dkg $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bmv)) {
         throw alr.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bmv)$$2;
      }
   }

   private static int a(du $$0, ib $$1, List<cqk> $$2, alx.a $$3) throws CommandSyntaxException {
      bmv $$4 = a($$0, $$1);
      List<cqk> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cqk $$6 : $$2) {
         if (a($$4, $$6.q())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bmv $$0, cqk $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cqk $$4 = $$0.a($$3);
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

   private static int a(du $$0, ib $$1, int $$2, int $$3, List<cqk> $$4, alx.a $$5) throws CommandSyntaxException {
      bmv $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cqk> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cqk $$11 = $$9 < $$4.size() ? $$4.get($$9) : cqk.h;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw alr.b.create($$2);
      }
   }

   private static boolean a(cqk $$0, cqk $$1) {
      return $$0.M() <= $$0.g() && cqk.c($$0, $$1);
   }

   private static int a(Collection<apg> $$0, List<cqk> $$1, alx.a $$2) throws CommandSyntaxException {
      List<cqk> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cqk $$4 : $$1) {
         for (apg $$5 : $$0) {
            if ($$5.fZ().e($$4.q())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bow $$0, List<cqk> $$1, int $$2, int $$3, List<cqk> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cqk $$6 = $$5 < $$1.size() ? $$1.get($$5) : cqk.h;
         bqf $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bqf.b && $$7.a($$6.q())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bow> $$0, int $$1, int $$2, List<cqk> $$3, alx.a $$4) throws CommandSyntaxException {
      List<cqk> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bow $$6 : $$0) {
         if ($$6 instanceof apg $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bZ.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, epr $$1, List<cqk> $$2, alx.a $$3) throws CommandSyntaxException {
      apf $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cfd $$3x = new cfd($$4, $$1.c, $$1.d, $$1.e, $$2x.q());
         $$3x.s();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<cqk> $$1) {
      if ($$1.size() == 1) {
         cqk $$2 = $$1.get(0);
         $$0.a(() -> vu.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> vu.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<cqk> $$1, ajh $$2) {
      if ($$1.size() == 1) {
         cqk $$3 = $$1.get(0);
         $$0.a(() -> vu.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), vu.a($$2)), false);
      } else {
         $$0.a(() -> vu.a("commands.drop.success.multiple_with_table", $$1.size(), vu.a($$2)), false);
      }
   }

   private static cqk a(du $$0, bpd $$1) throws CommandSyntaxException {
      bow $$2 = $$0.g();
      if ($$2 instanceof bpo) {
         return ((bpo)$$2).d($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<du> $$0, ib $$1, cqk $$2, alx.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      apf $$5 = $$4.e();
      dmz $$6 = $$5.a_($$1);
      dkg $$7 = $$5.c_($$1);
      ela.a $$8 = new ela.a($$5).a(enf.f, epr.b($$1)).a(enf.g, $$6).b(enf.h, $$7).b(enf.a, $$4.f()).a(enf.i, $$2);
      List<cqk> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bow $$1, alx.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bpo)) {
         throw c.create($$1.O_());
      } else {
         ajh $$3 = ((bpo)$$1).eC();
         du $$4 = (du)$$0.getSource();
         ela.a $$5 = new ela.a($$4.e());
         bow $$6 = $$4.f();
         if ($$6 instanceof cis $$7) {
            $$5.a(enf.b, $$7);
         }

         $$5.a(enf.c, $$1.dN().o());
         $$5.b(enf.e, $$6);
         $$5.b(enf.d, $$6);
         $$5.a(enf.a, $$1);
         $$5.a(enf.f, $$4.d());
         ela $$8 = $$5.a(ene.g);
         elc $$9 = $$4.l().aM().getLootTable($$3);
         List<cqk> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, ajh $$1, alx.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      ela $$4 = new ela.a($$3.e()).b(enf.a, $$3.f()).a(enf.f, $$3.d()).a(ene.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, ajh $$1, ib $$2, cqk $$3, alx.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      ela $$6 = new ela.a($$5.e()).a(enf.f, epr.b($$2)).a(enf.i, $$3).b(enf.a, $$5.f()).a(ene.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, ajh $$1, ela $$2, alx.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      elc $$5 = $$4.l().aM().getLootTable($$1);
      List<cqk> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cqk> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<cqk> var2, alx.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, alx.b var2);
   }
}
