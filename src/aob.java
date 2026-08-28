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

public class aob {
   public static final SuggestionProvider<ej> a = ($$0, $$1) -> {
      alq.a $$2 = ((ej)$$0.getSource()).l().bc();
      return eo.a($$2.a(mh.bq), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.drop.no_loot_table.block", $$0));

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
                                             .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), czk.k, $$2)))
                                          .then(
                                             ek.a("tool", gt.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), gt.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          ek.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bws.a), $$2))
                                       ))
                                    .then(
                                       ek.a("offhand")
                                          .executes($$1xx -> a($$1xx, fl.a($$1xx, "loot_table"), gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bws.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), czk.k, $$2)))
                                    .then(ek.a("tool", gt.a($$1)).executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), gt.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(ek.a("mainhand").executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bws.a), $$2))))
                              .then(ek.a("offhand").executes($$1xx -> a($$1xx, gg.a($$1xx, "pos"), a((ej)$$1xx.getSource(), bws.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<ej, T>> T a(T $$0, aob.c $$1) {
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

   private static btz a(ej $$0, iv $$1) throws CommandSyntaxException {
      dxm $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof btz)) {
         throw anu.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btz)$$2;
      }
   }

   private static int a(ej $$0, iv $$1, List<czk> $$2, aob.a $$3) throws CommandSyntaxException {
      btz $$4 = a($$0, $$1);
      List<czk> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (czk $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(btz $$0, czk $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         czk $$4 = $$0.a($$3);
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

   private static int a(ej $$0, iv $$1, int $$2, int $$3, List<czk> $$4, aob.a $$5) throws CommandSyntaxException {
      btz $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<czk> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            czk $$11 = $$9 < $$4.size() ? $$4.get($$9) : czk.k;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw anu.c.create($$2);
      }
   }

   private static boolean a(czk $$0, czk $$1) {
      return $$0.M() <= $$0.k() && czk.c($$0, $$1);
   }

   private static int a(Collection<arr> $$0, List<czk> $$1, aob.a $$2) throws CommandSyntaxException {
      List<czk> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (czk $$4 : $$1) {
         for (arr $$5 : $$0) {
            if ($$5.gi().g($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bwi $$0, List<czk> $$1, int $$2, int $$3, List<czk> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         czk $$6 = $$5 < $$1.size() ? $$1.get($$5) : czk.k;
         bya $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bya.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bwi> $$0, int $$1, int $$2, List<czk> $$3, aob.a $$4) throws CommandSyntaxException {
      List<czk> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bwi $$6 : $$0) {
         if ($$6 instanceof arr $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bR.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ej $$0, fex $$1, List<czk> $$2, aob.a $$3) throws CommandSyntaxException {
      arq $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cno $$3x = new cno($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.j();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ej $$0, List<czk> $$1) {
      if ($$1.size() == 1) {
         czk $$2 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ej $$0, List<czk> $$1, alf<ezt> $$2) {
      if ($$1.size() == 1) {
         czk $$3 = $$1.get(0);
         $$0.a(() -> wy.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), wy.a($$2.a())), false);
      } else {
         $$0.a(() -> wy.a("commands.drop.success.multiple_with_table", $$1.size(), wy.a($$2.a())), false);
      }
   }

   private static czk a(ej $$0, bws $$1) throws CommandSyntaxException {
      bwi $$2 = $$0.g();
      if ($$2 instanceof bxj) {
         return ((bxj)$$2).a($$1);
      } else {
         throw b.create($$2.m_());
      }
   }

   private static int a(CommandContext<ej> $$0, iv $$1, czk $$2, aob.b $$3) throws CommandSyntaxException {
      ej $$4 = (ej)$$0.getSource();
      arq $$5 = $$4.e();
      eao $$6 = $$5.a_($$1);
      dxm $$7 = $$5.c_($$1);
      Optional<alf<ezt>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw d.create($$6.b().f());
      } else {
         ezr.a $$9 = new ezr.a($$5).a(fci.f, fex.b($$1)).a(fci.g, $$6).b(fci.h, $$7).b(fci.a, $$4.f()).a(fci.i, $$2);
         List<czk> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ej> $$0, bwi $$1, aob.b $$2) throws CommandSyntaxException {
      Optional<alf<ezt>> $$3 = $$1.dZ();
      if ($$3.isEmpty()) {
         throw c.create($$1.m_());
      } else {
         ej $$4 = (ej)$$0.getSource();
         ezr.a $$5 = new ezr.a($$4.e());
         bwi $$6 = $$4.f();
         if ($$6 instanceof crj $$7) {
            $$5.a(fci.b, $$7);
         }

         $$5.a(fci.c, $$1.dV().q());
         $$5.b(fci.e, $$6);
         $$5.b(fci.d, $$6);
         $$5.a(fci.a, $$1);
         $$5.a(fci.f, $$4.d());
         ezr $$8 = $$5.a(fch.g);
         ezt $$9 = $$4.l().bc().b($$3.get());
         List<czk> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ej> $$0, jf<ezt> $$1, aob.b $$2) throws CommandSyntaxException {
      ej $$3 = (ej)$$0.getSource();
      ezr $$4 = new ezr.a($$3.e()).b(fci.a, $$3.f()).a(fci.f, $$3.d()).a(fch.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ej> $$0, jf<ezt> $$1, iv $$2, czk $$3, aob.b $$4) throws CommandSyntaxException {
      ej $$5 = (ej)$$0.getSource();
      ezr $$6 = new ezr.a($$5.e()).a(fci.f, fex.b($$2)).a(fci.i, $$3).b(fci.a, $$5.f()).a(fch.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ej> $$0, jf<ezt> $$1, ezr $$2, aob.b $$3) throws CommandSyntaxException {
      ej $$4 = (ej)$$0.getSource();
      List<czk> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<czk> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ej> var1, List<czk> var2, aob.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ej, ?> construct(ArgumentBuilder<ej, ?> var1, aob.b var2);
   }
}
