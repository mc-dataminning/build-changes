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

public class amp {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xd.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<et> a = ($$0, $$1) -> ey.a(((et)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           eu.a("add")
                              .then(
                                 eu.a("id", fu.a())
                                    .then(eu.a("name", fc.a($$1)).executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "id"), fc.a($$0x, "name"))))
                              )
                        ))
                     .then(eu.a("remove").then(eu.a("id", fu.a()).suggests(a).executes($$0x -> e((et)$$0x.getSource(), a($$0x))))))
                  .then(eu.a("list").executes($$0x -> a((et)$$0x.getSource()))))
               .then(
                  eu.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                                "id", fu.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                eu.a("name")
                                                   .then(eu.a("name", fc.a($$1)).executes($$0x -> a((et)$$0x.getSource(), a($$0x), fc.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                                                     "color"
                                                                  )
                                                                  .then(eu.a("pink").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.a))))
                                                               .then(eu.a("blue").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.b))))
                                                            .then(eu.a("red").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.c))))
                                                         .then(eu.a("green").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.d))))
                                                      .then(eu.a("yellow").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.e))))
                                                   .then(eu.a("purple").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.f))))
                                                .then(eu.a("white").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("style")
                                                         .then(eu.a("progress").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.b.a))))
                                                      .then(eu.a("notched_6").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.b.b))))
                                                   .then(eu.a("notched_10").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.b.c))))
                                                .then(eu.a("notched_12").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.b.d))))
                                             .then(eu.a("notched_20").executes($$0x -> a((et)$$0x.getSource(), a($$0x), brf.b.e)))
                                       ))
                                    .then(
                                       eu.a("value")
                                          .then(
                                             eu.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((et)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    eu.a("max")
                                       .then(
                                          eu.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((et)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 eu.a("visible")
                                    .then(
                                       eu.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((et)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eu.a("players").executes($$0x -> a((et)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(eu.a("targets", fg.d()).executes($$0x -> a((et)$$0x.getSource(), a($$0x), fg.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               eu.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("id", fu.a())
                                 .suggests(a)
                                 .then(eu.a("value").executes($$0x -> a((et)$$0x.getSource(), a($$0x)))))
                              .then(eu.a("max").executes($$0x -> b((et)$$0x.getSource(), a($$0x)))))
                           .then(eu.a("visible").executes($$0x -> c((et)$$0x.getSource(), a($$0x)))))
                        .then(eu.a("players").executes($$0x -> d((et)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(et $$0, ame $$1) {
      $$0.a(() -> xd.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(et $$0, ame $$1) {
      $$0.a(() -> xd.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(et $$0, ame $$1) {
      if ($$1.f()) {
         $$0.a(() -> xd.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xd.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(et $$0, ame $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xd.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xd.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xg.b($$1.g(), cnu::Q_)), true);
      }

      return $$1.g().size();
   }

   private static int a(et $$0, ame $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xd.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xd.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(et $$0, ame $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(et $$0, ame $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xd.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(et $$0, ame $$1, brf.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, ame $$1, brf.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, ame $$1, xd $$2) throws CommandSyntaxException {
      xd $$3 = xg.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xd.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, ame $$1, Collection<ari> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xd.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xd.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xg.b($$2, cnu::Q_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(et $$0) {
      Collection<ame> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xd.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xd.a("commands.bossbar.list.bars.some", $$1.size(), xg.b($$1, ame::e)), false);
      }

      return $$1.size();
   }

   private static int a(et $$0, alc $$1, xd $$2) throws CommandSyntaxException {
      amf $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         ame $$4 = $$3.a($$1, xg.a($$0, $$2, null, 0));
         $$0.a(() -> xd.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(et $$0, ame $$1) {
      amf $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xd.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static ame a(CommandContext<et> $$0) throws CommandSyntaxException {
      alc $$1 = fu.c($$0, "id");
      ame $$2 = ((et)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
