import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ane {
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

   private static void a(ex $$0, are $$1, dgg $$2) {
      wp $$3 = wp.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wp.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().O().b(dgf.p)) {
            $$1.a(wp.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wp.a("commands.gamemode.success.other", $$1.p_(), $$3), true);
      }
   }

   private static int a(CommandContext<ex> $$0, Collection<are> $$1, dgg $$2) {
      int $$3 = 0;

      for (are $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ex)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
