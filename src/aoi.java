import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aoi {
   public static final int a = 2;

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("gamemode", fk.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ew)$$0x.getSource()).h()), fk.a($$0x, "gamemode"))))
                  .then(ex.a("target", fj.d()).executes($$0x -> a($$0x, fj.f($$0x, "target"), fk.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ew $$0, asi $$1, dgx $$2) {
      xv $$3 = xv.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xv.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().N().b(dgw.p)) {
            $$1.a(xv.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xv.a("commands.gamemode.success.other", $$1.p_(), $$3), true);
      }
   }

   private static int a(CommandContext<ew> $$0, Collection<asi> $$1, dgx $$2) {
      int $$3 = 0;

      for (asi $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ew)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
