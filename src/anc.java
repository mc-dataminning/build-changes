import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anc {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ev.a("gamemode", fi.a()).executes($$0x -> a((eu)$$0x.getSource(), fi.a($$0x, "gamemode"))))
      );
   }

   private static int a(eu $$0, deg $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      deg $$4 = $$3.be();
      if ($$4 != null) {
         for (ark $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xe.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
