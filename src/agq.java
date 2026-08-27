import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class agq {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(du.a("gamemode", ef.a()).executes($$0x -> a((dt)$$0x.getSource(), ef.a($$0x, "gamemode"))))
      );
   }

   private static int a(dt $$0, cps $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      cps $$4 = $$3.aW();
      if ($$4 != null) {
         for (akr $$5 : $$3.ac().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> tl.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
