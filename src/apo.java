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

public class apo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ev.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("objective", fo.a())
                        .suggests(($$0x, $$1) -> a((eu)$$0x.getSource(), $$1))
                        .executes($$0x -> a((eu)$$0x.getSource(), ((eu)$$0x.getSource()).h(), fo.a($$0x, "objective"))))
                     .then(
                        ev.a("add")
                           .then(
                              ev.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eu)$$0x.getSource(),
                                          ((eu)$$0x.getSource()).h(),
                                          fo.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ev.a("set")
                        .then(
                           ev.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (eu)$$0x.getSource(), ((eu)$$0x.getSource()).h(), fo.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(eu $$0, SuggestionsBuilder $$1) {
      faa $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fab $$4 = $$0.l().aJ();

         for (ezt $$5 : $$4.c()) {
            if ($$5.c() == fae.c) {
               ezx $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ez.b($$3, $$1);
   }

   private static int a(eu $$0, ark $$1, ezt $$2, int $$3) throws CommandSyntaxException {
      ezz $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xe.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(eu $$0, ark $$1, ezt $$2, int $$3) throws CommandSyntaxException {
      ezz $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xe.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(eu $$0, ark $$1, ezt $$2) throws CommandSyntaxException {
      ezz $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xe.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static ezz a(fab $$0, faa $$1, ezt $$2) throws CommandSyntaxException {
      if ($$2.c() != fae.c) {
         throw b.create();
      } else {
         ezx $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            ezz $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
