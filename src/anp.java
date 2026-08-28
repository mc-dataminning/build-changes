import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anp {
   public static final int a = 2;

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ej.a("gamemode", ew.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ei)$$0x.getSource()).h()), ew.a($$0x, "gamemode"))))
                  .then(ej.a("target", ev.d()).executes($$0x -> a($$0x, ev.f($$0x, "target"), ew.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ei $$0, arr $$1, dis $$2) {
      wy $$3 = wy.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wy.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().c(dir.p)) {
            $$1.a(wy.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wy.a("commands.gamemode.success.other", $$1.m_(), $$3), true);
      }
   }

   private static int a(CommandContext<ei> $$0, Collection<arr> $$1, dis $$2) {
      int $$3 = 0;

      for (arr $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ei)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
