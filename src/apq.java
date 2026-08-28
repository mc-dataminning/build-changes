import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apq {
   private static final int a = -1;

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ev.a("clear").executes($$0x -> a((eu)$$0x.getSource(), -1)))
                        .then(ev.a("duration", gj.a(1)).executes($$0x -> a((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ev.a("rain").executes($$0x -> b((eu)$$0x.getSource(), -1)))
                     .then(ev.a("duration", gj.a(1)).executes($$0x -> b((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ev.a("thunder").executes($$0x -> c((eu)$$0x.getSource(), -1)))
                  .then(ev.a("duration", gj.a(1)).executes($$0x -> c((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(eu $$0, int $$1, bqx $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().D_()) : $$1;
   }

   private static int a(eu $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, arj.b), 0, false, false);
      $$0.a(() -> xe.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(eu $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arj.c), true, false);
      $$0.a(() -> xe.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(eu $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arj.d), true, true);
      $$0.a(() -> xe.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
