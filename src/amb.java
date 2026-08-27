import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amb {
   public static void a(CommandDispatcher<ed> $$0) {
      LiteralArgumentBuilder<ed> $$1 = (LiteralArgumentBuilder<ed>)ee.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bsd $$2 : bsd.values()) {
         $$1.then(ee.a($$2.a()).then(ee.a("at", fz.a()).executes($$1x -> a((ed)$$1x.getSource(), $$2, fz.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ed $$0, bsd $$1, in $$2) {
      dao.a($$1, $$0.e(), $$2);
      return 1;
   }
}
