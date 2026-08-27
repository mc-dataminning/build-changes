import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class agu {
   public static final int a = 2;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("gamemode", ee.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ds)$$0x.getSource()).h()), ee.a($$0x, "gamemode"))))
                  .then(dt.a("target", ed.d()).executes($$0x -> a($$0x, ed.f($$0x, "target"), ee.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ds $$0, akj $$1, cph $$2) {
      te $$3 = te.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> te.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().X().b(cpg.o)) {
            $$1.a(te.a("gameMode.changed", $$3));
         }

         $$0.a(() -> te.a("commands.gamemode.success.other", $$1.H_(), $$3), true);
      }
   }

   private static int a(CommandContext<ds> $$0, Collection<akj> $$1, cph $$2) {
      int $$3 = 0;

      for (akj $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ds)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
