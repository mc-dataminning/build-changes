import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class any {
   public static void a(CommandDispatcher<eq> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((eq)$$0x.getSource()).e().C();
         wu $$2 = wx.a(String.valueOf($$1x));
         ((eq)$$0x.getSource()).a(() -> wu.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
