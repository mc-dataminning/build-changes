import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class ame {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ed> $$0) {
      LiteralArgumentBuilder<ed> $$1 = ee.a("difficulty");

      for (bpj $$2 : bpj.values()) {
         $$1.then(ee.a($$2.e()).executes($$1x -> a((ed)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bpj $$1x = ((ed)$$0x.getSource()).e().ak();
         ((ed)$$0x.getSource()).a(() -> wu.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ed $$0, bpj $$1) throws CommandSyntaxException {
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
