import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apa {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), jj.a((kc)((ex)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ey.a("pos", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), gu.c($$0x, "pos"), 0.0F)))
                  .then(ey.a("angle", fd.a()).executes($$0x -> a((ex)$$0x.getSource(), gu.c($$0x, "pos"), fd.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ex $$0, jj $$1, float $$2) {
      arn $$3 = $$0.e();
      if ($$3.aj() != dhp.i) {
         $$0.b(wv.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wv.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
