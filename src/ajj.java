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

public class ajj {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      egh $$2 = ((ds)$$0.getSource()).l().aJ();
      return dw.a($$2.a(egj.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dt.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dt.a("fish")
                        .then(
                           dt.a("loot_table", es.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fk.a())
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), cmh.f, $$2)))
                                          .then(
                                             dt.a("tool", fw.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blk.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), fk.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blk.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dt.a("loot").then(dt.a("loot_table", es.a()).suggests(a).executes($$1xx -> a($$1xx, es.e($$1xx, "loot_table"), $$2))))
                  .then(dt.a("kill").then(dt.a("target", ee.a()).executes($$1xx -> a($$1xx, ee.a($$1xx, "target"), $$2))))
                  .then(
                     dt.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fk.a())
                                       .executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), cmh.f, $$2)))
                                    .then(dt.a("tool", fw.a($$1)).executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), fw.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blk.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fk.a($$1xx, "pos"), a((ds)$$1xx.getSource(), blk.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, ajj.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dt.a("replace")
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("entities", ee.b())
                              .then(
                                 $$1.construct(dt.a("slot", ey.a()), ($$0x, $$1x, $$2) -> a(ee.b($$0x, "entities"), ey.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dt.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ee.b($$0x, "entities"), ey.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("block")
                     .then(
                        dt.a("targetPos", fk.a())
                           .then(
                              $$1.construct(
                                    dt.a("slot", ey.a()),
                                    ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fk.a($$0x, "targetPos"), ey.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dt.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ds)$$0x.getSource(),
                                             fk.a($$0x, "targetPos"),
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
         .then(dt.a("insert").then($$1.construct(dt.a("targetPos", fk.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fk.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dt.a("give").then($$1.construct(dt.a("players", ee.d()), ($$0x, $$1x, $$2) -> a(ee.f($$0x, "players"), $$1x, $$2))))
         .then(dt.a("spawn").then($$1.construct(dt.a("targetPos", fr.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fr.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bje a(ds $$0, hv $$1) throws CommandSyntaxException {
      dgd $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bje)) {
         throw ajd.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bje)$$2;
      }
   }

   private static int a(ds $$0, hv $$1, List<cmh> $$2, ajj.a $$3) throws CommandSyntaxException {
      bje $$4 = a($$0, $$1);
      List<cmh> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cmh $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bje $$0, cmh $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cmh $$4 = $$0.a($$3);
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

   private static int a(ds $$0, hv $$1, int $$2, int $$3, List<cmh> $$4, ajj.a $$5) throws CommandSyntaxException {
      bje $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cmh> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cmh $$11 = $$9 < $$4.size() ? $$4.get($$9) : cmh.f;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ajd.b.create($$2);
      }
   }

   private static boolean a(cmh $$0, cmh $$1) {
      return $$0.L() <= $$0.g() && cmh.c($$0, $$1);
   }

   private static int a(Collection<amq> $$0, List<cmh> $$1, ajj.a $$2) throws CommandSyntaxException {
      List<cmh> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cmh $$4 : $$1) {
         for (amq $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(blf $$0, List<cmh> $$1, int $$2, int $$3, List<cmh> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cmh $$6 = $$5 < $$1.size() ? $$1.get($$5) : cmh.f;
         bmn $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bmn.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends blf> $$0, int $$1, int $$2, List<cmh> $$3, ajj.a $$4) throws CommandSyntaxException {
      List<cmh> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (blf $$6 : $$0) {
         if ($$6 instanceof amq $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, elb $$1, List<cmh> $$2, ajj.a $$3) throws CommandSyntaxException {
      amp $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cbe $$3x = new cbe($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<cmh> $$1) {
      if ($$1.size() == 1) {
         cmh $$2 = $$1.get(0);
         $$0.a(() -> vb.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> vb.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<cmh> $$1, agt $$2) {
      if ($$1.size() == 1) {
         cmh $$3 = $$1.get(0);
         $$0.a(() -> vb.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), vb.a($$2)), false);
      } else {
         $$0.a(() -> vb.a("commands.drop.success.multiple_with_table", $$1.size(), vb.a($$2)), false);
      }
   }

   private static cmh a(ds $$0, blk $$1) throws CommandSyntaxException {
      blf $$2 = $$0.g();
      if ($$2 instanceof blv) {
         return ((blv)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<ds> $$0, hv $$1, cmh $$2, ajj.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      amp $$5 = $$4.e();
      dip $$6 = $$5.a_($$1);
      dgd $$7 = $$5.c_($$1);
      egk.a $$8 = new egk.a($$5).a(eip.f, elb.b($$1)).a(eip.g, $$6).b(eip.h, $$7).b(eip.a, $$4.f()).a(eip.i, $$2);
      List<cmh> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ds> $$0, blf $$1, ajj.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof blv)) {
         throw c.create($$1.Q_());
      } else {
         agt $$3 = ((blv)$$1).eA();
         ds $$4 = (ds)$$0.getSource();
         egk.a $$5 = new egk.a($$4.e());
         blf $$6 = $$4.f();
         if ($$6 instanceof cer $$7) {
            $$5.a(eip.b, $$7);
         }

         $$5.a(eip.c, $$1.dN().o());
         $$5.b(eip.e, $$6);
         $$5.b(eip.d, $$6);
         $$5.a(eip.a, $$1);
         $$5.a(eip.f, $$4.d());
         egk $$8 = $$5.a(eio.g);
         egm $$9 = $$4.l().aJ().getLootTable($$3);
         List<cmh> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, agt $$1, ajj.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      egk $$4 = new egk.a($$3.e()).b(eip.a, $$3.f()).a(eip.f, $$3.d()).a(eio.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, agt $$1, hv $$2, cmh $$3, ajj.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      egk $$6 = new egk.a($$5.e()).a(eip.f, elb.b($$2)).a(eip.i, $$3).b(eip.a, $$5.f()).a(eio.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, agt $$1, egk $$2, ajj.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      egm $$5 = $$4.l().aJ().getLootTable($$1);
      List<cmh> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cmh> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<cmh> var2, ajj.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, ajj.b var2);
   }
}
