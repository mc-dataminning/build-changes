import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aol {
   public static void a(CommandDispatcher<ex> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ex)$$0x.getSource()).e().E();
         wo $$2 = wr.a(String.valueOf($$1x));
         ((ex)$$0x.getSource()).a(() -> wo.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
