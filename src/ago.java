import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ago {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dt.a("targets", ec.d()).then(dt.a("message", dy.a()).executes($$0x -> {
               int $$1 = 0;

               for (aig $$2 : ec.f($$0x, "targets")) {
                  $$2.b(sy.a((ds)$$0x.getSource(), dy.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
