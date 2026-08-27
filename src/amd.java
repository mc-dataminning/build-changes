import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amd {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register((LiteralArgumentBuilder)ed.a("me").then(ed.a("action", et.a()).executes($$0x -> {
         et.a($$0x, "action", $$1 -> {
            ec $$2 = (ec)$$0x.getSource();
            aub $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wo.a(wo.i, $$2));
         });
         return 1;
      })));
   }
}
