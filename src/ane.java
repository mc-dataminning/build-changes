import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ane {
   public static void a(CommandDispatcher<ej> $$0) {
      LiteralArgumentBuilder<ej> $$1 = (LiteralArgumentBuilder<ej>)ek.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bxx $$2 : bxx.values()) {
         $$1.then(ek.a($$2.a()).then(ek.a("at", gg.a()).executes($$1x -> a((ej)$$1x.getSource(), $$2, gg.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ej $$0, bxx $$1, iv $$2) {
      dki.a($$1, $$0.e(), $$2);
      return 1;
   }
}
