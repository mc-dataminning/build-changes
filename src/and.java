import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class and {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<eu> $$0) {
      LiteralArgumentBuilder<eu> $$1 = ev.a("difficulty");

      for (brp $$2 : brp.values()) {
         $$1.then(ev.a($$2.e()).executes($$1x -> a((eu)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         brp $$1x = ((eu)$$0x.getSource()).e().am();
         ((eu)$$0x.getSource()).a(() -> xe.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(eu $$0, brp $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.ba().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xe.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
