import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apo {
   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ej.a("targets", ev.d()).then(ej.a("message", er.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (arr $$2 : ev.f($$0x, "targets")) {
                  $$2.b(er.a($$0x, "message", $$2), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
