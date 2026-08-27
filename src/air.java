import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class air {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)dt.a("me").then(dt.a("action", ei.a()).executes($$0x -> {
         ei.a($$0x, "action", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            aqf $$3 = $$2.l().ae();
            $$3.a($$1, $$2, ux.a(ux.i, $$2));
         });
         return 1;
      })));
   }
}
