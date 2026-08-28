import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amy {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralArgumentBuilder<ep> $$1 = eq.a("difficulty");

      for (bqm $$2 : bqm.values()) {
         $$1.then(eq.a($$2.e()).executes($$1x -> a((ep)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bqm $$1x = ((ep)$$0x.getSource()).e().al();
         ((ep)$$0x.getSource()).a(() -> xl.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ep $$0, bqm $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bb().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xl.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
