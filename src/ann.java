import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ann {
   public static final int a = 2;

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ev.a("gamemode", fi.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((eu)$$0x.getSource()).h()), fi.a($$0x, "gamemode"))))
                  .then(ev.a("target", fh.d()).executes($$0x -> a($$0x, fh.f($$0x, "target"), fi.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(eu $$0, ark $$1, deg $$2) {
      xe $$3 = xe.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xe.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ac().b(def.p)) {
            $$1.a(xe.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xe.a("commands.gamemode.success.other", $$1.R_(), $$3), true);
      }
   }

   private static int a(CommandContext<eu> $$0, Collection<ark> $$1, deg $$2) {
      int $$3 = 0;

      for (ark $$4 : $$1) {
         if ($$4.a($$2)) {
            a((eu)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
