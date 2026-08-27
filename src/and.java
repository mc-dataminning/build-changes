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

public class and {
   public static final SuggestionProvider<ee> a = ($$0, $$1) -> {
      akw.b $$2 = ((ee)$$0.getSource()).l().be();
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
                                             .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), cto.i, $$2)))
                                          .then(
                                             ef.a("tool", gn.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), gn.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ef.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsb.a), $$2))
                                       ))
                                    .then(
                                       ef.a("offhand")
                                          .executes($$1xx -> a($$1xx, fg.a($$1xx, "loot_table"), ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsb.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), cto.i, $$2)))
                                    .then(ef.a("tool", gn.a($$1)).executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), gn.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ef.a("mainhand").executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsb.a), $$2))))
                              .then(ef.a("offhand").executes($$1xx -> a($$1xx, ga.a($$1xx, "pos"), a((ee)$$1xx.getSource(), bsb.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ee, T>> T a(T $$0, and.c $$1) {
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

   private static bpn a(ee $$0, io $$1) throws CommandSyntaxException {
      dog $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpn)) {
         throw amx.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpn)$$2;
      }
   }

   private static int a(ee $$0, io $$1, List<cto> $$2, and.a $$3) throws CommandSyntaxException {
      bpn $$4 = a($$0, $$1);
      List<cto> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cto $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpn $$0, cto $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cto $$4 = $$0.a($$3);
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

   private static int a(ee $$0, io $$1, int $$2, int $$3, List<cto> $$4, and.a $$5) throws CommandSyntaxException {
      bpn $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cto> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cto $$11 = $$9 < $$4.size() ? $$4.get($$9) : cto.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amx.c.create($$2);
      }
   }

   private static boolean a(cto $$0, cto $$1) {
      return $$0.I() <= $$0.j() && cto.c($$0, $$1);
   }

   private static int a(Collection<aqn> $$0, List<cto> $$1, and.a $$2) throws CommandSyntaxException {
      List<cto> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cto $$4 : $$1) {
         for (aqn $$5 : $$0) {
            if ($$5.gc().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bru $$0, List<cto> $$1, int $$2, int $$3, List<cto> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cto $$6 = $$5 < $$1.size() ? $$1.get($$5) : cto.i;
         btg $$7 = $$0.a_($$2 + $$5);
         if ($$7 != btg.b && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bru> $$0, int $$1, int $$2, List<cto> $$3, and.a $$4) throws CommandSyntaxException {
      List<cto> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bru $$6 : $$0) {
         if ($$6 instanceof aqn $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cc.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ee $$0, euk $$1, List<cto> $$2, and.a $$3) throws CommandSyntaxException {
      aqm $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cig $$3x = new cig($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ee $$0, List<cto> $$1) {
      if ($$1.size() == 1) {
         cto $$2 = $$1.get(0);
         $$0.a(() -> wx.a("commands.drop.success.single", $$2.I(), $$2.G()), false);
      } else {
         $$0.a(() -> wx.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ee $$0, List<cto> $$1, akl<epk> $$2) {
      if ($$1.size() == 1) {
         cto $$3 = $$1.get(0);
         $$0.a(() -> wx.a("commands.drop.success.single_with_table", $$3.I(), $$3.G(), wx.a($$2.a())), false);
      } else {
         $$0.a(() -> wx.a("commands.drop.success.multiple_with_table", $$1.size(), wx.a($$2.a())), false);
      }
   }

   private static cto a(ee $$0, bsb $$1) throws CommandSyntaxException {
      bru $$2 = $$0.g();
      if ($$2 instanceof bso) {
         return ((bso)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ee> $$0, io $$1, cto $$2, and.b $$3) throws CommandSyntaxException {
      ee $$4 = (ee)$$0.getSource();
      aqm $$5 = $$4.e();
      drb $$6 = $$5.a_($$1);
      dog $$7 = $$5.c_($$1);
      epi.a $$8 = new epi.a($$5).a(erx.f, euk.b($$1)).a(erx.g, $$6).b(erx.h, $$7).b(erx.a, $$4.f()).a(erx.i, $$2);
      List<cto> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ee> $$0, bru $$1, and.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bso)) {
         throw c.create($$1.O_());
      } else {
         akl<epk> $$3 = ((bso)$$1).eF();
         ee $$4 = (ee)$$0.getSource();
         epi.a $$5 = new epi.a($$4.e());
         bru $$6 = $$4.f();
         if ($$6 instanceof clw $$7) {
            $$5.a(erx.b, $$7);
         }

         $$5.a(erx.c, $$1.dQ().o());
         $$5.b(erx.e, $$6);
         $$5.b(erx.d, $$6);
         $$5.a(erx.a, $$1);
         $$5.a(erx.f, $$4.d());
         epi $$8 = $$5.a(erw.g);
         epk $$9 = $$4.l().be().b($$3);
         List<cto> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ee> $$0, ix<epk> $$1, and.b $$2) throws CommandSyntaxException {
      ee $$3 = (ee)$$0.getSource();
      epi $$4 = new epi.a($$3.e()).b(erx.a, $$3.f()).a(erx.f, $$3.d()).a(erw.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ee> $$0, ix<epk> $$1, io $$2, cto $$3, and.b $$4) throws CommandSyntaxException {
      ee $$5 = (ee)$$0.getSource();
      epi $$6 = new epi.a($$5.e()).a(erx.f, euk.b($$2)).a(erx.i, $$3).b(erx.a, $$5.f()).a(erw.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ee> $$0, ix<epk> $$1, epi $$2, and.b $$3) throws CommandSyntaxException {
      ee $$4 = (ee)$$0.getSource();
      List<cto> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cto> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ee> var1, List<cto> var2, and.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ee, ?> construct(ArgumentBuilder<ee, ?> var1, and.b var2);
   }
}
