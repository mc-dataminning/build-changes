import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aop {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(ey.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ex $$0, int $$1) {
      $$0.l().c($$1);
      if ($$1 > 0) {
         $$0.a(() -> wp.a("commands.setidletimeout.success", $$1), true);
      } else {
         $$0.a(() -> wp.c("commands.setidletimeout.success.disabled"), true);
      }

      return $$1;
   }
}
