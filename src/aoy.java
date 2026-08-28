import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoy {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eu)$$0x.getSource(), jf.a((jy)((eu)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ev.a("pos", gq.a()).executes($$0x -> a((eu)$$0x.getSource(), gq.c($$0x, "pos"), 0.0F)))
                  .then(ev.a("angle", fa.a()).executes($$0x -> a((eu)$$0x.getSource(), gq.c($$0x, "pos"), fa.a($$0x, "angle"))))
            )
      );
   }

   private static int a(eu $$0, jf $$1, float $$2) {
      arj $$3 = $$0.e();
      if ($$3.ag() != dej.h) {
         $$0.b(xe.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xe.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
