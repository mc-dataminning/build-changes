import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class agm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = ds.a("difficulty");

      for (bgn $$2 : bgn.values()) {
         $$1.then(ds.a($$2.e()).executes($$1x -> a((dr)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bgn $$1x = ((dr)$$0x.getSource()).e().ai();
         ((dr)$$0x.getSource()).a(() -> tf.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(dr $$0, bgn $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aT().s() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> tf.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
