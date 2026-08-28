import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class ane {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ek.a("gamemode", ex.a()).executes($$0x -> a((ej)$$0x.getSource(), ex.a($$0x, "gamemode"))))
      );
   }

   private static int a(ej $$0, djj $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      djj $$4 = $$3.bd();
      if ($$4 != null) {
         for (arr $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wy.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
