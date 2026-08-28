import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apw {
   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ex.a("targets", fj.d()).then(ex.a("message", ff.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (ary $$2 : fj.f($$0x, "targets")) {
                  $$2.b(xn.a((ew)$$0x.getSource(), ff.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
