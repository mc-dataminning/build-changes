import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ape {
   private static final int a = -1;

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ei.a("clear").executes($$0x -> a((eh)$$0x.getSource(), -1)))
                        .then(ei.a("duration", fw.a(1)).executes($$0x -> a((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ei.a("rain").executes($$0x -> b((eh)$$0x.getSource(), -1)))
                     .then(ei.a("duration", fw.a(1)).executes($$0x -> b((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ei.a("thunder").executes($$0x -> c((eh)$$0x.getSource(), -1)))
                  .then(ei.a("duration", fw.a(1)).executes($$0x -> c((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(eh $$0, int $$1, bpf $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().F_()) : $$1;
   }

   private static int a(eh $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqt.b), 0, false, false);
      $$0.a(() -> xe.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(eh $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqt.c), true, false);
      $$0.a(() -> xe.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(eh $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqt.d), true, true);
      $$0.a(() -> xe.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
