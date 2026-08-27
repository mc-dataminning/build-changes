import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class akz {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), hx.a(((ds)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dt.a("pos", fm.a()).executes($$0x -> a((ds)$$0x.getSource(), fm.c($$0x, "pos"), 0.0F)))
                  .then(dt.a("angle", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), fm.c($$0x, "pos"), dy.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ds $$0, hx $$1, float $$2) {
      $$0.e().a($$1, $$2);
      $$0.a(() -> vg.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
      return 1;
   }
}
