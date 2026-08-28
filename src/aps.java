import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aps {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("set")
                                    .then(ek.a("day").executes($$0x -> a((ej)$$0x.getSource(), 1000))))
                                 .then(ek.a("noon").executes($$0x -> a((ej)$$0x.getSource(), 6000))))
                              .then(ek.a("night").executes($$0x -> a((ej)$$0x.getSource(), 13000))))
                           .then(ek.a("midnight").executes($$0x -> a((ej)$$0x.getSource(), 18000))))
                        .then(ek.a("time", fz.a()).executes($$0x -> a((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ek.a("add").then(ek.a("time", fz.a()).executes($$0x -> b((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("query")
                        .then(ek.a("daytime").executes($$0x -> c((ej)$$0x.getSource(), a(((ej)$$0x.getSource()).e())))))
                     .then(ek.a("gametime").executes($$0x -> c((ej)$$0x.getSource(), (int)(((ej)$$0x.getSource()).e().ae() % 2147483647L)))))
                  .then(ek.a("day").executes($$0x -> c((ej)$$0x.getSource(), (int)(((ej)$$0x.getSource()).e().af() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(ars $$0) {
      return (int)($$0.af() % 24000L);
   }

   private static int c(ej $$0, int $$1) {
      $$0.a(() -> xa.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ej $$0, int $$1) {
      for (ars $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.l().H();
      $$0.a(() -> xa.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ej $$0, int $$1) {
      for (ars $$2 : $$0.l().L()) {
         $$2.b($$2.af() + (long)$$1);
      }

      $$0.l().H();
      int $$3 = a($$0.e());
      $$0.a(() -> xa.a("commands.time.set", $$3), true);
      return $$3;
   }
}
