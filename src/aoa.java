import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoa {
   public static void a(CommandDispatcher<ee> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ee)$$0x.getSource()).e().C();
         wx $$2 = xa.a(String.valueOf($$1x));
         ((ee)$$0x.getSource()).a(() -> wx.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
