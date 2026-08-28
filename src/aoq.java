import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("set")
                                    .then(er.a("day").executes($$0x -> a((eq)$$0x.getSource(), 1000))))
                                 .then(er.a("noon").executes($$0x -> a((eq)$$0x.getSource(), 6000))))
                              .then(er.a("night").executes($$0x -> a((eq)$$0x.getSource(), 13000))))
                           .then(er.a("midnight").executes($$0x -> a((eq)$$0x.getSource(), 18000))))
                        .then(er.a("time", gf.a()).executes($$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(er.a("add").then(er.a("time", gf.a()).executes($$0x -> b((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("query")
                        .then(er.a("daytime").executes($$0x -> c((eq)$$0x.getSource(), a(((eq)$$0x.getSource()).e())))))
                     .then(er.a("gametime").executes($$0x -> c((eq)$$0x.getSource(), (int)(((eq)$$0x.getSource()).e().Z() % 2147483647L)))))
                  .then(er.a("day").executes($$0x -> c((eq)$$0x.getSource(), (int)(((eq)$$0x.getSource()).e().aa() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aqk $$0) {
      return (int)($$0.aa() % 24000L);
   }

   private static int c(eq $$0, int $$1) {
      $$0.a(() -> wu.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(eq $$0, int $$1) {
      for (aqk $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> wu.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(eq $$0, int $$1) {
      for (aqk $$2 : $$0.l().K()) {
         $$2.b($$2.aa() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> wu.a("commands.time.set", $$3), true);
      return $$3;
   }
}
