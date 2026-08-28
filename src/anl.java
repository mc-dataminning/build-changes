import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anl {
   public static final int a = 2;

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eu.a("gamemode", fh.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((et)$$0x.getSource()).h()), fh.a($$0x, "gamemode"))))
                  .then(eu.a("target", fg.d()).executes($$0x -> a($$0x, fg.f($$0x, "target"), fh.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(et $$0, ari $$1, ded $$2) {
      xd $$3 = xd.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xd.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ac().b(dec.p)) {
            $$1.a(xd.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xd.a("commands.gamemode.success.other", $$1.Q_(), $$3), true);
      }
   }

   private static int a(CommandContext<et> $$0, Collection<ari> $$1, ded $$2) {
      int $$3 = 0;

      for (ari $$4 : $$1) {
         if ($$4.a($$2)) {
            a((et)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
