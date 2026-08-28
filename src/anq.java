import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class anq {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = el.a("difficulty");

      for (buz $$2 : buz.values()) {
         $$1.then(el.a($$2.e()).executes($$1x -> a((ek)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         buz $$1x = ((ek)$$0x.getSource()).e().an();
         ((ek)$$0x.getSource()).a(() -> xg.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ek $$0, buz $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xg.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
