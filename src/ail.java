import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ail {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((dr)$$0x.getSource()).a(() -> tf.c("commands.stop.stopping"), true);
         ((dr)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
