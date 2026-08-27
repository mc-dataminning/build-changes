import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amg {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register((LiteralArgumentBuilder)ee.a("me").then(ee.a("action", eu.a()).executes($$0x -> {
         eu.a($$0x, "action", $$1 -> {
            ed $$2 = (ed)$$0x.getSource();
            aue $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wq.a(wq.i, $$2));
         });
         return 1;
      })));
   }
}
