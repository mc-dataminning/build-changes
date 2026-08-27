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

public class aiv {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      eeo $$2 = ((du)$$0.getSource()).m().aH();
      return dy.a($$2.a(eeq.c), $$1);
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
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), clb.b, $$2)))
                                          .then(
                                             dv.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkn.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkn.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), clb.b, $$2)))
                                    .then(dv.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkn.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bkn.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, aiv.c $$1) {
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

   private static bij a(du $$0, ht $$1) throws CommandSyntaxException {
      der $$2 = $$0.f().c_($$1);
      if (!($$2 instanceof bij)) {
         throw aip.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bij)$$2;
      }
   }

   private static int a(du $$0, ht $$1, List<clb> $$2, aiv.a $$3) throws CommandSyntaxException {
      bij $$4 = a($$0, $$1);
      List<clb> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (clb $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bij $$0, clb $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         clb $$4 = $$0.a($$3);
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

   private static int a(du $$0, ht $$1, int $$2, int $$3, List<clb> $$4, aiv.a $$5) throws CommandSyntaxException {
      bij $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<clb> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            clb $$11 = $$9 < $$4.size() ? $$4.get($$9) : clb.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aip.b.create($$2);
      }
   }

   private static boolean a(clb $$0, clb $$1) {
      return $$0.L() <= $$0.g() && clb.c($$0, $$1);
   }

   private static int a(Collection<amb> $$0, List<clb> $$1, aiv.a $$2) throws CommandSyntaxException {
      List<clb> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (clb $$4 : $$1) {
         for (amb $$5 : $$0) {
            if ($$5.fS().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bki $$0, List<clb> $$1, int $$2, int $$3, List<clb> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         clb $$6 = $$5 < $$1.size() ? $$1.get($$5) : clb.b;
         blq $$7 = $$0.a_($$2 + $$5);
         if ($$7 != blq.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bki> $$0, int $$1, int $$2, List<clb> $$3, aiv.a $$4) throws CommandSyntaxException {
      List<clb> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bki $$6 : $$0) {
         if ($$6 instanceof amb $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, eji $$1, List<clb> $$2, aiv.a $$3) throws CommandSyntaxException {
      ama $$4 = $$0.f();
      $$2.forEach($$2x -> {
         caf $$3x = new caf($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.t();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<clb> $$1) {
      if ($$1.size() == 1) {
         clb $$2 = $$1.get(0);
         $$0.a(() -> ur.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> ur.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<clb> $$1, agg $$2) {
      if ($$1.size() == 1) {
         clb $$3 = $$1.get(0);
         $$0.a(() -> ur.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), ur.a($$2)), false);
      } else {
         $$0.a(() -> ur.a("commands.drop.success.multiple_with_table", $$1.size(), ur.a($$2)), false);
      }
   }

   private static clb a(du $$0, bkn $$1) throws CommandSyntaxException {
      bki $$2 = $$0.h();
      if ($$2 instanceof bky) {
         return ((bky)$$2).c($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<du> $$0, ht $$1, clb $$2, aiv.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      ama $$5 = $$4.f();
      dgw $$6 = $$5.a_($$1);
      der $$7 = $$5.c_($$1);
      eer.a $$8 = new eer.a($$5).a(egw.f, eji.b($$1)).a(egw.g, $$6).b(egw.h, $$7).b(egw.a, $$4.g()).a(egw.i, $$2);
      List<clb> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().u()));
   }

   private static int a(CommandContext<du> $$0, bki $$1, aiv.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bky)) {
         throw c.create($$1.O_());
      } else {
         agg $$3 = ((bky)$$1).ez();
         du $$4 = (du)$$0.getSource();
         eer.a $$5 = new eer.a($$4.f());
         bki $$6 = $$4.g();
         if ($$6 instanceof cdm $$7) {
            $$5.a(egw.b, $$7);
         }

         $$5.a(egw.c, $$1.dM().o());
         $$5.b(egw.e, $$6);
         $$5.b(egw.d, $$6);
         $$5.a(egw.a, $$1);
         $$5.a(egw.f, $$4.e());
         eer $$8 = $$5.a(egv.g);
         eet $$9 = $$4.m().aH().getLootTable($$3);
         List<clb> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, agg $$1, aiv.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      eer $$4 = new eer.a($$3.f()).b(egw.a, $$3.g()).a(egw.f, $$3.e()).a(egv.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, agg $$1, ht $$2, clb $$3, aiv.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      eer $$6 = new eer.a($$5.f()).a(egw.f, eji.b($$2)).a(egw.i, $$3).b(egw.a, $$5.g()).a(egv.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, agg $$1, eer $$2, aiv.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      eet $$5 = $$4.m().aH().getLootTable($$1);
      List<clb> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<clb> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<clb> var2, aiv.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, aiv.b var2);
   }
}
