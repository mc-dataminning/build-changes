import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ala {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bps $$2 : bps.values()) {
         $$1.then(dv.a($$2.a()).then(dv.a("at", fo.a()).executes($$1x -> a((du)$$1x.getSource(), $$2, fo.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(du $$0, bps $$1, ib $$2) {
      cxm.a($$1, $$0.e(), $$2);
      return 1;
   }
}
