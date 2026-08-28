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

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)eq.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("objective", fj.a())
                        .suggests(($$0x, $$1) -> a((ep)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h(), fj.a($$0x, "objective"))))
                     .then(
                        eq.a("add")
                           .then(
                              eq.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ep)$$0x.getSource(),
                                          ((ep)$$0x.getSource()).h(),
                                          fj.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     eq.a("set")
                        .then(
                           eq.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ep)$$0x.getSource(), ((ep)$$0x.getSource()).h(), fj.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ep $$0, SuggestionsBuilder $$1) {
      ews $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         ewt $$4 = $$0.l().aK();

         for (ewl $$5 : $$4.c()) {
            if ($$5.c() == eww.c) {
               ewp $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return eu.b($$3, $$1);
   }

   private static int a(ep $$0, arf $$1, ewl $$2, int $$3) throws CommandSyntaxException {
      ewr $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xo.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ep $$0, arf $$1, ewl $$2, int $$3) throws CommandSyntaxException {
      ewr $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xo.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ep $$0, arf $$1, ewl $$2) throws CommandSyntaxException {
      ewr $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xo.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static ewr a(ewt $$0, ews $$1, ewl $$2) throws CommandSyntaxException {
      if ($$2.c() != eww.c) {
         throw b.create();
      } else {
         ewp $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            ewr $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
