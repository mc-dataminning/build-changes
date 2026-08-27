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

public class agh {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tn.a("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tn.a("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(tn.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> dw.a(((dt)$$0.getSource()).l().aJ().a(), $$1);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           du.a("add")
                              .then(
                                 du.a("id", es.a()).then(du.a("name", ea.a()).executes($$0x -> a((dt)$$0x.getSource(), es.e($$0x, "id"), ea.a($$0x, "name"))))
                              )
                        ))
                     .then(du.a("remove").then(du.a("id", es.a()).suggests(a).executes($$0x -> e((dt)$$0x.getSource(), a($$0x))))))
                  .then(du.a("list").executes($$0x -> a((dt)$$0x.getSource()))))
               .then(
                  du.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                                "id", es.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                du.a("name").then(du.a("name", ea.a()).executes($$0x -> a((dt)$$0x.getSource(), a($$0x), ea.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                                                                     "color"
                                                                  )
                                                                  .then(du.a("pink").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.a))))
                                                               .then(du.a("blue").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.b))))
                                                            .then(du.a("red").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.c))))
                                                         .then(du.a("green").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.d))))
                                                      .then(du.a("yellow").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.e))))
                                                   .then(du.a("purple").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.f))))
                                                .then(du.a("white").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("style")
                                                         .then(du.a("progress").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.b.a))))
                                                      .then(du.a("notched_6").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.b.b))))
                                                   .then(du.a("notched_10").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.b.c))))
                                                .then(du.a("notched_12").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.b.d))))
                                             .then(du.a("notched_20").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), bgq.b.e)))
                                       ))
                                    .then(
                                       du.a("value")
                                          .then(
                                             du.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((dt)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    du.a("max")
                                       .then(
                                          du.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((dt)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 du.a("visible")
                                    .then(
                                       du.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((dt)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)du.a("players").executes($$0x -> a((dt)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(du.a("targets", ee.d()).executes($$0x -> a((dt)$$0x.getSource(), a($$0x), ee.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               du.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("id", es.a())
                                 .suggests(a)
                                 .then(du.a("value").executes($$0x -> a((dt)$$0x.getSource(), a($$0x)))))
                              .then(du.a("max").executes($$0x -> b((dt)$$0x.getSource(), a($$0x)))))
                           .then(du.a("visible").executes($$0x -> c((dt)$$0x.getSource(), a($$0x)))))
                        .then(du.a("players").executes($$0x -> d((dt)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(dt $$0, afw $$1) {
      $$0.a(() -> tn.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(dt $$0, afw $$1) {
      $$0.a(() -> tn.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(dt $$0, afw $$1) {
      if ($$1.g()) {
         $$0.a(() -> tn.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> tn.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(dt $$0, afw $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> tn.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> tn.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), tp.b($$1.h(), cbw::N_)), true);
      }

      return $$1.h().size();
   }

   private static int a(dt $$0, afw $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> tn.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> tn.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(dt $$0, afw $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> tn.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(dt $$0, afw $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> tn.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(dt $$0, afw $$1, bgq.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> tn.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dt $$0, afw $$1, bgq.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> tn.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dt $$0, afw $$1, tn $$2) throws CommandSyntaxException {
      tn $$3 = tp.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> tn.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(dt $$0, afw $$1, Collection<akt> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> tn.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> tn.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), tp.b($$2, cbw::N_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(dt $$0) {
      Collection<afw> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> tn.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> tn.a("commands.bossbar.list.bars.some", $$1.size(), tp.b($$1, afw::e)), false);
      }

      return $$1.size();
   }

   private static int a(dt $$0, aey $$1, tn $$2) throws CommandSyntaxException {
      afx $$3 = $$0.l().aJ();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         afw $$4 = $$3.a($$1, tp.a($$0, $$2, null, 0));
         $$0.a(() -> tn.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(dt $$0, afw $$1) {
      afx $$2 = $$0.l().aJ();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> tn.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static afw a(CommandContext<dt> $$0) throws CommandSyntaxException {
      aey $$1 = es.e($$0, "id");
      afw $$2 = ((dt)$$0.getSource()).l().aJ().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
