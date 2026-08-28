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

public class anb {
   public static final SuggestionProvider<eq> a = ($$0, $$1) -> {
      aku.b $$2 = ((eq)$$0.getSource()).l().bf();
      return ev.a($$2.a(lr.bb), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)er.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     er.a("fish")
                        .then(
                           er.a("loot_table", fs.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("pos", gm.a())
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), cud.l, $$2)))
                                          .then(
                                             er.a("tool", gz.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          er.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bso.a), $$2))
                                       ))
                                    .then(
                                       er.a("offhand")
                                          .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bso.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(er.a("loot").then(er.a("loot_table", fs.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), $$2))))
                  .then(er.a("kill").then(er.a("target", fd.a()).executes($$1xx -> a($$1xx, fd.a($$1xx, "target"), $$2))))
                  .then(
                     er.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("pos", gm.a())
                                       .executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), cud.l, $$2)))
                                    .then(er.a("tool", gz.a($$1)).executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(er.a("mainhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bso.a), $$2))))
                              .then(er.a("offhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bso.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<eq, T>> T a(T $$0, anb.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)er.a("replace")
                  .then(
                     er.a("entity")
                        .then(
                           er.a("entities", fd.b())
                              .then(
                                 $$1.construct(er.a("slot", fy.a()), ($$0x, $$1x, $$2) -> a(fd.b($$0x, "entities"), fy.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          er.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fd.b($$0x, "entities"), fy.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  er.a("block")
                     .then(
                        er.a("targetPos", gm.a())
                           .then(
                              $$1.construct(
                                    er.a("slot", fy.a()),
                                    ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gm.a($$0x, "targetPos"), fy.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       er.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (eq)$$0x.getSource(),
                                             gm.a($$0x, "targetPos"),
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
         .then(er.a("insert").then($$1.construct(er.a("targetPos", gm.a()), ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gm.a($$0x, "targetPos"), $$1x, $$2))))
         .then(er.a("give").then($$1.construct(er.a("players", fd.d()), ($$0x, $$1x, $$2) -> a(fd.f($$0x, "players"), $$1x, $$2))))
         .then(er.a("spawn").then($$1.construct(er.a("targetPos", gt.a()), ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gt.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bqa a(eq $$0, ja $$1) throws CommandSyntaxException {
      dpq $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bqa)) {
         throw amv.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqa)$$2;
      }
   }

   private static int a(eq $$0, ja $$1, List<cud> $$2, anb.a $$3) throws CommandSyntaxException {
      bqa $$4 = a($$0, $$1);
      List<cud> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cud $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bqa $$0, cud $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cud $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.e()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.j() - $$4.H();
               int $$6 = Math.min($$1.H(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(eq $$0, ja $$1, int $$2, int $$3, List<cud> $$4, anb.a $$5) throws CommandSyntaxException {
      bqa $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cud> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cud $$11 = $$9 < $$4.size() ? $$4.get($$9) : cud.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amv.c.create($$2);
      }
   }

   private static boolean a(cud $$0, cud $$1) {
      return $$0.H() <= $$0.j() && cud.c($$0, $$1);
   }

   private static int a(Collection<aqn> $$0, List<cud> $$1, anb.a $$2) throws CommandSyntaxException {
      List<cud> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cud $$4 : $$1) {
         for (aqn $$5 : $$0) {
            if ($$5.ga().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsh $$0, List<cud> $$1, int $$2, int $$3, List<cud> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cud $$6 = $$5 < $$1.size() ? $$1.get($$5) : cud.l;
         btu $$7 = $$0.a_($$2 + $$5);
         if ($$7 != btu.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsh> $$0, int $$1, int $$2, List<cud> $$3, anb.a $$4) throws CommandSyntaxException {
      List<cud> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsh $$6 : $$0) {
         if ($$6 instanceof aqn $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.ce.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(eq $$0, ewh $$1, List<cud> $$2, anb.a $$3) throws CommandSyntaxException {
      aqm $$4 = $$0.e();
      $$2.forEach($$2x -> {
         civ $$3x = new civ($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(eq $$0, List<cud> $$1) {
      if ($$1.size() == 1) {
         cud $$2 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single", $$2.H(), $$2.F()), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(eq $$0, List<cud> $$1, akj<erb> $$2) {
      if ($$1.size() == 1) {
         cud $$3 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single_with_table", $$3.H(), $$3.F(), wu.a($$2.a())), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple_with_table", $$1.size(), wu.a($$2.a())), false);
      }
   }

   private static cud a(eq $$0, bso $$1) throws CommandSyntaxException {
      bsh $$2 = $$0.g();
      if ($$2 instanceof btc) {
         return ((btc)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<eq> $$0, ja $$1, cud $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      aqm $$5 = $$4.e();
      dsl $$6 = $$5.a_($$1);
      dpq $$7 = $$5.c_($$1);
      eqz.a $$8 = new eqz.a($$5).a(ets.f, ewh.b($$1)).a(ets.g, $$6).b(ets.h, $$7).b(ets.a, $$4.f()).a(ets.i, $$2);
      List<cud> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<eq> $$0, bsh $$1, anb.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btc)) {
         throw c.create($$1.O_());
      } else {
         akj<erb> $$3 = ((btc)$$1).eC();
         eq $$4 = (eq)$$0.getSource();
         eqz.a $$5 = new eqz.a($$4.e());
         bsh $$6 = $$4.f();
         if ($$6 instanceof cml $$7) {
            $$5.a(ets.b, $$7);
         }

         $$5.a(ets.c, $$1.dS().p());
         $$5.b(ets.e, $$6);
         $$5.b(ets.d, $$6);
         $$5.a(ets.a, $$1);
         $$5.a(ets.f, $$4.d());
         eqz $$8 = $$5.a(etr.g);
         erb $$9 = $$4.l().bf().b($$3);
         List<cud> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<eq> $$0, jj<erb> $$1, anb.b $$2) throws CommandSyntaxException {
      eq $$3 = (eq)$$0.getSource();
      eqz $$4 = new eqz.a($$3.e()).b(ets.a, $$3.f()).a(ets.f, $$3.d()).a(etr.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<eq> $$0, jj<erb> $$1, ja $$2, cud $$3, anb.b $$4) throws CommandSyntaxException {
      eq $$5 = (eq)$$0.getSource();
      eqz $$6 = new eqz.a($$5.e()).a(ets.f, ewh.b($$2)).a(ets.i, $$3).b(ets.a, $$5.f()).a(etr.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<eq> $$0, jj<erb> $$1, eqz $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      List<cud> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cud> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<eq> var1, List<cud> var2, anb.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<eq, ?> construct(ArgumentBuilder<eq, ?> var1, anb.b var2);
   }
}
