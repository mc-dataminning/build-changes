import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = ey.a("difficulty");

      for (bsh $$2 : bsh.values()) {
         $$1.then(ey.a($$2.e()).executes($$1x -> a((ex)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bsh $$1x = ((ex)$$0x.getSource()).e().am();
         ((ex)$$0x.getSource()).a(() -> wp.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ex $$0, bsh $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wp.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
