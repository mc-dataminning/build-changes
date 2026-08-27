import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akh {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((du)$$0x.getSource()).a(() -> uv.c("commands.stop.stopping"), true);
         ((du)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
