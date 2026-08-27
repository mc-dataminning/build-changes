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

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)dw.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("objective", ep.a())
                        .suggests(($$0x, $$1) -> a((dv)$$0x.getSource(), $$1))
                        .executes($$0x -> a((dv)$$0x.getSource(), ((dv)$$0x.getSource()).h(), ep.a($$0x, "objective"))))
                     .then(
                        dw.a("add")
                           .then(
                              dw.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (dv)$$0x.getSource(),
                                          ((dv)$$0x.getSource()).h(),
                                          ep.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     dw.a("set")
                        .then(
                           dw.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (dv)$$0x.getSource(), ((dv)$$0x.getSource()).h(), ep.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(dv $$0, SuggestionsBuilder $$1) {
      etm $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         etn $$4 = $$0.l().aK();

         for (etf $$5 : $$4.c()) {
            if ($$5.c() == etq.c) {
               etj $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ea.b($$3, $$1);
   }

   private static int a(dv $$0, apv $$1, etf $$2, int $$3) throws CommandSyntaxException {
      etl $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wi.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(dv $$0, apv $$1, etf $$2, int $$3) throws CommandSyntaxException {
      etl $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wi.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(dv $$0, apv $$1, etf $$2) throws CommandSyntaxException {
      etl $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wi.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static etl a(etn $$0, etm $$1, etf $$2) throws CommandSyntaxException {
      if ($$2.c() != etq.c) {
         throw b.create();
      } else {
         etj $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            etl $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
