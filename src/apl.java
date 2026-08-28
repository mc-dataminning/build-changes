import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apl {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), jh.a((ka)((ew)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ex.a("pos", gs.a()).executes($$0x -> a((ew)$$0x.getSource(), gs.c($$0x, "pos"), 0.0F)))
                  .then(ex.a("angle", fc.a()).executes($$0x -> a((ew)$$0x.getSource(), gs.c($$0x, "pos"), fc.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ew $$0, jh $$1, float $$2) {
      arx $$3 = $$0.e();
      if ($$3.ai() != dgz.i) {
         $$0.b(xk.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xk.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
