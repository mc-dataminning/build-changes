import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoy {
   public static void a(CommandDispatcher<ei> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ei)$$0x.getSource()).e().E();
         wy $$2 = xb.a(String.valueOf($$1x));
         ((ei)$$0x.getSource()).a(() -> wy.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
