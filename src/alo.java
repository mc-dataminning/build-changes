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

public class alo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)dt.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("objective", em.a())
                        .suggests(($$0x, $$1) -> a((ds)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h(), em.a($$0x, "objective"))))
                     .then(
                        dt.a("add")
                           .then(
                              dt.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ds)$$0x.getSource(),
                                          ((ds)$$0x.getSource()).h(),
                                          em.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     dt.a("set")
                        .then(
                           dt.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ds)$$0x.getSource(), ((ds)$$0x.getSource()).h(), em.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ds $$0, SuggestionsBuilder $$1) {
      enf $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eng $$4 = $$0.l().aH();

         for (emy $$5 : $$4.c()) {
            if ($$5.c() == enj.b) {
               enc $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return dx.b($$3, $$1);
   }

   private static int a(ds $$0, anf $$1, emy $$2, int $$3) throws CommandSyntaxException {
      ene $$4 = a($$0.l().aH(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> vg.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ds $$0, anf $$1, emy $$2, int $$3) throws CommandSyntaxException {
      ene $$4 = a($$0.l().aH(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> vg.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ds $$0, anf $$1, emy $$2) throws CommandSyntaxException {
      ene $$3 = a($$0.l().aH(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> vg.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static ene a(eng $$0, enf $$1, emy $$2) throws CommandSyntaxException {
      if ($$2.c() != enj.b) {
         throw b.create();
      } else {
         enc $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            ene $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
