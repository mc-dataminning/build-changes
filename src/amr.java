import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amr {
   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = (LiteralArgumentBuilder<ex>)ey.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bvk $$2 : bvk.values()) {
         $$1.then(ey.a($$2.a()).then(ey.a("at", gt.a()).executes($$1x -> a((ex)$$1x.getSource(), $$2, gt.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ex $$0, bvk $$1, ji $$2) {
      dgt.a($$1, $$0.e(), $$2);
      return 1;
   }
}
