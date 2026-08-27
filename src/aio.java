import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aio {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((dt)$$0x.getSource()).a(() -> ti.c("commands.stop.stopping"), true);
         ((dt)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
