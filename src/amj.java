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

public class amj {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      ene $$2 = ((du)$$0.getSource()).l().aM();
      return dz.a($$2.a(eng.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wg.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), crj.i, $$2)))
                                          .then(
                                             dv.a("tool", ga.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bqc.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bqc.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), crj.i, $$2)))
                                    .then(dv.a("tool", ga.a($$1)).executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bqc.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bqc.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, amj.c $$1) {
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

   private static bnt a(du $$0, ib $$1) throws CommandSyntaxException {
      dmf $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bnt)) {
         throw amd.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bnt)$$2;
      }
   }

   private static int a(du $$0, ib $$1, List<crj> $$2, amj.a $$3) throws CommandSyntaxException {
      bnt $$4 = a($$0, $$1);
      List<crj> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (crj $$6 : $$2) {
         if (a($$4, $$6.r())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bnt $$0, crj $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.d(); $$3++) {
         crj $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.d()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.i() - $$4.G();
               int $$6 = Math.min($$1.G(), $$5);
               $$1.g($$6);
               $$4.f($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(du $$0, ib $$1, int $$2, int $$3, List<crj> $$4, amj.a $$5) throws CommandSyntaxException {
      bnt $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<crj> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            crj $$11 = $$9 < $$4.size() ? $$4.get($$9) : crj.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amd.b.create($$2);
      }
   }

   private static boolean a(crj $$0, crj $$1) {
      return $$0.G() <= $$0.i() && crj.c($$0, $$1);
   }

   private static int a(Collection<apt> $$0, List<crj> $$1, amj.a $$2) throws CommandSyntaxException {
      List<crj> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (crj $$4 : $$1) {
         for (apt $$5 : $$0) {
            if ($$5.fZ().e($$4.r())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bpv $$0, List<crj> $$1, int $$2, int $$3, List<crj> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         crj $$6 = $$5 < $$1.size() ? $$1.get($$5) : crj.i;
         brf $$7 = $$0.a_($$2 + $$5);
         if ($$7 != brf.b && $$7.a($$6.r())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bpv> $$0, int $$1, int $$2, List<crj> $$3, amj.a $$4) throws CommandSyntaxException {
      List<crj> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bpv $$6 : $$0) {
         if ($$6 instanceof apt $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bY.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, esa $$1, List<crj> $$2, amj.a $$3) throws CommandSyntaxException {
      aps $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cgd $$3x = new cgd($$4, $$1.c, $$1.d, $$1.e, $$2x.r());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<crj> $$1) {
      if ($$1.size() == 1) {
         crj $$2 = $$1.get(0);
         $$0.a(() -> wg.a("commands.drop.success.single", $$2.G(), $$2.E()), false);
      } else {
         $$0.a(() -> wg.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<crj> $$1, ajt $$2) {
      if ($$1.size() == 1) {
         crj $$3 = $$1.get(0);
         $$0.a(() -> wg.a("commands.drop.success.single_with_table", $$3.G(), $$3.E(), wg.a($$2)), false);
      } else {
         $$0.a(() -> wg.a("commands.drop.success.multiple_with_table", $$1.size(), wg.a($$2)), false);
      }
   }

   private static crj a(du $$0, bqc $$1) throws CommandSyntaxException {
      bpv $$2 = $$0.g();
      if ($$2 instanceof bqo) {
         return ((bqo)$$2).d($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<du> $$0, ib $$1, crj $$2, amj.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      aps $$5 = $$4.e();
      doz $$6 = $$5.a_($$1);
      dmf $$7 = $$5.c_($$1);
      enh.a $$8 = new enh.a($$5).a(epo.f, esa.b($$1)).a(epo.g, $$6).b(epo.h, $$7).b(epo.a, $$4.f()).a(epo.i, $$2);
      List<crj> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bpv $$1, amj.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bqo)) {
         throw c.create($$1.O_());
      } else {
         ajt $$3 = ((bqo)$$1).eC();
         du $$4 = (du)$$0.getSource();
         enh.a $$5 = new enh.a($$4.e());
         bpv $$6 = $$4.f();
         if ($$6 instanceof cjt $$7) {
            $$5.a(epo.b, $$7);
         }

         $$5.a(epo.c, $$1.dN().o());
         $$5.b(epo.e, $$6);
         $$5.b(epo.d, $$6);
         $$5.a(epo.a, $$1);
         $$5.a(epo.f, $$4.d());
         enh $$8 = $$5.a(epn.g);
         enj $$9 = $$4.l().aM().getLootTable($$3);
         List<crj> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, ajt $$1, amj.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      enh $$4 = new enh.a($$3.e()).b(epo.a, $$3.f()).a(epo.f, $$3.d()).a(epn.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, ajt $$1, ib $$2, crj $$3, amj.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      enh $$6 = new enh.a($$5.e()).a(epo.f, esa.b($$2)).a(epo.i, $$3).b(epo.a, $$5.f()).a(epn.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, ajt $$1, enh $$2, amj.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      enj $$5 = $$4.l().aM().getLootTable($$1);
      List<crj> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<crj> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<crj> var2, amj.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, amj.b var2);
   }
}
