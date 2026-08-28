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

public class aob {
   public static final SuggestionProvider<ei> a = ($$0, $$1) -> {
      alq.a $$2 = ((ei)$$0.getSource()).l().bc();
      return en.a($$2.a(mg.bq), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ej.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ej.a("fish")
                        .then(
                           ej.a("loot_table", fk.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("pos", gf.a())
                                             .executes($$1xx -> a($$1xx, fk.a($$1xx, "loot_table"), gf.a($$1xx, "pos"), czd.k, $$2)))
                                          .then(
                                             ej.a("tool", gs.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fk.a($$1xx, "loot_table"), gf.a($$1xx, "pos"), gs.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ej.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fk.a($$1xx, "loot_table"), gf.a($$1xx, "pos"), a((ei)$$1xx.getSource(), bwp.a), $$2))
                                       ))
                                    .then(
                                       ej.a("offhand")
                                          .executes($$1xx -> a($$1xx, fk.a($$1xx, "loot_table"), gf.a($$1xx, "pos"), a((ei)$$1xx.getSource(), bwp.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ej.a("loot").then(ej.a("loot_table", fk.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fk.a($$1xx, "loot_table"), $$2))))
                  .then(ej.a("kill").then(ej.a("target", ev.a()).executes($$1xx -> a($$1xx, ev.a($$1xx, "target"), $$2))))
                  .then(
                     ej.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("pos", gf.a())
                                       .executes($$1xx -> a($$1xx, gf.a($$1xx, "pos"), czd.k, $$2)))
                                    .then(ej.a("tool", gs.a($$1)).executes($$1xx -> a($$1xx, gf.a($$1xx, "pos"), gs.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ej.a("mainhand").executes($$1xx -> a($$1xx, gf.a($$1xx, "pos"), a((ei)$$1xx.getSource(), bwp.a), $$2))))
                              .then(ej.a("offhand").executes($$1xx -> a($$1xx, gf.a($$1xx, "pos"), a((ei)$$1xx.getSource(), bwp.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ei, T>> T a(T $$0, aob.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ej.a("replace")
                  .then(
                     ej.a("entity")
                        .then(
                           ej.a("entities", ev.b())
                              .then(
                                 $$1.construct(ej.a("slot", fr.a()), ($$0x, $$1x, $$2) -> a(ev.b($$0x, "entities"), fr.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ej.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ev.b($$0x, "entities"), fr.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ej.a("block")
                     .then(
                        ej.a("targetPos", gf.a())
                           .then(
                              $$1.construct(
                                    ej.a("slot", fr.a()),
                                    ($$0x, $$1x, $$2) -> a((ei)$$0x.getSource(), gf.a($$0x, "targetPos"), fr.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ej.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ei)$$0x.getSource(),
                                             gf.a($$0x, "targetPos"),
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
         .then(ej.a("insert").then($$1.construct(ej.a("targetPos", gf.a()), ($$0x, $$1x, $$2) -> a((ei)$$0x.getSource(), gf.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ej.a("give").then($$1.construct(ej.a("players", ev.d()), ($$0x, $$1x, $$2) -> a(ev.f($$0x, "players"), $$1x, $$2))))
         .then(ej.a("spawn").then($$1.construct(ej.a("targetPos", gm.a()), ($$0x, $$1x, $$2) -> a((ei)$$0x.getSource(), gm.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static btw a(ei $$0, iu $$1) throws CommandSyntaxException {
      dxf $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof btw)) {
         throw anu.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btw)$$2;
      }
   }

   private static int a(ei $$0, iu $$1, List<czd> $$2, aob.a $$3) throws CommandSyntaxException {
      btw $$4 = a($$0, $$1);
      List<czd> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (czd $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(btw $$0, czd $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         czd $$4 = $$0.a($$3);
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

   private static int a(ei $$0, iu $$1, int $$2, int $$3, List<czd> $$4, aob.a $$5) throws CommandSyntaxException {
      btw $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<czd> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            czd $$11 = $$9 < $$4.size() ? $$4.get($$9) : czd.k;
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

   private static boolean a(czd $$0, czd $$1) {
      return $$0.M() <= $$0.k() && czd.c($$0, $$1);
   }

   private static int a(Collection<arr> $$0, List<czd> $$1, aob.a $$2) throws CommandSyntaxException {
      List<czd> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (czd $$4 : $$1) {
         for (arr $$5 : $$0) {
            if ($$5.gj().g($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bwf $$0, List<czd> $$1, int $$2, int $$3, List<czd> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         czd $$6 = $$5 < $$1.size() ? $$1.get($$5) : czd.k;
         bxv $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bxv.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bwf> $$0, int $$1, int $$2, List<czd> $$3, aob.a $$4) throws CommandSyntaxException {
      List<czd> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bwf $$6 : $$0) {
         if ($$6 instanceof arr $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bR.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ei $$0, feq $$1, List<czd> $$2, aob.a $$3) throws CommandSyntaxException {
      arq $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cnh $$3x = new cnh($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ei $$0, List<czd> $$1) {
      if ($$1.size() == 1) {
         czd $$2 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ei $$0, List<czd> $$1, alf<ezm> $$2) {
      if ($$1.size() == 1) {
         czd $$3 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wy.a($$2.a())), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple_with_table", $$1.size(), wy.a($$2.a())), false);
      }
   }

   private static czd a(ei $$0, bwp $$1) throws CommandSyntaxException {
      bwf $$2 = $$0.g();
      if ($$2 instanceof bxe) {
         return ((bxe)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ei> $$0, iu $$1, czd $$2, aob.b $$3) throws CommandSyntaxException {
      ei $$4 = (ei)$$0.getSource();
      arq $$5 = $$4.e();
      eah $$6 = $$5.a_($$1);
      dxf $$7 = $$5.c_($$1);
      Optional<alf<ezm>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         ezk.a $$9 = new ezk.a($$5).a(fcb.f, feq.b($$1)).a(fcb.g, $$6).b(fcb.h, $$7).b(fcb.a, $$4.f()).a(fcb.i, $$2);
         List<czd> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ei> $$0, bwf $$1, aob.b $$2) throws CommandSyntaxException {
      Optional<alf<ezm>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ei $$4 = (ei)$$0.getSource();
         ezk.a $$5 = new ezk.a($$4.e());
         bwf $$6 = $$4.f();
         if ($$6 instanceof crc $$7) {
            $$5.a(fcb.b, $$7);
         }

         $$5.a(fcb.c, $$1.dW().q());
         $$5.b(fcb.e, $$6);
         $$5.b(fcb.d, $$6);
         $$5.a(fcb.a, $$1);
         $$5.a(fcb.f, $$4.d());
         ezk $$8 = $$5.a(fca.g);
         ezm $$9 = $$4.l().bc().b($$3.get());
         List<czd> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ei> $$0, je<ezm> $$1, aob.b $$2) throws CommandSyntaxException {
      ei $$3 = (ei)$$0.getSource();
      ezk $$4 = new ezk.a($$3.e()).b(fcb.a, $$3.f()).a(fcb.f, $$3.d()).a(fca.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ei> $$0, je<ezm> $$1, iu $$2, czd $$3, aob.b $$4) throws CommandSyntaxException {
      ei $$5 = (ei)$$0.getSource();
      ezk $$6 = new ezk.a($$5.e()).a(fcb.f, feq.b($$2)).a(fcb.i, $$3).b(fcb.a, $$5.f()).a(fca.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ei> $$0, je<ezm> $$1, ezk $$2, aob.b $$3) throws CommandSyntaxException {
      ei $$4 = (ei)$$0.getSource();
      List<czd> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<czd> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ei> var1, List<czd> var2, aob.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ei, ?> construct(ArgumentBuilder<ei, ?> var1, aob.b var2);
   }
}
