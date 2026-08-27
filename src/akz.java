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

public class akz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)dt.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("objective", el.a())
                        .suggests(($$0x, $$1) -> a((ds)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ds)$$0x.getSource(), a(((ds)$$0x.getSource()).h(), el.a($$0x, "objective")))))
                     .then(
                        dt.a("add")
                           .then(
                              dt.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ds)$$0x.getSource(),
                                          a(((ds)$$0x.getSource()).h(), el.a($$0x, "objective")),
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
                                       (ds)$$0x.getSource(),
                                       a(((ds)$$0x.getSource()).h(), el.a($$0x, "objective")),
                                       IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ds $$0, SuggestionsBuilder $$1) {
      blf $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         ema $$4 = $$0.l().aH();
         String $$5 = $$2.cy();

         for (elx $$6 : $$4.c()) {
            if ($$6.c() == emd.b && $$4.b($$5, $$6)) {
               elz $$7 = $$4.c($$5, $$6);
               if (!$$7.g()) {
                  $$3.add($$6.b());
               }
            }
         }
      }

      return dw.b($$3, $$1);
   }

   private static int a(ds $$0, elz $$1, int $$2) {
      $$1.a($$2);
      $$0.a(() -> vb.a("commands.trigger.add.success", $$1.d().e(), $$2), true);
      return $$1.b();
   }

   private static int b(ds $$0, elz $$1, int $$2) {
      $$1.b($$2);
      $$0.a(() -> vb.a("commands.trigger.set.success", $$1.d().e(), $$2), true);
      return $$2;
   }

   private static int a(ds $$0, elz $$1) {
      $$1.a(1);
      $$0.a(() -> vb.a("commands.trigger.simple.success", $$1.d().e()), true);
      return $$1.b();
   }

   private static elz a(amq $$0, elx $$1) throws CommandSyntaxException {
      if ($$1.c() != emd.b) {
         throw b.create();
      } else {
         ema $$2 = $$0.gh();
         String $$3 = $$0.cy();
         if (!$$2.b($$3, $$1)) {
            throw a.create();
         } else {
            elz $$4 = $$2.c($$3, $$1);
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
