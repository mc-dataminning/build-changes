import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((eh)$$0x.getSource()).a(() -> xe.c("commands.stop.stopping"), true);
         ((eh)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
