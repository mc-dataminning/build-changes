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

public class apv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ex.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("objective", fq.a())
                        .suggests(($$0x, $$1) -> a((ew)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h(), fq.a($$0x, "objective"))))
                     .then(
                        ex.a("add")
                           .then(
                              ex.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ew)$$0x.getSource(),
                                          ((ew)$$0x.getSource()).h(),
                                          fq.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ex.a("set")
                        .then(
                           ex.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ew)$$0x.getSource(), ((ew)$$0x.getSource()).h(), fq.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ew $$0, SuggestionsBuilder $$1) {
      fav $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         faw $$4 = $$0.l().aJ();

         for (fao $$5 : $$4.c()) {
            if ($$5.c() == faz.c) {
               fas $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return fb.b($$3, $$1);
   }

   private static int a(ew $$0, arr $$1, fao $$2, int $$3) throws CommandSyntaxException {
      fau $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xl.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ew $$0, arr $$1, fao $$2, int $$3) throws CommandSyntaxException {
      fau $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xl.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ew $$0, arr $$1, fao $$2) throws CommandSyntaxException {
      fau $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xl.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static fau a(faw $$0, fav $$1, fao $$2) throws CommandSyntaxException {
      if ($$2.c() != faz.c) {
         throw b.create();
      } else {
         fas $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fau $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
