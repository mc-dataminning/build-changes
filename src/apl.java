import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apl {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("set")
                                    .then(ev.a("day").executes($$0x -> a((eu)$$0x.getSource(), 1000))))
                                 .then(ev.a("noon").executes($$0x -> a((eu)$$0x.getSource(), 6000))))
                              .then(ev.a("night").executes($$0x -> a((eu)$$0x.getSource(), 13000))))
                           .then(ev.a("midnight").executes($$0x -> a((eu)$$0x.getSource(), 18000))))
                        .then(ev.a("time", gj.a()).executes($$0x -> a((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ev.a("add").then(ev.a("time", gj.a()).executes($$0x -> b((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("query")
                        .then(ev.a("daytime").executes($$0x -> c((eu)$$0x.getSource(), a(((eu)$$0x.getSource()).e())))))
                     .then(ev.a("gametime").executes($$0x -> c((eu)$$0x.getSource(), (int)(((eu)$$0x.getSource()).e().aa() % 2147483647L)))))
                  .then(ev.a("day").executes($$0x -> c((eu)$$0x.getSource(), (int)(((eu)$$0x.getSource()).e().ab() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(arj $$0) {
      return (int)($$0.ab() % 24000L);
   }

   private static int c(eu $$0, int $$1) {
      $$0.a(() -> xe.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(eu $$0, int $$1) {
      for (arj $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xe.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(eu $$0, int $$1) {
      for (arj $$2 : $$0.l().L()) {
         $$2.b($$2.ab() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xe.a("commands.time.set", $$3), true);
      return $$3;
   }
}
