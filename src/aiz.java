import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aiz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vd.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("difficulty");

      for (bjs $$2 : bjs.values()) {
         $$1.then(dt.a($$2.e()).executes($$1x -> a((ds)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bjs $$1x = ((ds)$$0x.getSource()).e().ak();
         ((ds)$$0x.getSource()).a(() -> vd.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ds $$0, bjs $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aY().s() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> vd.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
