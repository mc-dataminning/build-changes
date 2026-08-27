import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class alr {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<dv> $$0) {
      LiteralArgumentBuilder<dv> $$1 = dw.a("difficulty");

      for (boc $$2 : boc.values()) {
         $$1.then(dw.a($$2.e()).executes($$1x -> a((dv)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         boc $$1x = ((dv)$$0x.getSource()).e().ak();
         ((dv)$$0x.getSource()).a(() -> wi.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(dv $$0, boc $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bc().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wi.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
