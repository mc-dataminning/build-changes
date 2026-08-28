import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anl {
   public static final int a = 2;

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eq.a("gamemode", fd.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ep)$$0x.getSource()).h()), fd.a($$0x, "gamemode"))))
                  .then(eq.a("target", fc.d()).executes($$0x -> a($$0x, fc.f($$0x, "target"), fd.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ep $$0, arf $$1, dbt $$2) {
      xo $$3 = xo.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xo.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ab().b(dbs.p)) {
            $$1.a(xo.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xo.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<ep> $$0, Collection<arf> $$1, dbt $$2) {
      int $$3 = 0;

      for (arf $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ep)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
