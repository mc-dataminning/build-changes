import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqn {
   private static final int a = -1;

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ex.a("clear").executes($$0x -> a((ew)$$0x.getSource(), -1)))
                        .then(ex.a("duration", gl.a(1)).executes($$0x -> a((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ex.a("rain").executes($$0x -> b((ew)$$0x.getSource(), -1)))
                     .then(ex.a("duration", gl.a(1)).executes($$0x -> b((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ex.a("thunder").executes($$0x -> c((ew)$$0x.getSource(), -1)))
                  .then(ex.a("duration", gl.a(1)).executes($$0x -> c((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ew $$0, int $$1, bsn $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().H_()) : $$1;
   }

   private static int a(ew $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, ash.b), 0, false, false);
      $$0.a(() -> xv.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ew $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, ash.c), true, false);
      $$0.a(() -> xv.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ew $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, ash.d), true, true);
      $$0.a(() -> xv.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
