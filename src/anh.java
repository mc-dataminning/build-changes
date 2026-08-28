import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anh {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralArgumentBuilder<ej> $$1 = ek.a("difficulty");

      for (buo $$2 : buo.values()) {
         $$1.then(ek.a($$2.e()).executes($$1x -> a((ej)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         buo $$1x = ((ej)$$0x.getSource()).e().an();
         ((ej)$$0x.getSource()).a(() -> xa.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ej $$0, buo $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xa.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
