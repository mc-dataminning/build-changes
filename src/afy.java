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

public class afy {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(te.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(te.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(te.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(te.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(te.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(te.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(te.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(te.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> dv.a(((ds)$$0.getSource()).l().aJ().a(), $$1);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           dt.a("add")
                              .then(
                                 dt.a("id", er.a()).then(dt.a("name", dz.a()).executes($$0x -> a((ds)$$0x.getSource(), er.e($$0x, "id"), dz.a($$0x, "name"))))
                              )
                        ))
                     .then(dt.a("remove").then(dt.a("id", er.a()).suggests(a).executes($$0x -> e((ds)$$0x.getSource(), a($$0x))))))
                  .then(dt.a("list").executes($$0x -> a((ds)$$0x.getSource()))))
               .then(
                  dt.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                "id", er.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                dt.a("name").then(dt.a("name", dz.a()).executes($$0x -> a((ds)$$0x.getSource(), a($$0x), dz.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                                     "color"
                                                                  )
                                                                  .then(dt.a("pink").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.a))))
                                                               .then(dt.a("blue").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.b))))
                                                            .then(dt.a("red").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.c))))
                                                         .then(dt.a("green").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.d))))
                                                      .then(dt.a("yellow").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.e))))
                                                   .then(dt.a("purple").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.f))))
                                                .then(dt.a("white").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("style")
                                                         .then(dt.a("progress").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.b.a))))
                                                      .then(dt.a("notched_6").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.b.b))))
                                                   .then(dt.a("notched_10").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.b.c))))
                                                .then(dt.a("notched_12").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.b.d))))
                                             .then(dt.a("notched_20").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), bge.b.e)))
                                       ))
                                    .then(
                                       dt.a("value")
                                          .then(
                                             dt.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ds)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    dt.a("max")
                                       .then(
                                          dt.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ds)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 dt.a("visible")
                                    .then(
                                       dt.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ds)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("players").executes($$0x -> a((ds)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(dt.a("targets", ed.d()).executes($$0x -> a((ds)$$0x.getSource(), a($$0x), ed.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               dt.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("id", er.a())
                                 .suggests(a)
                                 .then(dt.a("value").executes($$0x -> a((ds)$$0x.getSource(), a($$0x)))))
                              .then(dt.a("max").executes($$0x -> b((ds)$$0x.getSource(), a($$0x)))))
                           .then(dt.a("visible").executes($$0x -> c((ds)$$0x.getSource(), a($$0x)))))
                        .then(dt.a("players").executes($$0x -> d((ds)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ds $$0, afn $$1) {
      $$0.a(() -> te.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ds $$0, afn $$1) {
      $$0.a(() -> te.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ds $$0, afn $$1) {
      if ($$1.g()) {
         $$0.a(() -> te.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> te.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ds $$0, afn $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> te.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> te.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), tg.b($$1.h(), cbl::H_)), true);
      }

      return $$1.h().size();
   }

   private static int a(ds $$0, afn $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> te.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> te.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ds $$0, afn $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ds $$0, afn $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> te.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ds $$0, afn $$1, bge.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, afn $$1, bge.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, afn $$1, te $$2) throws CommandSyntaxException {
      te $$3 = tg.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> te.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ds $$0, afn $$1, Collection<akj> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> te.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> te.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), tg.b($$2, cbl::H_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(ds $$0) {
      Collection<afn> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> te.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> te.a("commands.bossbar.list.bars.some", $$1.size(), tg.b($$1, afn::e)), false);
      }

      return $$1.size();
   }

   private static int a(ds $$0, aep $$1, te $$2) throws CommandSyntaxException {
      afo $$3 = $$0.l().aJ();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         afn $$4 = $$3.a($$1, tg.a($$0, $$2, null, 0));
         $$0.a(() -> te.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ds $$0, afn $$1) {
      afo $$2 = $$0.l().aJ();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> te.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static afn a(CommandContext<ds> $$0) throws CommandSyntaxException {
      aep $$1 = er.e($$0, "id");
      afn $$2 = ((ds)$$0.getSource()).l().aJ().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
