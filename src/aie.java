import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aie {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("difficulty");

      for (biu $$2 : biu.values()) {
         $$1.then(dv.a($$2.e()).executes($$1x -> a((du)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         biu $$1x = ((du)$$0x.getSource()).f().aj();
         ((du)$$0x.getSource()).a(() -> ur.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(du $$0, biu $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.m();
      if ($$2.aY().s() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> ur.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
