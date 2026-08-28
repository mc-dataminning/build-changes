import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anp {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(el.a("gamemode", ey.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "gamemode"))))
      );
   }

   private static int a(ek $$0, dkg $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dkg $$4 = $$3.bd();
      if ($$4 != null) {
         for (asc $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xg.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
