import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ani {
   public static void a(CommandDispatcher<dv> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((dv)$$0x.getSource()).e().C();
         wi $$2 = wl.a(String.valueOf($$1x));
         ((dv)$$0x.getSource()).a(() -> wi.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
