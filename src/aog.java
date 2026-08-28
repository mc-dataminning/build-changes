import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aog {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((eq)$$0x.getSource()).a(() -> wu.c("commands.stop.stopping"), true);
         ((eq)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
