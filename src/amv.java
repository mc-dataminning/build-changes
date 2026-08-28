import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amv {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register((LiteralArgumentBuilder)ey.a("me").then(ey.a("action", fo.a()).executes($$0x -> {
         fo.a($$0x, "action", $$1 -> {
            ex $$2 = (ex)$$0x.getSource();
            avd $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wl.a(wl.k, $$2));
         });
         return 1;
      })));
   }
}
