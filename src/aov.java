import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aov {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("say").requires($$0x -> $$0x.c(2))).then(ek.a("message", fa.a()).executes($$0x -> {
         fa.a($$0x, "message", $$1 -> {
            ej $$2 = (ej)$$0x.getSource();
            avq $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wu.a(wu.f, $$2));
         });
         return 1;
      })));
   }
}
