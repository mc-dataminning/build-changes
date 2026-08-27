import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aob {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ec)$$0x.getSource()).a(() -> ws.c("commands.stop.stopping"), true);
         ((ec)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
