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

public class afd {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      dzn $$2 = ((ds)$$0.getSource()).l().aH();
      return du.a($$2.a(dzp.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dt.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dt.a("fish")
                        .then(
                           dt.a("loot_table", eq.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fi.a())
                                             .executes($$1xx -> a($$1xx, eq.e($$1xx, "loot_table"), fi.a($$1xx, "pos"), cfz.b, $$2)))
                                          .then(
                                             dt.a("tool", fu.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, eq.e($$1xx, "loot_table"), fi.a($$1xx, "pos"), fu.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dt.a("mainhand")
                                             .executes($$1xx -> a($$1xx, eq.e($$1xx, "loot_table"), fi.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bfo.a), $$2))
                                       ))
                                    .then(
                                       dt.a("offhand")
                                          .executes($$1xx -> a($$1xx, eq.e($$1xx, "loot_table"), fi.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bfo.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dt.a("loot").then(dt.a("loot_table", eq.a()).suggests(a).executes($$1xx -> a($$1xx, eq.e($$1xx, "loot_table"), $$2))))
                  .then(dt.a("kill").then(dt.a("target", ec.a()).executes($$1xx -> a($$1xx, ec.a($$1xx, "target"), $$2))))
                  .then(
                     dt.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fi.a())
                                       .executes($$1xx -> a($$1xx, fi.a($$1xx, "pos"), cfz.b, $$2)))
                                    .then(dt.a("tool", fu.a($$1)).executes($$1xx -> a($$1xx, fi.a($$1xx, "pos"), fu.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dt.a("mainhand").executes($$1xx -> a($$1xx, fi.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bfo.a), $$2))))
                              .then(dt.a("offhand").executes($$1xx -> a($$1xx, fi.a($$1xx, "pos"), a((ds)$$1xx.getSource(), bfo.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ds, T>> T a(T $$0, afd.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dt.a("replace")
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("entities", ec.b())
                              .then(
                                 $$1.construct(dt.a("slot", ew.a()), ($$0x, $$1x, $$2) -> a(ec.b($$0x, "entities"), ew.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dt.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ec.b($$0x, "entities"), ew.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("block")
                     .then(
                        dt.a("targetPos", fi.a())
                           .then(
                              $$1.construct(
                                    dt.a("slot", ew.a()),
                                    ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fi.a($$0x, "targetPos"), ew.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dt.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ds)$$0x.getSource(),
                                             fi.a($$0x, "targetPos"),
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
         .then(dt.a("insert").then($$1.construct(dt.a("targetPos", fi.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fi.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dt.a("give").then($$1.construct(dt.a("players", ec.d()), ($$0x, $$1x, $$2) -> a(ec.f($$0x, "players"), $$1x, $$2))))
         .then(dt.a("spawn").then($$1.construct(dt.a("targetPos", fp.a()), ($$0x, $$1x, $$2) -> a((ds)$$0x.getSource(), fp.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bdq a(ds $$0, gu $$1) throws CommandSyntaxException {
      czn $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bdq)) {
         throw aex.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bdq)$$2;
      }
   }

   private static int a(ds $$0, gu $$1, List<cfz> $$2, afd.a $$3) throws CommandSyntaxException {
      bdq $$4 = a($$0, $$1);
      List<cfz> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cfz $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bdq $$0, cfz $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cfz $$4 = $$0.a($$3);
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

   private static int a(ds $$0, gu $$1, int $$2, int $$3, List<cfz> $$4, afd.a $$5) throws CommandSyntaxException {
      bdq $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cfz> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cfz $$11 = $$9 < $$4.size() ? $$4.get($$9) : cfz.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aex.b.create($$2);
      }
   }

   private static boolean a(cfz $$0, cfz $$1) {
      return $$0.L() <= $$0.g() && cfz.c($$0, $$1);
   }

   private static int a(Collection<aig> $$0, List<cfz> $$1, afd.a $$2) throws CommandSyntaxException {
      List<cfz> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cfz $$4 : $$1) {
         for (aig $$5 : $$0) {
            if ($$5.fN().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bfj $$0, List<cfz> $$1, int $$2, int $$3, List<cfz> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cfz $$6 = $$5 < $$1.size() ? $$1.get($$5) : cfz.b;
         bgs $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bgs.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bfj> $$0, int $$1, int $$2, List<cfz> $$3, afd.a $$4) throws CommandSyntaxException {
      List<cfz> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bfj $$6 : $$0) {
         if ($$6 instanceof aig $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bR.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ds $$0, eei $$1, List<cfz> $$2, afd.a $$3) throws CommandSyntaxException {
      aif $$4 = $$0.e();
      $$2.forEach($$2x -> {
         bvh $$3x = new bvh($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.o();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ds $$0, List<cfz> $$1) {
      if ($$1.size() == 1) {
         cfz $$2 = $$1.get(0);
         $$0.a(() -> sw.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> sw.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ds $$0, List<cfz> $$1, acq $$2) {
      if ($$1.size() == 1) {
         cfz $$3 = $$1.get(0);
         $$0.a(() -> sw.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), $$2), false);
      } else {
         $$0.a(() -> sw.a("commands.drop.success.multiple_with_table", $$1.size(), $$2), false);
      }
   }

   private static cfz a(ds $$0, bfo $$1) throws CommandSyntaxException {
      bfj $$2 = $$0.g();
      if ($$2 instanceof bfz) {
         return ((bfz)$$2).c($$1);
      } else {
         throw b.create($$2.H_());
      }
   }

   private static int a(CommandContext<ds> $$0, gu $$1, cfz $$2, afd.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      aif $$5 = $$4.e();
      dcb $$6 = $$5.a_($$1);
      czn $$7 = $$5.c_($$1);
      dzq.a $$8 = new dzq.a($$5).a(ebw.f, eei.b($$1)).a(ebw.g, $$6).b(ebw.h, $$7).b(ebw.a, $$4.f()).a(ebw.i, $$2);
      List<cfz> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().r()));
   }

   private static int a(CommandContext<ds> $$0, bfj $$1, afd.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bfz)) {
         throw c.create($$1.H_());
      } else {
         acq $$3 = ((bfz)$$1).ew();
         ds $$4 = (ds)$$0.getSource();
         dzq.a $$5 = new dzq.a($$4.e());
         bfj $$6 = $$4.f();
         if ($$6 instanceof byo $$7) {
            $$5.a(ebw.b, $$7);
         }

         $$5.a(ebw.c, $$1.dJ().o());
         $$5.b(ebw.e, $$6);
         $$5.b(ebw.d, $$6);
         $$5.a(ebw.a, $$1);
         $$5.a(ebw.f, $$4.d());
         dzq $$8 = $$5.a(ebv.f);
         dzs $$9 = $$4.l().aH().getLootTable($$3);
         List<cfz> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ds> $$0, acq $$1, afd.b $$2) throws CommandSyntaxException {
      ds $$3 = (ds)$$0.getSource();
      dzq $$4 = new dzq.a($$3.e()).b(ebw.a, $$3.f()).a(ebw.f, $$3.d()).a(ebv.b);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ds> $$0, acq $$1, gu $$2, cfz $$3, afd.b $$4) throws CommandSyntaxException {
      ds $$5 = (ds)$$0.getSource();
      dzq $$6 = new dzq.a($$5.e()).a(ebw.f, eei.b($$2)).a(ebw.i, $$3).b(ebw.a, $$5.f()).a(ebv.e);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ds> $$0, acq $$1, dzq $$2, afd.b $$3) throws CommandSyntaxException {
      ds $$4 = (ds)$$0.getSource();
      dzs $$5 = $$4.l().aH().getLootTable($$1);
      List<cfz> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cfz> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ds> var1, List<cfz> var2, afd.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, afd.b var2);
   }
}
