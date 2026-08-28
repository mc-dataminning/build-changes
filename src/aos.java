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

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)er.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("objective", fk.a())
                        .suggests(($$0x, $$1) -> a((eq)$$0x.getSource(), $$1))
                        .executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).h(), fk.a($$0x, "objective"))))
                     .then(
                        er.a("add")
                           .then(
                              er.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eq)$$0x.getSource(),
                                          ((eq)$$0x.getSource()).h(),
                                          fk.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     er.a("set")
                        .then(
                           er.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (eq)$$0x.getSource(), ((eq)$$0x.getSource()).h(), fk.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(eq $$0, SuggestionsBuilder $$1) {
      exi $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         exj $$4 = $$0.l().aL();

         for (exb $$5 : $$4.c()) {
            if ($$5.c() == exm.c) {
               exf $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ev.b($$3, $$1);
   }

   private static int a(eq $$0, aqn $$1, exb $$2, int $$3) throws CommandSyntaxException {
      exh $$4 = a($$0.l().aL(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wu.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(eq $$0, aqn $$1, exb $$2, int $$3) throws CommandSyntaxException {
      exh $$4 = a($$0.l().aL(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wu.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(eq $$0, aqn $$1, exb $$2) throws CommandSyntaxException {
      exh $$3 = a($$0.l().aL(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wu.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static exh a(exj $$0, exi $$1, exb $$2) throws CommandSyntaxException {
      if ($$2.c() != exm.c) {
         throw b.create();
      } else {
         exf $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            exh $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
