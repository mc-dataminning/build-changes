import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ala {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)dv.a("me").then(dv.a("action", el.a()).executes($$0x -> {
         el.a($$0x, "action", $$1 -> {
            du $$2 = (du)$$0x.getSource();
            ass $$3 = $$2.l().ah();
            $$3.a($$1, $$2, vo.a(vo.i, $$2));
         });
         return 1;
      })));
   }
}
