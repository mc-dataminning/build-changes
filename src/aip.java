import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aip {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vb.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("difficulty");

      for (bji $$2 : bji.values()) {
         $$1.then(dt.a($$2.e()).executes($$1x -> a((ds)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bji $$1x = ((ds)$$0x.getSource()).e().aj();
         ((ds)$$0x.getSource()).a(() -> vb.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ds $$0, bji $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aY().s() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> vb.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
