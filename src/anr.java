import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anr {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((dv)$$0x.getSource()).a(() -> wi.c("commands.stop.stopping"), true);
         ((dv)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
