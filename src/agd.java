import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class agd {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), gu.a(((ds)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$0x -> a((ds)$$0x.getSource(), fi.c($$0x, "pos"), 0.0F)))
                  .then(dt.a("angle", dv.a()).executes($$0x -> a((ds)$$0x.getSource(), fi.c($$0x, "pos"), dv.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ds $$0, gu $$1, float $$2) {
      $$0.e().a($$1, $$2);
      $$0.a(() -> sw.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
      return 1;
   }
}
