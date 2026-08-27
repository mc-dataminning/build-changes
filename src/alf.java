import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class alf {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dt.a("targets", ef.d()).then(dt.a("message", eb.a()).executes($$0x -> {
               int $$1 = 0;

               for (ana $$2 : ef.f($$0x, "targets")) {
                  $$2.b(vg.a((ds)$$0x.getSource(), eb.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
