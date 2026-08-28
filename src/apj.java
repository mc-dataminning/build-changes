import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apj {
   public static void a(CommandDispatcher<ek> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ek)$$0x.getSource()).e().E();
         xg $$2 = xj.a(String.valueOf($$1x));
         ((ek)$$0x.getSource()).a(() -> xg.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
