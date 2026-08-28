import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apm {
   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ew.a("targets", fi.d()).then(ew.a("message", fe.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (arn $$2 : fi.f($$0x, "targets")) {
                  $$2.b(xk.a((ev)$$0x.getSource(), fe.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
