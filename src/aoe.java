import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoe {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(ef.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ee $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> wx.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
