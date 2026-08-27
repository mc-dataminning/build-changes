import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aiy {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("set")
                                    .then(du.a("day").executes($$0x -> a((dt)$$0x.getSource(), 1000))))
                                 .then(du.a("noon").executes($$0x -> a((dt)$$0x.getSource(), 6000))))
                              .then(du.a("night").executes($$0x -> a((dt)$$0x.getSource(), 13000))))
                           .then(du.a("midnight").executes($$0x -> a((dt)$$0x.getSource(), 18000))))
                        .then(du.a("time", fd.a()).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(du.a("add").then(du.a("time", fd.a()).executes($$0x -> b((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("query")
                        .then(du.a("daytime").executes($$0x -> c((dt)$$0x.getSource(), a(((dt)$$0x.getSource()).e())))))
                     .then(du.a("gametime").executes($$0x -> c((dt)$$0x.getSource(), (int)(((dt)$$0x.getSource()).e().V() % 2147483647L)))))
                  .then(du.a("day").executes($$0x -> c((dt)$$0x.getSource(), (int)(((dt)$$0x.getSource()).e().W() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(akq $$0) {
      return (int)($$0.W() % 24000L);
   }

   private static int c(dt $$0, int $$1) {
      $$0.a(() -> tl.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(dt $$0, int $$1) {
      for (akq $$2 : $$0.l().F()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> tl.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(dt $$0, int $$1) {
      for (akq $$2 : $$0.l().F()) {
         $$2.b($$2.W() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> tl.a("commands.time.set", $$3), true);
      return $$3;
   }
}
