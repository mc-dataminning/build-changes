import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anv {
   public static void a(CommandDispatcher<ew> $$0) {
      LiteralArgumentBuilder<ew> $$1 = (LiteralArgumentBuilder<ew>)ex.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bwj $$2 : bwj.values()) {
         $$1.then(ex.a($$2.a()).then(ex.a("at", gs.a()).executes($$1x -> a((ew)$$1x.getSource(), $$2, gs.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ew $$0, bwj $$1, jh $$2) {
      dht.a($$1, $$0.e(), $$2);
      return 1;
   }
}
