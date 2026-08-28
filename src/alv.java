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

public class alv {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wu.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<eq> a = ($$0, $$1) -> ev.a(((eq)$$0.getSource()).l().aN().a(), $$1);

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           er.a("add")
                              .then(
                                 er.a("id", fr.a())
                                    .then(er.a("name", ez.a($$1)).executes($$0x -> a((eq)$$0x.getSource(), fr.c($$0x, "id"), ez.a($$0x, "name"))))
                              )
                        ))
                     .then(er.a("remove").then(er.a("id", fr.a()).suggests(a).executes($$0x -> e((eq)$$0x.getSource(), a($$0x))))))
                  .then(er.a("list").executes($$0x -> a((eq)$$0x.getSource()))))
               .then(
                  er.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                                "id", fr.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                er.a("name")
                                                   .then(er.a("name", ez.a($$1)).executes($$0x -> a((eq)$$0x.getSource(), a($$0x), ez.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                                                     "color"
                                                                  )
                                                                  .then(er.a("pink").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.a))))
                                                               .then(er.a("blue").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.b))))
                                                            .then(er.a("red").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.c))))
                                                         .then(er.a("green").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.d))))
                                                      .then(er.a("yellow").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.e))))
                                                   .then(er.a("purple").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.f))))
                                                .then(er.a("white").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("style")
                                                         .then(er.a("progress").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.b.a))))
                                                      .then(er.a("notched_6").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.b.b))))
                                                   .then(er.a("notched_10").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.b.c))))
                                                .then(er.a("notched_12").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.b.d))))
                                             .then(er.a("notched_20").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), bpt.b.e)))
                                       ))
                                    .then(
                                       er.a("value")
                                          .then(
                                             er.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((eq)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    er.a("max")
                                       .then(
                                          er.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((eq)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 er.a("visible")
                                    .then(
                                       er.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((eq)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)er.a("players").executes($$0x -> a((eq)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(er.a("targets", fd.d()).executes($$0x -> a((eq)$$0x.getSource(), a($$0x), fd.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               er.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("id", fr.a())
                                 .suggests(a)
                                 .then(er.a("value").executes($$0x -> a((eq)$$0x.getSource(), a($$0x)))))
                              .then(er.a("max").executes($$0x -> b((eq)$$0x.getSource(), a($$0x)))))
                           .then(er.a("visible").executes($$0x -> c((eq)$$0x.getSource(), a($$0x)))))
                        .then(er.a("players").executes($$0x -> d((eq)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(eq $$0, alk $$1) {
      $$0.a(() -> wu.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(eq $$0, alk $$1) {
      $$0.a(() -> wu.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(eq $$0, alk $$1) {
      if ($$1.f()) {
         $$0.a(() -> wu.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wu.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(eq $$0, alk $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wu.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wu.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), wx.b($$1.g(), cmh::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(eq $$0, alk $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wu.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wu.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(eq $$0, alk $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(eq $$0, alk $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(eq $$0, alk $$1, bpt.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eq $$0, alk $$1, bpt.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eq $$0, alk $$1, wu $$2) throws CommandSyntaxException {
      wu $$3 = wx.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wu.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(eq $$0, alk $$1, Collection<aql> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wu.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wu.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), wx.b($$2, cmh::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(eq $$0) {
      Collection<alk> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wu.a("commands.bossbar.list.bars.some", $$1.size(), wx.b($$1, alk::e)), false);
      }

      return $$1.size();
   }

   private static int a(eq $$0, akk $$1, wu $$2) throws CommandSyntaxException {
      all $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alk $$4 = $$3.a($$1, wx.a($$0, $$2, null, 0));
         $$0.a(() -> wu.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(eq $$0, alk $$1) {
      all $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wu.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alk a(CommandContext<eq> $$0) throws CommandSyntaxException {
      akk $$1 = fr.c($$0, "id");
      alk $$2 = ((eq)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
