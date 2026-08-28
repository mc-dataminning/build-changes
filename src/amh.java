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

public class amh {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wp.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> fc.a(((ex)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ey.a("add")
                              .then(
                                 ey.a("id", fy.a())
                                    .then(ey.a("name", fg.a($$1)).executes($$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "id"), fg.a($$0x, "name"))))
                              )
                        ))
                     .then(ey.a("remove").then(ey.a("id", fy.a()).suggests(a).executes($$0x -> e((ex)$$0x.getSource(), a($$0x))))))
                  .then(ey.a("list").executes($$0x -> a((ex)$$0x.getSource()))))
               .then(
                  ey.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                                "id", fy.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ey.a("name")
                                                   .then(ey.a("name", fg.a($$1)).executes($$0x -> a((ex)$$0x.getSource(), a($$0x), fg.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                                                     "color"
                                                                  )
                                                                  .then(ey.a("pink").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.a))))
                                                               .then(ey.a("blue").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.b))))
                                                            .then(ey.a("red").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.c))))
                                                         .then(ey.a("green").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.d))))
                                                      .then(ey.a("yellow").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.e))))
                                                   .then(ey.a("purple").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.f))))
                                                .then(ey.a("white").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("style")
                                                         .then(ey.a("progress").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.b.a))))
                                                      .then(ey.a("notched_6").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.b.b))))
                                                   .then(ey.a("notched_10").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.b.c))))
                                                .then(ey.a("notched_12").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.b.d))))
                                             .then(ey.a("notched_20").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), bso.b.e)))
                                       ))
                                    .then(
                                       ey.a("value")
                                          .then(
                                             ey.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ex)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ey.a("max")
                                       .then(
                                          ey.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ex)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ey.a("visible")
                                    .then(
                                       ey.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ex)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ey.a("players").executes($$0x -> a((ex)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ey.a("targets", fk.d()).executes($$0x -> a((ex)$$0x.getSource(), a($$0x), fk.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ey.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("id", fy.a())
                                 .suggests(a)
                                 .then(ey.a("value").executes($$0x -> a((ex)$$0x.getSource(), a($$0x)))))
                              .then(ey.a("max").executes($$0x -> b((ex)$$0x.getSource(), a($$0x)))))
                           .then(ey.a("visible").executes($$0x -> c((ex)$$0x.getSource(), a($$0x)))))
                        .then(ey.a("players").executes($$0x -> d((ex)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ex $$0, alw $$1) {
      $$0.a(() -> wp.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ex $$0, alw $$1) {
      $$0.a(() -> wp.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ex $$0, alw $$1) {
      if ($$1.f()) {
         $$0.a(() -> wp.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wp.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ex $$0, alw $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wp.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wp.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), ws.b($$1.g(), cpr::m_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ex $$0, alw $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wp.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wp.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ex $$0, alw $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wp.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ex $$0, alw $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wp.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ex $$0, alw $$1, bso.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wp.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ex $$0, alw $$1, bso.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wp.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ex $$0, alw $$1, wp $$2) throws CommandSyntaxException {
      wp $$3 = ws.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wp.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ex $$0, alw $$1, Collection<are> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wp.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wp.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), ws.b($$2, cpr::m_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ex $$0) {
      Collection<alw> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wp.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wp.a("commands.bossbar.list.bars.some", $$1.size(), ws.b($$1, alw::e)), false);
      }

      return $$1.size();
   }

   private static int a(ex $$0, aku $$1, wp $$2) throws CommandSyntaxException {
      alx $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alw $$4 = $$3.a($$1, ws.a($$0, $$2, null, 0));
         $$0.a(() -> wp.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ex $$0, alw $$1) {
      alx $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wp.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alw a(CommandContext<ex> $$0) throws CommandSyntaxException {
      aku $$1 = fy.a($$0, "id");
      alw $$2 = ((ex)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
