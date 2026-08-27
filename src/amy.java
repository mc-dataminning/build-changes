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

public class amy {
   public static final SuggestionProvider<ed> a = ($$0, $$1) -> {
      akr.b $$2 = ((ed)$$0.getSource()).l().be();
      return ei.a($$2.a(le.aU), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ee.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ee.a("fish")
                        .then(
                           ee.a("loot_table", ff.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("pos", fz.a())
                                             .executes($$1xx -> a($$1xx, ff.a($$1xx, "loot_table"), fz.a($$1xx, "pos"), csz.i, $$2)))
                                          .then(
                                             ee.a("tool", gm.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ff.a($$1xx, "loot_table"), fz.a($$1xx, "pos"), gm.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ee.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ff.a($$1xx, "loot_table"), fz.a($$1xx, "pos"), a((ed)$$1xx.getSource(), bro.a), $$2))
                                       ))
                                    .then(
                                       ee.a("offhand")
                                          .executes($$1xx -> a($$1xx, ff.a($$1xx, "loot_table"), fz.a($$1xx, "pos"), a((ed)$$1xx.getSource(), bro.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ee.a("loot").then(ee.a("loot_table", ff.a($$1)).suggests(a).executes($$1xx -> a($$1xx, ff.a($$1xx, "loot_table"), $$2))))
                  .then(ee.a("kill").then(ee.a("target", eq.a()).executes($$1xx -> a($$1xx, eq.a($$1xx, "target"), $$2))))
                  .then(
                     ee.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("pos", fz.a())
                                       .executes($$1xx -> a($$1xx, fz.a($$1xx, "pos"), csz.i, $$2)))
                                    .then(ee.a("tool", gm.a($$1)).executes($$1xx -> a($$1xx, fz.a($$1xx, "pos"), gm.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ee.a("mainhand").executes($$1xx -> a($$1xx, fz.a($$1xx, "pos"), a((ed)$$1xx.getSource(), bro.a), $$2))))
                              .then(ee.a("offhand").executes($$1xx -> a($$1xx, fz.a($$1xx, "pos"), a((ed)$$1xx.getSource(), bro.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ed, T>> T a(T $$0, amy.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ee.a("replace")
                  .then(
                     ee.a("entity")
                        .then(
                           ee.a("entities", eq.b())
                              .then(
                                 $$1.construct(ee.a("slot", fl.a()), ($$0x, $$1x, $$2) -> a(eq.b($$0x, "entities"), fl.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ee.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                eq.b($$0x, "entities"), fl.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ee.a("block")
                     .then(
                        ee.a("targetPos", fz.a())
                           .then(
                              $$1.construct(
                                    ee.a("slot", fl.a()),
                                    ($$0x, $$1x, $$2) -> a((ed)$$0x.getSource(), fz.a($$0x, "targetPos"), fl.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ee.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ed)$$0x.getSource(),
                                             fz.a($$0x, "targetPos"),
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
         .then(ee.a("insert").then($$1.construct(ee.a("targetPos", fz.a()), ($$0x, $$1x, $$2) -> a((ed)$$0x.getSource(), fz.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ee.a("give").then($$1.construct(ee.a("players", eq.d()), ($$0x, $$1x, $$2) -> a(eq.f($$0x, "players"), $$1x, $$2))))
         .then(ee.a("spawn").then($$1.construct(ee.a("targetPos", gg.a()), ($$0x, $$1x, $$2) -> a((ed)$$0x.getSource(), gg.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bpf a(ed $$0, in $$1) throws CommandSyntaxException {
      dnm $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpf)) {
         throw ams.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpf)$$2;
      }
   }

   private static int a(ed $$0, in $$1, List<csz> $$2, amy.a $$3) throws CommandSyntaxException {
      bpf $$4 = a($$0, $$1);
      List<csz> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (csz $$6 : $$2) {
         if (a($$4, $$6.r())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpf $$0, csz $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.d(); $$3++) {
         csz $$4 = $$0.a($$3);
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

   private static int a(ed $$0, in $$1, int $$2, int $$3, List<csz> $$4, amy.a $$5) throws CommandSyntaxException {
      bpf $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<csz> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            csz $$11 = $$9 < $$4.size() ? $$4.get($$9) : csz.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw ams.c.create($$2);
      }
   }

   private static boolean a(csz $$0, csz $$1) {
      return $$0.G() <= $$0.i() && csz.c($$0, $$1);
   }

   private static int a(Collection<aqi> $$0, List<csz> $$1, amy.a $$2) throws CommandSyntaxException {
      List<csz> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (csz $$4 : $$1) {
         for (aqi $$5 : $$0) {
            if ($$5.ga().f($$4.r())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(brh $$0, List<csz> $$1, int $$2, int $$3, List<csz> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         csz $$6 = $$5 < $$1.size() ? $$1.get($$5) : csz.i;
         bsr $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bsr.b && $$7.a($$6.r())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends brh> $$0, int $$1, int $$2, List<csz> $$3, amy.a $$4) throws CommandSyntaxException {
      List<csz> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (brh $$6 : $$0) {
         if ($$6 instanceof aqi $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cc.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ed $$0, etp $$1, List<csz> $$2, amy.a $$3) throws CommandSyntaxException {
      aqh $$4 = $$0.e();
      $$2.forEach($$2x -> {
         chr $$3x = new chr($$4, $$1.c, $$1.d, $$1.e, $$2x.r());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ed $$0, List<csz> $$1) {
      if ($$1.size() == 1) {
         csz $$2 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single", $$2.G(), $$2.E()), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ed $$0, List<csz> $$1, akg<eoq> $$2) {
      if ($$1.size() == 1) {
         csz $$3 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single_with_table", $$3.G(), $$3.E(), wu.a($$2.a())), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple_with_table", $$1.size(), wu.a($$2.a())), false);
      }
   }

   private static csz a(ed $$0, bro $$1) throws CommandSyntaxException {
      brh $$2 = $$0.g();
      if ($$2 instanceof bsa) {
         return ((bsa)$$2).d($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<ed> $$0, in $$1, csz $$2, amy.b $$3) throws CommandSyntaxException {
      ed $$4 = (ed)$$0.getSource();
      aqh $$5 = $$4.e();
      dqh $$6 = $$5.a_($$1);
      dnm $$7 = $$5.c_($$1);
      eoo.a $$8 = new eoo.a($$5).a(erc.f, etp.b($$1)).a(erc.g, $$6).b(erc.h, $$7).b(erc.a, $$4.f()).a(erc.i, $$2);
      List<csz> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<ed> $$0, brh $$1, amy.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bsa)) {
         throw c.create($$1.O_());
      } else {
         akg<eoq> $$3 = ((bsa)$$1).eD();
         ed $$4 = (ed)$$0.getSource();
         eoo.a $$5 = new eoo.a($$4.e());
         brh $$6 = $$4.f();
         if ($$6 instanceof clh $$7) {
            $$5.a(erc.b, $$7);
         }

         $$5.a(erc.c, $$1.dO().o());
         $$5.b(erc.e, $$6);
         $$5.b(erc.d, $$6);
         $$5.a(erc.a, $$1);
         $$5.a(erc.f, $$4.d());
         eoo $$8 = $$5.a(erb.g);
         eoq $$9 = $$4.l().be().b($$3);
         List<csz> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<ed> $$0, iw<eoq> $$1, amy.b $$2) throws CommandSyntaxException {
      ed $$3 = (ed)$$0.getSource();
      eoo $$4 = new eoo.a($$3.e()).b(erc.a, $$3.f()).a(erc.f, $$3.d()).a(erb.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ed> $$0, iw<eoq> $$1, in $$2, csz $$3, amy.b $$4) throws CommandSyntaxException {
      ed $$5 = (ed)$$0.getSource();
      eoo $$6 = new eoo.a($$5.e()).a(erc.f, etp.b($$2)).a(erc.i, $$3).b(erc.a, $$5.f()).a(erb.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ed> $$0, iw<eoq> $$1, eoo $$2, amy.b $$3) throws CommandSyntaxException {
      ed $$4 = (ed)$$0.getSource();
      List<csz> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<csz> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ed> var1, List<csz> var2, amy.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ed, ?> construct(ArgumentBuilder<ed, ?> var1, amy.b var2);
   }
}
