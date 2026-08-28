import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anc {
   public static void a(CommandDispatcher<ei> $$0) {
      LiteralArgumentBuilder<ei> $$1 = (LiteralArgumentBuilder<ei>)ej.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bxf $$2 : bxf.values()) {
         $$1.then(ej.a($$2.a()).then(ej.a("at", gf.a()).executes($$1x -> a((ei)$$1x.getSource(), $$2, gf.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ei $$0, bxf $$1, iu $$2) {
      djg.a($$1, $$0.e(), $$2);
      return 1;
   }
}
