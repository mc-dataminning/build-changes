import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amr {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)eu.a("me").then(eu.a("action", fk.a()).executes($$0x -> {
         fk.a($$0x, "action", $$1 -> {
            et $$2 = (et)$$0x.getSource();
            aur $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wv.a(wv.k, $$2));
         });
         return 1;
      })));
   }
}
