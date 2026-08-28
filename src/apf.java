import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apf {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ej)$$0x.getSource(), iv.a((jp)((ej)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ek.a("pos", gg.a()).executes($$0x -> a((ej)$$0x.getSource(), gg.c($$0x, "pos"), 0.0F)))
                  .then(ek.a("angle", ep.a()).executes($$0x -> a((ej)$$0x.getSource(), gg.c($$0x, "pos"), ep.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ej $$0, iv $$1, float $$2) {
      ars $$3 = $$0.e();
      if ($$3.aj() != djx.i) {
         $$0.b(xa.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xa.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
