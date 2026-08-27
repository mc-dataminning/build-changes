import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amn {
   public static void a(CommandDispatcher<eh> $$0) {
      LiteralArgumentBuilder<eh> $$1 = (LiteralArgumentBuilder<eh>)ei.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bsr $$2 : bsr.values()) {
         $$1.then(ei.a($$2.a()).then(ei.a("at", gd.a()).executes($$1x -> a((eh)$$1x.getSource(), $$2, gd.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(eh $$0, bsr $$1, ir $$2) {
      dcl.a($$1, $$0.e(), $$2);
      return 1;
   }
}
