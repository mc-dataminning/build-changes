import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class alm {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("set")
                                    .then(dt.a("day").executes($$0x -> a((ds)$$0x.getSource(), 1000))))
                                 .then(dt.a("noon").executes($$0x -> a((ds)$$0x.getSource(), 6000))))
                              .then(dt.a("night").executes($$0x -> a((ds)$$0x.getSource(), 13000))))
                           .then(dt.a("midnight").executes($$0x -> a((ds)$$0x.getSource(), 18000))))
                        .then(dt.a("time", ff.a()).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(dt.a("add").then(dt.a("time", ff.a()).executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("query")
                        .then(dt.a("daytime").executes($$0x -> c((ds)$$0x.getSource(), a(((ds)$$0x.getSource()).e())))))
                     .then(dt.a("gametime").executes($$0x -> c((ds)$$0x.getSource(), (int)(((ds)$$0x.getSource()).e().X() % 2147483647L)))))
                  .then(dt.a("day").executes($$0x -> c((ds)$$0x.getSource(), (int)(((ds)$$0x.getSource()).e().Y() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(ane $$0) {
      return (int)($$0.Y() % 24000L);
   }

   private static int c(ds $$0, int $$1) {
      $$0.a(() -> vg.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ds $$0, int $$1) {
      for (ane $$2 : $$0.l().H()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> vg.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ds $$0, int $$1) {
      for (ane $$2 : $$0.l().H()) {
         $$2.b($$2.Y() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> vg.a("commands.time.set", $$3), true);
      return $$3;
   }
}
