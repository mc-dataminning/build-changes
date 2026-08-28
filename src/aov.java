import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aov {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ex)$$0x.getSource()).a(() -> wp.c("commands.stop.stopping"), true);
         ((ex)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
