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

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)dv.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("objective", eo.a())
                        .suggests(($$0x, $$1) -> a((du)$$0x.getSource(), $$1))
                        .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h(), eo.a($$0x, "objective"))))
                     .then(
                        dv.a("add")
                           .then(
                              dv.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (du)$$0x.getSource(),
                                          ((du)$$0x.getSource()).h(),
                                          eo.a($$0x, "objective"),
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
                                       (du)$$0x.getSource(), ((du)$$0x.getSource()).h(), eo.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(du $$0, SuggestionsBuilder $$1) {
      eov $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         eow $$4 = $$0.l().aH();

         for (eoo $$5 : $$4.c()) {
            if ($$5.c() == eoz.c) {
               eos $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return dz.b($$3, $$1);
   }

   private static int a(du $$0, aow $$1, eoo $$2, int $$3) throws CommandSyntaxException {
      eou $$4 = a($$0.l().aH(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> vq.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(du $$0, aow $$1, eoo $$2, int $$3) throws CommandSyntaxException {
      eou $$4 = a($$0.l().aH(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> vq.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(du $$0, aow $$1, eoo $$2) throws CommandSyntaxException {
      eou $$3 = a($$0.l().aH(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> vq.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static eou a(eow $$0, eov $$1, eoo $$2) throws CommandSyntaxException {
      if ($$2.c() != eoz.c) {
         throw b.create();
      } else {
         eos $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            eou $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
