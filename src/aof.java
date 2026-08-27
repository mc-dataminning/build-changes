import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aof {
   private static final int a = -1;

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)dw.a("clear").executes($$0x -> a((dv)$$0x.getSource(), -1)))
                        .then(dw.a("duration", fj.a(1)).executes($$0x -> a((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)dw.a("rain").executes($$0x -> b((dv)$$0x.getSource(), -1)))
                     .then(dw.a("duration", fj.a(1)).executes($$0x -> b((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)dw.a("thunder").executes($$0x -> c((dv)$$0x.getSource(), -1)))
                  .then(dw.a("duration", fj.a(1)).executes($$0x -> c((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(dv $$0, int $$1, bnk $$2) {
      return $$1 == -1 ? $$2.a($$0.e().E_()) : $$1;
   }

   private static int a(dv $$0, int $$1) {
      $$0.e().a(a($$0, $$1, apu.b), 0, false, false);
      $$0.a(() -> wi.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(dv $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, apu.c), true, false);
      $$0.a(() -> wi.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(dv $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, apu.d), true, true);
      $$0.a(() -> wi.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
