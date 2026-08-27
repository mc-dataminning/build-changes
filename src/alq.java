import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class alq {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dw.a("gamemode", ej.a()).executes($$0x -> a((dv)$$0x.getSource(), ej.a($$0x, "gamemode"))))
      );
   }

   private static int a(dv $$0, czd $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      czd $$4 = $$3.bf();
      if ($$4 != null) {
         for (apv $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wi.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
