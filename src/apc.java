import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apc {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((eu)$$0x.getSource()).a(() -> xe.c("commands.stop.stopping"), true);
         ((eu)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
