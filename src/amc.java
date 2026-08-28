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

public class amc {
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
   public static final SuggestionProvider<et> a = ($$0, $$1) -> ey.a(((et)$$0.getSource()).l().aN().a(), $$1);

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
                                                                  .then(eu.a("pink").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.a))))
                                                               .then(eu.a("blue").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.b))))
                                                            .then(eu.a("red").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.c))))
                                                         .then(eu.a("green").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.d))))
                                                      .then(eu.a("yellow").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.e))))
                                                   .then(eu.a("purple").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.f))))
                                                .then(eu.a("white").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("style")
                                                         .then(eu.a("progress").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.b.a))))
                                                      .then(eu.a("notched_6").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.b.b))))
                                                   .then(eu.a("notched_10").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.b.c))))
                                                .then(eu.a("notched_12").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.b.d))))
                                             .then(eu.a("notched_20").executes($$0x -> a((et)$$0x.getSource(), a($$0x), bqg.b.e)))
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

   private static int a(et $$0, alr $$1) {
      $$0.a(() -> wy.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(et $$0, alr $$1) {
      $$0.a(() -> wy.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(et $$0, alr $$1) {
      if ($$1.f()) {
         $$0.a(() -> wy.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wy.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(et $$0, alr $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wy.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wy.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xb.b($$1.g(), cmv::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(et $$0, alr $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int a(et $$0, alr $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(et $$0, alr $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(et $$0, alr $$1, bqg.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, alr $$1, bqg.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, alr $$1, wy $$2) throws CommandSyntaxException {
      wy $$3 = xb.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wy.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(et $$0, alr $$1, Collection<aqu> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wy.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wy.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xb.b($$2, cmv::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(et $$0) {
      Collection<alr> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.bossbar.list.bars.some", $$1.size(), xb.b($$1, alr::e)), false);
      }

      return $$1.size();
   }

   private static int a(et $$0, akq $$1, wy $$2) throws CommandSyntaxException {
      als $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alr $$4 = $$3.a($$1, xb.a($$0, $$2, null, 0));
         $$0.a(() -> wy.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(et $$0, alr $$1) {
      als $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wy.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alr a(CommandContext<et> $$0) throws CommandSyntaxException {
      akq $$1 = fu.c($$0, "id");
      alr $$2 = ((et)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
