import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), ji.a((kb)((ex)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ey.a("pos", gt.a()).executes($$0x -> a((ex)$$0x.getSource(), gt.c($$0x, "pos"), 0.0F)))
                  .then(ey.a("angle", fd.a()).executes($$0x -> a((ex)$$0x.getSource(), gt.c($$0x, "pos"), fd.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ex $$0, ji $$1, float $$2) {
      arc $$3 = $$0.e();
      if ($$3.ai() != dgi.i) {
         $$0.b(wo.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wo.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
