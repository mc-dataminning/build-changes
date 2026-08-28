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

public class anb {
   public static final SuggestionProvider<eq> a = ($$0, $$1) -> {
      aku.b $$2 = ((eq)$$0.getSource()).l().be();
      return ev.a($$2.a(lr.bb), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)er.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     er.a("fish")
                        .then(
                           er.a("loot_table", fs.a($$1))
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("pos", gm.a())
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), cua.l, $$2)))
                                          .then(
                                             er.a("tool", gz.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          er.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsk.a), $$2))
                                       ))
                                    .then(
                                       er.a("offhand")
                                          .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsk.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(er.a("loot").then(er.a("loot_table", fs.a($$1)).suggests(a).executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), $$2))))
                  .then(er.a("kill").then(er.a("target", fd.a()).executes($$1xx -> a($$1xx, fd.a($$1xx, "target"), $$2))))
                  .then(
                     er.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("pos", gm.a())
                                       .executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), cua.l, $$2)))
                                    .then(er.a("tool", gz.a($$1)).executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(er.a("mainhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsk.a), $$2))))
                              .then(er.a("offhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsk.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<eq, T>> T a(T $$0, anb.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)er.a("replace")
                  .then(
                     er.a("entity")
                        .then(
                           er.a("entities", fd.b())
                              .then(
                                 $$1.construct(er.a("slot", fy.a()), ($$0x, $$1x, $$2) -> a(fd.b($$0x, "entities"), fy.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          er.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                fd.b($$0x, "entities"), fy.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  er.a("block")
                     .then(
                        er.a("targetPos", gm.a())
                           .then(
                              $$1.construct(
                                    er.a("slot", fy.a()),
                                    ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gm.a($$0x, "targetPos"), fy.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       er.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (eq)$$0x.getSource(),
                                             gm.a($$0x, "targetPos"),
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
         .then(er.a("insert").then($$1.construct(er.a("targetPos", gm.a()), ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gm.a($$0x, "targetPos"), $$1x, $$2))))
         .then(er.a("give").then($$1.construct(er.a("players", fd.d()), ($$0x, $$1x, $$2) -> a(fd.f($$0x, "players"), $$1x, $$2))))
         .then(er.a("spawn").then($$1.construct(er.a("targetPos", gt.a()), ($$0x, $$1x, $$2) -> a((eq)$$0x.getSource(), gt.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bpw a(eq $$0, ja $$1) throws CommandSyntaxException {
      dpn $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpw)) {
         throw amv.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpw)$$2;
      }
   }

   private static int a(eq $$0, ja $$1, List<cua> $$2, anb.a $$3) throws CommandSyntaxException {
      bpw $$4 = a($$0, $$1);
      List<cua> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cua $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpw $$0, cua $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cua $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.e()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.j() - $$4.H();
               int $$6 = Math.min($$1.H(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(eq $$0, ja $$1, int $$2, int $$3, List<cua> $$4, anb.a $$5) throws CommandSyntaxException {
      bpw $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cua> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cua $$11 = $$9 < $$4.size() ? $$4.get($$9) : cua.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amv.c.create($$2);
      }
   }

   private static boolean a(cua $$0, cua $$1) {
      return $$0.H() <= $$0.j() && cua.c($$0, $$1);
   }

   private static int a(Collection<aql> $$0, List<cua> $$1, anb.a $$2) throws CommandSyntaxException {
      List<cua> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cua $$4 : $$1) {
         for (aql $$5 : $$0) {
            if ($$5.fY().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsd $$0, List<cua> $$1, int $$2, int $$3, List<cua> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cua $$6 = $$5 < $$1.size() ? $$1.get($$5) : cua.l;
         btq $$7 = $$0.a_($$2 + $$5);
         if ($$7 != btq.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsd> $$0, int $$1, int $$2, List<cua> $$3, anb.a $$4) throws CommandSyntaxException {
      List<cua> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsd $$6 : $$0) {
         if ($$6 instanceof aql $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(eq $$0, evz $$1, List<cua> $$2, anb.a $$3) throws CommandSyntaxException {
      aqk $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cir $$3x = new cir($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(eq $$0, List<cua> $$1) {
      if ($$1.size() == 1) {
         cua $$2 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single", $$2.H(), $$2.F()), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(eq $$0, List<cua> $$1, akj<eqt> $$2) {
      if ($$1.size() == 1) {
         cua $$3 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single_with_table", $$3.H(), $$3.F(), wu.a($$2.a())), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple_with_table", $$1.size(), wu.a($$2.a())), false);
      }
   }

   private static cua a(eq $$0, bsk $$1) throws CommandSyntaxException {
      bsd $$2 = $$0.g();
      if ($$2 instanceof bsy) {
         return ((bsy)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<eq> $$0, ja $$1, cua $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      aqk $$5 = $$4.e();
      dsh $$6 = $$5.a_($$1);
      dpn $$7 = $$5.c_($$1);
      eqr.a $$8 = new eqr.a($$5).a(etk.f, evz.b($$1)).a(etk.g, $$6).b(etk.h, $$7).b(etk.a, $$4.f()).a(etk.i, $$2);
      List<cua> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<eq> $$0, bsd $$1, anb.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bsy)) {
         throw c.create($$1.O_());
      } else {
         akj<eqt> $$3 = ((bsy)$$1).eA();
         eq $$4 = (eq)$$0.getSource();
         eqr.a $$5 = new eqr.a($$4.e());
         bsd $$6 = $$4.f();
         if ($$6 instanceof cmh $$7) {
            $$5.a(etk.b, $$7);
         }

         $$5.a(etk.c, $$1.dQ().p());
         $$5.b(etk.e, $$6);
         $$5.b(etk.d, $$6);
         $$5.a(etk.a, $$1);
         $$5.a(etk.f, $$4.d());
         eqr $$8 = $$5.a(etj.g);
         eqt $$9 = $$4.l().be().b($$3);
         List<cua> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<eq> $$0, jj<eqt> $$1, anb.b $$2) throws CommandSyntaxException {
      eq $$3 = (eq)$$0.getSource();
      eqr $$4 = new eqr.a($$3.e()).b(etk.a, $$3.f()).a(etk.f, $$3.d()).a(etj.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<eq> $$0, jj<eqt> $$1, ja $$2, cua $$3, anb.b $$4) throws CommandSyntaxException {
      eq $$5 = (eq)$$0.getSource();
      eqr $$6 = new eqr.a($$5.e()).a(etk.f, evz.b($$2)).a(etk.i, $$3).b(etk.a, $$5.f()).a(etj.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<eq> $$0, jj<eqt> $$1, eqr $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      List<cua> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cua> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<eq> var1, List<cua> var2, anb.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<eq, ?> construct(ArgumentBuilder<eq, ?> var1, anb.b var2);
   }
}
