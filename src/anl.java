import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anl {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(dw.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(dv $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> wi.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
