import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ang {
   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = (LiteralArgumentBuilder<ek>)el.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bxz $$2 : bxz.values()) {
         $$1.then(el.a($$2.a()).then(el.a("at", gh.a()).executes($$1x -> a((ek)$$1x.getSource(), $$2, gh.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ek $$0, bxz $$1, iw $$2) {
      dkk.a($$1, $$0.e(), $$2);
      return 1;
   }
}
