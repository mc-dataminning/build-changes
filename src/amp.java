import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class amp {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ei.a("gamemode", ev.a()).executes($$0x -> a((eh)$$0x.getSource(), ev.a($$0x, "gamemode"))))
      );
   }

   private static int a(eh $$0, dbx $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dbx $$4 = $$3.bf();
      if ($$4 != null) {
         for (aqu $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xe.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
