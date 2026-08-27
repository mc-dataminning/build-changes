import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aik {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)dv.a("me").then(dv.a("action", ek.a()).executes($$0x -> {
         ek.a($$0x, "action", $$1 -> {
            du $$2 = (du)$$0x.getSource();
            apy $$3 = $$2.l().ae();
            $$3.a($$1, $$2, ur.a(ur.i, $$2));
         });
         return 1;
      })));
   }
}
