import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aop {
   private static final int a = -1;

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ed.a("clear").executes($$0x -> a((ec)$$0x.getSource(), -1)))
                        .then(ed.a("duration", fq.a(1)).executes($$0x -> a((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ed.a("rain").executes($$0x -> b((ec)$$0x.getSource(), -1)))
                     .then(ed.a("duration", fq.a(1)).executes($$0x -> b((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ed.a("thunder").executes($$0x -> c((ec)$$0x.getSource(), -1)))
                  .then(ed.a("duration", fq.a(1)).executes($$0x -> c((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ec $$0, int $$1, bnv $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(ec $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqe.b), 0, false, false);
      $$0.a(() -> ws.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ec $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqe.c), true, false);
      $$0.a(() -> ws.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ec $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqe.d), true, true);
      $$0.a(() -> ws.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
