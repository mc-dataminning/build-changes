import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aju {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(dv.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(du $$0, int $$1) {
      $$0.m().c($$1);
      $$0.a(() -> ur.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
