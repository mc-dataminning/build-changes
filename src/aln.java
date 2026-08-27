import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aln {
   public static final int a = 2;

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("gamemode", ei.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((du)$$0x.getSource()).h()), ei.a($$0x, "gamemode"))))
                  .then(dv.a("target", eh.d()).executes($$0x -> a($$0x, eh.f($$0x, "target"), ei.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(du $$0, apg $$1, cww $$2) {
      vu $$3 = vu.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> vu.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().Z().b(cwv.p)) {
            $$1.a(vu.a("gameMode.changed", $$3));
         }

         $$0.a(() -> vu.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<du> $$0, Collection<apg> $$1, cww $$2) {
      int $$3 = 0;

      for (apg $$4 : $$1) {
         if ($$4.a($$2)) {
            a((du)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
