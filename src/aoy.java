import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoy {
   private static final int a = -1;

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("weather").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)ef.a("clear").executes($$0x -> a((ee)$$0x.getSource(), -1)))
                        .then(ef.a("duration", ft.a(1)).executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ef.a("rain").executes($$0x -> b((ee)$$0x.getSource(), -1)))
                     .then(ef.a("duration", ft.a(1)).executes($$0x -> b((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
               ))
            .then(
               ((LiteralArgumentBuilder)ef.a("thunder").executes($$0x -> c((ee)$$0x.getSource(), -1)))
                  .then(ef.a("duration", ft.a(1)).executes($$0x -> c((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "duration"))))
            )
      );
   }

   private static int a(ee $$0, int $$1, bpb $$2) {
      return $$1 == -1 ? $$2.a($$0.l().I().E_()) : $$1;
   }

   private static int a(ee $$0, int $$1) {
      $$0.l().I().a(a($$0, $$1, aqn.b), 0, false, false);
      $$0.a(() -> wx.c("commands.weather.set.clear"), true);
      return $$1;
   }

   private static int b(ee $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqn.c), true, false);
      $$0.a(() -> wx.c("commands.weather.set.rain"), true);
      return $$1;
   }

   private static int c(ee $$0, int $$1) {
      $$0.l().I().a(0, a($$0, $$1, aqn.d), true, true);
      $$0.a(() -> wx.c("commands.weather.set.thunder"), true);
      return $$1;
   }
}
