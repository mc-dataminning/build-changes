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

public class aoq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ee.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("objective", ex.a())
                        .suggests(($$0x, $$1) -> a((ed)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ed)$$0x.getSource(), ((ed)$$0x.getSource()).h(), ex.a($$0x, "objective"))))
                     .then(
                        ee.a("add")
                           .then(
                              ee.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ed)$$0x.getSource(),
                                          ((ed)$$0x.getSource()).h(),
                                          ex.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ee.a("set")
                        .then(
                           ee.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ed)$$0x.getSource(), ((ed)$$0x.getSource()).h(), ex.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ed $$0, SuggestionsBuilder $$1) {
      eus $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eut $$4 = $$0.l().aK();

         for (eul $$5 : $$4.c()) {
            if ($$5.c() == euw.c) {
               eup $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ei.b($$3, $$1);
   }

   private static int a(ed $$0, aqi $$1, eul $$2, int $$3) throws CommandSyntaxException {
      eur $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wu.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ed $$0, aqi $$1, eul $$2, int $$3) throws CommandSyntaxException {
      eur $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wu.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ed $$0, aqi $$1, eul $$2) throws CommandSyntaxException {
      eur $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wu.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static eur a(eut $$0, eus $$1, eul $$2) throws CommandSyntaxException {
      if ($$2.c() != euw.c) {
         throw b.create();
      } else {
         eup $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            eur $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
