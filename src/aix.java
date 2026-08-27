import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aix {
   private static final int a = -1;

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ds.a("clear").executes($$0x -> a((dr)$$0x.getSource(), -1)))
                        .then(ds.a("duration", fb.a(1)).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ds.a("rain").executes($$0x -> b((dr)$$0x.getSource(), -1)))
                     .then(ds.a("duration", fb.a(1)).executes($$0x -> b((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ds.a("thunder").executes($$0x -> c((dr)$$0x.getSource(), -1)))
                  .then(ds.a("duration", fb.a(1)).executes($$0x -> c((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(dr $$0, int $$1, bfv $$2) {
      return $$1 == -1 ? $$2.a($$0.e().y_()) : $$1;
   }

   private static int a(dr $$0, int $$1) {
      $$0.e().a(a($$0, $$1, akk.b), 0, false, false);
      $$0.a(() -> tf.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(dr $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, akk.c), true, false);
      $$0.a(() -> tf.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(dr $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, akk.d), true, true);
      $$0.a(() -> tf.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
