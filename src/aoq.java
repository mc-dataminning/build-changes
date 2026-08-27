import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ef.a("targets", er.d()).then(ef.a("message", en.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aqn $$2 : er.f($$0x, "targets")) {
                  $$2.b(xa.a((ee)$$0x.getSource(), en.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
