import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ant {
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

   private static void a(ek $$0, arv $$1, djw $$2) {
      xc $$3 = xc.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xc.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().c(djv.q)) {
            $$1.a(xc.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xc.a("commands.gamemode.success.other", $$1.m_(), $$3), true);
      }
   }

   private static int a(CommandContext<ek> $$0, Collection<arv> $$1, djw $$2) {
      int $$3 = 0;

      for (arv $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ek)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
