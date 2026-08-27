import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aiz {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(du.a("targets", ee.d()).then(du.a("message", ea.a()).executes($$0x -> {
               int $$1 = 0;

               for (akt $$2 : ee.f($$0x, "targets")) {
                  $$2.b(tp.a((dt)$$0x.getSource(), ea.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
