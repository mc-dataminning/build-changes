import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aml {
   public static final int a = 2;

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ed.a("gamemode", eq.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ec)$$0x.getSource()).h()), eq.a($$0x, "gamemode"))))
                  .then(ed.a("target", ep.d()).executes($$0x -> a($$0x, ep.f($$0x, "target"), eq.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ec $$0, aqf $$1, czr $$2) {
      ws $$3 = ws.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> ws.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().aa().b(czq.p)) {
            $$1.a(ws.a("gameMode.changed", $$3));
         }

         $$0.a(() -> ws.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<ec> $$0, Collection<aqf> $$1, czr $$2) {
      int $$3 = 0;

      for (aqf $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ec)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
