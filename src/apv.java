import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apv {
   private static final int a = -1;

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ej.a("clear").executes($$0x -> a((ei)$$0x.getSource(), -1)))
                        .then(ej.a("duration", fy.a(1)).executes($$0x -> a((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ej.a("rain").executes($$0x -> b((ei)$$0x.getSource(), -1)))
                     .then(ej.a("duration", fy.a(1)).executes($$0x -> b((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ej.a("thunder").executes($$0x -> c((ei)$$0x.getSource(), -1)))
                  .then(ej.a("duration", fy.a(1)).executes($$0x -> c((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ei $$0, int $$1, btg $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().C_()) : $$1;
   }

   private static int a(ei $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, arq.b), 0, false, false);
      $$0.a(() -> wy.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ei $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arq.c), true, false);
      $$0.a(() -> wy.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ei $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arq.d), true, true);
      $$0.a(() -> wy.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
