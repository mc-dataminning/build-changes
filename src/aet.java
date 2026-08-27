import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aet {
   public static final int a = 2;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("gamemode", ed.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ds)$$0x.getSource()).h()), ed.a($$0x, "gamemode"))))
                  .then(dt.a("target", ec.d()).executes($$0x -> a($$0x, ec.f($$0x, "target"), ed.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ds $$0, aig $$1, cmj $$2) {
      sw $$3 = sw.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> sw.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().X().b(cmi.o)) {
            $$1.a(sw.a("gameMode.changed", $$3));
         }

         $$0.a(() -> sw.a("commands.gamemode.success.other", $$1.H_(), $$3), true);
      }
   }

   private static int a(CommandContext<ds> $$0, Collection<aig> $$1, cmj $$2) {
      int $$3 = 0;

      for (aig $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ds)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
