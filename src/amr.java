import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class amr {
   public static final int a = 2;

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)er.a("gamemode", fe.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((eq)$$0x.getSource()).h()), fe.a($$0x, "gamemode"))))
                  .then(er.a("target", fd.d()).executes($$0x -> a($$0x, fd.f($$0x, "target"), fe.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(eq $$0, aql $$1, dca $$2) {
      wu $$3 = wu.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wu.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ab().b(dbz.p)) {
            $$1.a(wu.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wu.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<eq> $$0, Collection<aql> $$1, dca $$2) {
      int $$3 = 0;

      for (aql $$4 : $$1) {
         if ($$4.a($$2)) {
            a((eq)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
