import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aib {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (blj $$2 : blj.values()) {
         $$1.then(dv.a($$2.a()).then(dv.a("at", fm.a()).executes($$1x -> a((du)$$1x.getSource(), $$2, fm.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(du $$0, blj $$1, ht $$2) {
      csl.a($$1, $$0.f(), $$2);
      return 1;
   }
}
