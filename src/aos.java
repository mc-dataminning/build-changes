import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aos {
   public static void a(CommandDispatcher<ep> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ep)$$0x.getSource()).e().C();
         xo $$2 = xr.a(String.valueOf($$1x));
         ((ep)$$0x.getSource()).a(() -> xo.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
