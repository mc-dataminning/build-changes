import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aid {
   public static void a(CommandDispatcher<dr> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((dr)$$0x.getSource()).e().A();
         tf $$2 = th.a(String.valueOf($$1x));
         ((dr)$$0x.getSource()).a(() -> tf.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
