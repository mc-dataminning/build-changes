import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class als {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ed> a = ($$0, $$1) -> ei.a(((ed)$$0.getSource()).l().aN().a(), $$1);

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ee.a("add")
                              .then(
                                 ee.a("id", fe.a())
                                    .then(ee.a("name", em.a($$1)).executes($$0x -> a((ed)$$0x.getSource(), fe.c($$0x, "id"), em.a($$0x, "name"))))
                              )
                        ))
                     .then(ee.a("remove").then(ee.a("id", fe.a()).suggests(a).executes($$0x -> e((ed)$$0x.getSource(), a($$0x))))))
                  .then(ee.a("list").executes($$0x -> a((ed)$$0x.getSource()))))
               .then(
                  ee.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a(
                                                "id", fe.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ee.a("name")
                                                   .then(ee.a("name", em.a($$1)).executes($$0x -> a((ed)$$0x.getSource(), a($$0x), em.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                                                                     "color"
                                                                  )
                                                                  .then(ee.a("pink").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.a))))
                                                               .then(ee.a("blue").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.b))))
                                                            .then(ee.a("red").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.c))))
                                                         .then(ee.a("green").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.d))))
                                                      .then(ee.a("yellow").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.e))))
                                                   .then(ee.a("purple").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.f))))
                                                .then(ee.a("white").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("style")
                                                         .then(ee.a("progress").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.b.a))))
                                                      .then(ee.a("notched_6").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.b.b))))
                                                   .then(ee.a("notched_10").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.b.c))))
                                                .then(ee.a("notched_12").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.b.d))))
                                             .then(ee.a("notched_20").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), bpc.b.e)))
                                       ))
                                    .then(
                                       ee.a("value")
                                          .then(
                                             ee.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ed)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ee.a("max")
                                       .then(
                                          ee.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ed)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ee.a("visible")
                                    .then(
                                       ee.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ed)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ee.a("players").executes($$0x -> a((ed)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ee.a("targets", eq.d()).executes($$0x -> a((ed)$$0x.getSource(), a($$0x), eq.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ee.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("id", fe.a())
                                 .suggests(a)
                                 .then(ee.a("value").executes($$0x -> a((ed)$$0x.getSource(), a($$0x)))))
                              .then(ee.a("max").executes($$0x -> b((ed)$$0x.getSource(), a($$0x)))))
                           .then(ee.a("visible").executes($$0x -> c((ed)$$0x.getSource(), a($$0x)))))
                        .then(ee.a("players").executes($$0x -> d((ed)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ed $$0, alh $$1) {
      $$0.a(() -> wu.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ed $$0, alh $$1) {
      $$0.a(() -> wu.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ed $$0, alh $$1) {
      if ($$1.f()) {
         $$0.a(() -> wu.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wu.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ed $$0, alh $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wu.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wu.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), wx.b($$1.g(), clh::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ed $$0, alh $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wu.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wu.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ed $$0, alh $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ed $$0, alh $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ed $$0, alh $$1, bpc.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ed $$0, alh $$1, bpc.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ed $$0, alh $$1, wu $$2) throws CommandSyntaxException {
      wu $$3 = wx.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wu.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ed $$0, alh $$1, Collection<aqi> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wu.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wu.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), wx.b($$2, clh::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ed $$0) {
      Collection<alh> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wu.a("commands.bossbar.list.bars.some", $$1.size(), wx.b($$1, alh::e)), false);
      }

      return $$1.size();
   }

   private static int a(ed $$0, akh $$1, wu $$2) throws CommandSyntaxException {
      ali $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alh $$4 = $$3.a($$1, wx.a($$0, $$2, null, 0));
         $$0.a(() -> wu.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ed $$0, alh $$1) {
      ali $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wu.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alh a(CommandContext<ed> $$0) throws CommandSyntaxException {
      akh $$1 = fe.c($$0, "id");
      alh $$2 = ((ed)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
