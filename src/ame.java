import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ame {
   public static void a(CommandDispatcher<eq> $$0) {
      LiteralArgumentBuilder<eq> $$1 = (LiteralArgumentBuilder<eq>)er.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (btb $$2 : btb.values()) {
         $$1.then(er.a($$2.a()).then(er.a("at", gm.a()).executes($$1x -> a((eq)$$1x.getSource(), $$2, gm.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(eq $$0, btb $$1, ja $$2) {
      dco.a($$1, $$0.e(), $$2);
      return 1;
   }
}
