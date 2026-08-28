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

public class amu {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xh.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ev> a = ($$0, $$1) -> fa.a(((ev)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ew.a("add")
                              .then(
                                 ew.a("id", fw.a())
                                    .then(ew.a("name", fe.a($$1)).executes($$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "id"), fe.a($$0x, "name"))))
                              )
                        ))
                     .then(ew.a("remove").then(ew.a("id", fw.a()).suggests(a).executes($$0x -> e((ev)$$0x.getSource(), a($$0x))))))
                  .then(ew.a("list").executes($$0x -> a((ev)$$0x.getSource()))))
               .then(
                  ew.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                                "id", fw.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ew.a("name")
                                                   .then(ew.a("name", fe.a($$1)).executes($$0x -> a((ev)$$0x.getSource(), a($$0x), fe.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                                                     "color"
                                                                  )
                                                                  .then(ew.a("pink").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.a))))
                                                               .then(ew.a("blue").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.b))))
                                                            .then(ew.a("red").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.c))))
                                                         .then(ew.a("green").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.d))))
                                                      .then(ew.a("yellow").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.e))))
                                                   .then(ew.a("purple").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.f))))
                                                .then(ew.a("white").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("style")
                                                         .then(ew.a("progress").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.b.a))))
                                                      .then(ew.a("notched_6").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.b.b))))
                                                   .then(ew.a("notched_10").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.b.c))))
                                                .then(ew.a("notched_12").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.b.d))))
                                             .then(ew.a("notched_20").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), bro.b.e)))
                                       ))
                                    .then(
                                       ew.a("value")
                                          .then(
                                             ew.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ev)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ew.a("max")
                                       .then(
                                          ew.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ev)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ew.a("visible")
                                    .then(
                                       ew.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ev)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ew.a("players").executes($$0x -> a((ev)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ew.a("targets", fi.d()).executes($$0x -> a((ev)$$0x.getSource(), a($$0x), fi.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ew.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("id", fw.a())
                                 .suggests(a)
                                 .then(ew.a("value").executes($$0x -> a((ev)$$0x.getSource(), a($$0x)))))
                              .then(ew.a("max").executes($$0x -> b((ev)$$0x.getSource(), a($$0x)))))
                           .then(ew.a("visible").executes($$0x -> c((ev)$$0x.getSource(), a($$0x)))))
                        .then(ew.a("players").executes($$0x -> d((ev)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ev $$0, amj $$1) {
      $$0.a(() -> xh.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ev $$0, amj $$1) {
      $$0.a(() -> xh.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ev $$0, amj $$1) {
      if ($$1.f()) {
         $$0.a(() -> xh.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xh.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ev $$0, amj $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> xh.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xh.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xk.b($$1.g(), coh::S_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ev $$0, amj $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xh.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xh.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ev $$0, amj $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ev $$0, amj $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xh.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ev $$0, amj $$1, bro.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ev $$0, amj $$1, bro.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ev $$0, amj $$1, xh $$2) throws CommandSyntaxException {
      xh $$3 = xk.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xh.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ev $$0, amj $$1, Collection<arn> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> xh.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xh.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xk.b($$2, coh::S_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ev $$0) {
      Collection<amj> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xh.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xh.a("commands.bossbar.list.bars.some", $$1.size(), xk.b($$1, amj::e)), false);
      }

      return $$1.size();
   }

   private static int a(ev $$0, alh $$1, xh $$2) throws CommandSyntaxException {
      amk $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amj $$4 = $$3.a($$1, xk.a($$0, $$2, null, 0));
         $$0.a(() -> xh.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ev $$0, amj $$1) {
      amk $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xh.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amj a(CommandContext<ev> $$0) throws CommandSyntaxException {
      alh $$1 = fw.c($$0, "id");
      amj $$2 = ((ev)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
