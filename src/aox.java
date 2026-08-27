import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aox {
   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ei.a("targets", eu.d()).then(ei.a("message", eq.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aqu $$2 : eu.f($$0x, "targets")) {
                  $$2.b(xh.a((eh)$$0x.getSource(), eq.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
