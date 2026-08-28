import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ane {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register((LiteralArgumentBuilder)eq.a("me").then(eq.a("action", fg.a()).executes($$0x -> {
         fg.a($$0x, "action", $$1 -> {
            ep $$2 = (ep)$$0x.getSource();
            avd $$3 = $$2.l().ah();
            $$3.a($$1, $$2, xl.a(xl.i, $$2));
         });
         return 1;
      })));
   }
}
