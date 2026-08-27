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

public class ahf {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ui.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ui.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(ui.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<du> a = ($$0, $$1) -> dy.a(((du)$$0.getSource()).m().aJ().a(), $$1);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           dv.a("add")
                              .then(
                                 dv.a("id", eu.a()).then(dv.a("name", ec.a()).executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "id"), ec.a($$0x, "name"))))
                              )
                        ))
                     .then(dv.a("remove").then(dv.a("id", eu.a()).suggests(a).executes($$0x -> e((du)$$0x.getSource(), a($$0x))))))
                  .then(dv.a("list").executes($$0x -> a((du)$$0x.getSource()))))
               .then(
                  dv.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                "id", eu.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                dv.a("name").then(dv.a("name", ec.a()).executes($$0x -> a((du)$$0x.getSource(), a($$0x), ec.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                                     "color"
                                                                  )
                                                                  .then(dv.a("pink").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.a))))
                                                               .then(dv.a("blue").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.b))))
                                                            .then(dv.a("red").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.c))))
                                                         .then(dv.a("green").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.d))))
                                                      .then(dv.a("yellow").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.e))))
                                                   .then(dv.a("purple").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.f))))
                                                .then(dv.a("white").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("style")
                                                         .then(dv.a("progress").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.b.a))))
                                                      .then(dv.a("notched_6").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.b.b))))
                                                   .then(dv.a("notched_10").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.b.c))))
                                                .then(dv.a("notched_12").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.b.d))))
                                             .then(dv.a("notched_20").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bhr.b.e)))
                                       ))
                                    .then(
                                       dv.a("value")
                                          .then(
                                             dv.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((du)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    dv.a("max")
                                       .then(
                                          dv.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((du)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 dv.a("visible")
                                    .then(
                                       dv.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((du)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("players").executes($$0x -> a((du)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(dv.a("targets", eg.d()).executes($$0x -> a((du)$$0x.getSource(), a($$0x), eg.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               dv.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("id", eu.a())
                                 .suggests(a)
                                 .then(dv.a("value").executes($$0x -> a((du)$$0x.getSource(), a($$0x)))))
                              .then(dv.a("max").executes($$0x -> b((du)$$0x.getSource(), a($$0x)))))
                           .then(dv.a("visible").executes($$0x -> c((du)$$0x.getSource(), a($$0x)))))
                        .then(dv.a("players").executes($$0x -> d((du)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(du $$0, agu $$1) {
      $$0.a(() -> ui.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(du $$0, agu $$1) {
      $$0.a(() -> ui.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(du $$0, agu $$1) {
      if ($$1.g()) {
         $$0.a(() -> ui.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> ui.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(du $$0, agu $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> ui.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> ui.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), ul.b($$1.h(), ccx::O_)), true);
      }

      return $$1.h().size();
   }

   private static int a(du $$0, agu $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> ui.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> ui.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(du $$0, agu $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(du $$0, agu $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> ui.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(du $$0, agu $$1, bhr.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, agu $$1, bhr.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, agu $$1, ui $$2) throws CommandSyntaxException {
      ui $$3 = ul.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> ui.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, agu $$1, Collection<alr> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> ui.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> ui.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), ul.b($$2, ccx::O_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(du $$0) {
      Collection<agu> $$1 = $$0.m().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> ui.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> ui.a("commands.bossbar.list.bars.some", $$1.size(), ul.b($$1, agu::e)), false);
      }

      return $$1.size();
   }

   private static int a(du $$0, afw $$1, ui $$2) throws CommandSyntaxException {
      agv $$3 = $$0.m().aJ();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         agu $$4 = $$3.a($$1, ul.a($$0, $$2, null, 0));
         $$0.a(() -> ui.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(du $$0, agu $$1) {
      agv $$2 = $$0.m().aJ();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> ui.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static agu a(CommandContext<du> $$0) throws CommandSyntaxException {
      afw $$1 = eu.e($$0, "id");
      agu $$2 = ((du)$$0.getSource()).m().aJ().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
