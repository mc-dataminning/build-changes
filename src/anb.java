import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anb {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(dv.a("targets", eh.d()).then(dv.a("message", ed.a()).executes($$0x -> {
               int $$1 = 0;

               for (aox $$2 : eh.f($$0x, "targets")) {
                  $$2.b(vt.a((du)$$0x.getSource(), ed.a($$0x, "message"), $$2, 0), false);
                  $$1++;
               }

               return $$1;
            })))
      );
   }
}
