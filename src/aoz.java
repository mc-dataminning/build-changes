import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoz {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("set")
                                    .then(ei.a("day").executes($$0x -> a((eh)$$0x.getSource(), 1000))))
                                 .then(ei.a("noon").executes($$0x -> a((eh)$$0x.getSource(), 6000))))
                              .then(ei.a("night").executes($$0x -> a((eh)$$0x.getSource(), 13000))))
                           .then(ei.a("midnight").executes($$0x -> a((eh)$$0x.getSource(), 18000))))
                        .then(ei.a("time", fw.a()).executes($$0x -> a((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ei.a("add").then(ei.a("time", fw.a()).executes($$0x -> b((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("query")
                        .then(ei.a("daytime").executes($$0x -> c((eh)$$0x.getSource(), a(((eh)$$0x.getSource()).e())))))
                     .then(ei.a("gametime").executes($$0x -> c((eh)$$0x.getSource(), (int)(((eh)$$0x.getSource()).e().Z() % 2147483647L)))))
                  .then(ei.a("day").executes($$0x -> c((eh)$$0x.getSource(), (int)(((eh)$$0x.getSource()).e().aa() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aqt $$0) {
      return (int)($$0.aa() % 24000L);
   }

   private static int c(eh $$0, int $$1) {
      $$0.a(() -> xe.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(eh $$0, int $$1) {
      for (aqt $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xe.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(eh $$0, int $$1) {
      for (aqt $$2 : $$0.l().K()) {
         $$2.b($$2.aa() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xe.a("commands.time.set", $$3), true);
      return $$3;
   }
}
