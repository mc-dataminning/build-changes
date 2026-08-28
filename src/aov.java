import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aov {
   private static final int a = -1;

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)er.a("clear").executes($$0x -> a((eq)$$0x.getSource(), -1)))
                        .then(er.a("duration", gf.a(1)).executes($$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)er.a("rain").executes($$0x -> b((eq)$$0x.getSource(), -1)))
                     .then(er.a("duration", gf.a(1)).executes($$0x -> b((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)er.a("thunder").executes($$0x -> c((eq)$$0x.getSource(), -1)))
                  .then(er.a("duration", gf.a(1)).executes($$0x -> c((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(eq $$0, int $$1, bpi $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(eq $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqk.b), 0, false, false);
      $$0.a(() -> wu.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(eq $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqk.c), true, false);
      $$0.a(() -> wu.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(eq $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqk.d), true, true);
      $$0.a(() -> wu.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
