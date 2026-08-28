import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ans {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)el.a("me").then(el.a("action", fb.a()).executes($$0x -> {
         fb.a($$0x, "action", $$1 -> {
            ek $$2 = (ek)$$0x.getSource();
            awb $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xc.a(xc.k, $$2));
         });
         return 1;
      })));
   }
}
