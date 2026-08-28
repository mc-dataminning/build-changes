import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anl {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)el.a("me").then(el.a("action", fb.a()).executes($$0x -> {
         fb.a($$0x, "action", $$1 -> {
            ek $$2 = (ek)$$0x.getSource();
            avu $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wy.a(wy.k, $$2));
         });
         return 1;
      })));
   }
}
