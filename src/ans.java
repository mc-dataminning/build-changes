import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ans {
   public static void a(CommandDispatcher<ec> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ec)$$0x.getSource()).e().C();
         ws $$2 = wv.a(String.valueOf($$1x));
         ((ec)$$0x.getSource()).a(() -> ws.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
