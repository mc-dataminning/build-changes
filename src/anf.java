import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anf {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register((LiteralArgumentBuilder)ej.a("me").then(ej.a("action", ez.a()).executes($$0x -> {
         ez.a($$0x, "action", $$1 -> {
            ei $$2 = (ei)$$0x.getSource();
            avo $$3 = $$2.l().ag();
            $$3.a($$1, $$2, ws.a(ws.k, $$2));
         });
         return 1;
      })));
   }
}
