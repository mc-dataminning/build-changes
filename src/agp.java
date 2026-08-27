import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agp {
   public static void a(CommandDispatcher<dt> $$0) {
      LiteralArgumentBuilder<dt> $$1 = (LiteralArgumentBuilder<dt>)du.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bjj $$2 : bjj.values()) {
         $$1.then(du.a($$2.a()).then(du.a("at", fk.a()).executes($$1x -> a((dt)$$1x.getSource(), $$2, fk.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(dt $$0, bjj $$1, gw $$2) {
      cqg.a($$1, $$0.e(), $$2);
      return 1;
   }
}
