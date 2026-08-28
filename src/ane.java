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

public class ane {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xg.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ek> a = ($$0, $$1) -> ep.a(((ek)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           el.a("add")
                              .then(
                                 el.a("id", fl.a())
                                    .then(el.a("name", et.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), fl.a($$0x, "id"), et.b($$0x, "name"))))
                              )
                        ))
                     .then(el.a("remove").then(el.a("id", fl.a()).suggests(a).executes($$0x -> e((ek)$$0x.getSource(), a($$0x))))))
                  .then(el.a("list").executes($$0x -> a((ek)$$0x.getSource()))))
               .then(
                  el.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                "id", fl.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                el.a("name")
                                                   .then(el.a("name", et.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), a($$0x), et.b($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                                                     "color"
                                                                  )
                                                                  .then(el.a("pink").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.a))))
                                                               .then(el.a("blue").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.b))))
                                                            .then(el.a("red").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.c))))
                                                         .then(el.a("green").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.d))))
                                                      .then(el.a("yellow").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.e))))
                                                   .then(el.a("purple").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.f))))
                                                .then(el.a("white").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("style")
                                                         .then(el.a("progress").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.b.a))))
                                                      .then(el.a("notched_6").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.b.b))))
                                                   .then(el.a("notched_10").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.b.c))))
                                                .then(el.a("notched_12").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.b.d))))
                                             .then(el.a("notched_20").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bus.b.e)))
                                       ))
                                    .then(
                                       el.a("value")
                                          .then(
                                             el.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ek)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    el.a("max")
                                       .then(
                                          el.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ek)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 el.a("visible")
                                    .then(
                                       el.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ek)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.a("players").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(el.a("targets", ex.d()).executes($$0x -> a((ek)$$0x.getSource(), a($$0x), ex.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               el.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("id", fl.a())
                                 .suggests(a)
                                 .then(el.a("value").executes($$0x -> a((ek)$$0x.getSource(), a($$0x)))))
                              .then(el.a("max").executes($$0x -> b((ek)$$0x.getSource(), a($$0x)))))
                           .then(el.a("visible").executes($$0x -> c((ek)$$0x.getSource(), a($$0x)))))
                        .then(el.a("players").executes($$0x -> d((ek)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ek $$0, amt $$1) {
      $$0.a(() -> xg.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ek $$0, amt $$1) {
      $$0.a(() -> xg.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ek $$0, amt $$1) {
      if ($$1.g()) {
         $$0.a(() -> xg.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xg.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ek $$0, amt $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> xg.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xg.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), xj.b($$1.h(), csi::P_)), true);
      }

      return $$1.h().size();
   }

   private static int a(ek $$0, amt $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xg.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xg.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ek $$0, amt $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xg.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ek $$0, amt $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xg.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ek $$0, amt $$1, bus.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xg.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, amt $$1, bus.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xg.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, amt $$1, xg $$2) throws CommandSyntaxException {
      xg $$3 = xj.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xg.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, amt $$1, Collection<asc> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> xg.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xg.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xj.b($$2, csi::P_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(ek $$0) {
      Collection<amt> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xg.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xg.a("commands.bossbar.list.bars.some", $$1.size(), xj.b($$1, amt::e)), false);
      }

      return $$1.size();
   }

   private static int a(ek $$0, alr $$1, xg $$2) throws CommandSyntaxException {
      amu $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amt $$4 = $$3.a($$1, xj.a($$0, $$2, null, 0));
         $$0.a(() -> xg.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ek $$0, amt $$1) {
      amu $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xg.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amt a(CommandContext<ek> $$0) throws CommandSyntaxException {
      alr $$1 = fl.a($$0, "id");
      amt $$2 = ((ek)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
