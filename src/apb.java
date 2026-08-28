import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apb {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ev)$$0x.getSource(), jg.a((jz)((ev)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ew.a("pos", gr.a()).executes($$0x -> a((ev)$$0x.getSource(), gr.c($$0x, "pos"), 0.0F)))
                  .then(ew.a("angle", fb.a()).executes($$0x -> a((ev)$$0x.getSource(), gr.c($$0x, "pos"), fb.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ev $$0, jg $$1, float $$2) {
      arm $$3 = $$0.e();
      if ($$3.ag() != dev.i) {
         $$0.b(xh.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xh.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
