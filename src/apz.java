import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apz {
   private static final int a = -1;

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)el.a("clear").executes($$0x -> a((ek)$$0x.getSource(), -1)))
                        .then(el.a("duration", ga.a(1)).executes($$0x -> a((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)el.a("rain").executes($$0x -> b((ek)$$0x.getSource(), -1)))
                     .then(el.a("duration", ga.a(1)).executes($$0x -> b((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)el.a("thunder").executes($$0x -> c((ek)$$0x.getSource(), -1)))
                  .then(el.a("duration", ga.a(1)).executes($$0x -> c((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ek $$0, int $$1, bty $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().G_()) : $$1;
   }

   private static int a(ek $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, aru.b), 0, false, false);
      $$0.a(() -> xc.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ek $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, aru.c), true, false);
      $$0.a(() -> xc.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ek $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, aru.d), true, true);
      $$0.a(() -> xc.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
