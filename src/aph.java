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

public class aph {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ey.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("objective", fr.a())
                        .suggests(($$0x, $$1) -> a((ex)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).h(), fr.a($$0x, "objective"))))
                     .then(
                        ey.a("add")
                           .then(
                              ey.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ex)$$0x.getSource(),
                                          ((ex)$$0x.getSource()).h(),
                                          fr.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("set")
                        .then(
                           ey.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ex)$$0x.getSource(), ((ex)$$0x.getSource()).h(), fr.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ex $$0, SuggestionsBuilder $$1) {
      fce $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fcf $$4 = $$0.l().aJ();

         for (fbx $$5 : $$4.c()) {
            if ($$5.c() == fci.c) {
               fcb $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return fc.b($$3, $$1);
   }

   private static int a(ex $$0, are $$1, fbx $$2, int $$3) throws CommandSyntaxException {
      fcd $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wp.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ex $$0, are $$1, fbx $$2, int $$3) throws CommandSyntaxException {
      fcd $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wp.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ex $$0, are $$1, fbx $$2) throws CommandSyntaxException {
      fcd $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wp.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static fcd a(fcf $$0, fce $$1, fbx $$2) throws CommandSyntaxException {
      if ($$2.c() != fci.c) {
         throw b.create();
      } else {
         fcb $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fcd $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
