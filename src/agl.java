import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class agl {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ds.a("gamemode", ed.a()).executes($$0x -> a((dr)$$0x.getSource(), ed.a($$0x, "gamemode"))))
      );
   }

   private static int a(dr $$0, cpj $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      cpj $$4 = $$3.aX();
      if ($$4 != null) {
         for (akl $$5 : $$3.ac().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> tf.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
