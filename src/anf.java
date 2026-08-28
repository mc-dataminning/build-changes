import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anf {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register((LiteralArgumentBuilder)ev.a("me").then(ev.a("action", fl.a()).executes($$0x -> {
         fl.a($$0x, "action", $$1 -> {
            eu $$2 = (eu)$$0x.getSource();
            avj $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xa.a(xa.k, $$2));
         });
         return 1;
      })));
   }
}
