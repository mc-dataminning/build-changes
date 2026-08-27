import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class amk {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralArgumentBuilder<ee> $$1 = ef.a("difficulty");

      for (bpt $$2 : bpt.values()) {
         $$1.then(ef.a($$2.e()).executes($$1x -> a((ee)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bpt $$1x = ((ee)$$0x.getSource()).e().ak();
         ((ee)$$0x.getSource()).a(() -> wx.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ee $$0, bpt $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.bb().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> wx.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
