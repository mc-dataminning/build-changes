import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.save.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("save-all").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ec)$$0x.getSource(), false)))
            .then(ed.a("flush").executes($$0x -> a((ec)$$0x.getSource(), true)))
      );
   }

   private static int a(ec $$0, boolean $$1) throws CommandSyntaxException {
      $$0.a(() -> ws.c("commands.save.saving"), false);
      MinecraftServer $$2 = $$0.l();
      boolean $$3 = $$2.b(true, $$1, true);
      if (!$$3) {
         throw a.create();
      } else {
         $$0.a(() -> ws.c("commands.save.success"), true);
         return 1;
      }
   }
}
