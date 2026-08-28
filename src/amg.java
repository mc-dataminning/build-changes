import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class amg {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(er.a("gamemode", fe.a()).executes($$0x -> a((eq)$$0x.getSource(), fe.a($$0x, "gamemode"))))
      );
   }

   private static int a(eq $$0, dca $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dca $$4 = $$3.bf();
      if ($$4 != null) {
         for (aql $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wu.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
