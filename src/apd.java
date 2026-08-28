import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apd {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("say").requires($$0x -> $$0x.c(2))).then(ex.a("message", fn.a()).executes($$0x -> {
         fn.a($$0x, "message", $$1 -> {
            ew $$2 = (ew)$$0x.getSource();
            avy $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xg.a(xg.f, $$2));
         });
         return 1;
      })));
   }
}
