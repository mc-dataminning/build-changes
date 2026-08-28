import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ana {
   public static void a(CommandDispatcher<eu> $$0) {
      LiteralArgumentBuilder<eu> $$1 = (LiteralArgumentBuilder<eu>)ev.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (buq $$2 : buq.values()) {
         $$1.then(ev.a($$2.a()).then(ev.a("at", gq.a()).executes($$1x -> a((eu)$$1x.getSource(), $$2, gq.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(eu $$0, buq $$1, jf $$2) {
      deu.a($$1, $$0.e(), $$2);
      return 1;
   }
}
