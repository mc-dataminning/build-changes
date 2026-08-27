import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ahb {
   public static final int a = 2;

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)du.a("gamemode", ef.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((dt)$$0x.getSource()).h()), ef.a($$0x, "gamemode"))))
                  .then(du.a("target", ee.d()).executes($$0x -> a($$0x, ee.f($$0x, "target"), ef.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(dt $$0, akr $$1, cps $$2) {
      tl $$3 = tl.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> tl.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().X().b(cpr.o)) {
            $$1.a(tl.a("gameMode.changed", $$3));
         }

         $$0.a(() -> tl.a("commands.gamemode.success.other", $$1.N_(), $$3), true);
      }
   }

   private static int a(CommandContext<dt> $$0, Collection<akr> $$1, cps $$2) {
      int $$3 = 0;

      for (akr $$4 : $$1) {
         if ($$4.a($$2)) {
            a((dt)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
