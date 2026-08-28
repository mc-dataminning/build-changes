import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apj {
   private static final int a = -1;

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ey.a("clear").executes($$0x -> a((ex)$$0x.getSource(), -1)))
                        .then(ey.a("duration", gm.a(1)).executes($$0x -> a((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ey.a("rain").executes($$0x -> b((ex)$$0x.getSource(), -1)))
                     .then(ey.a("duration", gm.a(1)).executes($$0x -> b((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ey.a("thunder").executes($$0x -> c((ex)$$0x.getSource(), -1)))
                  .then(ey.a("duration", gm.a(1)).executes($$0x -> c((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ex $$0, int $$1, brq $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().H_()) : $$1;
   }

   private static int a(ex $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, ard.b), 0, false, false);
      $$0.a(() -> wp.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ex $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, ard.c), true, false);
      $$0.a(() -> wp.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ex $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, ard.d), true, true);
      $$0.a(() -> wp.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
