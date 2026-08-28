import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anb {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(eq.a("gamemode", fd.a()).executes($$0x -> a((ep)$$0x.getSource(), fd.a($$0x, "gamemode"))))
      );
   }

   private static int a(ep $$0, dbw $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dbw $$4 = $$3.bf();
      if ($$4 != null) {
         for (arg $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xp.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
