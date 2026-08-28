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

public class apr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ej.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("objective", fc.a())
                        .suggests(($$0x, $$1) -> a((ei)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ei)$$0x.getSource(), ((ei)$$0x.getSource()).h(), fc.a($$0x, "objective"))))
                     .then(
                        ej.a("add")
                           .then(
                              ej.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ei)$$0x.getSource(),
                                          ((ei)$$0x.getSource()).h(),
                                          fc.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ej.a("set")
                        .then(
                           ej.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ei)$$0x.getSource(), ((ei)$$0x.getSource()).h(), fc.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ei $$0, SuggestionsBuilder $$1) {
      ffa $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         ffb $$4 = $$0.l().aJ();

         for (fet $$5 : $$4.c()) {
            if ($$5.c() == ffe.c) {
               fex $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return en.b($$3, $$1);
   }

   private static int a(ei $$0, arp $$1, fet $$2, int $$3) throws CommandSyntaxException {
      fez $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> ww.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ei $$0, arp $$1, fet $$2, int $$3) throws CommandSyntaxException {
      fez $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> ww.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ei $$0, arp $$1, fet $$2) throws CommandSyntaxException {
      fez $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> ww.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static fez a(ffb $$0, ffa $$1, fet $$2) throws CommandSyntaxException {
      if ($$2.c() != ffe.c) {
         throw b.create();
      } else {
         fex $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fez $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
