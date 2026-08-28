import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class apt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ek.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("objective", fd.a())
                        .suggests(($$0x, $$1) -> a((ej)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h(), fd.a($$0x, "objective"))))
                     .then(
                        ek.a("add")
                           .then(
                              ek.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ej)$$0x.getSource(),
                                          ((ej)$$0x.getSource()).h(),
                                          fd.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ek.a("set")
                        .then(
                           ek.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ej)$$0x.getSource(), ((ej)$$0x.getSource()).h(), fd.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ej $$0, SuggestionsBuilder $$1) {
      fgb $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fgc $$4 = $$0.l().aJ();

         for (ffu $$5 : $$4.b()) {
            if ($$5.d() == fgf.d) {
               ffy $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.c());
               }
            }
         }
      }

      return eo.b($$3, $$1);
   }

   private static int a(ej $$0, arr $$1, ffu $$2, int $$3) throws CommandSyntaxException {
      fga $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wy.a("commands.trigger.add.success", $$2.h(), $$3), true);
      return $$5;
   }

   private static int b(ej $$0, arr $$1, ffu $$2, int $$3) throws CommandSyntaxException {
      fga $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wy.a("commands.trigger.set.success", $$2.h(), $$3), true);
      return $$3;
   }

   private static int a(ej $$0, arr $$1, ffu $$2) throws CommandSyntaxException {
      fga $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wy.a("commands.trigger.simple.success", $$2.h()), true);
      return $$4;
   }

   private static fga a(fgc $$0, fgb $$1, ffu $$2) throws CommandSyntaxException {
      if ($$2.d() != fgf.d) {
         throw b.create();
      } else {
         ffy $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fga $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
