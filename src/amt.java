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

public class amt {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wy.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ei> a = ($$0, $$1) -> en.a(((ei)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ej.a("add")
                              .then(
                                 ej.a("id", fj.a())
                                    .then(ej.a("name", er.a($$1)).executes($$0x -> a((ei)$$0x.getSource(), fj.a($$0x, "id"), er.b($$0x, "name"))))
                              )
                        ))
                     .then(ej.a("remove").then(ej.a("id", fj.a()).suggests(a).executes($$0x -> e((ei)$$0x.getSource(), a($$0x))))))
                  .then(ej.a("list").executes($$0x -> a((ei)$$0x.getSource()))))
               .then(
                  ej.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a(
                                                "id", fj.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ej.a("name")
                                                   .then(ej.a("name", er.a($$1)).executes($$0x -> a((ei)$$0x.getSource(), a($$0x), er.b($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                                                     "color"
                                                                  )
                                                                  .then(ej.a("pink").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.a))))
                                                               .then(ej.a("blue").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.b))))
                                                            .then(ej.a("red").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.c))))
                                                         .then(ej.a("green").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.d))))
                                                      .then(ej.a("yellow").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.e))))
                                                   .then(ej.a("purple").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.f))))
                                                .then(ej.a("white").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("style")
                                                         .then(ej.a("progress").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.b.a))))
                                                      .then(ej.a("notched_6").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.b.b))))
                                                   .then(ej.a("notched_10").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.b.c))))
                                                .then(ej.a("notched_12").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.b.d))))
                                             .then(ej.a("notched_20").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), btr.b.e)))
                                       ))
                                    .then(
                                       ej.a("value")
                                          .then(
                                             ej.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ei)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ej.a("max")
                                       .then(
                                          ej.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ei)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ej.a("visible")
                                    .then(
                                       ej.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ei)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ej.a("players").executes($$0x -> a((ei)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ej.a("targets", ev.d()).executes($$0x -> a((ei)$$0x.getSource(), a($$0x), ev.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ej.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("id", fj.a())
                                 .suggests(a)
                                 .then(ej.a("value").executes($$0x -> a((ei)$$0x.getSource(), a($$0x)))))
                              .then(ej.a("max").executes($$0x -> b((ei)$$0x.getSource(), a($$0x)))))
                           .then(ej.a("visible").executes($$0x -> c((ei)$$0x.getSource(), a($$0x)))))
                        .then(ej.a("players").executes($$0x -> d((ei)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ei $$0, ami $$1) {
      $$0.a(() -> wy.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ei $$0, ami $$1) {
      $$0.a(() -> wy.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ei $$0, ami $$1) {
      if ($$1.f()) {
         $$0.a(() -> wy.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wy.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ei $$0, ami $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wy.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wy.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xb.b($$1.g(), cqy::m_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ei $$0, ami $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wy.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wy.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ei $$0, ami $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ei $$0, ami $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ei $$0, ami $$1, btr.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ami $$1, btr.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ami $$1, wy $$2) throws CommandSyntaxException {
      wy $$3 = xb.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wy.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ami $$1, Collection<arr> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wy.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wy.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xb.b($$2, cqy::m_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ei $$0) {
      Collection<ami> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.bossbar.list.bars.some", $$1.size(), xb.b($$1, ami::e)), false);
      }

      return $$1.size();
   }

   private static int a(ei $$0, alg $$1, wy $$2) throws CommandSyntaxException {
      amj $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         ami $$4 = $$3.a($$1, xb.a($$0, $$2, null, 0));
         $$0.a(() -> wy.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ei $$0, ami $$1) {
      amj $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wy.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static ami a(CommandContext<ei> $$0) throws CommandSyntaxException {
      alg $$1 = fj.a($$0, "id");
      ami $$2 = ((ei)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
