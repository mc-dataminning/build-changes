import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class aox {
   public static <T extends ey<T>> void a(CommandDispatcher<T> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("return")
                     .requires($$0x -> $$0x.c(2)))
                  .then(RequiredArgumentBuilder.argument("value", IntegerArgumentType.integer()).executes(new aox.c())))
               .then(LiteralArgumentBuilder.literal("fail").executes(new aox.a())))
            .then(LiteralArgumentBuilder.literal("run").forward($$0.getRoot(), new aox.b(), false))
      );
   }

   static class a<T extends ey<T>> implements ht.a<T> {
      public void a(T $$0, ContextChain<T> $$1, hr $$2, hx<T> $$3) {
         $$0.p().onFailure();
         hy $$4 = $$3.b();
         $$4.a();
         $$4.b();
      }
   }

   static class b<T extends ey<T>> implements hu.a<T> {
      public void a(T $$0, List<T> $$1, ContextChain<T> $$2, hr $$3, hx<T> $$4) {
         if ($$1.isEmpty()) {
            if ($$3.c()) {
               $$4.a(ih.a());
            }
         } else {
            $$4.b().b();
            ContextChain<T> $$5 = $$2.nextStage();
            String $$6 = $$5.getTopContext().getInput();
            $$4.a(new ic.a<>($$6, $$5, $$3.d(), $$0, $$1));
         }
      }
   }

   static class c<T extends ey<T>> implements ht.a<T> {
      public void a(T $$0, ContextChain<T> $$1, hr $$2, hx<T> $$3) {
         int $$4 = IntegerArgumentType.getInteger($$1.getTopContext(), "value");
         $$0.p().onSuccess($$4);
         hy $$5 = $$3.b();
         $$5.a($$4);
         $$5.b();
      }
   }
}
