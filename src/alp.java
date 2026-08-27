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

public class alp {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(ws.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ec> a = ($$0, $$1) -> eh.a(((ec)$$0.getSource()).l().aO().a(), $$1);

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ed.a("add")
                              .then(
                                 ed.a("id", fd.a())
                                    .then(ed.a("name", el.a($$1)).executes($$0x -> a((ec)$$0x.getSource(), fd.e($$0x, "id"), el.a($$0x, "name"))))
                              )
                        ))
                     .then(ed.a("remove").then(ed.a("id", fd.a()).suggests(a).executes($$0x -> e((ec)$$0x.getSource(), a($$0x))))))
                  .then(ed.a("list").executes($$0x -> a((ec)$$0x.getSource()))))
               .then(
                  ed.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                                "id", fd.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ed.a("name")
                                                   .then(ed.a("name", el.a($$1)).executes($$0x -> a((ec)$$0x.getSource(), a($$0x), el.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                                                                     "color"
                                                                  )
                                                                  .then(ed.a("pink").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.a))))
                                                               .then(ed.a("blue").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.b))))
                                                            .then(ed.a("red").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.c))))
                                                         .then(ed.a("green").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.d))))
                                                      .then(ed.a("yellow").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.e))))
                                                   .then(ed.a("purple").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.f))))
                                                .then(ed.a("white").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("style")
                                                         .then(ed.a("progress").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.b.a))))
                                                      .then(ed.a("notched_6").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.b.b))))
                                                   .then(ed.a("notched_10").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.b.c))))
                                                .then(ed.a("notched_12").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.b.d))))
                                             .then(ed.a("notched_20").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), bog.b.e)))
                                       ))
                                    .then(
                                       ed.a("value")
                                          .then(
                                             ed.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ec)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ed.a("max")
                                       .then(
                                          ed.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ec)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ed.a("visible")
                                    .then(
                                       ed.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ec)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ed.a("players").executes($$0x -> a((ec)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ed.a("targets", ep.d()).executes($$0x -> a((ec)$$0x.getSource(), a($$0x), ep.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ed.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("id", fd.a())
                                 .suggests(a)
                                 .then(ed.a("value").executes($$0x -> a((ec)$$0x.getSource(), a($$0x)))))
                              .then(ed.a("max").executes($$0x -> b((ec)$$0x.getSource(), a($$0x)))))
                           .then(ed.a("visible").executes($$0x -> c((ec)$$0x.getSource(), a($$0x)))))
                        .then(ed.a("players").executes($$0x -> d((ec)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ec $$0, ale $$1) {
      $$0.a(() -> ws.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ec $$0, ale $$1) {
      $$0.a(() -> ws.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ec $$0, ale $$1) {
      if ($$1.f()) {
         $$0.a(() -> ws.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> ws.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ec $$0, ale $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> ws.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> ws.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), wv.b($$1.g(), ckl::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ec $$0, ale $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> ws.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> ws.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ec $$0, ale $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ec $$0, ale $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> ws.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ec $$0, ale $$1, bog.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ec $$0, ale $$1, bog.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ec $$0, ale $$1, ws $$2) throws CommandSyntaxException {
      ws $$3 = wv.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> ws.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ec $$0, ale $$1, Collection<aqf> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> ws.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> ws.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), wv.b($$2, ckl::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ec $$0) {
      Collection<ale> $$1 = $$0.l().aO().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> ws.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> ws.a("commands.bossbar.list.bars.some", $$1.size(), wv.b($$1, ale::e)), false);
      }

      return $$1.size();
   }

   private static int a(ec $$0, akf $$1, ws $$2) throws CommandSyntaxException {
      alf $$3 = $$0.l().aO();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         ale $$4 = $$3.a($$1, wv.a($$0, $$2, null, 0));
         $$0.a(() -> ws.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ec $$0, ale $$1) {
      alf $$2 = $$0.l().aO();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> ws.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static ale a(CommandContext<ec> $$0) throws CommandSyntaxException {
      akf $$1 = fd.e($$0, "id");
      ale $$2 = ((ec)$$0.getSource()).l().aO().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
