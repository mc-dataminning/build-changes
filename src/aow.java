import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aow {
   public static void a(CommandDispatcher<ev> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ev)$$0x.getSource()).e().C();
         xh $$2 = xk.a(String.valueOf($$1x));
         ((ev)$$0x.getSource()).a(() -> xh.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
