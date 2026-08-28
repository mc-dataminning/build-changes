import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anf {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralArgumentBuilder<ei> $$1 = ej.a("difficulty");

      for (bty $$2 : bty.values()) {
         $$1.then(ej.a($$2.e()).executes($$1x -> a((ei)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bty $$1x = ((ei)$$0x.getSource()).e().an();
         ((ei)$$0x.getSource()).a(() -> wy.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ei $$0, bty $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wy.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
