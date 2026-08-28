import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("say").requires($$0x -> $$0x.c(2))).then(eq.a("message", fg.a()).executes($$0x -> {
         fg.a($$0x, "message", $$1 -> {
            ep $$2 = (ep)$$0x.getSource();
            avd $$3 = $$2.l().ah();
            $$3.a($$1, $$2, xl.a(xl.d, $$2));
         });
         return 1;
      })));
   }
}
