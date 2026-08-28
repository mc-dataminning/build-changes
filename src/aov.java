import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aov {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("say").requires($$0x -> $$0x.c(2))).then(ej.a("message", ez.a()).executes($$0x -> {
         ez.a($$0x, "message", $$1 -> {
            ei $$2 = (ei)$$0x.getSource();
            avq $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wu.a(wu.f, $$2));
         });
         return 1;
      })));
   }
}
