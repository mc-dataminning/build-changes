import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aij {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ds)$$0x.getSource()).a(() -> te.c("commands.stop.stopping"), true);
         ((ds)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
