import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anm {
   private static final int a = -1;

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), -1)))
                        .then(dv.a("duration", fh.a(1)).executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)dv.a("rain").executes($$0x -> b((du)$$0x.getSource(), -1)))
                     .then(dv.a("duration", fh.a(1)).executes($$0x -> b((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)dv.a("thunder").executes($$0x -> c((du)$$0x.getSource(), -1)))
                  .then(dv.a("duration", fh.a(1)).executes($$0x -> c((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(du $$0, int $$1, blq $$2) {
      return $$1 == -1 ? $$2.a($$0.e().F_()) : $$1;
   }

   private static int a(du $$0, int $$1) {
      $$0.e().a(a($$0, $$1, apa.b), 0, false, false);
      $$0.a(() -> vs.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(du $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, apa.c), true, false);
      $$0.a(() -> vs.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(du $$0, int $$1) {
      $$0.e().a(0, a($$0, $$1, apa.d), true, true);
      $$0.a(() -> vs.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
