import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anj {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register((LiteralArgumentBuilder)ex.a("me").then(ex.a("action", fn.a()).executes($$0x -> {
         fn.a($$0x, "action", $$1 -> {
            ew $$2 = (ew)$$0x.getSource();
            avo $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xe.a(xe.k, $$2));
         });
         return 1;
      })));
   }
}
