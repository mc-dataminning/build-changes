import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class amo {
   public static final int a = 2;

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ee.a("gamemode", er.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ed)$$0x.getSource()).h()), er.a($$0x, "gamemode"))))
                  .then(ee.a("target", eq.d()).executes($$0x -> a($$0x, eq.f($$0x, "target"), er.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ed $$0, aqi $$1, daa $$2) {
      wu $$3 = wu.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wu.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().aa().b(czz.p)) {
            $$1.a(wu.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wu.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<ed> $$0, Collection<aqi> $$1, daa $$2) {
      int $$3 = 0;

      for (aqi $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ed)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
