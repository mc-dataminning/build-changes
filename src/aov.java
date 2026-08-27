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

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.trigger.failed.invalid"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)ef.a("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("objective", ey.a())
                        .suggests(($$0x, $$1) -> a((ee)$$0x.getSource(), $$1))
                        .executes($$0x -> a((ee)$$0x.getSource(), ((ee)$$0x.getSource()).h(), ey.a($$0x, "objective"))))
                     .then(
                        ef.a("add")
                           .then(
                              ef.a("value", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ee)$$0x.getSource(),
                                          ((ee)$$0x.getSource()).h(),
                                          ey.a($$0x, "objective"),
                                          IntegerArgumentType.getInteger($$0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     ef.a("set")
                        .then(
                           ef.a("value", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> b(
                                       (ee)$$0x.getSource(), ((ee)$$0x.getSource()).h(), ey.a($$0x, "objective"), IntegerArgumentType.getInteger($$0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> a(ee $$0, SuggestionsBuilder $$1) {
      evn $$2 = $$0.f();
      List<String> $$3 = Lists.newArrayList();
      if ($$2 != null) {
         evo $$4 = $$0.l().aK();

         for (evg $$5 : $$4.c()) {
            if ($$5.c() == evr.c) {
               evk $$6 = $$4.d($$2, $$5);
               if ($$6 != null && !$$6.b()) {
                  $$3.add($$5.b());
               }
            }
         }
      }

      return ej.b($$3, $$1);
   }

   private static int a(ee $$0, aqn $$1, evg $$2, int $$3) throws CommandSyntaxException {
      evm $$4 = a($$0.l().aK(), $$1, $$2);
      int $$5 = $$4.b($$3);
      $$0.a(() -> wx.a("commands.trigger.add.success", $$2.g(), $$3), true);
      return $$5;
   }

   private static int b(ee $$0, aqn $$1, evg $$2, int $$3) throws CommandSyntaxException {
      evm $$4 = a($$0.l().aK(), $$1, $$2);
      $$4.a($$3);
      $$0.a(() -> wx.a("commands.trigger.set.success", $$2.g(), $$3), true);
      return $$3;
   }

   private static int a(ee $$0, aqn $$1, evg $$2) throws CommandSyntaxException {
      evm $$3 = a($$0.l().aK(), $$1, $$2);
      int $$4 = $$3.b(1);
      $$0.a(() -> wx.a("commands.trigger.simple.success", $$2.g()), true);
      return $$4;
   }

   private static evm a(evo $$0, evn $$1, evg $$2) throws CommandSyntaxException {
      if ($$2.c() != evr.c) {
         throw b.create();
      } else {
         evk $$3 = $$0.d($$1, $$2);
         if ($$3 != null && !$$3.b()) {
            evm $$4 = $$0.c($$1, $$2);
            $$4.f();
            return $$4;
         } else {
            throw a.create();
         }
      }
   }
}
