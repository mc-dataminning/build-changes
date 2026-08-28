import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apg {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("say").requires($$0x -> $$0x.c(2))).then(el.a("message", fb.a()).executes($$0x -> {
         fb.a($$0x, "message", $$1 -> {
            ek $$2 = (ek)$$0x.getSource();
            awb $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xc.a(xc.f, $$2));
         });
         return 1;
      })));
   }
}
