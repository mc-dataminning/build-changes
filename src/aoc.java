import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoc {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("setworldspawn").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), ja.a(((eq)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)er.a("pos", gm.a()).executes($$0x -> a((eq)$$0x.getSource(), gm.c($$0x, "pos"), 0.0F)))
                  .then(er.a("angle", ew.a()).executes($$0x -> a((eq)$$0x.getSource(), gm.c($$0x, "pos"), ew.a($$0x, "angle"))))
            )
      );
   }

   private static int a(eq $$0, ja $$1, float $$2) {
      aqm $$3 = $$0.e();
      if ($$3.af() != dcf.h) {
         $$0.b(wu.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wu.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
