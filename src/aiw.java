import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aiw {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bmi $$2 : bmi.values()) {
         $$1.then(dt.a($$2.a()).then(dt.a("at", fm.a()).executes($$1x -> a((ds)$$1x.getSource(), $$2, fm.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ds $$0, bmi $$1, hx $$2) {
      ctt.a($$1, $$0.e(), $$2);
      return 1;
   }
}
