import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class alo {
   public static void a(CommandDispatcher<dv> $$0) {
      LiteralArgumentBuilder<dv> $$1 = (LiteralArgumentBuilder<dv>)dw.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bqw $$2 : bqw.values()) {
         $$1.then(dw.a($$2.a()).then(dw.a("at", fq.a()).executes($$1x -> a((dv)$$1x.getSource(), $$2, fq.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(dv $$0, bqw $$1, id $$2) {
      czr.a($$1, $$0.e(), $$2);
      return 1;
   }
}
