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

public class aoz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.trigger.failed.invalid"));

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
      exz $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eya $$4 = $$0.l().aK();

         for (exs $$5 : $$4.c()) {
            if ($$5.c() == eyd.c) {
               exw $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ey.b($$3, $$1);
   }

   private static int a(et $$0, aqu $$1, exs $$2, int $$3) throws CommandSyntaxException {
      exy $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wy.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(et $$0, aqu $$1, exs $$2, int $$3) throws CommandSyntaxException {
      exy $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wy.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(et $$0, aqu $$1, exs $$2) throws CommandSyntaxException {
      exy $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wy.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static exy a(eya $$0, exz $$1, exs $$2) throws CommandSyntaxException {
      if ($$2.c() != eyd.c) {
         throw b.create();
      } else {
         exw $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            exy $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
