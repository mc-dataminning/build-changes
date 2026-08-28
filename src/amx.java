import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amx {
   public static void a(CommandDispatcher<et> $$0) {
      LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bui $$2 : bui.values()) {
         $$1.then(eu.a($$2.a()).then(eu.a("at", gp.a()).executes($$1x -> a((et)$$1x.getSource(), $$2, gp.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(et $$0, bui $$1, je $$2) {
      ded.a($$1, $$0.e(), $$2);
      return 1;
   }
}
