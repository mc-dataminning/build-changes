import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anc {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ej.a("gamemode", ew.a()).executes($$0x -> a((ei)$$0x.getSource(), ew.a($$0x, "gamemode"))))
      );
   }

   private static int a(ei $$0, dim $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dim $$4 = $$3.bd();
      if ($$4 != null) {
         for (arp $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> ww.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
