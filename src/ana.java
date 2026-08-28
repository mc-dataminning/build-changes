import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ana {
   public static void a(CommandDispatcher<ei> $$0) {
      LiteralArgumentBuilder<ei> $$1 = (LiteralArgumentBuilder<ei>)ej.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bxc $$2 : bxc.values()) {
         $$1.then(ej.a($$2.a()).then(ej.a("at", gf.a()).executes($$1x -> a((ei)$$1x.getSource(), $$2, gf.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ei $$0, bxc $$1, iu $$2) {
      dja.a($$1, $$0.e(), $$2);
      return 1;
   }
}
