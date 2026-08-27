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

public class ajc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)du.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("objective", el.a())
                        .suggests(($$0x, $$1) -> a((dt)$$0x.getSource(), $$1))
                        .executes($$0x -> a((dt)$$0x.getSource(), a(((dt)$$0x.getSource()).h(), el.a($$0x, "objective")))))
                     .then(
                        du.a("add")
                           .then(
                              du.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (dt)$$0x.getSource(),
                                          a(((dt)$$0x.getSource()).h(), el.a($$0x, "objective")),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     du.a("set")
                        .then(
                           du.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (dt)$$0x.getSource(),
                                       a(((dt)$$0x.getSource()).h(), el.a($$0x, "objective")),
                                       IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(dt $$0, SuggestionsBuilder $$1) {
      bis $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eio $$4 = $$0.l().aF();
         String $$5 = $$2.cx();

         for (eil $$6 : $$4.c()) {
            if ($$6.c() == eir.b && $$4.b($$5, $$6)) {
               ein $$7 = $$4.c($$5, $$6);
               if (!$$7.g()) {
                  $$3.add($$6.b());
               }
            }
         }
      }

      return dw.b($$3, $$1);
   }

   private static int a(dt $$0, ein $$1, int $$2) {
      $$1.a($$2);
      $$0.a(() -> tn.a("commands.trigger.add.success", $$1.d().e(), $$2), true);
      return $$1.b();
   }

   private static int b(dt $$0, ein $$1, int $$2) {
      $$1.b($$2);
      $$0.a(() -> tn.a("commands.trigger.set.success", $$1.d().e(), $$2), true);
      return $$2;
   }

   private static int a(dt $$0, ein $$1) {
      $$1.a(1);
      $$0.a(() -> tn.a("commands.trigger.simple.success", $$1.d().e()), true);
      return $$1.b();
   }

   private static ein a(akt $$0, eil $$1) throws CommandSyntaxException {
      if ($$1.c() != eir.b) {
         throw b.create();
      } else {
         eio $$2 = $$0.gg();
         String $$3 = $$0.cx();
         if (!$$2.b($$3, $$1)) {
            throw a.create();
         } else {
            ein $$4 = $$2.c($$3, $$1);
            if ($$4.g()) {
               throw a.create();
            } else {
               $$4.a(true);
               return $$4;
            }
         }
      }
   }
}
