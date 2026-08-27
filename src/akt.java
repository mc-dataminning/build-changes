import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class akt {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dv.a("gamemode", ei.a()).executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "gamemode"))))
      );
   }

   private static int a(du $$0, cvk $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      cvk $$4 = $$3.bb();
      if ($$4 != null) {
         for (aow $$5 : $$3.ae().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> vq.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
