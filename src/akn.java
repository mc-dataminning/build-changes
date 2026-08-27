import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class akn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.save.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("save-all").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ds)$$0x.getSource(), false)))
            .then(dt.a("flush").executes($$0x -> a((ds)$$0x.getSource(), true)))
      );
   }

   private static int a(ds $$0, boolean $$1) throws CommandSyntaxException {
      $$0.a(() -> vf.c("commands.save.saving"), false);
      MinecraftServer $$2 = $$0.l();
      boolean $$3 = $$2.b(true, $$1, true);
      if (!$$3) {
         throw a.create();
      } else {
         $$0.a(() -> vf.c("commands.save.success"), true);
         return 1;
      }
   }
}
