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

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)eu.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("objective", fn.a())
                        .suggests(($$0x, $$1) -> a((et)$$0x.getSource(), $$1))
                        .executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).h(), fn.a($$0x, "objective"))))
                     .then(
                        eu.a("add")
                           .then(
                              eu.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (et)$$0x.getSource(),
                                          ((et)$$0x.getSource()).h(),
                                          fn.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     eu.a("set")
                        .then(
                           eu.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (et)$$0x.getSource(), ((et)$$0x.getSource()).h(), fn.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(et $$0, SuggestionsBuilder $$1) {
      eyd $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eye $$4 = $$0.l().aK();

         for (exw $$5 : $$4.c()) {
            if ($$5.c() == eyh.c) {
               eya $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ey.b($$3, $$1);
   }

   private static int a(et $$0, aqv $$1, exw $$2, int $$3) throws CommandSyntaxException {
      eyc $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wz.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(et $$0, aqv $$1, exw $$2, int $$3) throws CommandSyntaxException {
      eyc $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wz.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(et $$0, aqv $$1, exw $$2) throws CommandSyntaxException {
      eyc $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wz.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static eyc a(eye $$0, eyd $$1, exw $$2) throws CommandSyntaxException {
      if ($$2.c() != eyh.c) {
         throw b.create();
      } else {
         eya $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            eyc $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
