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

public class akk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)dv.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("objective", en.a())
                        .suggests(($$0x, $$1) -> a((du)$$0x.getSource(), $$1))
                        .executes($$0x -> a((du)$$0x.getSource(), a(((du)$$0x.getSource()).i(), en.a($$0x, "objective")))))
                     .then(
                        dv.a("add")
                           .then(
                              dv.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (du)$$0x.getSource(),
                                          a(((du)$$0x.getSource()).i(), en.a($$0x, "objective")),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     dv.a("set")
                        .then(
                           dv.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (du)$$0x.getSource(),
                                       a(((du)$$0x.getSource()).i(), en.a($$0x, "objective")),
                                       IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(du $$0, SuggestionsBuilder $$1) {
      bki $$2 = $$0.g();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         ekh $$4 = $$0.m().aF();
         String $$5 = $$2.cx();

         for (eke $$6 : $$4.c()) {
            if ($$6.c() == ekk.b && $$4.b($$5, $$6)) {
               ekg $$7 = $$4.c($$5, $$6);
               if (!$$7.g()) {
                  $$3.add($$6.b());
               }
            }
         }
      }

      return dy.b($$3, $$1);
   }

   private static int a(du $$0, ekg $$1, int $$2) {
      $$1.a($$2);
      $$0.a(() -> ur.a("commands.trigger.add.success", $$1.d().e(), $$2), true);
      return $$1.b();
   }

   private static int b(du $$0, ekg $$1, int $$2) {
      $$1.b($$2);
      $$0.a(() -> ur.a("commands.trigger.set.success", $$1.d().e(), $$2), true);
      return $$2;
   }

   private static int a(du $$0, ekg $$1) {
      $$1.a(1);
      $$0.a(() -> ur.a("commands.trigger.simple.success", $$1.d().e()), true);
      return $$1.b();
   }

   private static ekg a(amb $$0, eke $$1) throws CommandSyntaxException {
      if ($$1.c() != ekk.b) {
         throw b.create();
      } else {
         ekh $$2 = $$0.gh();
         String $$3 = $$0.cx();
         if (!$$2.b($$3, $$1)) {
            throw a.create();
         } else {
            ekg $$4 = $$2.c($$3, $$1);
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
