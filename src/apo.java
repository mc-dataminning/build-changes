import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apo {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("set")
                                    .then(ew.a("day").executes($$0x -> a((ev)$$0x.getSource(), 1000))))
                                 .then(ew.a("noon").executes($$0x -> a((ev)$$0x.getSource(), 6000))))
                              .then(ew.a("night").executes($$0x -> a((ev)$$0x.getSource(), 13000))))
                           .then(ew.a("midnight").executes($$0x -> a((ev)$$0x.getSource(), 18000))))
                        .then(ew.a("time", gk.a()).executes($$0x -> a((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ew.a("add").then(ew.a("time", gk.a()).executes($$0x -> b((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("query")
                        .then(ew.a("daytime").executes($$0x -> c((ev)$$0x.getSource(), a(((ev)$$0x.getSource()).e())))))
                     .then(ew.a("gametime").executes($$0x -> c((ev)$$0x.getSource(), (int)(((ev)$$0x.getSource()).e().aa() % 2147483647L)))))
                  .then(ew.a("day").executes($$0x -> c((ev)$$0x.getSource(), (int)(((ev)$$0x.getSource()).e().ab() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(arm $$0) {
      return (int)($$0.ab() % 24000L);
   }

   private static int c(ev $$0, int $$1) {
      $$0.a(() -> xh.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ev $$0, int $$1) {
      for (arm $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xh.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ev $$0, int $$1) {
      for (arm $$2 : $$0.l().L()) {
         $$2.b($$2.ab() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xh.a("commands.time.set", $$3), true);
      return $$3;
   }
}
