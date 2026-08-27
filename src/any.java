import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class any {
   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dw.a("targets", ei.d()).then(dw.a("message", ee.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (apv $$2 : ei.f($$0x, "targets")) {
                  $$2.b(wl.a((dv)$$0x.getSource(), ee.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
