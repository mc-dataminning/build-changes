import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class any {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xv.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralArgumentBuilder<ew> $$1 = ex.a("difficulty");

      for (btb $$2 : btb.values()) {
         $$1.then(ex.a($$2.e()).executes($$1x -> a((ew)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         btb $$1x = ((ew)$$0x.getSource()).e().al();
         ((ew)$$0x.getSource()).a(() -> xv.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ew $$0, btb $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xv.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
