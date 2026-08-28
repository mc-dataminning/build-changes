import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aps {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ek)$$0x.getSource()).a(() -> xg.c("commands.stop.stopping"), true);
         ((ek)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
