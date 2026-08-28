import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apk {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("set")
                                    .then(eq.a("day").executes($$0x -> a((ep)$$0x.getSource(), 1000))))
                                 .then(eq.a("noon").executes($$0x -> a((ep)$$0x.getSource(), 6000))))
                              .then(eq.a("night").executes($$0x -> a((ep)$$0x.getSource(), 13000))))
                           .then(eq.a("midnight").executes($$0x -> a((ep)$$0x.getSource(), 18000))))
                        .then(eq.a("time", ge.a()).executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(eq.a("add").then(eq.a("time", ge.a()).executes($$0x -> b((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("query")
                        .then(eq.a("daytime").executes($$0x -> c((ep)$$0x.getSource(), a(((ep)$$0x.getSource()).e())))))
                     .then(eq.a("gametime").executes($$0x -> c((ep)$$0x.getSource(), (int)(((ep)$$0x.getSource()).e().Z() % 2147483647L)))))
                  .then(eq.a("day").executes($$0x -> c((ep)$$0x.getSource(), (int)(((ep)$$0x.getSource()).e().aa() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(are $$0) {
      return (int)($$0.aa() % 24000L);
   }

   private static int c(ep $$0, int $$1) {
      $$0.a(() -> xo.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ep $$0, int $$1) {
      for (are $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xo.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ep $$0, int $$1) {
      for (are $$2 : $$0.l().K()) {
         $$2.b($$2.aa() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xo.a("commands.time.set", $$3), true);
      return $$3;
   }
}
