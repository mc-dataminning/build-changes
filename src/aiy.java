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

public class aiy {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      efa $$2 = ((du)$$0.getSource()).m().aJ();
      return dy.a($$2.a(efc.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dv.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dv.a("fish")
                        .then(
                           dv.a("loot_table", eu.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), clj.b, $$2)))
                                          .then(
                                             dv.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkv.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkv.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dv.a("loot").then(dv.a("loot_table", eu.a()).suggests(a).executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), $$2))))
                  .then(dv.a("kill").then(dv.a("target", eg.a()).executes($$1xx -> a($$1xx, eg.a($$1xx, "target"), $$2))))
                  .then(
                     dv.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), clj.b, $$2)))
                                    .then(dv.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkv.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkv.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, aiy.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dv.a("replace")
                  .then(
                     dv.a("entity")
                        .then(
                           dv.a("entities", eg.b())
                              .then(
                                 $$1.construct(dv.a("slot", fa.a()), ($$0x, $$1x, $$2) -> a(eg.b($$0x, "entities"), fa.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dv.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                eg.b($$0x, "entities"), fa.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("block")
                     .then(
                        dv.a("targetPos", fm.a())
                           .then(
                              $$1.construct(
                                    dv.a("slot", fa.a()),
                                    ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fm.a($$0x, "targetPos"), fa.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dv.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (du)$$0x.getSource(),
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
         .then(dv.a("insert").then($$1.construct(dv.a("targetPos", fm.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fm.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dv.a("give").then($$1.construct(dv.a("players", eg.d()), ($$0x, $$1x, $$2) -> a(eg.f($$0x, "players"), $$1x, $$2))))
         .then(dv.a("spawn").then($$1.construct(dv.a("targetPos", ft.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), ft.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static biq a(du $$0, ht $$1) throws CommandSyntaxException {
      dfd $$2 = $$0.f().c_($$1);
      if (!($$2 instanceof biq)) {
         throw ais.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (biq)$$2;
      }
   }

   private static int a(du $$0, ht $$1, List<clj> $$2, aiy.a $$3) throws CommandSyntaxException {
      biq $$4 = a($$0, $$1);
      List<clj> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (clj $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(biq $$0, clj $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         clj $$4 = $$0.a($$3);
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

   private static int a(du $$0, ht $$1, int $$2, int $$3, List<clj> $$4, aiy.a $$5) throws CommandSyntaxException {
      biq $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<clj> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            clj $$11 = $$9 < $$4.size() ? $$4.get($$9) : clj.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ais.b.create($$2);
      }
   }

   private static boolean a(clj $$0, clj $$1) {
      return $$0.L() <= $$0.g() && clj.c($$0, $$1);
   }

   private static int a(Collection<amf> $$0, List<clj> $$1, aiy.a $$2) throws CommandSyntaxException {
      List<clj> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (clj $$4 : $$1) {
         for (amf $$5 : $$0) {
            if ($$5.fT().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bkq $$0, List<clj> $$1, int $$2, int $$3, List<clj> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         clj $$6 = $$5 < $$1.size() ? $$1.get($$5) : clj.b;
         bly $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bly.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bkq> $$0, int $$1, int $$2, List<clj> $$3, aiy.a $$4) throws CommandSyntaxException {
      List<clj> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bkq $$6 : $$0) {
         if ($$6 instanceof amf $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, eju $$1, List<clj> $$2, aiy.a $$3) throws CommandSyntaxException {
      ame $$4 = $$0.f();
      $$2.forEach($$2x -> {
         can $$3x = new can($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<clj> $$1) {
      if ($$1.size() == 1) {
         clj $$2 = $$1.get(0);
         $$0.a(() -> ur.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> ur.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<clj> $$1, agi $$2) {
      if ($$1.size() == 1) {
         clj $$3 = $$1.get(0);
         $$0.a(() -> ur.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), ur.a($$2)), false);
      } else {
         $$0.a(() -> ur.a("commands.drop.success.multiple_with_table", $$1.size(), ur.a($$2)), false);
      }
   }

   private static clj a(du $$0, bkv $$1) throws CommandSyntaxException {
      bkq $$2 = $$0.h();
      if ($$2 instanceof blg) {
         return ((blg)$$2).c($$1);
      } else {
         throw b.create($$2.P_());
      }
   }

   private static int a(CommandContext<du> $$0, ht $$1, clj $$2, aiy.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      ame $$5 = $$4.f();
      dhi $$6 = $$5.a_($$1);
      dfd $$7 = $$5.c_($$1);
      efd.a $$8 = new efd.a($$5).a(ehi.f, eju.b($$1)).a(ehi.g, $$6).b(ehi.h, $$7).b(ehi.a, $$4.g()).a(ehi.i, $$2);
      List<clj> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bkq $$1, aiy.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof blg)) {
         throw c.create($$1.P_());
      } else {
         agi $$3 = ((blg)$$1).eB();
         du $$4 = (du)$$0.getSource();
         efd.a $$5 = new efd.a($$4.f());
         bkq $$6 = $$4.g();
         if ($$6 instanceof cdu $$7) {
            $$5.a(ehi.b, $$7);
         }

         $$5.a(ehi.c, $$1.dO().o());
         $$5.b(ehi.e, $$6);
         $$5.b(ehi.d, $$6);
         $$5.a(ehi.a, $$1);
         $$5.a(ehi.f, $$4.e());
         efd $$8 = $$5.a(ehh.g);
         eff $$9 = $$4.m().aJ().getLootTable($$3);
         List<clj> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, agi $$1, aiy.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      efd $$4 = new efd.a($$3.f()).b(ehi.a, $$3.g()).a(ehi.f, $$3.e()).a(ehh.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, agi $$1, ht $$2, clj $$3, aiy.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      efd $$6 = new efd.a($$5.f()).a(ehi.f, eju.b($$2)).a(ehi.i, $$3).b(ehi.a, $$5.g()).a(ehh.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, agi $$1, efd $$2, aiy.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      eff $$5 = $$4.m().aJ().getLootTable($$1);
      List<clj> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<clj> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<clj> var2, aiy.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, aiy.b var2);
   }
}
