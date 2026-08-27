import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ang {
   public static void a(CommandDispatcher<du> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((du)$$0x.getSource()).e().C();
         wg $$2 = wj.a(String.valueOf($$1x));
         ((du)$$0x.getSource()).a(() -> wg.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
