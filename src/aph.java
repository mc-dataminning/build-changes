import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aph {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), iw.a((jq)((ek)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)el.a("pos", gh.a()).executes($$0x -> a((ek)$$0x.getSource(), gh.c($$0x, "pos"), 0.0F)))
                  .then(el.a("angle", eq.a()).executes($$0x -> a((ek)$$0x.getSource(), gh.c($$0x, "pos"), eq.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ek $$0, iw $$1, float $$2) {
      aru $$3 = $$0.e();
      if ($$3.aj() != djz.i) {
         $$0.b(xc.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xc.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
