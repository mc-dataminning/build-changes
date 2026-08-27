import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class agp {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ti.a("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralArgumentBuilder<dt> $$1 = du.a("difficulty");

      for (bgq $$2 : bgq.values()) {
         $$1.then(du.a($$2.e()).executes($$1x -> a((dt)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bgq $$1x = ((dt)$$0x.getSource()).e().ai();
         ((dt)$$0x.getSource()).a(() -> ti.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(dt $$0, bgq $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aT().s() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> ti.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
