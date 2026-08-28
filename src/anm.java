import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anm {
   public static final int a = 2;

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("gamemode", fl.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ex)$$0x.getSource()).h()), fl.a($$0x, "gamemode"))))
                  .then(ey.a("target", fk.d()).executes($$0x -> a($$0x, fk.f($$0x, "target"), fl.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ex $$0, aro $$1, dhm $$2) {
      wv $$3 = wv.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wv.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().c(dhl.p)) {
            $$1.a(wv.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wv.a("commands.gamemode.success.other", $$1.m_(), $$3), true);
      }
   }

   private static int a(CommandContext<ex> $$0, Collection<aro> $$1, dhm $$2) {
      int $$3 = 0;

      for (aro $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ex)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
