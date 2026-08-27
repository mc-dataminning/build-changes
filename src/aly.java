import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aly {
   public static void a(CommandDispatcher<ec> $$0) {
      LiteralArgumentBuilder<ec> $$1 = (LiteralArgumentBuilder<ec>)ed.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (brh $$2 : brh.values()) {
         $$1.then(ed.a($$2.a()).then(ed.a("at", fx.a()).executes($$1x -> a((ec)$$1x.getSource(), $$2, fx.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ec $$0, brh $$1, im $$2) {
      daf.a($$1, $$0.e(), $$2);
      return 1;
   }
}
