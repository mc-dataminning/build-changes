import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apd {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ei)$$0x.getSource(), iu.a((jo)((ei)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ej.a("pos", gf.a()).executes($$0x -> a((ei)$$0x.getSource(), gf.c($$0x, "pos"), 0.0F)))
                  .then(ej.a("angle", eo.a()).executes($$0x -> a((ei)$$0x.getSource(), gf.c($$0x, "pos"), eo.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ei $$0, iu $$1, float $$2) {
      arq $$3 = $$0.e();
      if ($$3.aj() != dja.i) {
         $$0.b(wy.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wy.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
