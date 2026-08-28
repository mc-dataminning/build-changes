import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class api {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("set")
                                    .then(eu.a("day").executes($$0x -> a((et)$$0x.getSource(), 1000))))
                                 .then(eu.a("noon").executes($$0x -> a((et)$$0x.getSource(), 6000))))
                              .then(eu.a("night").executes($$0x -> a((et)$$0x.getSource(), 13000))))
                           .then(eu.a("midnight").executes($$0x -> a((et)$$0x.getSource(), 18000))))
                        .then(eu.a("time", gi.a()).executes($$0x -> a((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(eu.a("add").then(eu.a("time", gi.a()).executes($$0x -> b((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("query")
                        .then(eu.a("daytime").executes($$0x -> c((et)$$0x.getSource(), a(((et)$$0x.getSource()).e())))))
                     .then(eu.a("gametime").executes($$0x -> c((et)$$0x.getSource(), (int)(((et)$$0x.getSource()).e().aa() % 2147483647L)))))
                  .then(eu.a("day").executes($$0x -> c((et)$$0x.getSource(), (int)(((et)$$0x.getSource()).e().ab() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(arg $$0) {
      return (int)($$0.ab() % 24000L);
   }

   private static int c(et $$0, int $$1) {
      $$0.a(() -> xd.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(et $$0, int $$1) {
      for (arg $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xd.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(et $$0, int $$1) {
      for (arg $$2 : $$0.l().L()) {
         $$2.b($$2.ab() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xd.a("commands.time.set", $$3), true);
      return $$3;
   }
}
