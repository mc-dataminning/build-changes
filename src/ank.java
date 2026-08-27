import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ank {
   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dv.a("targets", eh.d()).then(dv.a("message", ed.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (apg $$2 : eh.f($$0x, "targets")) {
                  $$2.b(vx.a((du)$$0x.getSource(), ed.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
