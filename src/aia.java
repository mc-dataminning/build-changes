import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aia {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("return").requires($$0x -> $$0x.c(2)))
            .then(du.a("value", IntegerArgumentType.integer()).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "value"))))
      );
   }

   private static int a(dt $$0, int $$1) {
      $$0.p().accept($$1);
      return $$1;
   }
}
