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

public class ajc {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      eff $$2 = ((du)$$0.getSource()).l().aJ();
      return dy.a($$2.a(efh.c), $$1);
   };
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("commands.drop.no_loot_table", $$0));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder)dv.a("loot").requires($$0x -> $$0x.c(2)),
            ($$1x, $$2) -> $$1x.then(
                     dv.a("fish")
                        .then(
                           dv.a("loot_table", eu.a())
                              .suggests(a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), clo.b, $$2)))
                                          .then(
                                             dv.a("tool", fy.a($$1))
                                                .executes(
                                                   $$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2)
                                                )
                                          ))
                                       .then(
                                          dv.a("mainhand")
                                             .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bla.a), $$2))
                                       ))
                                    .then(
                                       dv.a("offhand")
                                          .executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bla.b), $$2))
                                    )
                              )
                        )
                  )
                  .then(dv.a("loot").then(dv.a("loot_table", eu.a()).suggests(a).executes($$1xx -> a($$1xx, eu.e($$1xx, "loot_table"), $$2))))
                  .then(dv.a("kill").then(dv.a("target", eg.a()).executes($$1xx -> a($$1xx, eg.a($$1xx, "target"), $$2))))
                  .then(
                     dv.a("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                       .executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), clo.b, $$2)))
                                    .then(dv.a("tool", fy.a($$1)).executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), fy.a($$1xx, "tool").a(1, false), $$2))))
                                 .then(dv.a("mainhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bla.a), $$2))))
                              .then(dv.a("offhand").executes($$1xx -> a($$1xx, fm.a($$1xx, "pos"), a((du)$$1xx.getSource(), bla.b), $$2)))
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<du, T>> T a(T $$0, ajc.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)dv.a("replace")
                  .then(
                     dv.a("entity")
                        .then(
                           dv.a("entities", eg.b())
                              .then(
                                 $$1.construct(dv.a("slot", fa.a()), ($$0x, $$1x, $$2) -> a(eg.b($$0x, "entities"), fa.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          dv.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                                eg.b($$0x, "entities"), fa.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("block")
                     .then(
                        dv.a("targetPos", fm.a())
                           .then(
                              $$1.construct(
                                    dv.a("slot", fa.a()),
                                    ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fm.a($$0x, "targetPos"), fa.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       dv.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                             (du)$$0x.getSource(),
                                             fm.a($$0x, "targetPos"),
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
         .then(dv.a("insert").then($$1.construct(dv.a("targetPos", fm.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), fm.a($$0x, "targetPos"), $$1x, $$2))))
         .then(dv.a("give").then($$1.construct(dv.a("players", eg.d()), ($$0x, $$1x, $$2) -> a(eg.f($$0x, "players"), $$1x, $$2))))
         .then(dv.a("spawn").then($$1.construct(dv.a("targetPos", ft.a()), ($$0x, $$1x, $$2) -> a((du)$$0x.getSource(), ft.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static biu a(du $$0, hx $$1) throws CommandSyntaxException {
      dfi $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof biu)) {
         throw aiw.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (biu)$$2;
      }
   }

   private static int a(du $$0, hx $$1, List<clo> $$2, ajc.a $$3) throws CommandSyntaxException {
      biu $$4 = a($$0, $$1);
      List<clo> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (clo $$6 : $$2) {
         if (a($$4, $$6.p())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(biu $$0, clo $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); $$3++) {
         clo $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.b()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.g() - $$4.L();
               int $$6 = Math.min($$1.L(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(du $$0, hx $$1, int $$2, int $$3, List<clo> $$4, ajc.a $$5) throws CommandSyntaxException {
      biu $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<clo> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            clo $$11 = $$9 < $$4.size() ? $$4.get($$9) : clo.b;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aiw.b.create($$2);
      }
   }

   private static boolean a(clo $$0, clo $$1) {
      return $$0.L() <= $$0.g() && clo.c($$0, $$1);
   }

   private static int a(Collection<amj> $$0, List<clo> $$1, ajc.a $$2) throws CommandSyntaxException {
      List<clo> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (clo $$4 : $$1) {
         for (amj $$5 : $$0) {
            if ($$5.fT().e($$4.p())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bkv $$0, List<clo> $$1, int $$2, int $$3, List<clo> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         clo $$6 = $$5 < $$1.size() ? $$1.get($$5) : clo.b;
         bmd $$7 = $$0.a_($$2 + $$5);
         if ($$7 != bmd.b && $$7.a($$6.p())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bkv> $$0, int $$1, int $$2, List<clo> $$3, ajc.a $$4) throws CommandSyntaxException {
      List<clo> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bkv $$6 : $$0) {
         if ($$6 instanceof amj $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.bS.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(du $$0, ejz $$1, List<clo> $$2, ajc.a $$3) throws CommandSyntaxException {
      ami $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cas $$3x = new cas($$4, $$1.c, $$1.d, $$1.e, $$2x.p());
         $$3x.u();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(du $$0, List<clo> $$1) {
      if ($$1.size() == 1) {
         clo $$2 = $$1.get(0);
         $$0.a(() -> uv.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
      } else {
         $$0.a(() -> uv.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(du $$0, List<clo> $$1, agm $$2) {
      if ($$1.size() == 1) {
         clo $$3 = $$1.get(0);
         $$0.a(() -> uv.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), uv.a($$2)), false);
      } else {
         $$0.a(() -> uv.a("commands.drop.success.multiple_with_table", $$1.size(), uv.a($$2)), false);
      }
   }

   private static clo a(du $$0, bla $$1) throws CommandSyntaxException {
      bkv $$2 = $$0.g();
      if ($$2 instanceof bll) {
         return ((bll)$$2).c($$1);
      } else {
         throw b.create($$2.Q_());
      }
   }

   private static int a(CommandContext<du> $$0, hx $$1, clo $$2, ajc.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      ami $$5 = $$4.e();
      dhn $$6 = $$5.a_($$1);
      dfi $$7 = $$5.c_($$1);
      efi.a $$8 = new efi.a($$5).a(ehn.f, ejz.b($$1)).a(ehn.g, $$6).b(ehn.h, $$7).b(ehn.a, $$4.f()).a(ehn.i, $$2);
      List<clo> $$9 = $$6.a($$8);
      return $$3.accept($$0, $$9, $$2x -> a($$4, $$2x, $$6.b().v()));
   }

   private static int a(CommandContext<du> $$0, bkv $$1, ajc.b $$2) throws CommandSyntaxException {
      if (!($$1 instanceof bll)) {
         throw c.create($$1.Q_());
      } else {
         agm $$3 = ((bll)$$1).eB();
         du $$4 = (du)$$0.getSource();
         efi.a $$5 = new efi.a($$4.e());
         bkv $$6 = $$4.f();
         if ($$6 instanceof cdz $$7) {
            $$5.a(ehn.b, $$7);
         }

         $$5.a(ehn.c, $$1.dO().o());
         $$5.b(ehn.e, $$6);
         $$5.b(ehn.d, $$6);
         $$5.a(ehn.a, $$1);
         $$5.a(ehn.f, $$4.d());
         efi $$8 = $$5.a(ehm.g);
         efk $$9 = $$4.l().aJ().getLootTable($$3);
         List<clo> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3));
      }
   }

   private static int a(CommandContext<du> $$0, agm $$1, ajc.b $$2) throws CommandSyntaxException {
      du $$3 = (du)$$0.getSource();
      efi $$4 = new efi.a($$3.e()).b(ehn.a, $$3.f()).a(ehn.f, $$3.d()).a(ehm.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<du> $$0, agm $$1, hx $$2, clo $$3, ajc.b $$4) throws CommandSyntaxException {
      du $$5 = (du)$$0.getSource();
      efi $$6 = new efi.a($$5.e()).a(ehn.f, ejz.b($$2)).a(ehn.i, $$3).b(ehn.a, $$5.f()).a(ehm.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<du> $$0, agm $$1, efi $$2, ajc.b $$3) throws CommandSyntaxException {
      du $$4 = (du)$$0.getSource();
      efk $$5 = $$4.l().aJ().getLootTable($$1);
      List<clo> $$6 = $$5.a($$2);
      return $$3.accept($$0, $$6, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<clo> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<du> var1, List<clo> var2, ajc.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<du, ?> construct(ArgumentBuilder<du, ?> var1, ajc.b var2);
   }
}
