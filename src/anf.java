import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class anf {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ew.a("gamemode", fj.a()).executes($$0x -> a((ev)$$0x.getSource(), fj.a($$0x, "gamemode"))))
      );
   }

   private static int a(ev $$0, des $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      des $$4 = $$3.be();
      if ($$4 != null) {
         for (arn $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xh.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
