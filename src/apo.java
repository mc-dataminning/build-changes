import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apo {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("set")
                                    .then(ej.a("day").executes($$0x -> a((ei)$$0x.getSource(), 1000))))
                                 .then(ej.a("noon").executes($$0x -> a((ei)$$0x.getSource(), 6000))))
                              .then(ej.a("night").executes($$0x -> a((ei)$$0x.getSource(), 13000))))
                           .then(ej.a("midnight").executes($$0x -> a((ei)$$0x.getSource(), 18000))))
                        .then(ej.a("time", fy.a()).executes($$0x -> a((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ej.a("add").then(ej.a("time", fy.a()).executes($$0x -> b((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("query")
                        .then(ej.a("daytime").executes($$0x -> c((ei)$$0x.getSource(), a(((ei)$$0x.getSource()).e())))))
                     .then(ej.a("gametime").executes($$0x -> c((ei)$$0x.getSource(), (int)(((ei)$$0x.getSource()).e().ae() % 2147483647L)))))
                  .then(ej.a("day").executes($$0x -> c((ei)$$0x.getSource(), (int)(((ei)$$0x.getSource()).e().af() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aro $$0) {
      return (int)($$0.af() % 24000L);
   }

   private static int c(ei $$0, int $$1) {
      $$0.a(() -> ww.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ei $$0, int $$1) {
      for (aro $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.l().H();
      $$0.a(() -> ww.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ei $$0, int $$1) {
      for (aro $$2 : $$0.l().L()) {
         $$2.b($$2.af() + (long)$$1);
      }

      $$0.l().H();
      int $$3 = a($$0.e());
      $$0.a(() -> ww.a("commands.time.set", $$3), true);
      return $$3;
   }
}
