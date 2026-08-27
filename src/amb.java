import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amb {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralArgumentBuilder<ec> $$1 = ed.a("difficulty");

      for (bon $$2 : bon.values()) {
         $$1.then(ed.a($$2.e()).executes($$1x -> a((ec)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bon $$1x = ((ec)$$0x.getSource()).e().ak();
         ((ec)$$0x.getSource()).a(() -> ws.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ec $$0, bon $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bc().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> ws.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
