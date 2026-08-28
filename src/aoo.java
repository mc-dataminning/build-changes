import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class aoo {
   public static <T extends ex<T>> void a(CommandDispatcher<T> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("return")
                     .requires($$0x -> $$0x.c(2)))
                  .then(RequiredArgumentBuilder.argument("value", IntegerArgumentType.integer()).executes(new aoo.c())))
               .then(LiteralArgumentBuilder.literal("fail").executes(new aoo.a())))
            .then(LiteralArgumentBuilder.literal("run").forward($$0.getRoot(), new aoo.b(), false))
      );
   }

   static class a<T extends ex<T>> implements hs.a<T> {
      public void a(T $$0, ContextChain<T> $$1, hq $$2, hw<T> $$3) {
         $$0.p().onFailure();
         hx $$4 = $$3.b();
         $$4.a();
         $$4.b();
      }
   }

   static class b<T extends ex<T>> implements ht.a<T> {
      public void a(T $$0, List<T> $$1, ContextChain<T> $$2, hq $$3, hw<T> $$4) {
         if ($$1.isEmpty()) {
            if ($$3.c()) {
               $$4.a(ig.a());
            }
         } else {
            $$4.b().b();
            ContextChain<T> $$5 = $$2.nextStage();
            String $$6 = $$5.getTopContext().getInput();
            $$4.a(new ib.a<>($$6, $$5, $$3.d(), $$0, $$1));
         }
      }
   }

   static class c<T extends ex<T>> implements hs.a<T> {
      public void a(T $$0, ContextChain<T> $$1, hq $$2, hw<T> $$3) {
         int $$4 = IntegerArgumentType.getInteger($$1.getTopContext(), "value");
         $$0.p().onSuccess($$4);
         hx $$5 = $$3.b();
         $$5.a($$4);
         $$5.b();
      }
   }
}
