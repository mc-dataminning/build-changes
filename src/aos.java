import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aos {
   private static final int a = -1;

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ee.a("clear").executes($$0x -> a((ed)$$0x.getSource(), -1)))
                        .then(ee.a("duration", fs.a(1)).executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ee.a("rain").executes($$0x -> b((ed)$$0x.getSource(), -1)))
                     .then(ee.a("duration", fs.a(1)).executes($$0x -> b((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ee.a("thunder").executes($$0x -> c((ed)$$0x.getSource(), -1)))
                  .then(ee.a("duration", fs.a(1)).executes($$0x -> c((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ed $$0, int $$1, bor $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(ed $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqh.b), 0, false, false);
      $$0.a(() -> wu.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ed $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqh.c), true, false);
      $$0.a(() -> wu.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ed $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqh.d), true, true);
      $$0.a(() -> wu.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
