import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoy {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), iz.a(((ep)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)eq.a("pos", gl.a()).executes($$0x -> a((ep)$$0x.getSource(), gl.c($$0x, "pos"), 0.0F)))
                  .then(eq.a("angle", ev.a()).executes($$0x -> a((ep)$$0x.getSource(), gl.c($$0x, "pos"), ev.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ep $$0, iz $$1, float $$2) {
      arf $$3 = $$0.e();
      if ($$3.af() != dca.h) {
         $$0.b(xp.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xp.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
