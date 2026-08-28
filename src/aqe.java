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

public class aqe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)el.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("objective", fe.a())
                        .suggests(($$0x, $$1) -> a((ek)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).h(), fe.a($$0x, "objective"))))
                     .then(
                        el.a("add")
                           .then(
                              el.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ek)$$0x.getSource(),
                                          ((ek)$$0x.getSource()).h(),
                                          fe.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.a("set")
                        .then(
                           el.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ek)$$0x.getSource(), ((ek)$$0x.getSource()).h(), fe.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ek $$0, SuggestionsBuilder $$1) {
      fhg $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fhh $$4 = $$0.l().aJ();

         for (fgz $$5 : $$4.b()) {
            if ($$5.d() == fhk.d) {
               fhd $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.c());
               }
            }
         }
      }

      return ep.b($$3, $$1);
   }

   private static int a(ek $$0, asc $$1, fgz $$2, int $$3) throws CommandSyntaxException {
      fhf $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xg.a("commands.trigger.add.success", $$2.h(), $$3), true);
      return $$5;
   }

   private static int b(ek $$0, asc $$1, fgz $$2, int $$3) throws CommandSyntaxException {
      fhf $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xg.a("commands.trigger.set.success", $$2.h(), $$3), true);
      return $$3;
   }

   private static int a(ek $$0, asc $$1, fgz $$2) throws CommandSyntaxException {
      fhf $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xg.a("commands.trigger.simple.success", $$2.h()), true);
      return $$4;
   }

   private static fhf a(fhh $$0, fhg $$1, fgz $$2) throws CommandSyntaxException {
      if ($$2.d() != fhk.d) {
         throw b.create();
      } else {
         fhd $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fhf $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
