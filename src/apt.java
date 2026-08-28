import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apt {
   private static final int a = -1;

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ew.a("clear").executes($$0x -> a((ev)$$0x.getSource(), -1)))
                        .then(ew.a("duration", gk.a(1)).executes($$0x -> a((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ew.a("rain").executes($$0x -> b((ev)$$0x.getSource(), -1)))
                     .then(ew.a("duration", gk.a(1)).executes($$0x -> b((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ew.a("thunder").executes($$0x -> c((ev)$$0x.getSource(), -1)))
                  .then(ew.a("duration", gk.a(1)).executes($$0x -> c((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ev $$0, int $$1, brd $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().E_()) : $$1;
   }

   private static int a(ev $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, arm.b), 0, false, false);
      $$0.a(() -> xh.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ev $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arm.c), true, false);
      $$0.a(() -> xh.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ev $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arm.d), true, true);
      $$0.a(() -> xh.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
