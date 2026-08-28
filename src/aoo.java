import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoo {
   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(er.a("targets", fd.d()).then(er.a("message", ez.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aql $$2 : fd.f($$0x, "targets")) {
                  $$2.b(wx.a((eq)$$0x.getSource(), ez.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
