import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anc {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wv.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = ey.a("difficulty");

      for (btn $$2 : btn.values()) {
         $$1.then(ey.a($$2.e()).executes($$1x -> a((ex)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         btn $$1x = ((ex)$$0x.getSource()).e().an();
         ((ex)$$0x.getSource()).a(() -> wv.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ex $$0, btn $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wv.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
