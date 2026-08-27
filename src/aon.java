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

public class aon {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ed.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("objective", ew.a())
                        .suggests(($$0x, $$1) -> a((ec)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ec)$$0x.getSource(), ((ec)$$0x.getSource()).h(), ew.a($$0x, "objective"))))
                     .then(
                        ed.a("add")
                           .then(
                              ed.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ec)$$0x.getSource(),
                                          ((ec)$$0x.getSource()).h(),
                                          ew.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ed.a("set")
                        .then(
                           ed.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ec)$$0x.getSource(), ((ec)$$0x.getSource()).h(), ew.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ec $$0, SuggestionsBuilder $$1) {
      eui $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         euj $$4 = $$0.l().aK();

         for (eub $$5 : $$4.c()) {
            if ($$5.c() == eum.c) {
               euf $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return eh.b($$3, $$1);
   }

   private static int a(ec $$0, aqf $$1, eub $$2, int $$3) throws CommandSyntaxException {
      euh $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> ws.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ec $$0, aqf $$1, eub $$2, int $$3) throws CommandSyntaxException {
      euh $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> ws.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ec $$0, aqf $$1, eub $$2) throws CommandSyntaxException {
      euh $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> ws.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static euh a(euj $$0, eui $$1, eub $$2) throws CommandSyntaxException {
      if ($$2.c() != eum.c) {
         throw b.create();
      } else {
         euf $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            euh $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
