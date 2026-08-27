import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class all {
   private static final int a = -1;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), -1)))
                        .then(dt.a("duration", ff.a(1)).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)dt.a("rain").executes($$0x -> b((ds)$$0x.getSource(), -1)))
                     .then(dt.a("duration", ff.a(1)).executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)dt.a("thunder").executes($$0x -> c((ds)$$0x.getSource(), -1)))
                  .then(dt.a("duration", ff.a(1)).executes($$0x -> c((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ds $$0, int $$1, bja $$2) {
      return $$1 == -1 ? $$2.a($$0.e().F_()) : $$1;
   }

   private static int a(ds $$0, int $$1) {
      $$0.e().a(a($$0, $$1, amz.b), 0, false, false);
      $$0.a(() -> vd.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ds $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, amz.c), true, false);
      $$0.a(() -> vd.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ds $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, amz.d), true, true);
      $$0.a(() -> vd.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
