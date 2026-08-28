import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amy {
   public static void a(CommandDispatcher<ep> $$0) {
      LiteralArgumentBuilder<ep> $$1 = (LiteralArgumentBuilder<ep>)eq.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (btr $$2 : btr.values()) {
         $$1.then(eq.a($$2.a()).then(eq.a("at", gl.a()).executes($$1x -> a((ep)$$1x.getSource(), $$2, gl.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ep $$0, btr $$1, iz $$2) {
      dci.a($$1, $$0.e(), $$2);
      return 1;
   }
}
