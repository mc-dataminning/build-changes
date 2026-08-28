import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anj {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register((LiteralArgumentBuilder)ek.a("me").then(ek.a("action", fa.a()).executes($$0x -> {
         fa.a($$0x, "action", $$1 -> {
            ej $$2 = (ej)$$0x.getSource();
            avs $$3 = $$2.l().ag();
            $$3.a($$1, $$2, ww.a(ww.k, $$2));
         });
         return 1;
      })));
   }
}
