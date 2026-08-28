import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amz {
   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = (LiteralArgumentBuilder<ex>)ey.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bwu $$2 : bwu.values()) {
         $$1.then(ey.a($$2.a()).then(ey.a("at", gu.a()).executes($$1x -> a((ex)$$1x.getSource(), $$2, gu.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ex $$0, bwu $$1, jj $$2) {
      dia.a($$1, $$0.e(), $$2);
      return 1;
   }
}
