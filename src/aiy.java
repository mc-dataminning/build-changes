import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class aiy {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(dt.a("gamemode", eg.a()).executes($$0x -> a((ds)$$0x.getSource(), eg.a($$0x, "gamemode"))))
      );
   }

   private static int a(ds $$0, ctf $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      ctf $$4 = $$3.bb();
      if ($$4 != null) {
         for (ana $$5 : $$3.ae().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> vd.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
