import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class ang {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralArgumentBuilder<ev> $$1 = ew.a("difficulty");

      for (brv $$2 : brv.values()) {
         $$1.then(ew.a($$2.e()).executes($$1x -> a((ev)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         brv $$1x = ((ev)$$0x.getSource()).e().am();
         ((ev)$$0x.getSource()).a(() -> xh.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ev $$0, brv $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.ba().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xh.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
