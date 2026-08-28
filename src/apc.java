import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apc {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ep)$$0x.getSource()).a(() -> xp.c("commands.stop.stopping"), true);
         ((ep)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
