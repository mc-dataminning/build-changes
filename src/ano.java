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

public class ano {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      ale.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(mc.bi), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ey.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ey.a("fish")
                        .then(
                           ey.a("loot_table", fz.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gt.a())
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), cxh.k, $$2)))
                                          .then(
                                             ey.a("tool", hg.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ey.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bvj.a), $$2))
                                       ))
                                    .then(
                                       ey.a("offhand")
                                          .executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bvj.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ey.a("loot").then(ey.a("loot_table", fz.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fz.a($$1xx, "loot_table"), $$2))))
                  .then(ey.a("kill").then(ey.a("target", fk.a()).executes($$1xx -> a($$1xx, fk.a($$1xx, "target"), $$2))))
                  .then(
                     ey.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("pos", gt.a())
                                       .executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), cxh.k, $$2)))
                                    .then(ey.a("tool", hg.a($$1)).executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), hg.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ey.a("mainhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bvj.a), $$2))))
                              .then(ey.a("offhand").executes($$1xx -> a($$1xx, gt.a($$1xx, "pos"), a((ex)$$1xx.getSource(), bvj.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ex, T>> T a(T $$0, ano.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ey.a("replace")
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("entities", fk.b())
                              .then(
                                 $$1.construct(ey.a("slot", gf.a()), ($$0x, $$1x, $$2) -> a(fk.b($$0x, "entities"), gf.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ey.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fk.b($$0x, "entities"), gf.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("block")
                     .then(
                        ey.a("targetPos", gt.a())
                           .then(
                              $$1.construct(
                                    ey.a("slot", gf.a()),
                                    ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gt.a($$0x, "targetPos"), gf.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ey.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ex)$$0x.getSource(),
                                             gt.a($$0x, "targetPos"),
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
         .then(ey.a("insert").then($$1.construct(ey.a("targetPos", gt.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), gt.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ey.a("give").then($$1.construct(ey.a("players", fk.d()), ($$0x, $$1x, $$2) -> a(fk.f($$0x, "players"), $$1x, $$2))))
         .then(ey.a("spawn").then($$1.construct(ey.a("targetPos", ha.a()), ($$0x, $$1x, $$2) -> a((ex)$$0x.getSource(), ha.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bsr a(ex $$0, ji $$1) throws CommandSyntaxException {
      dus $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bsr)) {
         throw anh.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsr)$$2;
      }
   }

   private static int a(ex $$0, ji $$1, List<cxh> $$2, ano.a $$3) throws CommandSyntaxException {
      bsr $$4 = a($$0, $$1);
      List<cxh> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cxh $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bsr $$0, cxh $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         cxh $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.M();
               int $$6 = Math.min($$1.M(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ex $$0, ji $$1, int $$2, int $$3, List<cxh> $$4, ano.a $$5) throws CommandSyntaxException {
      bsr $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cxh> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cxh $$11 = $$9 < $$4.size() ? $$4.get($$9) : cxh.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anh.c.create($$2);
      }
   }

   private static boolean a(cxh $$0, cxh $$1) {
      return $$0.M() <= $$0.k() && cxh.c($$0, $$1);
   }

   private static int a(Collection<are> $$0, List<cxh> $$1, ano.a $$2) throws CommandSyntaxException {
      List<cxh> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cxh $$4 : $$1) {
         for (are $$5 : $$0) {
            if ($$5.gl().f($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bva $$0, List<cxh> $$1, int $$2, int $$3, List<cxh> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cxh $$6 = $$5 < $$1.size() ? $$1.get($$5) : cxh.k;
         bwq $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bwq.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bva> $$0, int $$1, int $$2, List<cxh> $$3, ano.a $$4) throws CommandSyntaxException {
      List<cxh> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bva $$6 : $$0) {
         if ($$6 instanceof are $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bQ.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ex $$0, fbx $$1, List<cxh> $$2, ano.a $$3) throws CommandSyntaxException {
      ard $$4 = $$0.e();
      $$2.forEach($$2x -> {
         clw $$3x = new clw($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ex $$0, List<cxh> $$1) {
      if ($$1.size() == 1) {
         cxh $$2 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ex $$0, List<cxh> $$1, akt<ewt> $$2) {
      if ($$1.size() == 1) {
         cxh $$3 = $$1.get(0);
         $$0.a(() -> wp.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wp.a($$2.a())), false);
      } else {
         $$0.a(() -> wp.a("commands.drop.success.multiple_with_table", $$1.size(), wp.a($$2.a())), false);
      }
   }

   private static cxh a(ex $$0, bvj $$1) throws CommandSyntaxException {
      bva $$2 = $$0.g();
      if ($$2 instanceof bvy) {
         return ((bvy)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ex> $$0, ji $$1, cxh $$2, ano.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      ard $$5 = $$4.e();
      dxq $$6 = $$5.a_($$1);
      dus $$7 = $$5.c_($$1);
      Optional<akt<ewt>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         ewr.a $$9 = new ewr.a($$5).a(ezi.f, fbx.b($$1)).a(ezi.g, $$6).b(ezi.h, $$7).b(ezi.a, $$4.f()).a(ezi.i, $$2);
         List<cxh> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, bva $$1, ano.b $$2) throws CommandSyntaxException {
      Optional<akt<ewt>> $$3 = $$1.dZ();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ex $$4 = (ex)$$0.getSource();
         ewr.a $$5 = new ewr.a($$4.e());
         bva $$6 = $$4.f();
         if ($$6 instanceof cpr $$7) {
            $$5.a(ezi.b, $$7);
         }

         $$5.a(ezi.c, $$1.dV().q());
         $$5.b(ezi.e, $$6);
         $$5.b(ezi.d, $$6);
         $$5.a(ezi.a, $$1);
         $$5.a(ezi.f, $$4.d());
         ewr $$8 = $$5.a(ezh.g);
         ewt $$9 = $$4.l().bc().b($$3.get());
         List<cxh> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ex> $$0, jr<ewt> $$1, ano.b $$2) throws CommandSyntaxException {
      ex $$3 = (ex)$$0.getSource();
      ewr $$4 = new ewr.a($$3.e()).b(ezi.a, $$3.f()).a(ezi.f, $$3.d()).a(ezh.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ex> $$0, jr<ewt> $$1, ji $$2, cxh $$3, ano.b $$4) throws CommandSyntaxException {
      ex $$5 = (ex)$$0.getSource();
      ewr $$6 = new ewr.a($$5.e()).a(ezi.f, fbx.b($$2)).a(ezi.i, $$3).b(ezi.a, $$5.f()).a(ezh.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ex> $$0, jr<ewt> $$1, ewr $$2, ano.b $$3) throws CommandSyntaxException {
      ex $$4 = (ex)$$0.getSource();
      List<cxh> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cxh> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ex> var1, List<cxh> var2, ano.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ex, ?> construct(ArgumentBuilder<ex, ?> var1, ano.b var2);
   }
}
