import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akv {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dt.a("targets", ee.d()).then(dt.a("message", ea.a()).executes($$0x -> {
               int $$1 = 0;

               for (amq $$2 : ee.f($$0x, "targets")) {
                  $$2.b(ve.a((ds)$$0x.getSource(), ea.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
