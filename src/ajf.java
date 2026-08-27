import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ajf {
   private static final int a = -1;

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)du.a("clear").executes($$0x -> a((dt)$$0x.getSource(), -1)))
                        .then(du.a("duration", fd.a(1)).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)du.a("rain").executes($$0x -> b((dt)$$0x.getSource(), -1)))
                     .then(du.a("duration", fd.a(1)).executes($$0x -> b((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)du.a("thunder").executes($$0x -> c((dt)$$0x.getSource(), -1)))
                  .then(du.a("duration", fd.a(1)).executes($$0x -> c((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(dt $$0, int $$1, bgj $$2) {
      return $$1 == -1 ? $$2.a($$0.e().D_()) : $$1;
   }

   private static int a(dt $$0, int $$1) {
      $$0.e().a(a($$0, $$1, akt.b), 0, false, false);
      $$0.a(() -> tl.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(dt $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, akt.c), true, false);
      $$0.a(() -> tl.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(dt $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, akt.d), true, true);
      $$0.a(() -> tl.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
