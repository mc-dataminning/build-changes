import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ams {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register((LiteralArgumentBuilder)ei.a("me").then(ei.a("action", ey.a()).executes($$0x -> {
         ey.a($$0x, "action", $$1 -> {
            eh $$2 = (eh)$$0x.getSource();
            auq $$3 = $$2.l().ah();
            $$3.a($$1, $$2, xa.a(xa.i, $$2));
         });
         return 1;
      })));
   }
}
