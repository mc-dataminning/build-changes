import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ans {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("say").requires($$0x -> $$0x.c(2))).then(ee.a("message", eu.a()).executes($$0x -> {
         eu.a($$0x, "message", $$1 -> {
            ed $$2 = (ed)$$0x.getSource();
            aue $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wq.a(wq.d, $$2));
         });
         return 1;
      })));
   }
}
