import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aok {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("set")
                                    .then(ed.a("day").executes($$0x -> a((ec)$$0x.getSource(), 1000))))
                                 .then(ed.a("noon").executes($$0x -> a((ec)$$0x.getSource(), 6000))))
                              .then(ed.a("night").executes($$0x -> a((ec)$$0x.getSource(), 13000))))
                           .then(ed.a("midnight").executes($$0x -> a((ec)$$0x.getSource(), 18000))))
                        .then(ed.a("time", fq.a()).executes($$0x -> a((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ed.a("add").then(ed.a("time", fq.a()).executes($$0x -> b((ec)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("query")
                        .then(ed.a("daytime").executes($$0x -> c((ec)$$0x.getSource(), a(((ec)$$0x.getSource()).e())))))
                     .then(ed.a("gametime").executes($$0x -> c((ec)$$0x.getSource(), (int)(((ec)$$0x.getSource()).e().Y() % 2147483647L)))))
                  .then(ed.a("day").executes($$0x -> c((ec)$$0x.getSource(), (int)(((ec)$$0x.getSource()).e().Z() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aqe $$0) {
      return (int)($$0.Z() % 24000L);
   }

   private static int c(ec $$0, int $$1) {
      $$0.a(() -> ws.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ec $$0, int $$1) {
      for (aqe $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> ws.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ec $$0, int $$1) {
      for (aqe $$2 : $$0.l().K()) {
         $$2.b($$2.Z() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> ws.a("commands.time.set", $$3), true);
      return $$3;
   }
}
