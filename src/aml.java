import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aml {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register((LiteralArgumentBuilder)ef.a("me").then(ef.a("action", ev.a()).executes($$0x -> {
         ev.a($$0x, "action", $$1 -> {
            ee $$2 = (ee)$$0x.getSource();
            auj $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wt.a(wt.i, $$2));
         });
         return 1;
      })));
   }
}
