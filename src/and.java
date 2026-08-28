import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class and {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)eu.a("me").then(eu.a("action", fk.a()).executes($$0x -> {
         fk.a($$0x, "action", $$1 -> {
            et $$2 = (et)$$0x.getSource();
            avh $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wz.a(wz.k, $$2));
         });
         return 1;
      })));
   }
}
