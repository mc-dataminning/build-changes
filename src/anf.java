import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anf {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("say").requires($$0x -> $$0x.c(2))).then(dw.a("message", em.a()).executes($$0x -> {
         em.a($$0x, "message", $$1 -> {
            dv $$2 = (dv)$$0x.getSource();
            atr $$3 = $$2.l().ah();
            $$3.a($$1, $$2, we.a(we.d, $$2));
         });
         return 1;
      })));
   }
}
