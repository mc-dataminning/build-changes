import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anc {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralArgumentBuilder<ep> $$1 = eq.a("difficulty");

      for (bqr $$2 : bqr.values()) {
         $$1.then(eq.a($$2.e()).executes($$1x -> a((ep)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bqr $$1x = ((ep)$$0x.getSource()).e().al();
         ((ep)$$0x.getSource()).a(() -> xp.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ep $$0, bqr $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bb().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xp.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
