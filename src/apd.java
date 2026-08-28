import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apd {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("set")
                                    .then(ey.a("day").executes($$0x -> a((ex)$$0x.getSource(), 1000))))
                                 .then(ey.a("noon").executes($$0x -> a((ex)$$0x.getSource(), 6000))))
                              .then(ey.a("night").executes($$0x -> a((ex)$$0x.getSource(), 13000))))
                           .then(ey.a("midnight").executes($$0x -> a((ex)$$0x.getSource(), 18000))))
                        .then(ey.a("time", gm.a()).executes($$0x -> a((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ey.a("add").then(ey.a("time", gm.a()).executes($$0x -> b((ex)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("query")
                        .then(ey.a("daytime").executes($$0x -> c((ex)$$0x.getSource(), a(((ex)$$0x.getSource()).e())))))
                     .then(ey.a("gametime").executes($$0x -> c((ex)$$0x.getSource(), (int)(((ex)$$0x.getSource()).e().ad() % 2147483647L)))))
                  .then(ey.a("day").executes($$0x -> c((ex)$$0x.getSource(), (int)(((ex)$$0x.getSource()).e().ae() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(arc $$0) {
      return (int)($$0.ae() % 24000L);
   }

   private static int c(ex $$0, int $$1) {
      $$0.a(() -> wo.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ex $$0, int $$1) {
      for (arc $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.l().H();
      $$0.a(() -> wo.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ex $$0, int $$1) {
      for (arc $$2 : $$0.l().L()) {
         $$2.b($$2.ae() + (long)$$1);
      }

      $$0.l().H();
      int $$3 = a($$0.e());
      $$0.a(() -> wo.a("commands.time.set", $$3), true);
      return $$3;
   }
}
