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

public class apg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.trigger.failed.invalid"));

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
      fcc $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fcd $$4 = $$0.l().aJ();

         for (fbv $$5 : $$4.c()) {
            if ($$5.c() == fcg.c) {
               fbz $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return fc.b($$3, $$1);
   }

   private static int a(ex $$0, ard $$1, fbv $$2, int $$3) throws CommandSyntaxException {
      fcb $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wo.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ex $$0, ard $$1, fbv $$2, int $$3) throws CommandSyntaxException {
      fcb $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wo.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ex $$0, ard $$1, fbv $$2) throws CommandSyntaxException {
      fcb $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wo.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static fcb a(fcd $$0, fcc $$1, fbv $$2) throws CommandSyntaxException {
      if ($$2.c() != fcg.c) {
         throw b.create();
      } else {
         fbz $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fcb $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
