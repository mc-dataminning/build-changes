import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apo {
   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ek.a("targets", ew.d()).then(ek.a("message", es.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (arr $$2 : ew.f($$0x, "targets")) {
                  $$2.b(es.a($$0x, "message", $$2), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
