import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class amd {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ee.a("gamemode", er.a()).executes($$0x -> a((ed)$$0x.getSource(), er.a($$0x, "gamemode"))))
      );
   }

   private static int a(ed $$0, daa $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      daa $$4 = $$3.bf();
      if ($$4 != null) {
         for (aqi $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> wu.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
