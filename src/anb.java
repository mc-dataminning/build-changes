import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anb {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ey.a("gamemode", fl.a()).executes($$0x -> a((ex)$$0x.getSource(), fl.a($$0x, "gamemode"))))
      );
   }

   private static int a(ex $$0, dhm $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dhm $$4 = $$3.bd();
      if ($$4 != null) {
         for (aro $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wv.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
