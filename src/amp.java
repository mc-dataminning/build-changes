import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amp {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wz.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralArgumentBuilder<et> $$1 = eu.a("difficulty");

      for (bqo $$2 : bqo.values()) {
         $$1.then(eu.a($$2.e()).executes($$1x -> a((et)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bqo $$1x = ((et)$$0x.getSource()).e().al();
         ((et)$$0x.getSource()).a(() -> wz.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(et $$0, bqo $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bb().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wz.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
