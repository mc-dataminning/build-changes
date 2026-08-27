import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aeg {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bgc $$2 : bgc.values()) {
         $$1.then(dt.a($$2.a()).then(dt.a("at", fi.a()).executes($$1x -> a((ds)$$1x.getSource(), $$2, fi.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ds $$0, bgc $$1, gu $$2) {
      cmx.a($$1, $$0.e(), $$2);
      return 1;
   }
}
