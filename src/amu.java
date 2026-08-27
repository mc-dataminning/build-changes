import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class amu {
   public static final int a = 2;

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ef.a("gamemode", es.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ee)$$0x.getSource()).h()), es.a($$0x, "gamemode"))))
                  .then(ef.a("target", er.d()).executes($$0x -> a($$0x, er.f($$0x, "target"), es.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ee $$0, aqo $$1, daw $$2) {
      wx $$3 = wx.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> wx.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().aa().b(dav.p)) {
            $$1.a(wx.a("gameMode.changed", $$3));
         }

         $$0.a(() -> wx.a("commands.gamemode.success.other", $$1.O_(), $$3), true);
      }
   }

   private static int a(CommandContext<ee> $$0, Collection<aqo> $$1, daw $$2) {
      int $$3 = 0;

      for (aqo $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ee)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
