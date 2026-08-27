import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class anx {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ec)$$0x.getSource(), im.a(((ec)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ed.a("pos", fx.a()).executes($$0x -> a((ec)$$0x.getSource(), fx.c($$0x, "pos"), 0.0F)))
                  .then(ed.a("angle", ei.a()).executes($$0x -> a((ec)$$0x.getSource(), fx.c($$0x, "pos"), ei.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ec $$0, im $$1, float $$2) {
      aqe $$3 = $$0.e();
      if ($$3.ae() != czu.h) {
         $$0.b(ws.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> ws.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
