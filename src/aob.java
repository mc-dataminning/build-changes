import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aob {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(er.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(eq $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> wu.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
