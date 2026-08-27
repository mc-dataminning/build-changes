import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akr {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (boj $$2 : boj.values()) {
         $$1.then(dv.a($$2.a()).then(dv.a("at", fo.a()).executes($$1x -> a((du)$$1x.getSource(), $$2, fo.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(du $$0, boj $$1, hz $$2) {
      cvy.a($$1, $$0.e(), $$2);
      return 1;
   }
}
