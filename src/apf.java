import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apf {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ei)$$0x.getSource()).a(() -> ww.c("commands.stop.stopping"), true);
         ((ei)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
