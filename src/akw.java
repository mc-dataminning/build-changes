import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akw {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)dv.a("me").then(dv.a("action", el.a()).executes($$0x -> {
         el.a($$0x, "action", $$1 -> {
            du $$2 = (du)$$0x.getSource();
            asn $$3 = $$2.l().ae();
            $$3.a($$1, $$2, vm.a(vm.i, $$2));
         });
         return 1;
      })));
   }
}
