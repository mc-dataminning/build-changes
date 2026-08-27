import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class amq {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), hz.a(((du)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dv.a("pos", fo.a()).executes($$0x -> a((du)$$0x.getSource(), fo.c($$0x, "pos"), 0.0F)))
                  .then(dv.a("angle", ea.a()).executes($$0x -> a((du)$$0x.getSource(), fo.c($$0x, "pos"), ea.a($$0x, "angle"))))
            )
      );
   }

   private static int a(du $$0, hz $$1, float $$2) {
      aow $$3 = $$0.e();
      if ($$3.ad() != cvr.h) {
         $$0.b(vq.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> vq.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
