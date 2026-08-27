import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ago {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register((LiteralArgumentBuilder)ds.a("me").then(ds.a("action", eg.a()).executes($$0x -> {
         eg.a($$0x, "action", $$1 -> {
            dr $$2 = (dr)$$0x.getSource();
            anz $$3 = $$2.l().ac();
            $$3.a($$1, $$2, tb.a(tb.i, $$2));
         });
         return 1;
      })));
   }
}
