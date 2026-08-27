import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anv {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(ed.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ec $$0, int $$1) {
      $$0.l().c($$1);
      $$0.a(() -> ws.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
