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

public class amv {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xa.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ej> a = ($$0, $$1) -> eo.a(((ej)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ek.a("add")
                              .then(
                                 ek.a("id", fk.a())
                                    .then(ek.a("name", es.a($$1)).executes($$0x -> a((ej)$$0x.getSource(), fk.a($$0x, "id"), es.b($$0x, "name"))))
                              )
                        ))
                     .then(ek.a("remove").then(ek.a("id", fk.a()).suggests(a).executes($$0x -> e((ej)$$0x.getSource(), a($$0x))))))
                  .then(ek.a("list").executes($$0x -> a((ej)$$0x.getSource()))))
               .then(
                  ek.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a(
                                                "id", fk.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ek.a("name")
                                                   .then(ek.a("name", es.a($$1)).executes($$0x -> a((ej)$$0x.getSource(), a($$0x), es.b($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                                                     "color"
                                                                  )
                                                                  .then(ek.a("pink").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.a))))
                                                               .then(ek.a("blue").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.b))))
                                                            .then(ek.a("red").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.c))))
                                                         .then(ek.a("green").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.d))))
                                                      .then(ek.a("yellow").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.e))))
                                                   .then(ek.a("purple").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.f))))
                                                .then(ek.a("white").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("style")
                                                         .then(ek.a("progress").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.b.a))))
                                                      .then(ek.a("notched_6").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.b.b))))
                                                   .then(ek.a("notched_10").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.b.c))))
                                                .then(ek.a("notched_12").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.b.d))))
                                             .then(ek.a("notched_20").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), buh.b.e)))
                                       ))
                                    .then(
                                       ek.a("value")
                                          .then(
                                             ek.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ej)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ek.a("max")
                                       .then(
                                          ek.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ej)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ek.a("visible")
                                    .then(
                                       ek.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ej)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ek.a("players").executes($$0x -> a((ej)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ek.a("targets", ew.d()).executes($$0x -> a((ej)$$0x.getSource(), a($$0x), ew.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ek.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("id", fk.a())
                                 .suggests(a)
                                 .then(ek.a("value").executes($$0x -> a((ej)$$0x.getSource(), a($$0x)))))
                              .then(ek.a("max").executes($$0x -> b((ej)$$0x.getSource(), a($$0x)))))
                           .then(ek.a("visible").executes($$0x -> c((ej)$$0x.getSource(), a($$0x)))))
                        .then(ek.a("players").executes($$0x -> d((ej)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ej $$0, amk $$1) {
      $$0.a(() -> xa.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ej $$0, amk $$1) {
      $$0.a(() -> xa.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ej $$0, amk $$1) {
      if ($$1.g()) {
         $$0.a(() -> xa.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xa.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ej $$0, amk $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> xa.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xa.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), xd.b($$1.h(), crx::m_)), true);
      }

      return $$1.h().size();
   }

   private static int a(ej $$0, amk $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xa.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xa.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ej $$0, amk $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ej $$0, amk $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xa.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ej $$0, amk $$1, buh.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, amk $$1, buh.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, amk $$1, xa $$2) throws CommandSyntaxException {
      xa $$3 = xd.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xa.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, amk $$1, Collection<art> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> xa.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xa.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xd.b($$2, crx::m_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(ej $$0) {
      Collection<amk> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xa.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xa.a("commands.bossbar.list.bars.some", $$1.size(), xd.b($$1, amk::e)), false);
      }

      return $$1.size();
   }

   private static int a(ej $$0, ali $$1, xa $$2) throws CommandSyntaxException {
      aml $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         amk $$4 = $$3.a($$1, xd.a($$0, $$2, null, 0));
         $$0.a(() -> xa.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ej $$0, amk $$1) {
      aml $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xa.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static amk a(CommandContext<ej> $$0) throws CommandSyntaxException {
      ali $$1 = fk.a($$0, "id");
      amk $$2 = ((ej)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
