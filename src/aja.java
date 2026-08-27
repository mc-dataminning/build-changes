import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class aja {
   public static <T extends dw<T>> void a(CommandDispatcher<T> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("return").requires($$0x -> $$0x.c(2)))
               .then(RequiredArgumentBuilder.argument("value", IntegerArgumentType.integer()).executes(new aja.b())))
            .then(LiteralArgumentBuilder.literal("run").forward($$0.getRoot(), new aja.a(), false))
      );
   }

   static class a<T extends dw<T>> implements gl.a<T> {
      @Override
      public void a(List<T> $$0, ContextChain<T> $$1, boolean $$2, go<T> $$3) {
         if (!$$0.isEmpty()) {
            ContextChain<T> $$4 = $$1.nextStage();
            String $$5 = $$4.getTopContext().getInput();
            List<T> $$6 = $$0.stream().map($$1x -> $$1x.b(($$1xx, $$2x, $$3x) -> {
                  $$3.a();
                  $$1xx.d($$3x);
               })).toList();
            $$3.a(new gs.a<>($$5, $$4, $$2, $$6));
         }
      }
   }

   static class b<T extends dw<T>> implements gk.a<T> {
      public void a(T $$0, ContextChain<T> $$1, boolean $$2, go<T> $$3) {
         $$3.a();
         int $$4 = IntegerArgumentType.getInteger($$1.getTopContext(), "value");
         $$0.d($$4);
      }
   }
}
