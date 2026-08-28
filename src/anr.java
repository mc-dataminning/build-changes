import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anr {
   public static final int a = 2;

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ek.a("gamemode", ex.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ej)$$0x.getSource()).h()), ex.a($$0x, "gamemode"))))
                  .then(ek.a("target", ew.d()).executes($$0x -> a($$0x, ew.f($$0x, "target"), ex.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ej $$0, art $$1, dju $$2) {
      xa $$3 = xa.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xa.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().c(djt.q)) {
            $$1.a(xa.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xa.a("commands.gamemode.success.other", $$1.m_(), $$3), true);
      }
   }

   private static int a(CommandContext<ej> $$0, Collection<art> $$1, dju $$2) {
      int $$3 = 0;

      for (art $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ej)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
