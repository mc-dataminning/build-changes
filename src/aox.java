import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aox {
   public static void a(CommandDispatcher<ew> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ew)$$0x.getSource()).e().C();
         xi $$2 = xl.a(String.valueOf($$1x));
         ((ew)$$0x.getSource()).a(() -> xi.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
