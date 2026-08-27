import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class ann {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dv)$$0x.getSource(), id.a(((dv)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dw.a("pos", fq.a()).executes($$0x -> a((dv)$$0x.getSource(), fq.c($$0x, "pos"), 0.0F)))
                  .then(dw.a("angle", eb.a()).executes($$0x -> a((dv)$$0x.getSource(), fq.c($$0x, "pos"), eb.a($$0x, "angle"))))
            )
      );
   }

   private static int a(dv $$0, id $$1, float $$2) {
      apu $$3 = $$0.e();
      if ($$3.ae() != czg.h) {
         $$0.b(wi.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wi.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
