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

public class aml {
   public static final SuggestionProvider<dv> a = ($$0, $$1) -> {
      enn $$2 = ((dv)$$0.getSource()).l().aM();
      return ea.a($$2.a(enp.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dw.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dw.a("fish")
                        .then(
                           dw.a("loot_table", ew.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("pos", fq.a())
                                             .executes($$1xx -> a($$1xx, ew.e($$1xx, "loot_table"), fq.a($$1xx, "pos"), crs.i, $$2)))
                                          .then(
                                             dw.a("tool", gc.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, ew.e($$1xx, "loot_table"), fq.a($$1xx, "pos"), gc.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dw.a("mainhand")
                                             .executes($$1xx -> a($$1xx, ew.e($$1xx, "loot_table"), fq.a($$1xx, "pos"), a((dv)$$1xx.getSource(), bqh.a), $$2))
                                       ))
                                    .then(
                                       dw.a("offhand")
                                          .executes($$1xx -> a($$1xx, ew.e($$1xx, "loot_table"), fq.a($$1xx, "pos"), a((dv)$$1xx.getSource(), bqh.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dw.a("loot").then(dw.a("loot_table", ew.a()).suggests(a).executes($$1xx -> a($$1xx, ew.e($$1xx, "loot_table"), $$2))))
                  .then(dw.a("kill").then(dw.a("target", ei.a()).executes($$1xx -> a($$1xx, ei.a($$1xx, "target"), $$2))))
                  .then(
                     dw.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("pos", fq.a())
                                       .executes($$1xx -> a($$1xx, fq.a($$1xx, "pos"), crs.i, $$2)))
                                    .then(dw.a("tool", gc.a($$1)).executes($$1xx -> a($$1xx, fq.a($$1xx, "pos"), gc.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dw.a("mainhand").executes($$1xx -> a($$1xx, fq.a($$1xx, "pos"), a((dv)$$1xx.getSource(), bqh.a), $$2))))
                              .then(dw.a("offhand").executes($$1xx -> a($$1xx, fq.a($$1xx, "pos"), a((dv)$$1xx.getSource(), bqh.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<dv, T>> T a(T $$0, aml.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dw.a("replace")
                  .then(
                     dw.a("entity")
                        .then(
                           dw.a("entities", ei.b())
                              .then(
                                 $$1.construct(dw.a("slot", fc.a()), ($$0x, $$1x, $$2) -> a(ei.b($$0x, "entities"), fc.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dw.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                ei.b($$0x, "entities"), fc.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dw.a("block")
                     .then(
                        dw.a("targetPos", fq.a())
                           .then(
                              $$1.construct(
                                    dw.a("slot", fc.a()),
                                    ($$0x, $$1x, $$2) -> a((dv)$$0x.getSource(), fq.a($$0x, "targetPos"), fc.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dw.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (dv)$$0x.getSource(),
                                             fq.a($$0x, "targetPos"),
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
         .then(dw.a("insert").then($$1.construct(dw.a("targetPos", fq.a()), ($$0x, $$1x, $$2) -> a((dv)$$0x.getSource(), fq.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dw.a("give").then($$1.construct(dw.a("players", ei.d()), ($$0x, $$1x, $$2) -> a(ei.f($$0x, "players"), $$1x, $$2))))
         .then(dw.a("spawn").then($$1.construct(dw.a("targetPos", fx.a()), ($$0x, $$1x, $$2) -> a((dv)$$0x.getSource(), fx.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bny a(dv $$0, id $$1) throws CommandSyntaxException {
      dmo $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bny)) {
         throw amf.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bny)$$2;
      }
   }

   private static int a(dv $$0, id $$1, List<crs> $$2, aml.a $$3) throws CommandSyntaxException {
      bny $$4 = a($$0, $$1);
      List<crs> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (crs $$6 : $$2) {
         if (a($$4, $$6.r())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bny $$0, crs $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.d(); $$3++) {
         crs $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.d()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.i() - $$4.G();
               int $$6 = Math.min($$1.G(), $$5);
               $$1.g($$6);
               $$4.f($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(dv $$0, id $$1, int $$2, int $$3, List<crs> $$4, aml.a $$5) throws CommandSyntaxException {
      bny $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<crs> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            crs $$11 = $$9 < $$4.size() ? $$4.get($$9) : crs.i;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw amf.c.create($$2);
      }
   }

   private static boolean a(crs $$0, crs $$1) {
      return $$0.G() <= $$0.i() && crs.c($$0, $$1);
   }

   private static int a(Collection<apv> $$0, List<crs> $$1, aml.a $$2) throws CommandSyntaxException {
      List<crs> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (crs $$4 : $$1) {
         for (apv $$5 : $$0) {
            if ($$5.fZ().e($$4.r())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bqa $$0, List<crs> $$1, int $$2, int $$3, List<crs> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         crs $$6 = $$5 < $$1.size() ? $$1.get($$5) : crs.i;
         brk $$7 = $$0.a_($$2 + $$5);
         if ($$7 != brk.b && $$7.a($$6.r())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bqa> $$0, int $$1, int $$2, List<crs> $$3, aml.a $$4) throws CommandSyntaxException {
      List<crs> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bqa $$6 : $$0) {
         if ($$6 instanceof apv $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.ca.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(dv $$0, esj $$1, List<crs> $$2, aml.a $$3) throws CommandSyntaxException {
      apu $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cgk $$3x = new cgk($$4, $$1.c, $$1.d, $$1.e, $$2x.r());
         $$3x.v();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(dv $$0, List<crs> $$1) {
      if ($$1.size() == 1) {
         crs $$2 = $$1.get(0);
         $$0.a(() -> wi.a("commands.drop.success.single", $$2.G(), $$2.E()), false);
      } else {
         $$0.a(() -> wi.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(dv $$0, List<crs> $$1, ajv $$2) {
      if ($$1.size() == 1) {
         crs $$3 = $$1.get(0);
         $$0.a(() -> wi.a("commands.drop.success.single_with_table", $$3.G(), $$3.E(), wi.a($$2)), false);
      } else {
         $$0.a(() -> wi.a("commands.drop.success.multiple_with_table", $$1.size(), wi.a($$2)), false);
      }
   }

   private static crs a(dv $$0, bqh $$1) throws CommandSyntaxException {
      bqa $$2 = $$0.g();
      if ($$2 instanceof bqt) {
         return ((bqt)$$2).d($$1);
      } else {
         throw b.create($$2.O_());
      }
   }

   private static int a(CommandContext<dv> $$0, id $$1, crs $$2, aml.b $$3) throws CommandSyntaxException {
      dv $$4 = (dv)$$0.getSource();
      apu $$5 = $$4.e();
      dpi $$6 = $$5.a_($$1);
      dmo $$7 = $$5.c_($$1);
      enq.a $$8 = new enq.a($$5).a(epx.f, esj.b($$1)).a(epx.g, $$6).b(epx.h, $$7).b(epx.a, $$4.f()).a(epx.i, $$2);
      List<crs> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<dv> $$0, bqa $$1, aml.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bqt)) {
         throw c.create($$1.O_());
      } else {
         ajv $$3 = ((bqt)$$1).eC();
         dv $$4 = (dv)$$0.getSource();
         enq.a $$5 = new enq.a($$4.e());
         bqa $$6 = $$4.f();
         if ($$6 instanceof cka $$7) {
            $$5.a(epx.b, $$7);
         }

         $$5.a(epx.c, $$1.dN().o());
         $$5.b(epx.e, $$6);
         $$5.b(epx.d, $$6);
         $$5.a(epx.a, $$1);
         $$5.a(epx.f, $$4.d());
         enq $$8 = $$5.a(epw.g);
         ens $$9 = $$4.l().aM().getLootTable($$3);
         List<crs> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<dv> $$0, ajv $$1, aml.b $$2) throws CommandSyntaxException {
      dv $$3 = (dv)$$0.getSource();
      enq $$4 = new enq.a($$3.e()).b(epx.a, $$3.f()).a(epx.f, $$3.d()).a(epw.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<dv> $$0, ajv $$1, id $$2, crs $$3, aml.b $$4) throws CommandSyntaxException {
      dv $$5 = (dv)$$0.getSource();
      enq $$6 = new enq.a($$5.e()).a(epx.f, esj.b($$2)).a(epx.i, $$3).b(epx.a, $$5.f()).a(epw.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<dv> $$0, ajv $$1, enq $$2, aml.b $$3) throws CommandSyntaxException {
      dv $$4 = (dv)$$0.getSource();
      ens $$5 = $$4.l().aM().getLootTable($$1);
      List<crs> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<crs> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<dv> var1, List<crs> var2, aml.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<dv, ?> construct(ArgumentBuilder<dv, ?> var1, aml.b var2);
   }
}
