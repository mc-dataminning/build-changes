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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ew.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("objective", fp.a())
                        .suggests(($$0x, $$1) -> a((ev)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ev)$$0x.getSource(), ((ev)$$0x.getSource()).h(), fp.a($$0x, "objective"))))
                     .then(
                        ew.a("add")
                           .then(
                              ew.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ev)$$0x.getSource(),
                                          ((ev)$$0x.getSource()).h(),
                                          fp.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ew.a("set")
                        .then(
                           ew.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ev)$$0x.getSource(), ((ev)$$0x.getSource()).h(), fp.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ev $$0, SuggestionsBuilder $$1) {
      fal $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         fam $$4 = $$0.l().aJ();

         for (fae $$5 : $$4.c()) {
            if ($$5.c() == fap.c) {
               fai $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return fa.b($$3, $$1);
   }

   private static int a(ev $$0, arn $$1, fae $$2, int $$3) throws CommandSyntaxException {
      fak $$4 = a($$0.l().aJ(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> xh.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ev $$0, arn $$1, fae $$2, int $$3) throws CommandSyntaxException {
      fak $$4 = a($$0.l().aJ(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> xh.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ev $$0, arn $$1, fae $$2) throws CommandSyntaxException {
      fak $$3 = a($$0.l().aJ(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> xh.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static fak a(fam $$0, fal $$1, fae $$2) throws CommandSyntaxException {
      if ($$2.c() != fap.c) {
         throw b.create();
      } else {
         fai $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            fak $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
