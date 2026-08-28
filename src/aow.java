import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aow {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(eq.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ep $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> xp.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
