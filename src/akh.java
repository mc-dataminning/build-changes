import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akh {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dv.a("targets", eg.d()).then(dv.a("message", ec.a()).executes($$0x -> {
               int $$1 = 0;

               for (amb $$2 : eg.f($$0x, "targets")) {
                  $$2.b(uu.a((du)$$0x.getSource(), ec.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
