import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amh {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<eq> $$0) {
      LiteralArgumentBuilder<eq> $$1 = er.a("difficulty");

      for (bqa $$2 : bqa.values()) {
         $$1.then(er.a($$2.e()).executes($$1x -> a((eq)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bqa $$1x = ((eq)$$0x.getSource()).e().al();
         ((eq)$$0x.getSource()).a(() -> wu.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(eq $$0, bqa $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bb().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wu.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
