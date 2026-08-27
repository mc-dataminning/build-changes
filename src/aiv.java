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

public class aiv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ds.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("objective", ej.a())
                        .suggests(($$0x, $$1) -> a((dr)$$0x.getSource(), $$1))
                        .executes($$0x -> a((dr)$$0x.getSource(), a(((dr)$$0x.getSource()).h(), ej.a($$0x, "objective")))))
                     .then(
                        ds.a("add")
                           .then(
                              ds.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (dr)$$0x.getSource(),
                                          a(((dr)$$0x.getSource()).h(), ej.a($$0x, "objective")),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ds.a("set")
                        .then(
                           ds.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (dr)$$0x.getSource(),
                                       a(((dr)$$0x.getSource()).h(), ej.a($$0x, "objective")),
                                       IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(dr $$0, SuggestionsBuilder $$1) {
      bii $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eid $$4 = $$0.l().aF();
         String $$5 = $$2.cx();

         for (eia $$6 : $$4.c()) {
            if ($$6.c() == eig.b && $$4.b($$5, $$6)) {
               eic $$7 = $$4.c($$5, $$6);
               if (!$$7.g()) {
                  $$3.add($$6.b());
               }
            }
         }
      }

      return du.b($$3, $$1);
   }

   private static int a(dr $$0, eic $$1, int $$2) {
      $$1.a($$2);
      $$0.a(() -> tf.a("commands.trigger.add.success", $$1.d().e(), $$2), true);
      return $$1.b();
   }

   private static int b(dr $$0, eic $$1, int $$2) {
      $$1.b($$2);
      $$0.a(() -> tf.a("commands.trigger.set.success", $$1.d().e(), $$2), true);
      return $$2;
   }

   private static int a(dr $$0, eic $$1) {
      $$1.a(1);
      $$0.a(() -> tf.a("commands.trigger.simple.success", $$1.d().e()), true);
      return $$1.b();
   }

   private static eic a(akl $$0, eia $$1) throws CommandSyntaxException {
      if ($$1.c() != eig.b) {
         throw b.create();
      } else {
         eid $$2 = $$0.gf();
         String $$3 = $$0.cx();
         if (!$$2.b($$3, $$1)) {
            throw a.create();
         } else {
            eic $$4 = $$2.c($$3, $$1);
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
