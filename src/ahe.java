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

public class ahe {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      eck $$2 = ((ds)$$0.getSource()).l().aH();
      return dv.a($$2.a(ecm.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dt.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dt.a("fish")
                        .then(
                           dt.a("loot_table", er.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fj.a())
                                             .executes($$1xx -> a($$1xx, er.e($$1xx, "loot_table"), fj.a($$1xx, "pos"), ciw.b, $$2)))
                                          .then(
                                             dt.a("tool", fv.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, er.e($$1xx, "loot_table"), fj.a($$1xx, "pos"), fv.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, er.e($$1xx, "loot_table"), fj.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bil.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, er.e($$1xx, "loot_table"), fj.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bil.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dt.a("loot").then(dt.a("loot_table", er.a()).suggests(a).executes($$1xx -> a($$1xx, er.e($$1xx, "loot_table"), $$2))))
                  .then(dt.a("kill").then(dt.a("target", ed.a()).executes($$1xx -> a($$1xx, ed.a($$1xx, "target"), $$2))))
                  .then(
                     dt.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fj.a())
                                       .executes($$1xx -> a($$1xx, fj.a($$1xx, "pos"), ciw.b, $$2)))
                                    .then(dt.a("tool", fv.a($$1)).executes($$1xx -> a($$1xx, fj.a($$1xx, "pos"), fv.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fj.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bil.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fj.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bil.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, ahe.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dt.a("replace")
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("entities", ed.b())
                              .then(
                                 $$1.construct(dt.a("slot", ex.a()), ($$0x, $$1x, $$2) -> a(ed.b($$0x, "entities"), ex.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dt.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ed.b($$0x, "entities"), ex.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("block")
                     .then(
                        dt.a("targetPos", fj.a())
                           .then(
                              $$1.construct(
                                    dt.a("slot", ex.a()),
                                    ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fj.a($$0x, "targetPos"), ex.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dt.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ds)$$0x.getSource(),
                                             fj.a($$0x, "targetPos"),
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
         .then(dt.a("insert").then($$1.construct(dt.a("targetPos", fj.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fj.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dt.a("give").then($$1.construct(dt.a("players", ed.d()), ($$0x, $$1x, $$2) -> a(ed.f($$0x, "players"), $$1x, $$2))))
         .then(dt.a("spawn").then($$1.construct(dt.a("targetPos", fq.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fq.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bgh a(ds $$0, gv $$1) throws CommandSyntaxException {
      dck $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bgh)) {
         throw agy.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgh)$$2;
      }
   }

   private static int a(ds $$0, gv $$1, List<ciw> $$2, ahe.a $$3) throws CommandSyntaxException {
      bgh $$4 = a($$0, $$1);
      List<ciw> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (ciw $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bgh $$0, ciw $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         ciw $$4 = $$0.a($$3);
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

   private static int a(ds $$0, gv $$1, int $$2, int $$3, List<ciw> $$4, ahe.a $$5) throws CommandSyntaxException {
      bgh $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<ciw> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            ciw $$11 = $$9 < $$4.size() ? $$4.get($$9) : ciw.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw agy.b.create($$2);
      }
   }

   private static boolean a(ciw $$0, ciw $$1) {
      return $$0.L() <= $$0.g() && ciw.c($$0, $$1);
   }

   private static int a(Collection<akj> $$0, List<ciw> $$1, ahe.a $$2) throws CommandSyntaxException {
      List<ciw> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (ciw $$4 : $$1) {
         for (akj $$5 : $$0) {
            if ($$5.fQ().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(big $$0, List<ciw> $$1, int $$2, int $$3, List<ciw> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         ciw $$6 = $$5 < $$1.size() ? $$1.get($$5) : ciw.b;
         bjp $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bjp.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends big> $$0, int $$1, int $$2, List<ciw> $$3, ahe.a $$4) throws CommandSyntaxException {
      List<ciw> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (big $$6 : $$0) {
         if ($$6 instanceof akj $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bQ.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, ehf $$1, List<ciw> $$2, ahe.a $$3) throws CommandSyntaxException {
      aki $$4 = $$0.e();
      $$2.forEach($$2x -> {
         bye $$3x = new bye($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.o();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<ciw> $$1) {
      if ($$1.size() == 1) {
         ciw $$2 = $$1.get(0);
         $$0.a(() -> te.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> te.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<ciw> $$1, aep $$2) {
      if ($$1.size() == 1) {
         ciw $$3 = $$1.get(0);
         $$0.a(() -> te.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), $$2), false);
      } else {
         $$0.a(() -> te.a("commands.drop.success.multiple_with_table", $$1.size(), $$2), false);
      }
   }

   private static ciw a(ds $$0, bil $$1) throws CommandSyntaxException {
      big $$2 = $$0.g();
      if ($$2 instanceof biw) {
         return ((biw)$$2).c($$1);
      } else {
         throw b.create($$2.H_());
      }
   }

   private static int a(CommandContext<ds> $$0, gv $$1, ciw $$2, ahe.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      aki $$5 = $$4.e();
      dey $$6 = $$5.a_($$1);
      dck $$7 = $$5.c_($$1);
      ecn.a $$8 = new ecn.a($$5).a(eet.f, ehf.b($$1)).a(eet.g, $$6).b(eet.h, $$7).b(eet.a, $$4.f()).a(eet.i, $$2);
      List<ciw> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().r()));
   }

   private static int a(CommandContext<ds> $$0, big $$1, ahe.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof biw)) {
         throw c.create($$1.H_());
      } else {
         aep $$3 = ((biw)$$1).ey();
         ds $$4 = (ds)$$0.getSource();
         ecn.a $$5 = new ecn.a($$4.e());
         big $$6 = $$4.f();
         if ($$6 instanceof cbl $$7) {
            $$5.a(eet.b, $$7);
         }

         $$5.a(eet.c, $$1.dL().o());
         $$5.b(eet.e, $$6);
         $$5.b(eet.d, $$6);
         $$5.a(eet.a, $$1);
         $$5.a(eet.f, $$4.d());
         ecn $$8 = $$5.a(ees.f);
         ecp $$9 = $$4.l().aH().getLootTable($$3);
         List<ciw> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, aep $$1, ahe.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      ecn $$4 = new ecn.a($$3.e()).b(eet.a, $$3.f()).a(eet.f, $$3.d()).a(ees.b);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, aep $$1, gv $$2, ciw $$3, ahe.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      ecn $$6 = new ecn.a($$5.e()).a(eet.f, ehf.b($$2)).a(eet.i, $$3).b(eet.a, $$5.f()).a(ees.e);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, aep $$1, ecn $$2, ahe.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      ecp $$5 = $$4.l().aH().getLootTable($$1);
      List<ciw> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<ciw> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<ciw> var2, ahe.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, ahe.b var2);
   }
}
