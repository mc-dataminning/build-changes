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

public class amr {
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
   public static final SuggestionProvider<eu> a = ($$0, $$1) -> ez.a(((eu)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ev.a("add")
                              .then(
                                 ev.a("id", fv.a())
                                    .then(ev.a("name", fd.a($$1)).executes($$0x -> a((eu)$$0x.getSource(), fv.c($$0x, "id"), fd.a($$0x, "name"))))
                              )
                        ))
                     .then(ev.a("remove").then(ev.a("id", fv.a()).suggests(a).executes($$0x -> e((eu)$$0x.getSource(), a($$0x))))))
                  .then(ev.a("list").executes($$0x -> a((eu)$$0x.getSource()))))
               .then(
                  ev.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                                "id", fv.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ev.a("name")
                                                   .then(ev.a("name", fd.a($$1)).executes($$0x -> a((eu)$$0x.getSource(), a($$0x), fd.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                                                     "color"
                                                                  )
                                                                  .then(ev.a("pink").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.a))))
                                                               .then(ev.a("blue").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.b))))
                                                            .then(ev.a("red").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.c))))
                                                         .then(ev.a("green").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.d))))
                                                      .then(ev.a("yellow").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.e))))
                                                   .then(ev.a("purple").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.f))))
                                                .then(ev.a("white").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("style")
                                                         .then(ev.a("progress").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.b.a))))
                                                      .then(ev.a("notched_6").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.b.b))))
                                                   .then(ev.a("notched_10").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.b.c))))
                                                .then(ev.a("notched_12").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.b.d))))
                                             .then(ev.a("notched_20").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), bri.b.e)))
                                       ))
                                    .then(
                                       ev.a("value")
                                          .then(
                                             ev.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((eu)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ev.a("max")
                                       .then(
                                          ev.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((eu)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ev.a("visible")
                                    .then(
                                       ev.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((eu)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ev.a("players").executes($$0x -> a((eu)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ev.a("targets", fh.d()).executes($$0x -> a((eu)$$0x.getSource(), a($$0x), fh.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ev.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("id", fv.a())
                                 .suggests(a)
                                 .then(ev.a("value").executes($$0x -> a((eu)$$0x.getSource(), a($$0x)))))
                              .then(ev.a("max").executes($$0x -> b((eu)$$0x.getSource(), a($$0x)))))
                           .then(ev.a("visible").executes($$0x -> c((eu)$$0x.getSource(), a($$0x)))))
                        .then(ev.a("players").executes($$0x -> d((eu)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(eu $$0, amg $$1) {
      $$0.a(() -> xe.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(eu $$0, amg $$1) {
      $$0.a(() -> xe.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(eu $$0, amg $$1) {
      if ($$1.f()) {
         $$0.a(() -> xe.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xe.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(eu $$0, amg $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xe.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xe.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xh.b($$1.g(), cnx::R_)), true);
      }

      return $$1.g().size();
   }

   private static int a(eu $$0, amg $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int a(eu $$0, amg $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(eu $$0, amg $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(eu $$0, amg $$1, bri.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eu $$0, amg $$1, bri.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eu $$0, amg $$1, xe $$2) throws CommandSyntaxException {
      xe $$3 = xh.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xe.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eu $$0, amg $$1, Collection<ark> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xe.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xe.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xh.b($$2, cnx::R_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(eu $$0) {
      Collection<amg> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.bossbar.list.bars.some", $$1.size(), xh.b($$1, amg::e)), false);
      }

      return $$1.size();
   }

   private static int a(eu $$0, ale $$1, xe $$2) throws CommandSyntaxException {
      amh $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amg $$4 = $$3.a($$1, xh.a($$0, $$2, null, 0));
         $$0.a(() -> xe.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(eu $$0, amg $$1) {
      amh $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xe.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amg a(CommandContext<eu> $$0) throws CommandSyntaxException {
      ale $$1 = fv.c($$0, "id");
      amg $$2 = ((eu)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
