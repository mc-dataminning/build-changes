import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoe {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ed)$$0x.getSource()).a(() -> wu.c("commands.stop.stopping"), true);
         ((ed)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
