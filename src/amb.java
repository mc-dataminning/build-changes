import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class amb {
   public static final int a = 2;

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dw.a("gamemode", ej.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((dv)$$0x.getSource()).h()), ej.a($$0x, "gamemode"))))
                  .then(dw.a("target", ei.d()).executes($$0x -> a($$0x, ei.f($$0x, "target"), ej.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(dv $$0, apv $$1, czd $$2) {
      wi $$3 = wi.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wi.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().aa().b(czc.p)) {
            $$1.a(wi.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wi.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<dv> $$0, Collection<apv> $$1, czd $$2) {
      int $$3 = 0;

      for (apv $$4 : $$1) {
         if ($$4.a($$2)) {
            a((dv)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
