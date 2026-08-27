import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aik {
   public static void a(CommandDispatcher<dt> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((dt)$$0x.getSource()).e().A();
         tn $$2 = tp.a(String.valueOf($$1x));
         ((dt)$$0x.getSource()).a(() -> tn.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
