import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aiq {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dt.a("targets", ed.d()).then(dt.a("message", dz.a()).executes($$0x -> {
               int $$1 = 0;

               for (akj $$2 : ed.f($$0x, "targets")) {
                  $$2.b(tg.a((ds)$$0x.getSource(), dz.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
