import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apj {
   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ev.a("targets", fh.d()).then(ev.a("message", fd.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (ark $$2 : fh.f($$0x, "targets")) {
                  $$2.b(xh.a((eu)$$0x.getSource(), fd.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
