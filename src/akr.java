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

public class akr {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vu.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vu.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(vu.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<du> a = ($$0, $$1) -> dz.a(((du)$$0.getSource()).l().aO().a(), $$1);

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           dv.a("add")
                              .then(
                                 dv.a("id", ev.a())
                                    .then(dv.a("name", ed.a($$1)).executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "id"), ed.a($$0x, "name"))))
                              )
                        ))
                     .then(dv.a("remove").then(dv.a("id", ev.a()).suggests(a).executes($$0x -> e((du)$$0x.getSource(), a($$0x))))))
                  .then(dv.a("list").executes($$0x -> a((du)$$0x.getSource()))))
               .then(
                  dv.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                "id", ev.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                dv.a("name")
                                                   .then(dv.a("name", ed.a($$1)).executes($$0x -> a((du)$$0x.getSource(), a($$0x), ed.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                                     "color"
                                                                  )
                                                                  .then(dv.a("pink").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.a))))
                                                               .then(dv.a("blue").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.b))))
                                                            .then(dv.a("red").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.c))))
                                                         .then(dv.a("green").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.d))))
                                                      .then(dv.a("yellow").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.e))))
                                                   .then(dv.a("purple").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.f))))
                                                .then(dv.a("white").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("style")
                                                         .then(dv.a("progress").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.b.a))))
                                                      .then(dv.a("notched_6").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.b.b))))
                                                   .then(dv.a("notched_10").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.b.c))))
                                                .then(dv.a("notched_12").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.b.d))))
                                             .then(dv.a("notched_20").executes($$0x -> a((du)$$0x.getSource(), a($$0x), bmt.b.e)))
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
                                 .then(dv.a("targets", eh.d()).executes($$0x -> a((du)$$0x.getSource(), a($$0x), eh.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               dv.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("id", ev.a())
                                 .suggests(a)
                                 .then(dv.a("value").executes($$0x -> a((du)$$0x.getSource(), a($$0x)))))
                              .then(dv.a("max").executes($$0x -> b((du)$$0x.getSource(), a($$0x)))))
                           .then(dv.a("visible").executes($$0x -> c((du)$$0x.getSource(), a($$0x)))))
                        .then(dv.a("players").executes($$0x -> d((du)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(du $$0, akg $$1) {
      $$0.a(() -> vu.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(du $$0, akg $$1) {
      $$0.a(() -> vu.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(du $$0, akg $$1) {
      if ($$1.g()) {
         $$0.a(() -> vu.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> vu.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(du $$0, akg $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> vu.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> vu.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), vx.b($$1.h(), ciu::O_)), true);
      }

      return $$1.h().size();
   }

   private static int a(du $$0, akg $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> vu.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> vu.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(du $$0, akg $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vu.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(du $$0, akg $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> vu.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(du $$0, akg $$1, bmt.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vu.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, akg $$1, bmt.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vu.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, akg $$1, vu $$2) throws CommandSyntaxException {
      vu $$3 = vx.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> vu.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(du $$0, akg $$1, Collection<apg> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> vu.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> vu.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), vx.b($$2, ciu::O_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(du $$0) {
      Collection<akg> $$1 = $$0.l().aO().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> vu.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> vu.a("commands.bossbar.list.bars.some", $$1.size(), vx.b($$1, akg::e)), false);
      }

      return $$1.size();
   }

   private static int a(du $$0, ajh $$1, vu $$2) throws CommandSyntaxException {
      akh $$3 = $$0.l().aO();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         akg $$4 = $$3.a($$1, vx.a($$0, $$2, null, 0));
         $$0.a(() -> vu.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(du $$0, akg $$1) {
      akh $$2 = $$0.l().aO();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> vu.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static akg a(CommandContext<du> $$0) throws CommandSyntaxException {
      ajh $$1 = ev.e($$0, "id");
      akg $$2 = ((du)$$0.getSource()).l().aO().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
