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

public class ady {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(sw.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> du.a(((ds)$$0.getSource()).l().aJ().a(), $$1);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           dt.a("add")
                              .then(
                                 dt.a("id", eq.a()).then(dt.a("name", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), eq.e($$0x, "id"), dy.a($$0x, "name"))))
                              )
                        ))
                     .then(dt.a("remove").then(dt.a("id", eq.a()).suggests(a).executes($$0x -> e((ds)$$0x.getSource(), a($$0x))))))
                  .then(dt.a("list").executes($$0x -> a((ds)$$0x.getSource()))))
               .then(
                  dt.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                "id", eq.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                dt.a("name").then(dt.a("name", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), a($$0x), dy.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                                     "color"
                                                                  )
                                                                  .then(dt.a("pink").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.a))))
                                                               .then(dt.a("blue").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.b))))
                                                            .then(dt.a("red").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.c))))
                                                         .then(dt.a("green").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.d))))
                                                      .then(dt.a("yellow").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.e))))
                                                   .then(dt.a("purple").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.f))))
                                                .then(dt.a("white").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("style")
                                                         .then(dt.a("progress").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.b.a))))
                                                      .then(dt.a("notched_6").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.b.b))))
                                                   .then(dt.a("notched_10").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.b.c))))
                                                .then(dt.a("notched_12").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.b.d))))
                                             .then(dt.a("notched_20").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bdn.b.e)))
                                       ))
                                    .then(
                                       dt.a("value")
                                          .then(
                                             dt.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ds)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    dt.a("max")
                                       .then(
                                          dt.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ds)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 dt.a("visible")
                                    .then(
                                       dt.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ds)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("players").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(dt.a("targets", ec.d()).executes($$0x -> a((ds)$$0x.getSource(), a($$0x), ec.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               dt.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("id", eq.a())
                                 .suggests(a)
                                 .then(dt.a("value").executes($$0x -> a((ds)$$0x.getSource(), a($$0x)))))
                              .then(dt.a("max").executes($$0x -> b((ds)$$0x.getSource(), a($$0x)))))
                           .then(dt.a("visible").executes($$0x -> c((ds)$$0x.getSource(), a($$0x)))))
                        .then(dt.a("players").executes($$0x -> d((ds)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ds $$0, adn $$1) {
      $$0.a(() -> sw.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ds $$0, adn $$1) {
      $$0.a(() -> sw.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ds $$0, adn $$1) {
      if ($$1.g()) {
         $$0.a(() -> sw.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> sw.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ds $$0, adn $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> sw.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> sw.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), sy.b($$1.h(), byo::H_)), true);
      }

      return $$1.h().size();
   }

   private static int a(ds $$0, adn $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> sw.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> sw.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ds $$0, adn $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> sw.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ds $$0, adn $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> sw.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ds $$0, adn $$1, bdn.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> sw.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, adn $$1, bdn.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> sw.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, adn $$1, sw $$2) throws CommandSyntaxException {
      sw $$3 = sy.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> sw.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, adn $$1, Collection<aig> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> sw.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> sw.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), sy.b($$2, byo::H_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(ds $$0) {
      Collection<adn> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> sw.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> sw.a("commands.bossbar.list.bars.some", $$1.size(), sy.b($$1, adn::e)), false);
      }

      return $$1.size();
   }

   private static int a(ds $$0, acq $$1, sw $$2) throws CommandSyntaxException {
      ado $$3 = $$0.l().aJ();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         adn $$4 = $$3.a($$1, sy.a($$0, $$2, null, 0));
         $$0.a(() -> sw.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ds $$0, adn $$1) {
      ado $$2 = $$0.l().aJ();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> sw.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static adn a(CommandContext<ds> $$0) throws CommandSyntaxException {
      acq $$1 = eq.e($$0, "id");
      adn $$2 = ((ds)$$0.getSource()).l().aJ().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
