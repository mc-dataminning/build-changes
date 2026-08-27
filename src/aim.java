import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aim {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bly $$2 : bly.values()) {
         $$1.then(dt.a($$2.a()).then(dt.a("at", fk.a()).executes($$1x -> a((ds)$$1x.getSource(), $$2, fk.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ds $$0, bly $$1, hv $$2) {
      ctj.a($$1, $$0.e(), $$2);
      return 1;
   }
}
