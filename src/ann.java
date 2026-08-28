import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class ann {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ex.a("gamemode", fk.a()).executes($$0x -> a((ew)$$0x.getSource(), fk.a($$0x, "gamemode"))))
      );
   }

   private static int a(ew $$0, dgw $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dgw $$4 = $$3.bd();
      if ($$4 != null) {
         for (ary $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xk.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
