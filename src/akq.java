import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akq {
   public static void a(CommandDispatcher<ds> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("seed").requires($$1x -> !$$1 || $$1x.c(2))).executes($$0x -> {
         long $$1x = ((ds)$$0x.getSource()).e().C();
         vd $$2 = vg.a(String.valueOf($$1x));
         ((ds)$$0x.getSource()).a(() -> vd.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
