import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class and {
   public static void a(CommandDispatcher<ev> $$0) {
      LiteralArgumentBuilder<ev> $$1 = (LiteralArgumentBuilder<ev>)ew.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (buy $$2 : buy.values()) {
         $$1.then(ew.a($$2.a()).then(ew.a("at", gr.a()).executes($$1x -> a((ev)$$1x.getSource(), $$2, gr.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ev $$0, buy $$1, jg $$2) {
      dfg.a($$1, $$0.e(), $$2);
      return 1;
   }
}
