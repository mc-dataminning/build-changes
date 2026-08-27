import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aik {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dt)$$0x.getSource(), gw.a(((dt)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)du.a("pos", fk.a()).executes($$0x -> a((dt)$$0x.getSource(), fk.c($$0x, "pos"), 0.0F)))
                  .then(du.a("angle", dx.a()).executes($$0x -> a((dt)$$0x.getSource(), fk.c($$0x, "pos"), dx.a($$0x, "angle"))))
            )
      );
   }

   private static int a(dt $$0, gw $$1, float $$2) {
      $$0.e().a($$1, $$2);
      $$0.a(() -> ti.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
      return 1;
   }
}
