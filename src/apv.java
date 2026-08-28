import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apv {
   private static final int a = -1;

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ek.a("clear").executes($$0x -> a((ej)$$0x.getSource(), -1)))
                        .then(ek.a("duration", fz.a(1)).executes($$0x -> a((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ek.a("rain").executes($$0x -> b((ej)$$0x.getSource(), -1)))
                     .then(ek.a("duration", fz.a(1)).executes($$0x -> b((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ek.a("thunder").executes($$0x -> c((ej)$$0x.getSource(), -1)))
                  .then(ek.a("duration", fz.a(1)).executes($$0x -> c((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ej $$0, int $$1, btl $$2) {
      return $$1 == -1 ? $$2.a($$0.l().J().C_()) : $$1;
   }

   private static int a(ej $$0, int $$1) {
      $$0.l().J().a(a($$0, $$1, arq.b), 0, false, false);
      $$0.a(() -> wy.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ej $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arq.c), true, false);
      $$0.a(() -> wy.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ej $$0, int $$1) {
      $$0.l().J().a(0, a($$0, $$1, arq.d), true, true);
      $$0.a(() -> wy.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
