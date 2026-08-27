import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ais {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ds.a("targets", ec.d()).then(ds.a("message", dy.a()).executes($$0x -> {
               int $$1 = 0;

               for (akl $$2 : ec.f($$0x, "targets")) {
                  $$2.b(th.a((dr)$$0x.getSource(), dy.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
