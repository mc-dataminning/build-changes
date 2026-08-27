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

public class alo {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      ejf $$2 = ((du)$$0.getSource()).l().aL();
      return dz.a($$2.a(ejh.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("commands.drop.no_loot_table", $$0));

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
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), cpd.h, $$2)))
                                          .then(
                                             dv.a("tool", ga.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bnx.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, ev.e($$1xx, "loot_table"), fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bnx.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), cpd.h, $$2)))
                                    .then(dv.a("tool", ga.a($$1)).executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), ga.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bnx.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fo.a($$1xx, "pos"), a((du)$$1xx.getSource(), bnx.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, alo.c $$1) {
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

   private static blp a(du $$0, hz $$1) throws CommandSyntaxException {
      dix $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof blp)) {
         throw ali.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (blp)$$2;
      }
   }

   private static int a(du $$0, hz $$1, List<cpd> $$2, alo.a $$3) throws CommandSyntaxException {
      blp $$4 = a($$0, $$1);
      List<cpd> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cpd $$6 : $$2) {
         if (a($$4, $$6.q())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(blp $$0, cpd $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         cpd $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.b()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.g() - $$4.M();
               int $$6 = Math.min($$1.M(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(du $$0, hz $$1, int $$2, int $$3, List<cpd> $$4, alo.a $$5) throws CommandSyntaxException {
      blp $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cpd> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cpd $$11 = $$9 < $$4.size() ? $$4.get($$9) : cpd.h;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ali.b.create($$2);
      }
   }

   private static boolean a(cpd $$0, cpd $$1) {
      return $$0.M() <= $$0.g() && cpd.c($$0, $$1);
   }

   private static int a(Collection<aox> $$0, List<cpd> $$1, alo.a $$2) throws CommandSyntaxException {
      List<cpd> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cpd $$4 : $$1) {
         for (aox $$5 : $$0) {
            if ($$5.fT().e($$4.q())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bnq $$0, List<cpd> $$1, int $$2, int $$3, List<cpd> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cpd $$6 = $$5 < $$1.size() ? $$1.get($$5) : cpd.h;
         boz $$7 = $$0.a_($$2 + $$5);
         if ($$7 != boz.b && $$7.a($$6.q())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bnq> $$0, int $$1, int $$2, List<cpd> $$3, alo.a $$4) throws CommandSyntaxException {
      List<cpd> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bnq $$6 : $$0) {
         if ($$6 instanceof aox $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bW.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, enz $$1, List<cpd> $$2, alo.a $$3) throws CommandSyntaxException {
      aow $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cdw $$3x = new cdw($$4, $$1.c, $$1.d, $$1.e, $$2x.q());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<cpd> $$1) {
      if ($$1.size() == 1) {
         cpd $$2 = $$1.get(0);
         $$0.a(() -> vq.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> vq.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<cpd> $$1, aiy $$2) {
      if ($$1.size() == 1) {
         cpd $$3 = $$1.get(0);
         $$0.a(() -> vq.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), vq.a($$2)), false);
      } else {
         $$0.a(() -> vq.a("commands.drop.success.multiple_with_table", $$1.size(), vq.a($$2)), false);
      }
   }

   private static cpd a(du $$0, bnx $$1) throws CommandSyntaxException {
      bnq $$2 = $$0.g();
      if ($$2 instanceof boi) {
         return ((boi)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<du> $$0, hz $$1, cpd $$2, alo.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      aow $$5 = $$4.e();
      dlj $$6 = $$5.a_($$1);
      dix $$7 = $$5.c_($$1);
      eji.a $$8 = new eji.a($$5).a(eln.f, enz.b($$1)).a(eln.g, $$6).b(eln.h, $$7).b(eln.a, $$4.f()).a(eln.i, $$2);
      List<cpd> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bnq $$1, alo.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof boi)) {
         throw c.create($$1.Q_());
      } else {
         aiy $$3 = ((boi)$$1).eB();
         du $$4 = (du)$$0.getSource();
         eji.a $$5 = new eji.a($$4.e());
         bnq $$6 = $$4.f();
         if ($$6 instanceof chl $$7) {
            $$5.a(eln.b, $$7);
         }

         $$5.a(eln.c, $$1.dN().o());
         $$5.b(eln.e, $$6);
         $$5.b(eln.d, $$6);
         $$5.a(eln.a, $$1);
         $$5.a(eln.f, $$4.d());
         eji $$8 = $$5.a(elm.g);
         ejk $$9 = $$4.l().aL().getLootTable($$3);
         List<cpd> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, aiy $$1, alo.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      eji $$4 = new eji.a($$3.e()).b(eln.a, $$3.f()).a(eln.f, $$3.d()).a(elm.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, aiy $$1, hz $$2, cpd $$3, alo.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      eji $$6 = new eji.a($$5.e()).a(eln.f, enz.b($$2)).a(eln.i, $$3).b(eln.a, $$5.f()).a(elm.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, aiy $$1, eji $$2, alo.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      ejk $$5 = $$4.l().aL().getLootTable($$1);
      List<cpd> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cpd> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<cpd> var2, alo.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, alo.b var2);
   }
}
