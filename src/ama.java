import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class ama {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("defaultgamemode").requires($$0x -> $$0x.c(2)))
            .then(ed.a("gamemode", eq.a()).executes($$0x -> a((ec)$$0x.getSource(), eq.a($$0x, "gamemode"))))
      );
   }

   private static int a(ec $$0, czr $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      czr $$4 = $$3.bf();
      if ($$4 != null) {
         for (aqf $$5 : $$3.ah().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> ws.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
