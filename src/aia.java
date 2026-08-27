import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class aia {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dv.a("gamemode", eh.a()).executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "gamemode"))))
      );
   }

   private static int a(du $$0, crp $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.m();
      $$3.a($$1);
      crp $$4 = $$3.aW();
      if ($$4 != null) {
         for (amb $$5 : $$3.ac().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> ur.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
