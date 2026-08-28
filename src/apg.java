import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apg {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ew)$$0x.getSource()).a(() -> xi.c("commands.stop.stopping"), true);
         ((ew)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
