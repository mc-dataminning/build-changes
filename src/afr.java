import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class afr {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("return").requires($$0x -> $$0x.c(2)))
            .then(dt.a("value", IntegerArgumentType.integer()).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "value"))))
      );
   }

   private static int a(ds $$0, int $$1) {
      $$0.p().accept($$1);
      return $$1;
   }
}
