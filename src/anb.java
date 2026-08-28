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
      aku.b $$2 = ((eq)$$0.getSource()).l().bf();
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
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), cuc.l, $$2)))
                                          .then(
                                             er.a("tool", gz.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          er.a("mainhand")
                                             .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsn.a), $$2))
                                       ))
                                    .then(
                                       er.a("offhand")
                                          .executes($$1xx -> a($$1xx, fs.a($$1xx, "loot_table"), gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsn.b), $$2))
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
                                       .executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), cuc.l, $$2)))
                                    .then(er.a("tool", gz.a($$1)).executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), gz.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(er.a("mainhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsn.a), $$2))))
                              .then(er.a("offhand").executes($$1xx -> a($$1xx, gm.a($$1xx, "pos"), a((eq)$$1xx.getSource(), bsn.b), $$2)))
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

   private static bpz a(eq $$0, ja $$1) throws CommandSyntaxException {
      dpp $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bpz)) {
         throw amv.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpz)$$2;
      }
   }

   private static int a(eq $$0, ja $$1, List<cuc> $$2, anb.a $$3) throws CommandSyntaxException {
      bpz $$4 = a($$0, $$1);
      List<cuc> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (cuc $$6 : $$2) {
         if (a($$4, $$6.s())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bpz $$0, cuc $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.e(); $$3++) {
         cuc $$4 = $$0.a($$3);
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

   private static int a(eq $$0, ja $$1, int $$2, int $$3, List<cuc> $$4, anb.a $$5) throws CommandSyntaxException {
      bpz $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<cuc> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            cuc $$11 = $$9 < $$4.size() ? $$4.get($$9) : cuc.l;
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

   private static boolean a(cuc $$0, cuc $$1) {
      return $$0.H() <= $$0.j() && cuc.c($$0, $$1);
   }

   private static int a(Collection<aqn> $$0, List<cuc> $$1, anb.a $$2) throws CommandSyntaxException {
      List<cuc> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (cuc $$4 : $$1) {
         for (aqn $$5 : $$0) {
            if ($$5.fZ().f($$4.s())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bsg $$0, List<cuc> $$1, int $$2, int $$3, List<cuc> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         cuc $$6 = $$5 < $$1.size() ? $$1.get($$5) : cuc.l;
         btt $$7 = $$0.a_($$2 + $$5);
         if ($$7 != btt.a && $$7.a($$6.s())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bsg> $$0, int $$1, int $$2, List<cuc> $$3, anb.a $$4) throws CommandSyntaxException {
      List<cuc> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bsg $$6 : $$0) {
         if ($$6 instanceof aqn $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cd.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(eq $$0, ewf $$1, List<cuc> $$2, anb.a $$3) throws CommandSyntaxException {
      aqm $$4 = $$0.e();
      $$2.forEach($$2x -> {
         ciu $$3x = new ciu($$4, $$1.c, $$1.d, $$1.e, $$2x.s());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(eq $$0, List<cuc> $$1) {
      if ($$1.size() == 1) {
         cuc $$2 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single", $$2.H(), $$2.F()), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(eq $$0, List<cuc> $$1, akj<eqz> $$2) {
      if ($$1.size() == 1) {
         cuc $$3 = $$1.get(0);
         $$0.a(() -> wu.a("commands.drop.success.single_with_table", $$3.H(), $$3.F(), wu.a($$2.a())), false);
      } else {
         $$0.a(() -> wu.a("commands.drop.success.multiple_with_table", $$1.size(), wu.a($$2.a())), false);
      }
   }

   private static cuc a(eq $$0, bsn $$1) throws CommandSyntaxException {
      bsg $$2 = $$0.g();
      if ($$2 instanceof btb) {
         return ((btb)$$2).a($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<eq> $$0, ja $$1, cuc $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      aqm $$5 = $$4.e();
      dsk $$6 = $$5.a_($$1);
      dpp $$7 = $$5.c_($$1);
      eqx.a $$8 = new eqx.a($$5).a(etq.f, ewf.b($$1)).a(etq.g, $$6).b(etq.h, $$7).b(etq.a, $$4.f()).a(etq.i, $$2);
      List<cuc> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<eq> $$0, bsg $$1, anb.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof btb)) {
         throw c.create($$1.O_());
      } else {
         akj<eqz> $$3 = ((btb)$$1).eB();
         eq $$4 = (eq)$$0.getSource();
         eqx.a $$5 = new eqx.a($$4.e());
         bsg $$6 = $$4.f();
         if ($$6 instanceof cmk $$7) {
            $$5.a(etq.b, $$7);
         }

         $$5.a(etq.c, $$1.dR().p());
         $$5.b(etq.e, $$6);
         $$5.b(etq.d, $$6);
         $$5.a(etq.a, $$1);
         $$5.a(etq.f, $$4.d());
         eqx $$8 = $$5.a(etp.g);
         eqz $$9 = $$4.l().bf().b($$3);
         List<cuc> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<eq> $$0, jj<eqz> $$1, anb.b $$2) throws CommandSyntaxException {
      eq $$3 = (eq)$$0.getSource();
      eqx $$4 = new eqx.a($$3.e()).b(etq.a, $$3.f()).a(etq.f, $$3.d()).a(etp.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<eq> $$0, jj<eqz> $$1, ja $$2, cuc $$3, anb.b $$4) throws CommandSyntaxException {
      eq $$5 = (eq)$$0.getSource();
      eqx $$6 = new eqx.a($$5.e()).a(etq.f, ewf.b($$2)).a(etq.i, $$3).b(etq.a, $$5.f()).a(etp.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<eq> $$0, jj<eqz> $$1, eqx $$2, anb.b $$3) throws CommandSyntaxException {
      eq $$4 = (eq)$$0.getSource();
      List<cuc> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<cuc> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<eq> var1, List<cuc> var2, anb.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<eq, ?> construct(ArgumentBuilder<eq, ?> var1, anb.b var2);
   }
}
