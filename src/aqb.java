import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqb {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("set")
                                    .then(el.a("day").executes($$0x -> a((ek)$$0x.getSource(), 1000))))
                                 .then(el.a("noon").executes($$0x -> a((ek)$$0x.getSource(), 6000))))
                              .then(el.a("night").executes($$0x -> a((ek)$$0x.getSource(), 13000))))
                           .then(el.a("midnight").executes($$0x -> a((ek)$$0x.getSource(), 18000))))
                        .then(el.a("time", ga.a()).executes($$0x -> a((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(el.a("add").then(el.a("time", ga.a()).executes($$0x -> b((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("query")
                        .then(el.a("daytime").executes($$0x -> c((ek)$$0x.getSource(), a(((ek)$$0x.getSource()).e())))))
                     .then(el.a("gametime").executes($$0x -> c((ek)$$0x.getSource(), (int)(((ek)$$0x.getSource()).e().ae() % 2147483647L)))))
                  .then(el.a("day").executes($$0x -> c((ek)$$0x.getSource(), (int)(((ek)$$0x.getSource()).e().af() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(asb $$0) {
      return (int)($$0.af() % 24000L);
   }

   private static int c(ek $$0, int $$1) {
      $$0.a(() -> xg.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ek $$0, int $$1) {
      for (asb $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.l().H();
      $$0.a(() -> xg.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ek $$0, int $$1) {
      for (asb $$2 : $$0.l().L()) {
         $$2.b($$2.af() + (long)$$1);
      }

      $$0.l().H();
      int $$3 = a($$0.e());
      $$0.a(() -> xg.a("commands.time.set", $$3), true);
      return $$3;
   }
}
