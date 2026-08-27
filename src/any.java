import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class any {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(ee.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ed $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> wu.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
