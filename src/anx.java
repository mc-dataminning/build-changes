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

public class anx {
   public static final SuggestionProvider<eu> a = ($$0, $$1) -> {
      alo.a $$2 = ((eu)$$0.getSource()).l().bd();
      return ez.a($$2.a(lw.be), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ev.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ev.a("fish")
                        .then(
                           ev.a("loot_table", fw.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("pos", gq.a())
                                             .executes($$1xx -> a($$1xx, fw.a($$1xx, "loot_table"), gq.a($$1xx, "pos"), cvs.k, $$2)))
                                          .then(
                                             ev.a("tool", hd.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fw.a($$1xx, "loot_table"), gq.a($$1xx, "pos"), hd.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ev.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fw.a($$1xx, "loot_table"), gq.a($$1xx, "pos"), a((eu)$$1xx.getSource(), btz.a), $$2))
                                       ))
                                    .then(
                                       ev.a("offhand")
                                          .executes($$1xx -> a($$1xx, fw.a($$1xx, "loot_table"), gq.a($$1xx, "pos"), a((eu)$$1xx.getSource(), btz.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ev.a("loot").then(ev.a("loot_table", fw.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fw.a($$1xx, "loot_table"), $$2))))
                  .then(ev.a("kill").then(ev.a("target", fh.a()).executes($$1xx -> a($$1xx, fh.a($$1xx, "target"), $$2))))
                  .then(
                     ev.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("pos", gq.a())
                                       .executes($$1xx -> a($$1xx, gq.a($$1xx, "pos"), cvs.k, $$2)))
                                    .then(ev.a("tool", hd.a($$1)).executes($$1xx -> a($$1xx, gq.a($$1xx, "pos"), hd.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ev.a("mainhand").executes($$1xx -> a($$1xx, gq.a($$1xx, "pos"), a((eu)$$1xx.getSource(), btz.a), $$2))))
                              .then(ev.a("offhand").executes($$1xx -> a($$1xx, gq.a($$1xx, "pos"), a((eu)$$1xx.getSource(), btz.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<eu, T>> T a(T $$0, anx.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ev.a("replace")
                  .then(
                     ev.a("entity")
                        .then(
                           ev.a("entities", fh.b())
                              .then(
                                 $$1.construct(ev.a("slot", gc.a()), ($$0x, $$1x, $$2) -> a(fh.b($$0x, "entities"), gc.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ev.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fh.b($$0x, "entities"), gc.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ev.a("block")
                     .then(
                        ev.a("targetPos", gq.a())
                           .then(
                              $$1.construct(
                                    ev.a("slot", gc.a()),
                                    ($$0x, $$1x, $$2) -> a((eu)$$0x.getSource(), gq.a($$0x, "targetPos"), gc.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ev.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (eu)$$0x.getSource(),
                                             gq.a($$0x, "targetPos"),
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
         .then(ev.a("insert").then($$1.construct(ev.a("targetPos", gq.a()), ($$0x, $$1x, $$2) -> a((eu)$$0x.getSource(), gq.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ev.a("give").then($$1.construct(ev.a("players", fh.d()), ($$0x, $$1x, $$2) -> a(fh.f($$0x, "players"), $$1x, $$2))))
         .then(ev.a("spawn").then($$1.construct(ev.a("targetPos", gx.a()), ($$0x, $$1x, $$2) -> a((eu)$$0x.getSource(), gx.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static brl a(eu $$0, jf $$1) throws CommandSyntaxException {
      drv $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof brl)) {
         throw anr.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (brl)$$2;
      }
   }

   private static int a(eu $$0, jf $$1, List<cvs> $$2, anx.a $$3) throws CommandSyntaxException {
      brl $$4 = a($$0, $$1);
      List<cvs> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cvs $$6 : $$2) {
         if (a($$4, $$6.u())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(brl $$0, cvs $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cvs $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.K();
               int $$6 = Math.min($$1.K(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(eu $$0, jf $$1, int $$2, int $$3, List<cvs> $$4, anx.a $$5) throws CommandSyntaxException {
      brl $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cvs> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cvs $$11 = $$9 < $$4.size() ? $$4.get($$9) : cvs.k;
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

   private static boolean a(cvs $$0, cvs $$1) {
      return $$0.K() <= $$0.k() && cvs.c($$0, $$1);
   }

   private static int a(Collection<ark> $$0, List<cvs> $$1, anx.a $$2) throws CommandSyntaxException {
      List<cvs> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cvs $$4 : $$1) {
         for (ark $$5 : $$0) {
            if ($$5.gd().f($$4.u())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(btr $$0, List<cvs> $$1, int $$2, int $$3, List<cvs> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cvs $$6 = $$5 < $$1.size() ? $$1.get($$5) : cvs.k;
         bve $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bve.a && $$7.a($$6.u())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends btr> $$0, int $$1, int $$2, List<cvs> $$3, anx.a $$4) throws CommandSyntaxException {
      List<cvs> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (btr $$6 : $$0) {
         if ($$6 instanceof ark $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bZ.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(eu $$0, eyw $$1, List<cvs> $$2, anx.a $$3) throws CommandSyntaxException {
      arj $$4 = $$0.e();
      $$2.forEach($$2x -> {
         ckh $$3x = new ckh($$4, $$1.d, $$1.e, $$1.f, $$2x.u());
         $$3x.q();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(eu $$0, List<cvs> $$1) {
      if ($$1.size() == 1) {
         cvs $$2 = $$1.get(0);
         $$0.a(() -> xe.a("commands.drop.success.single", $$2.K(), $$2.I()), false);
      } else {
         $$0.a(() -> xe.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(eu $$0, List<cvs> $$1, ald<etq> $$2) {
      if ($$1.size() == 1) {
         cvs $$3 = $$1.get(0);
         $$0.a(() -> xe.a("commands.drop.success.single_with_table", $$3.K(), $$3.I(), xe.a($$2.a())), false);
      } else {
         $$0.a(() -> xe.a("commands.drop.success.multiple_with_table", $$1.size(), xe.a($$2.a())), false);
      }
   }

   private static cvs a(eu $$0, btz $$1) throws CommandSyntaxException {
      btr $$2 = $$0.g();
      if ($$2 instanceof bun) {
         return ((bun)$$2).a($$1);
      } else {
         throw b.create($$2.R_());
      }
   }

   private static int a(CommandContext<eu> $$0, jf $$1, cvs $$2, anx.b $$3) throws CommandSyntaxException {
      eu $$4 = (eu)$$0.getSource();
      arj $$5 = $$4.e();
      dus $$6 = $$5.a_($$1);
      drv $$7 = $$5.c_($$1);
      Optional<ald<etq>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         eto.a $$9 = new eto.a($$5).a(ewh.f, eyw.b($$1)).a(ewh.g, $$6).b(ewh.h, $$7).b(ewh.a, $$4.f()).a(ewh.i, $$2);
         List<cvs> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<eu> $$0, btr $$1, anx.b $$2) throws CommandSyntaxException {
      Optional<ald<etq>> $$3 = $$1.dX();
      if ($$3.isEmpty()) {
         throw c.create($$1.R_());
      } else {
         eu $$4 = (eu)$$0.getSource();
         eto.a $$5 = new eto.a($$4.e());
         btr $$6 = $$4.f();
         if ($$6 instanceof cnx $$7) {
            $$5.a(ewh.b, $$7);
         }

         $$5.a(ewh.c, $$1.dT().q());
         $$5.b(ewh.e, $$6);
         $$5.b(ewh.d, $$6);
         $$5.a(ewh.a, $$1);
         $$5.a(ewh.f, $$4.d());
         eto $$8 = $$5.a(ewg.g);
         etq $$9 = $$4.l().bd().b($$3.get());
         List<cvs> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<eu> $$0, jo<etq> $$1, anx.b $$2) throws CommandSyntaxException {
      eu $$3 = (eu)$$0.getSource();
      eto $$4 = new eto.a($$3.e()).b(ewh.a, $$3.f()).a(ewh.f, $$3.d()).a(ewg.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<eu> $$0, jo<etq> $$1, jf $$2, cvs $$3, anx.b $$4) throws CommandSyntaxException {
      eu $$5 = (eu)$$0.getSource();
      eto $$6 = new eto.a($$5.e()).a(ewh.f, eyw.b($$2)).a(ewh.i, $$3).b(ewh.a, $$5.f()).a(ewg.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<eu> $$0, jo<etq> $$1, eto $$2, anx.b $$3) throws CommandSyntaxException {
      eu $$4 = (eu)$$0.getSource();
      List<cvs> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cvs> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<eu> var1, List<cvs> var2, anx.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<eu, ?> construct(ArgumentBuilder<eu, ?> var1, anx.b var2);
   }
}
