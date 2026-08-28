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

public class anc {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xk.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ew> a = ($$0, $$1) -> fb.a(((ew)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ex.a("add")
                              .then(
                                 ex.a("id", fx.a())
                                    .then(ex.a("name", ff.a($$1)).executes($$0x -> a((ew)$$0x.getSource(), fx.a($$0x, "id"), ff.a($$0x, "name"))))
                              )
                        ))
                     .then(ex.a("remove").then(ex.a("id", fx.a()).suggests(a).executes($$0x -> e((ew)$$0x.getSource(), a($$0x))))))
                  .then(ex.a("list").executes($$0x -> a((ew)$$0x.getSource()))))
               .then(
                  ex.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                                "id", fx.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ex.a("name")
                                                   .then(ex.a("name", ff.a($$1)).executes($$0x -> a((ew)$$0x.getSource(), a($$0x), ff.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                                                     "color"
                                                                  )
                                                                  .then(ex.a("pink").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.a))))
                                                               .then(ex.a("blue").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.b))))
                                                            .then(ex.a("red").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.c))))
                                                         .then(ex.a("green").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.d))))
                                                      .then(ex.a("yellow").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.e))))
                                                   .then(ex.a("purple").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.f))))
                                                .then(ex.a("white").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("style")
                                                         .then(ex.a("progress").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.b.a))))
                                                      .then(ex.a("notched_6").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.b.b))))
                                                   .then(ex.a("notched_10").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.b.c))))
                                                .then(ex.a("notched_12").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.b.d))))
                                             .then(ex.a("notched_20").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), bsq.b.e)))
                                       ))
                                    .then(
                                       ex.a("value")
                                          .then(
                                             ex.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ew)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ex.a("max")
                                       .then(
                                          ex.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ew)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ex.a("visible")
                                    .then(
                                       ex.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ew)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ex.a("players").executes($$0x -> a((ew)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ex.a("targets", fj.d()).executes($$0x -> a((ew)$$0x.getSource(), a($$0x), fj.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ex.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("id", fx.a())
                                 .suggests(a)
                                 .then(ex.a("value").executes($$0x -> a((ew)$$0x.getSource(), a($$0x)))))
                              .then(ex.a("max").executes($$0x -> b((ew)$$0x.getSource(), a($$0x)))))
                           .then(ex.a("visible").executes($$0x -> c((ew)$$0x.getSource(), a($$0x)))))
                        .then(ex.a("players").executes($$0x -> d((ew)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ew $$0, amr $$1) {
      $$0.a(() -> xk.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ew $$0, amr $$1) {
      $$0.a(() -> xk.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ew $$0, amr $$1) {
      if ($$1.f()) {
         $$0.a(() -> xk.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xk.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ew $$0, amr $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xk.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xk.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xn.b($$1.g(), cpo::p_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ew $$0, amr $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xk.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xk.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ew $$0, amr $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xk.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ew $$0, amr $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xk.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ew $$0, amr $$1, bsq.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xk.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ew $$0, amr $$1, bsq.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xk.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ew $$0, amr $$1, xk $$2) throws CommandSyntaxException {
      xk $$3 = xn.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xk.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ew $$0, amr $$1, Collection<ary> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xk.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xk.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xn.b($$2, cpo::p_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ew $$0) {
      Collection<amr> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xk.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xk.a("commands.bossbar.list.bars.some", $$1.size(), xn.b($$1, amr::e)), false);
      }

      return $$1.size();
   }

   private static int a(ew $$0, alp $$1, xk $$2) throws CommandSyntaxException {
      ams $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amr $$4 = $$3.a($$1, xn.a($$0, $$2, null, 0));
         $$0.a(() -> xk.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ew $$0, amr $$1) {
      ams $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xk.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amr a(CommandContext<ew> $$0) throws CommandSyntaxException {
      alp $$1 = fx.a($$0, "id");
      amr $$2 = ((ew)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
