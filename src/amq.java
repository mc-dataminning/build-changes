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

public class amq {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xp.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ep> a = ($$0, $$1) -> eu.a(((ep)$$0.getSource()).l().aN().a(), $$1);

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           eq.a("add")
                              .then(
                                 eq.a("id", fq.a())
                                    .then(eq.a("name", ey.a($$1)).executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "id"), ey.a($$0x, "name"))))
                              )
                        ))
                     .then(eq.a("remove").then(eq.a("id", fq.a()).suggests(a).executes($$0x -> e((ep)$$0x.getSource(), a($$0x))))))
                  .then(eq.a("list").executes($$0x -> a((ep)$$0x.getSource()))))
               .then(
                  eq.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                                "id", fq.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                eq.a("name")
                                                   .then(eq.a("name", ey.a($$1)).executes($$0x -> a((ep)$$0x.getSource(), a($$0x), ey.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                                                     "color"
                                                                  )
                                                                  .then(eq.a("pink").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.a))))
                                                               .then(eq.a("blue").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.b))))
                                                            .then(eq.a("red").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.c))))
                                                         .then(eq.a("green").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.d))))
                                                      .then(eq.a("yellow").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.e))))
                                                   .then(eq.a("purple").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.f))))
                                                .then(eq.a("white").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("style")
                                                         .then(eq.a("progress").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.b.a))))
                                                      .then(eq.a("notched_6").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.b.b))))
                                                   .then(eq.a("notched_10").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.b.c))))
                                                .then(eq.a("notched_12").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.b.d))))
                                             .then(eq.a("notched_20").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), bqm.b.e)))
                                       ))
                                    .then(
                                       eq.a("value")
                                          .then(
                                             eq.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ep)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    eq.a("max")
                                       .then(
                                          eq.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ep)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 eq.a("visible")
                                    .then(
                                       eq.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ep)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eq.a("players").executes($$0x -> a((ep)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(eq.a("targets", fc.d()).executes($$0x -> a((ep)$$0x.getSource(), a($$0x), fc.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               eq.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("id", fq.a())
                                 .suggests(a)
                                 .then(eq.a("value").executes($$0x -> a((ep)$$0x.getSource(), a($$0x)))))
                              .then(eq.a("max").executes($$0x -> b((ep)$$0x.getSource(), a($$0x)))))
                           .then(eq.a("visible").executes($$0x -> c((ep)$$0x.getSource(), a($$0x)))))
                        .then(eq.a("players").executes($$0x -> d((ep)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ep $$0, amf $$1) {
      $$0.a(() -> xp.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ep $$0, amf $$1) {
      $$0.a(() -> xp.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ep $$0, amf $$1) {
      if ($$1.f()) {
         $$0.a(() -> xp.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xp.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ep $$0, amf $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xp.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xp.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xs.b($$1.g(), cmz::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ep $$0, amf $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xp.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xp.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ep $$0, amf $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ep $$0, amf $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xp.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ep $$0, amf $$1, bqm.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ep $$0, amf $$1, bqm.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ep $$0, amf $$1, xp $$2) throws CommandSyntaxException {
      xp $$3 = xs.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xp.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ep $$0, amf $$1, Collection<arg> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xp.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xp.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xs.b($$2, cmz::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ep $$0) {
      Collection<amf> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xp.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xp.a("commands.bossbar.list.bars.some", $$1.size(), xs.b($$1, amf::e)), false);
      }

      return $$1.size();
   }

   private static int a(ep $$0, alf $$1, xp $$2) throws CommandSyntaxException {
      amg $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amf $$4 = $$3.a($$1, xs.a($$0, $$2, null, 0));
         $$0.a(() -> xp.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ep $$0, amf $$1) {
      amg $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xp.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amf a(CommandContext<ep> $$0) throws CommandSyntaxException {
      alf $$1 = fq.c($$0, "id");
      amf $$2 = ((ep)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
