import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aou {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(eu.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(et $$0, int $$1) {
      $$0.l().c($$1);
      if ($$1 > 0) {
         $$0.a(() -> xd.a("commands.setidletimeout.success", $$1), true);
      } else {
         $$0.a(() -> xd.c("commands.setidletimeout.success.disabled"), true);
      }

      return $$1;
   }
}
