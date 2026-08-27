import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class aei {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dt.a("gamemode", ed.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.a($$0x, "gamemode"))))
      );
   }

   private static int a(ds $$0, cmj $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      cmj $$4 = $$3.aX();
      if ($$4 != null) {
         for (aig $$5 : $$3.ac().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> sw.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
