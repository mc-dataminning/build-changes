import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apj {
   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(eq.a("targets", fc.d()).then(eq.a("message", ey.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (arg $$2 : fc.f($$0x, "targets")) {
                  $$2.b(xs.a((ep)$$0x.getSource(), ey.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
