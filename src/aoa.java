import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoa {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ed)$$0x.getSource(), in.a(((ed)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ee.a("pos", fz.a()).executes($$0x -> a((ed)$$0x.getSource(), fz.c($$0x, "pos"), 0.0F)))
                  .then(ee.a("angle", ej.a()).executes($$0x -> a((ed)$$0x.getSource(), fz.c($$0x, "pos"), ej.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ed $$0, in $$1, float $$2) {
      aqh $$3 = $$0.e();
      if ($$3.ae() != dad.h) {
         $$0.b(wu.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wu.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
