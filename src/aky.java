import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aky {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vs.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("difficulty");

      for (bmi $$2 : bmi.values()) {
         $$1.then(dv.a($$2.e()).executes($$1x -> a((du)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bmi $$1x = ((du)$$0x.getSource()).e().aj();
         ((du)$$0x.getSource()).a(() -> vs.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(du $$0, bmi $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bc().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> vs.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
