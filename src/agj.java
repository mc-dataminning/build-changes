import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agj {
   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = (LiteralArgumentBuilder<dr>)ds.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bjb $$2 : bjb.values()) {
         $$1.then(ds.a($$2.a()).then(ds.a("at", fi.a()).executes($$1x -> a((dr)$$1x.getSource(), $$2, fi.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(dr $$0, bjb $$1, gu $$2) {
      cpx.a($$1, $$0.e(), $$2);
      return 1;
   }
}
