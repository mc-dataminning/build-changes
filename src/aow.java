import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aow {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((et)$$0x.getSource(), je.a((jx)((et)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)eu.a("pos", gp.a()).executes($$0x -> a((et)$$0x.getSource(), gp.c($$0x, "pos"), 0.0F)))
                  .then(eu.a("angle", ez.a()).executes($$0x -> a((et)$$0x.getSource(), gp.c($$0x, "pos"), ez.a($$0x, "angle"))))
            )
      );
   }

   private static int a(et $$0, je $$1, float $$2) {
      arh $$3 = $$0.e();
      if ($$3.ag() != deg.h) {
         $$0.b(xd.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xd.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
