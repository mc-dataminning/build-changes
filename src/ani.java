import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ani {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register((LiteralArgumentBuilder)ew.a("me").then(ew.a("action", fm.a()).executes($$0x -> {
         fm.a($$0x, "action", $$1 -> {
            ev $$2 = (ev)$$0x.getSource();
            avn $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xd.a(xd.k, $$2));
         });
         return 1;
      })));
   }
}
