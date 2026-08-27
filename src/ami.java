import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class ami {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ef.a("gamemode", es.a()).executes($$0x -> a((ee)$$0x.getSource(), es.a($$0x, "gamemode"))))
      );
   }

   private static int a(ee $$0, dau $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dau $$4 = $$3.bf();
      if ($$4 != null) {
         for (aqn $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wx.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
