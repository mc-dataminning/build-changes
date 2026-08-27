import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aks {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(dt.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ds $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> vd.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
