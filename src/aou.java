import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aou {
   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(eu.a("targets", fg.d()).then(eu.a("message", fc.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aqu $$2 : fg.f($$0x, "targets")) {
                  $$2.b(xb.a((et)$$0x.getSource(), fc.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
