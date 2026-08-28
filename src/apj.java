import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apj {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ej)$$0x.getSource()).a(() -> xa.c("commands.stop.stopping"), true);
         ((ej)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
