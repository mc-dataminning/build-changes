import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apz {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(el.a("targets", ex.d()).then(el.a("message", et.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (asc $$2 : ex.f($$0x, "targets")) {
                  $$2.b(et.a($$0x, "message", $$2), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
