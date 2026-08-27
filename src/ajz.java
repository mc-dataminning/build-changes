import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class ajz {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), ht.a(((du)$$0x.getSource()).e()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dv.a("pos", fm.a()).executes($$0x -> a((du)$$0x.getSource(), fm.c($$0x, "pos"), 0.0F)))
                  .then(dv.a("angle", dz.a()).executes($$0x -> a((du)$$0x.getSource(), fm.c($$0x, "pos"), dz.a($$0x, "angle"))))
            )
      );
   }

   private static int a(du $$0, ht $$1, float $$2) {
      $$0.f().a($$1, $$2);
      $$0.a(() -> ur.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
      return 1;
   }
}
