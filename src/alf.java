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

public class alf {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wi.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<dv> a = ($$0, $$1) -> ea.a(((dv)$$0.getSource()).l().aO().a(), $$1);

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           dw.a("add")
                              .then(
                                 dw.a("id", ew.a())
                                    .then(dw.a("name", ee.a($$1)).executes($$0x -> a((dv)$$0x.getSource(), ew.e($$0x, "id"), ee.a($$0x, "name"))))
                              )
                        ))
                     .then(dw.a("remove").then(dw.a("id", ew.a()).suggests(a).executes($$0x -> e((dv)$$0x.getSource(), a($$0x))))))
                  .then(dw.a("list").executes($$0x -> a((dv)$$0x.getSource()))))
               .then(
                  dw.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a(
                                                "id", ew.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                dw.a("name")
                                                   .then(dw.a("name", ee.a($$1)).executes($$0x -> a((dv)$$0x.getSource(), a($$0x), ee.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                                                                     "color"
                                                                  )
                                                                  .then(dw.a("pink").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.a))))
                                                               .then(dw.a("blue").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.b))))
                                                            .then(dw.a("red").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.c))))
                                                         .then(dw.a("green").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.d))))
                                                      .then(dw.a("yellow").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.e))))
                                                   .then(dw.a("purple").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.f))))
                                                .then(dw.a("white").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("style")
                                                         .then(dw.a("progress").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.b.a))))
                                                      .then(dw.a("notched_6").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.b.b))))
                                                   .then(dw.a("notched_10").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.b.c))))
                                                .then(dw.a("notched_12").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.b.d))))
                                             .then(dw.a("notched_20").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), bnv.b.e)))
                                       ))
                                    .then(
                                       dw.a("value")
                                          .then(
                                             dw.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((dv)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    dw.a("max")
                                       .then(
                                          dw.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((dv)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 dw.a("visible")
                                    .then(
                                       dw.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((dv)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dw.a("players").executes($$0x -> a((dv)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(dw.a("targets", ei.d()).executes($$0x -> a((dv)$$0x.getSource(), a($$0x), ei.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               dw.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("id", ew.a())
                                 .suggests(a)
                                 .then(dw.a("value").executes($$0x -> a((dv)$$0x.getSource(), a($$0x)))))
                              .then(dw.a("max").executes($$0x -> b((dv)$$0x.getSource(), a($$0x)))))
                           .then(dw.a("visible").executes($$0x -> c((dv)$$0x.getSource(), a($$0x)))))
                        .then(dw.a("players").executes($$0x -> d((dv)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(dv $$0, aku $$1) {
      $$0.a(() -> wi.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(dv $$0, aku $$1) {
      $$0.a(() -> wi.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(dv $$0, aku $$1) {
      if ($$1.f()) {
         $$0.a(() -> wi.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wi.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(dv $$0, aku $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wi.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wi.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), wl.b($$1.g(), cka::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(dv $$0, aku $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wi.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wi.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(dv $$0, aku $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(dv $$0, aku $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wi.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(dv $$0, aku $$1, bnv.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dv $$0, aku $$1, bnv.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dv $$0, aku $$1, wi $$2) throws CommandSyntaxException {
      wi $$3 = wl.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wi.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dv $$0, aku $$1, Collection<apv> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wi.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wi.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), wl.b($$2, cka::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(dv $$0) {
      Collection<aku> $$1 = $$0.l().aO().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wi.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wi.a("commands.bossbar.list.bars.some", $$1.size(), wl.b($$1, aku::e)), false);
      }

      return $$1.size();
   }

   private static int a(dv $$0, ajv $$1, wi $$2) throws CommandSyntaxException {
      akv $$3 = $$0.l().aO();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         aku $$4 = $$3.a($$1, wl.a($$0, $$2, null, 0));
         $$0.a(() -> wi.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(dv $$0, aku $$1) {
      akv $$2 = $$0.l().aO();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wi.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static aku a(CommandContext<dv> $$0) throws CommandSyntaxException {
      ajv $$1 = ew.e($$0, "id");
      aku $$2 = ((dv)$$0.getSource()).l().aO().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
