import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aol {
   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ee.a("targets", eq.d()).then(ee.a("message", em.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aqi $$2 : eq.f($$0x, "targets")) {
                  $$2.b(wx.a((ed)$$0x.getSource(), em.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
