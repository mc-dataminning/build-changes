import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aon {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("set")
                                    .then(ee.a("day").executes($$0x -> a((ed)$$0x.getSource(), 1000))))
                                 .then(ee.a("noon").executes($$0x -> a((ed)$$0x.getSource(), 6000))))
                              .then(ee.a("night").executes($$0x -> a((ed)$$0x.getSource(), 13000))))
                           .then(ee.a("midnight").executes($$0x -> a((ed)$$0x.getSource(), 18000))))
                        .then(ee.a("time", fs.a()).executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ee.a("add").then(ee.a("time", fs.a()).executes($$0x -> b((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("query")
                        .then(ee.a("daytime").executes($$0x -> c((ed)$$0x.getSource(), a(((ed)$$0x.getSource()).e())))))
                     .then(ee.a("gametime").executes($$0x -> c((ed)$$0x.getSource(), (int)(((ed)$$0x.getSource()).e().Y() % 2147483647L)))))
                  .then(ee.a("day").executes($$0x -> c((ed)$$0x.getSource(), (int)(((ed)$$0x.getSource()).e().Z() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aqh $$0) {
      return (int)($$0.Z() % 24000L);
   }

   private static int c(ed $$0, int $$1) {
      $$0.a(() -> wu.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ed $$0, int $$1) {
      for (aqh $$2 : $$0.l().K()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> wu.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ed $$0, int $$1) {
      for (aqh $$2 : $$0.l().K()) {
         $$2.b($$2.Z() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> wu.a("commands.time.set", $$3), true);
      return $$3;
   }
}
