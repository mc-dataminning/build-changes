import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class app {
   private static final int a = -1;

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)eq.a("clear").executes($$0x -> a((ep)$$0x.getSource(), -1)))
                        .then(eq.a("duration", ge.a(1)).executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)eq.a("rain").executes($$0x -> b((ep)$$0x.getSource(), -1)))
                     .then(eq.a("duration", ge.a(1)).executes($$0x -> b((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)eq.a("thunder").executes($$0x -> c((ep)$$0x.getSource(), -1)))
                  .then(eq.a("duration", ge.a(1)).executes($$0x -> c((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ep $$0, int $$1, bpy $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(ep $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, are.b), 0, false, false);
      $$0.a(() -> xo.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ep $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, are.c), true, false);
      $$0.a(() -> xo.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ep $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, are.d), true, true);
      $$0.a(() -> xo.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
