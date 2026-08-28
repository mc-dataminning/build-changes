import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class amn {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(eu.a("gamemode", fh.a()).executes($$0x -> a((et)$$0x.getSource(), fh.a($$0x, "gamemode"))))
      );
   }

   private static int a(et $$0, dcr $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dcr $$4 = $$3.bf();
      if ($$4 != null) {
         for (aqu $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wy.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
