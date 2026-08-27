import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amh {
   public static void a(CommandDispatcher<ee> $$0) {
      LiteralArgumentBuilder<ee> $$1 = (LiteralArgumentBuilder<ee>)ef.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bst $$2 : bst.values()) {
         $$1.then(ef.a($$2.a()).then(ef.a("at", ga.a()).executes($$1x -> a((ee)$$1x.getSource(), $$2, ga.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ee $$0, bst $$1, io $$2) {
      dbk.a($$1, $$0.e(), $$2);
      return 1;
   }
}
