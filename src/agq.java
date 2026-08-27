import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agq {
   public static void a(CommandDispatcher<dt> $$0) {
      LiteralArgumentBuilder<dt> $$1 = (LiteralArgumentBuilder<dt>)du.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for (bjl $$2 : bjl.values()) {
         $$1.then(du.a($$2.a()).then(du.a("at", fk.a()).executes($$1x -> a((dt)$$1x.getSource(), $$2, fk.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(dt $$0, bjl $$1, gw $$2) {
      cqi.a($$1, $$0.e(), $$2);
      return 1;
   }
}
