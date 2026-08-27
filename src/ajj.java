import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ajj {
   public static final int a = 2;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("gamemode", eg.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ds)$$0x.getSource()).h()), eg.a($$0x, "gamemode"))))
                  .then(dt.a("target", ef.d()).executes($$0x -> a($$0x, ef.f($$0x, "target"), eg.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ds $$0, ana $$1, ctf $$2) {
      vd $$3 = vd.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> vd.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().Z().b(cte.p)) {
            $$1.a(vd.a("gameMode.changed", $$3));
         }

         $$0.a(() -> vd.a("commands.gamemode.success.other", $$1.Q_(), $$3), true);
      }
   }

   private static int a(CommandContext<ds> $$0, Collection<ana> $$1, ctf $$2) {
      int $$3 = 0;

      for (ana $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ds)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
