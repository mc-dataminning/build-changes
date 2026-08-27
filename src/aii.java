import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aii {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(du.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(dt $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> ti.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
