import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aom {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), ir.a(((eh)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ei.a("pos", gd.a()).executes($$0x -> a((eh)$$0x.getSource(), gd.c($$0x, "pos"), 0.0F)))
                  .then(ei.a("angle", en.a()).executes($$0x -> a((eh)$$0x.getSource(), gd.c($$0x, "pos"), en.a($$0x, "angle"))))
            )
      );
   }

   private static int a(eh $$0, ir $$1, float $$2) {
      aqt $$3 = $$0.e();
      if ($$3.af() != dca.h) {
         $$0.b(xe.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xe.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
