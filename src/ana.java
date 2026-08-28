import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class ana {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(eu.a("gamemode", fh.a()).executes($$0x -> a((et)$$0x.getSource(), fh.a($$0x, "gamemode"))))
      );
   }

   private static int a(et $$0, ded $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      ded $$4 = $$3.be();
      if ($$4 != null) {
         for (ari $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xd.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
