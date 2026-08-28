import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aoa {
   public static final int a = 2;

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("gamemode", ey.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ek)$$0x.getSource()).h()), ey.a($$0x, "gamemode"))))
                  .then(el.a("target", ex.d()).executes($$0x -> a($$0x, ex.f($$0x, "target"), ey.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ek $$0, asc $$1, dkg $$2) {
      xg $$3 = xg.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xg.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().c(dkf.q)) {
            $$1.a(xg.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xg.a("commands.gamemode.success.other", $$1.m_(), $$3), true);
      }
   }

   private static int a(CommandContext<ek> $$0, Collection<asc> $$1, dkg $$2) {
      int $$3 = 0;

      for (asc $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ek)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
