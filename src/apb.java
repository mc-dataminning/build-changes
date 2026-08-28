import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apb {
   private static final int a = -1;

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)eu.a("clear").executes($$0x -> a((et)$$0x.getSource(), -1)))
                        .then(eu.a("duration", gi.a(1)).executes($$0x -> a((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)eu.a("rain").executes($$0x -> b((et)$$0x.getSource(), -1)))
                     .then(eu.a("duration", gi.a(1)).executes($$0x -> b((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)eu.a("thunder").executes($$0x -> c((et)$$0x.getSource(), -1)))
                  .then(eu.a("duration", gi.a(1)).executes($$0x -> c((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(et $$0, int $$1, bpv $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(et $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqt.b), 0, false, false);
      $$0.a(() -> wy.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(et $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqt.c), true, false);
      $$0.a(() -> wy.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(et $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqt.d), true, true);
      $$0.a(() -> wy.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
