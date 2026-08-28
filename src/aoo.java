import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoo {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((et)$$0x.getSource()).a(() -> wz.c("commands.stop.stopping"), true);
         ((et)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
