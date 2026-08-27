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

public class apc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ei.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("objective", fb.a())
                        .suggests(($$0x, $$1) -> a((eh)$$0x.getSource(), $$1))
                        .executes($$0x -> a((eh)$$0x.getSource(), ((eh)$$0x.getSource()).h(), fb.a($$0x, "objective"))))
                     .then(
                        ei.a("add")
                           .then(
                              ei.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eh)$$0x.getSource(),
                                          ((eh)$$0x.getSource()).h(),
                                          fb.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ei.a("set")
                        .then(
                           ei.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (eh)$$0x.getSource(), ((eh)$$0x.getSource()).h(), fb.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(eh $$0, SuggestionsBuilder $$1) {
      exx $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         exy $$4 = $$0.l().aK();

         for (exq $$5 : $$4.c()) {
            if ($$5.c() == eyb.c) {
               exu $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return em.b($$3, $$1);
   }

   private static int a(eh $$0, aqu $$1, exq $$2, int $$3) throws CommandSyntaxException {
      exw $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xe.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(eh $$0, aqu $$1, exq $$2, int $$3) throws CommandSyntaxException {
      exw $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xe.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(eh $$0, aqu $$1, exq $$2) throws CommandSyntaxException {
      exw $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xe.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static exw a(exy $$0, exx $$1, exq $$2) throws CommandSyntaxException {
      if ($$2.c() != eyb.c) {
         throw b.create();
      } else {
         exu $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            exw $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
