import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apf {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("stop").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ((ev)$$0x.getSource()).a(() -> xh.c("commands.stop.stopping"), true);
         ((ev)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
