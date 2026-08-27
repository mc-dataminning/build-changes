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

public class ane {
   public static final SuggestionProvider<ee> a = ($$0, $$1) -> {
      akx.b $$2 = ((ee)$$0.getSource()).l().be();
      return ej.a($$2.a(lf.aU), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ef.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ef.a("fish")
                        .then(
                           ef.a("loot_table", fg.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("pos", ga.a())
                                             .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), ctq.i, $$2)))
                                          .then(
                                             ef.a("tool", gn.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), gn.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ef.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsd.a), $$2))
                                       ))
                                    .then(
                                       ef.a("offhand")
                                          .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsd.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ef.a("loot").then(ef.a("loot_table", fg.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), $$2))))
                  .then(ef.a("kill").then(ef.a("target", er.a()).executes($$1xx -> a($$1xx, er.a($$1xx, "target"), $$2))))
                  .then(
                     ef.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("pos", ga.a())
                                       .executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), ctq.i, $$2)))
                                    .then(ef.a("tool", gn.a($$1)).executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), gn.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ef.a("mainhand").executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsd.a), $$2))))
                              .then(ef.a("offhand").executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsd.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ee, T>> T a(T $$0, ane.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ef.a("replace")
                  .then(
                     ef.a("entity")
                        .then(
                           ef.a("entities", er.b())
                              .then(
                                 $$1.construct(ef.a("slot", fm.a()), ($$0x, $$1x, $$2) -> a(er.b($$0x, "entities"), fm.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ef.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                er.b($$0x, "entities"), fm.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ef.a("block")
                     .then(
                        ef.a("targetPos", ga.a())
                           .then(
                              $$1.construct(
                                    ef.a("slot", fm.a()),
                                    ($$0x, $$1x, $$2) -> a((ee)$$0x.getSource(), ga.a($$0x, "targetPos"), fm.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ef.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ee)$$0x.getSource(),
                                             ga.a($$0x, "targetPos"),
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
         .then(ef.a("insert").then($$1.construct(ef.a("targetPos", ga.a()), ($$0x, $$1x, $$2) -> a((ee)$$0x.getSource(), ga.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ef.a("give").then($$1.construct(ef.a("players", er.d()), ($$0x, $$1x, $$2) -> a(er.f($$0x, "players"), $$1x, $$2))))
         .then(ef.a("spawn").then($$1.construct(ef.a("targetPos", gh.a()), ($$0x, $$1x, $$2) -> a((ee)$$0x.getSource(), gh.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bpp a(ee $$0, io $$1) throws CommandSyntaxException {
      doi $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpp)) {
         throw amy.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpp)$$2;
      }
   }

   private static int a(ee $$0, io $$1, List<ctq> $$2, ane.a $$3) throws CommandSyntaxException {
      bpp $$4 = a($$0, $$1);
      List<ctq> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (ctq $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpp $$0, ctq $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         ctq $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.e()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.j() - $$4.I();
               int $$6 = Math.min($$1.I(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ee $$0, io $$1, int $$2, int $$3, List<ctq> $$4, ane.a $$5) throws CommandSyntaxException {
      bpp $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<ctq> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            ctq $$11 = $$9 < $$4.size() ? $$4.get($$9) : ctq.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amy.c.create($$2);
      }
   }

   private static boolean a(ctq $$0, ctq $$1) {
      return $$0.I() <= $$0.j() && ctq.c($$0, $$1);
   }

   private static int a(Collection<aqo> $$0, List<ctq> $$1, ane.a $$2) throws CommandSyntaxException {
      List<ctq> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (ctq $$4 : $$1) {
         for (aqo $$5 : $$0) {
            if ($$5.gc().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(brw $$0, List<ctq> $$1, int $$2, int $$3, List<ctq> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         ctq $$6 = $$5 < $$1.size() ? $$1.get($$5) : ctq.i;
         bti $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bti.b && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends brw> $$0, int $$1, int $$2, List<ctq> $$3, ane.a $$4) throws CommandSyntaxException {
      List<ctq> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (brw $$6 : $$0) {
         if ($$6 instanceof aqo $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cb.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ee $$0, eum $$1, List<ctq> $$2, ane.a $$3) throws CommandSyntaxException {
      aqn $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cii $$3x = new cii($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ee $$0, List<ctq> $$1) {
      if ($$1.size() == 1) {
         ctq $$2 = $$1.get(0);
         $$0.a(() -> wx.a("commands.drop.success.single", $$2.I(), $$2.G()), false);
      } else {
         $$0.a(() -> wx.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ee $$0, List<ctq> $$1, akm<epm> $$2) {
      if ($$1.size() == 1) {
         ctq $$3 = $$1.get(0);
         $$0.a(() -> wx.a("commands.drop.success.single_with_table", $$3.I(), $$3.G(), wx.a($$2.a())), false);
      } else {
         $$0.a(() -> wx.a("commands.drop.success.multiple_with_table", $$1.size(), wx.a($$2.a())), false);
      }
   }

   private static ctq a(ee $$0, bsd $$1) throws CommandSyntaxException {
      brw $$2 = $$0.g();
      if ($$2 instanceof bsq) {
         return ((bsq)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ee> $$0, io $$1, ctq $$2, ane.b $$3) throws CommandSyntaxException {
      ee $$4 = (ee)$$0.getSource();
      aqn $$5 = $$4.e();
      drd $$6 = $$5.a_($$1);
      doi $$7 = $$5.c_($$1);
      epk.a $$8 = new epk.a($$5).a(erz.f, eum.b($$1)).a(erz.g, $$6).b(erz.h, $$7).b(erz.a, $$4.f()).a(erz.i, $$2);
      List<ctq> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ee> $$0, brw $$1, ane.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bsq)) {
         throw c.create($$1.O_());
      } else {
         akm<epm> $$3 = ((bsq)$$1).eF();
         ee $$4 = (ee)$$0.getSource();
         epk.a $$5 = new epk.a($$4.e());
         brw $$6 = $$4.f();
         if ($$6 instanceof cly $$7) {
            $$5.a(erz.b, $$7);
         }

         $$5.a(erz.c, $$1.dQ().o());
         $$5.b(erz.e, $$6);
         $$5.b(erz.d, $$6);
         $$5.a(erz.a, $$1);
         $$5.a(erz.f, $$4.d());
         epk $$8 = $$5.a(ery.g);
         epm $$9 = $$4.l().be().b($$3);
         List<ctq> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ee> $$0, ix<epm> $$1, ane.b $$2) throws CommandSyntaxException {
      ee $$3 = (ee)$$0.getSource();
      epk $$4 = new epk.a($$3.e()).b(erz.a, $$3.f()).a(erz.f, $$3.d()).a(ery.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ee> $$0, ix<epm> $$1, io $$2, ctq $$3, ane.b $$4) throws CommandSyntaxException {
      ee $$5 = (ee)$$0.getSource();
      epk $$6 = new epk.a($$5.e()).a(erz.f, eum.b($$2)).a(erz.i, $$3).b(erz.a, $$5.f()).a(ery.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ee> $$0, ix<epm> $$1, epk $$2, ane.b $$3) throws CommandSyntaxException {
      ee $$4 = (ee)$$0.getSource();
      List<ctq> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<ctq> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ee> var1, List<ctq> var2, ane.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ee, ?> construct(ArgumentBuilder<ee, ?> var1, ane.b var2);
   }
}
