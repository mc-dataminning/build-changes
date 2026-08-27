import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aot {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("set")
                                    .then(ef.a("day").executes($$0x -> a((ee)$$0x.getSource(), 1000))))
                                 .then(ef.a("noon").executes($$0x -> a((ee)$$0x.getSource(), 6000))))
                              .then(ef.a("night").executes($$0x -> a((ee)$$0x.getSource(), 13000))))
                           .then(ef.a("midnight").executes($$0x -> a((ee)$$0x.getSource(), 18000))))
                        .then(ef.a("time", ft.a()).executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ef.a("add").then(ef.a("time", ft.a()).executes($$0x -> b((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("query")
                        .then(ef.a("daytime").executes($$0x -> c((ee)$$0x.getSource(), a(((ee)$$0x.getSource()).e())))))
                     .then(ef.a("gametime").executes($$0x -> c((ee)$$0x.getSource(), (int)(((ee)$$0x.getSource()).e().Y() % 2147483647L)))))
                  .then(ef.a("day").executes($$0x -> c((ee)$$0x.getSource(), (int)(((ee)$$0x.getSource()).e().Z() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aqn $$0) {
      return (int)($$0.Z() % 24000L);
   }

   private static int c(ee $$0, int $$1) {
      $$0.a(() -> wx.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ee $$0, int $$1) {
      for (aqn $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> wx.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ee $$0, int $$1) {
      for (aqn $$2 : $$0.l().K()) {
         $$2.b($$2.Z() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> wx.a("commands.time.set", $$3), true);
      return $$3;
   }
}
