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

public class ank {
   public static final SuggestionProvider<eh> a = ($$0, $$1) -> {
      ald.b $$2 = ((eh)$$0.getSource()).l().be();
      return em.a($$2.a(li.aU), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ei.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ei.a("fish")
                        .then(
                           ei.a("loot_table", fj.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("pos", gd.a())
                                             .executes($$1xx -> a($$1xx, fj.a($$1xx, "loot_table"), gd.a($$1xx, "pos"), cuh.i, $$2)))
                                          .then(
                                             ei.a("tool", gq.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fj.a($$1xx, "loot_table"), gd.a($$1xx, "pos"), gq.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ei.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fj.a($$1xx, "loot_table"), gd.a($$1xx, "pos"), a((eh)$$1xx.getSource(), bsc.a), $$2))
                                       ))
                                    .then(
                                       ei.a("offhand")
                                          .executes($$1xx -> a($$1xx, fj.a($$1xx, "loot_table"), gd.a($$1xx, "pos"), a((eh)$$1xx.getSource(), bsc.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ei.a("loot").then(ei.a("loot_table", fj.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fj.a($$1xx, "loot_table"), $$2))))
                  .then(ei.a("kill").then(ei.a("target", eu.a()).executes($$1xx -> a($$1xx, eu.a($$1xx, "target"), $$2))))
                  .then(
                     ei.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("pos", gd.a())
                                       .executes($$1xx -> a($$1xx, gd.a($$1xx, "pos"), cuh.i, $$2)))
                                    .then(ei.a("tool", gq.a($$1)).executes($$1xx -> a($$1xx, gd.a($$1xx, "pos"), gq.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ei.a("mainhand").executes($$1xx -> a($$1xx, gd.a($$1xx, "pos"), a((eh)$$1xx.getSource(), bsc.a), $$2))))
                              .then(ei.a("offhand").executes($$1xx -> a($$1xx, gd.a($$1xx, "pos"), a((eh)$$1xx.getSource(), bsc.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<eh, T>> T a(T $$0, ank.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ei.a("replace")
                  .then(
                     ei.a("entity")
                        .then(
                           ei.a("entities", eu.b())
                              .then(
                                 $$1.construct(ei.a("slot", fp.a()), ($$0x, $$1x, $$2) -> a(eu.b($$0x, "entities"), fp.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ei.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                eu.b($$0x, "entities"), fp.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ei.a("block")
                     .then(
                        ei.a("targetPos", gd.a())
                           .then(
                              $$1.construct(
                                    ei.a("slot", fp.a()),
                                    ($$0x, $$1x, $$2) -> a((eh)$$0x.getSource(), gd.a($$0x, "targetPos"), fp.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ei.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (eh)$$0x.getSource(),
                                             gd.a($$0x, "targetPos"),
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
         .then(ei.a("insert").then($$1.construct(ei.a("targetPos", gd.a()), ($$0x, $$1x, $$2) -> a((eh)$$0x.getSource(), gd.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ei.a("give").then($$1.construct(ei.a("players", eu.d()), ($$0x, $$1x, $$2) -> a(eu.f($$0x, "players"), $$1x, $$2))))
         .then(ei.a("spawn").then($$1.construct(ei.a("targetPos", gk.a()), ($$0x, $$1x, $$2) -> a((eh)$$0x.getSource(), gk.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bpt a(eh $$0, ir $$1) throws CommandSyntaxException {
      dqc $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpt)) {
         throw ane.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpt)$$2;
      }
   }

   private static int a(eh $$0, ir $$1, List<cuh> $$2, ank.a $$3) throws CommandSyntaxException {
      bpt $$4 = a($$0, $$1);
      List<cuh> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cuh $$6 : $$2) {
         if (a($$4, $$6.r())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpt $$0, cuh $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.d(); $$3++) {
         cuh $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.d()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.i() - $$4.G();
               int $$6 = Math.min($$1.G(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(eh $$0, ir $$1, int $$2, int $$3, List<cuh> $$4, ank.a $$5) throws CommandSyntaxException {
      bpt $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cuh> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cuh $$11 = $$9 < $$4.size() ? $$4.get($$9) : cuh.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ane.c.create($$2);
      }
   }

   private static boolean a(cuh $$0, cuh $$1) {
      return $$0.G() <= $$0.i() && cuh.c($$0, $$1);
   }

   private static int a(Collection<aqu> $$0, List<cuh> $$1, ank.a $$2) throws CommandSyntaxException {
      List<cuh> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cuh $$4 : $$1) {
         for (aqu $$5 : $$0) {
            if ($$5.gl().f($$4.r())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(brv $$0, List<cuh> $$1, int $$2, int $$3, List<cuh> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cuh $$6 = $$5 < $$1.size() ? $$1.get($$5) : cuh.i;
         btf $$7 = $$0.a_($$2 + $$5);
         if ($$7 != btf.b && $$7.a($$6.r())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends brv> $$0, int $$1, int $$2, List<cuh> $$3, ank.a $$4) throws CommandSyntaxException {
      List<cuh> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (brv $$6 : $$0) {
         if ($$6 instanceof aqu $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cq.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(eh $$0, ewu $$1, List<cuh> $$2, ank.a $$3) throws CommandSyntaxException {
      aqt $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cig $$3x = new cig($$4, $$1.c, $$1.d, $$1.e, $$2x.r());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(eh $$0, List<cuh> $$1) {
      if ($$1.size() == 1) {
         cuh $$2 = $$1.get(0);
         $$0.a(() -> xe.a("commands.drop.success.single", $$2.G(), $$2.E()), false);
      } else {
         $$0.a(() -> xe.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(eh $$0, List<cuh> $$1, aks<eru> $$2) {
      if ($$1.size() == 1) {
         cuh $$3 = $$1.get(0);
         $$0.a(() -> xe.a("commands.drop.success.single_with_table", $$3.G(), $$3.E(), xe.a($$2.a())), false);
      } else {
         $$0.a(() -> xe.a("commands.drop.success.multiple_with_table", $$1.size(), xe.a($$2.a())), false);
      }
   }

   private static cuh a(eh $$0, bsc $$1) throws CommandSyntaxException {
      brv $$2 = $$0.g();
      if ($$2 instanceof bso) {
         return ((bso)$$2).d($$1);
      } else {
         throw b.create($$2.P_());
      }
   }

   private static int a(CommandContext<eh> $$0, ir $$1, cuh $$2, ank.b $$3) throws CommandSyntaxException {
      eh $$4 = (eh)$$0.getSource();
      aqt $$5 = $$4.e();
      dtc $$6 = $$5.a_($$1);
      dqc $$7 = $$5.c_($$1);
      ers.a $$8 = new ers.a($$5).a(eug.f, ewu.b($$1)).a(eug.g, $$6).b(eug.h, $$7).b(eug.a, $$4.f()).a(eug.i, $$2);
      List<cuh> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<eh> $$0, brv $$1, ank.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bso)) {
         throw c.create($$1.P_());
      } else {
         aks<eru> $$3 = ((bso)$$1).eM();
         eh $$4 = (eh)$$0.getSource();
         ers.a $$5 = new ers.a($$4.e());
         brv $$6 = $$4.f();
         if ($$6 instanceof cly $$7) {
            $$5.a(eug.b, $$7);
         }

         $$5.a(eug.c, $$1.dX().p());
         $$5.b(eug.e, $$6);
         $$5.b(eug.d, $$6);
         $$5.a(eug.a, $$1);
         $$5.a(eug.f, $$4.d());
         ers $$8 = $$5.a(euf.g);
         eru $$9 = $$4.l().be().b($$3);
         List<cuh> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<eh> $$0, ja<eru> $$1, ank.b $$2) throws CommandSyntaxException {
      eh $$3 = (eh)$$0.getSource();
      ers $$4 = new ers.a($$3.e()).b(eug.a, $$3.f()).a(eug.f, $$3.d()).a(euf.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<eh> $$0, ja<eru> $$1, ir $$2, cuh $$3, ank.b $$4) throws CommandSyntaxException {
      eh $$5 = (eh)$$0.getSource();
      ers $$6 = new ers.a($$5.e()).a(eug.f, ewu.b($$2)).a(eug.i, $$3).b(eug.a, $$5.f()).a(euf.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<eh> $$0, ja<eru> $$1, ers $$2, ank.b $$3) throws CommandSyntaxException {
      eh $$4 = (eh)$$0.getSource();
      List<cuh> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cuh> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<eh> var1, List<cuh> var2, ank.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<eh, ?> construct(ArgumentBuilder<eh, ?> var1, ank.b var2);
   }
}
