import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agm {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)dt.a("me").then(dt.a("action", eh.a()).executes($$0x -> {
         eh.a($$0x, "action", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            anx $$3 = $$2.l().ac();
            $$3.a($$1, $$2, ta.a(ta.i, $$2));
         });
         return 1;
      })));
   }
}
