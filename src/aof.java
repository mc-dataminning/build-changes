import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aof {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), io.a(((ee)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ef.a("pos", ga.a()).executes($$0x -> a((ee)$$0x.getSource(), ga.c($$0x, "pos"), 0.0F)))
                  .then(ef.a("angle", ek.a()).executes($$0x -> a((ee)$$0x.getSource(), ga.c($$0x, "pos"), ek.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ee $$0, io $$1, float $$2) {
      aqm $$3 = $$0.e();
      if ($$3.ae() != dax.h) {
         $$0.b(wx.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wx.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
