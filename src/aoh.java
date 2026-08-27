import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoh {
   public static void a(CommandDispatcher<eh> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((eh)$$0x.getSource()).e().C();
         xe $$2 = xh.a(String.valueOf($$1x));
         ((eh)$$0x.getSource()).a(() -> xe.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
