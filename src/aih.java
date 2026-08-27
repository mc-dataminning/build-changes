import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aih {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dr)$$0x.getSource(), gu.a(((dr)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ds.a("pos", fi.a()).executes($$0x -> a((dr)$$0x.getSource(), fi.c($$0x, "pos"), 0.0F)))
                  .then(ds.a("angle", dv.a()).executes($$0x -> a((dr)$$0x.getSource(), fi.c($$0x, "pos"), dv.a($$0x, "angle"))))
            )
      );
   }

   private static int a(dr $$0, gu $$1, float $$2) {
      $$0.e().a($$1, $$2);
      $$0.a(() -> tf.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
      return 1;
   }
}
