import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class aid {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dv.a("gamemode", eh.a()).executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "gamemode"))))
      );
   }

   private static int a(du $$0, crx $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.m();
      $$3.a($$1);
      crx $$4 = $$3.bb();
      if ($$4 != null) {
         for (amf $$5 : $$3.ae().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> ur.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
