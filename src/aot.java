import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aot {
   public static void a(CommandDispatcher<eu> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((eu)$$0x.getSource()).e().C();
         xe $$2 = xh.a(String.valueOf($$1x));
         ((eu)$$0x.getSource()).a(() -> xe.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
