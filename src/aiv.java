import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aiv {
   private static final int a = -1;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), -1)))
                        .then(dt.a("duration", fc.a(1)).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)dt.a("rain").executes($$0x -> b((ds)$$0x.getSource(), -1)))
                     .then(dt.a("duration", fc.a(1)).executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)dt.a("thunder").executes($$0x -> c((ds)$$0x.getSource(), -1)))
                  .then(dt.a("duration", fc.a(1)).executes($$0x -> c((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ds $$0, int $$1, bft $$2) {
      return $$1 == -1 ? $$2.a($$0.e().y_()) : $$1;
   }

   private static int a(ds $$0, int $$1) {
      $$0.e().a(a($$0, $$1, aki.b), 0, false, false);
      $$0.a(() -> te.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ds $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, aki.c), true, false);
      $$0.a(() -> te.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ds $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, aki.d), true, true);
      $$0.a(() -> te.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
