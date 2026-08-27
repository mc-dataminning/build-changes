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

public class ame {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xe.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<eh> a = ($$0, $$1) -> em.a(((eh)$$0.getSource()).l().aN().a(), $$1);

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ei.a("add")
                              .then(
                                 ei.a("id", fi.a())
                                    .then(ei.a("name", eq.a($$1)).executes($$0x -> a((eh)$$0x.getSource(), fi.c($$0x, "id"), eq.a($$0x, "name"))))
                              )
                        ))
                     .then(ei.a("remove").then(ei.a("id", fi.a()).suggests(a).executes($$0x -> e((eh)$$0x.getSource(), a($$0x))))))
                  .then(ei.a("list").executes($$0x -> a((eh)$$0x.getSource()))))
               .then(
                  ei.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                                "id", fi.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ei.a("name")
                                                   .then(ei.a("name", eq.a($$1)).executes($$0x -> a((eh)$$0x.getSource(), a($$0x), eq.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                                                     "color"
                                                                  )
                                                                  .then(ei.a("pink").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.a))))
                                                               .then(ei.a("blue").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.b))))
                                                            .then(ei.a("red").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.c))))
                                                         .then(ei.a("green").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.d))))
                                                      .then(ei.a("yellow").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.e))))
                                                   .then(ei.a("purple").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.f))))
                                                .then(ei.a("white").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("style")
                                                         .then(ei.a("progress").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.b.a))))
                                                      .then(ei.a("notched_6").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.b.b))))
                                                   .then(ei.a("notched_10").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.b.c))))
                                                .then(ei.a("notched_12").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.b.d))))
                                             .then(ei.a("notched_20").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), bpq.b.e)))
                                       ))
                                    .then(
                                       ei.a("value")
                                          .then(
                                             ei.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((eh)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ei.a("max")
                                       .then(
                                          ei.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((eh)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ei.a("visible")
                                    .then(
                                       ei.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((eh)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ei.a("players").executes($$0x -> a((eh)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ei.a("targets", eu.d()).executes($$0x -> a((eh)$$0x.getSource(), a($$0x), eu.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ei.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("id", fi.a())
                                 .suggests(a)
                                 .then(ei.a("value").executes($$0x -> a((eh)$$0x.getSource(), a($$0x)))))
                              .then(ei.a("max").executes($$0x -> b((eh)$$0x.getSource(), a($$0x)))))
                           .then(ei.a("visible").executes($$0x -> c((eh)$$0x.getSource(), a($$0x)))))
                        .then(ei.a("players").executes($$0x -> d((eh)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(eh $$0, alt $$1) {
      $$0.a(() -> xe.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(eh $$0, alt $$1) {
      $$0.a(() -> xe.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(eh $$0, alt $$1) {
      if ($$1.f()) {
         $$0.a(() -> xe.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xe.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(eh $$0, alt $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xe.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xe.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xh.b($$1.g(), cly::P_)), true);
      }

      return $$1.g().size();
   }

   private static int a(eh $$0, alt $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xe.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xe.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(eh $$0, alt $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(eh $$0, alt $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(eh $$0, alt $$1, bpq.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eh $$0, alt $$1, bpq.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eh $$0, alt $$1, xe $$2) throws CommandSyntaxException {
      xe $$3 = xh.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xe.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eh $$0, alt $$1, Collection<aqu> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xe.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xe.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xh.b($$2, cly::P_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(eh $$0) {
      Collection<alt> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.bossbar.list.bars.some", $$1.size(), xh.b($$1, alt::e)), false);
      }

      return $$1.size();
   }

   private static int a(eh $$0, akt $$1, xe $$2) throws CommandSyntaxException {
      alu $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alt $$4 = $$3.a($$1, xh.a($$0, $$2, null, 0));
         $$0.a(() -> xe.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(eh $$0, alt $$1) {
      alu $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xe.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alt a(CommandContext<eh> $$0) throws CommandSyntaxException {
      akt $$1 = fi.c($$0, "id");
      alt $$2 = ((eh)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
