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

public class aod {
   public static final SuggestionProvider<ej> a = ($$0, $$1) -> {
      als.a $$2 = ((ej)$$0.getSource()).l().bc();
      return eo.a($$2.a(mh.br), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xa.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)ek.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     ek.a("fish")
                        .then(
                           ek.a("loot_table", fl.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("pos", gg.a())
                                             .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), czy.k, $$2)))
                                          .then(
                                             ek.a("tool", gt.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), gt.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ek.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bxd.a), $$2))
                                       ))
                                    .then(
                                       ek.a("offhand")
                                          .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bxd.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(ek.a("loot").then(ek.a("loot_table", fl.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), $$2))))
                  .then(ek.a("kill").then(ek.a("target", ew.a()).executes($$1xx -> a($$1xx, ew.a($$1xx, "target"), $$2))))
                  .then(
                     ek.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("pos", gg.a())
                                       .executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), czy.k, $$2)))
                                    .then(ek.a("tool", gt.a($$1)).executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), gt.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ek.a("mainhand").executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bxd.a), $$2))))
                              .then(ek.a("offhand").executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bxd.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ej, T>> T a(T $$0, aod.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)ek.a("replace")
                  .then(
                     ek.a("entity")
                        .then(
                           ek.a("entities", ew.b())
                              .then(
                                 $$1.construct(ek.a("slot", fs.a()), ($$0x, $$1x, $$2) -> a(ew.b($$0x, "entities"), fs.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          ek.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ew.b($$0x, "entities"), fs.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  ek.a("block")
                     .then(
                        ek.a("targetPos", gg.a())
                           .then(
                              $$1.construct(
                                    ek.a("slot", fs.a()),
                                    ($$0x, $$1x, $$2) -> a((ej)$$0x.getSource(), gg.a($$0x, "targetPos"), fs.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       ek.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (ej)$$0x.getSource(),
                                             gg.a($$0x, "targetPos"),
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
         .then(ek.a("insert").then($$1.construct(ek.a("targetPos", gg.a()), ($$0x, $$1x, $$2) -> a((ej)$$0x.getSource(), gg.a($$0x, "targetPos"), $$1x, $$2))))
         .then(ek.a("give").then($$1.construct(ek.a("players", ew.d()), ($$0x, $$1x, $$2) -> a(ew.f($$0x, "players"), $$1x, $$2))))
         .then(ek.a("spawn").then($$1.construct(ek.a("targetPos", gn.a()), ($$0x, $$1x, $$2) -> a((ej)$$0x.getSource(), gn.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static buk a(ej $$0, iv $$1) throws CommandSyntaxException {
      dyc $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof buk)) {
         throw anw.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (buk)$$2;
      }
   }

   private static int a(ej $$0, iv $$1, List<czy> $$2, aod.a $$3) throws CommandSyntaxException {
      buk $$4 = a($$0, $$1);
      List<czy> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (czy $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(buk $$0, czy $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         czy $$4 = $$0.a($$3);
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

   private static int a(ej $$0, iv $$1, int $$2, int $$3, List<czy> $$4, aod.a $$5) throws CommandSyntaxException {
      buk $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<czy> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            czy $$11 = $$9 < $$4.size() ? $$4.get($$9) : czy.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anw.c.create($$2);
      }
   }

   private static boolean a(czy $$0, czy $$1) {
      return $$0.M() <= $$0.k() && czy.c($$0, $$1);
   }

   private static int a(Collection<art> $$0, List<czy> $$1, aod.a $$2) throws CommandSyntaxException {
      List<czy> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (czy $$4 : $$1) {
         for (art $$5 : $$0) {
            if ($$5.gj().g($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bwt $$0, List<czy> $$1, int $$2, int $$3, List<czy> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         czy $$6 = $$5 < $$1.size() ? $$1.get($$5) : czy.k;
         byl $$7 = $$0.a_($$2 + $$5);
         if ($$7 != byl.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bwt> $$0, int $$1, int $$2, List<czy> $$3, aod.a $$4) throws CommandSyntaxException {
      List<czy> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bwt $$6 : $$0) {
         if ($$6 instanceof art $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bR.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ej $$0, ffq $$1, List<czy> $$2, aod.a $$3) throws CommandSyntaxException {
      ars $$4 = $$0.e();
      $$2.forEach($$2x -> {
         coc $$3x = new coc($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ej $$0, List<czy> $$1) {
      if ($$1.size() == 1) {
         czy $$2 = $$1.get(0);
         $$0.a(() -> xa.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> xa.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ej $$0, List<czy> $$1, alh<fam> $$2) {
      if ($$1.size() == 1) {
         czy $$3 = $$1.get(0);
         $$0.a(() -> xa.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), xa.a($$2.a())), false);
      } else {
         $$0.a(() -> xa.a("commands.drop.success.multiple_with_table", $$1.size(), xa.a($$2.a())), false);
      }
   }

   private static czy a(ej $$0, bxd $$1) throws CommandSyntaxException {
      bwt $$2 = $$0.g();
      if ($$2 instanceof bxu) {
         return ((bxu)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ej> $$0, iv $$1, czy $$2, aod.b $$3) throws CommandSyntaxException {
      ej $$4 = (ej)$$0.getSource();
      ars $$5 = $$4.e();
      ebe $$6 = $$5.a_($$1);
      dyc $$7 = $$5.c_($$1);
      Optional<alh<fam>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         fak.a $$9 = new fak.a($$5).a(fdb.f, ffq.b($$1)).a(fdb.g, $$6).b(fdb.h, $$7).b(fdb.a, $$4.f()).a(fdb.i, $$2);
         List<czy> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ej> $$0, bwt $$1, aod.b $$2) throws CommandSyntaxException {
      Optional<alh<fam>> $$3 = $$1.ea();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ej $$4 = (ej)$$0.getSource();
         fak.a $$5 = new fak.a($$4.e());
         bwt $$6 = $$4.f();
         if ($$6 instanceof crx $$7) {
            $$5.a(fdb.b, $$7);
         }

         $$5.a(fdb.c, $$1.dW().q());
         $$5.b(fdb.e, $$6);
         $$5.b(fdb.d, $$6);
         $$5.a(fdb.a, $$1);
         $$5.a(fdb.f, $$4.d());
         fak $$8 = $$5.a(fda.g);
         fam $$9 = $$4.l().bc().b($$3.get());
         List<czy> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ej> $$0, jf<fam> $$1, aod.b $$2) throws CommandSyntaxException {
      ej $$3 = (ej)$$0.getSource();
      fak $$4 = new fak.a($$3.e()).b(fdb.a, $$3.f()).a(fdb.f, $$3.d()).a(fda.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ej> $$0, jf<fam> $$1, iv $$2, czy $$3, aod.b $$4) throws CommandSyntaxException {
      ej $$5 = (ej)$$0.getSource();
      fak $$6 = new fak.a($$5.e()).a(fdb.f, ffq.b($$2)).a(fdb.i, $$3).b(fdb.a, $$5.f()).a(fda.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ej> $$0, jf<fam> $$1, fak $$2, aod.b $$3) throws CommandSyntaxException {
      ej $$4 = (ej)$$0.getSource();
      List<czy> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<czy> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ej> var1, List<czy> var2, aod.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ej, ?> construct(ArgumentBuilder<ej, ?> var1, aod.b var2);
   }
}
