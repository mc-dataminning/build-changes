import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apb {
   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ey.a("targets", fk.d()).then(ey.a("message", fg.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (are $$2 : fk.f($$0x, "targets")) {
                  $$2.b(ws.a((ex)$$0x.getSource(), fg.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
