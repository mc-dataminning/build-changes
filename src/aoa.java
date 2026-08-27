import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoa {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("set")
                                    .then(dw.a("day").executes($$0x -> a((dv)$$0x.getSource(), 1000))))
                                 .then(dw.a("noon").executes($$0x -> a((dv)$$0x.getSource(), 6000))))
                              .then(dw.a("night").executes($$0x -> a((dv)$$0x.getSource(), 13000))))
                           .then(dw.a("midnight").executes($$0x -> a((dv)$$0x.getSource(), 18000))))
                        .then(dw.a("time", fj.a()).executes($$0x -> a((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(dw.a("add").then(dw.a("time", fj.a()).executes($$0x -> b((dv)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("query")
                        .then(dw.a("daytime").executes($$0x -> c((dv)$$0x.getSource(), a(((dv)$$0x.getSource()).e())))))
                     .then(dw.a("gametime").executes($$0x -> c((dv)$$0x.getSource(), (int)(((dv)$$0x.getSource()).e().Y() % 2147483647L)))))
                  .then(dw.a("day").executes($$0x -> c((dv)$$0x.getSource(), (int)(((dv)$$0x.getSource()).e().Z() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(apu $$0) {
      return (int)($$0.Z() % 24000L);
   }

   private static int c(dv $$0, int $$1) {
      $$0.a(() -> wi.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(dv $$0, int $$1) {
      for (apu $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> wi.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(dv $$0, int $$1) {
      for (apu $$2 : $$0.l().K()) {
         $$2.b($$2.Z() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> wi.a("commands.time.set", $$3), true);
      return $$3;
   }
}
