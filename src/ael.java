import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ael {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)dt.a("me").then(dt.a("action", eg.a()).executes($$0x -> {
         eg.a($$0x, "action", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            alk $$3 = $$2.l().ac();
            $$3.a($$1, $$2, ss.a(ss.i, $$2));
         });
         return 1;
      })));
   }
}
