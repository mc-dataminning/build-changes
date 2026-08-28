import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aps {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("set")
                                    .then(ex.a("day").executes($$0x -> a((ew)$$0x.getSource(), 1000))))
                                 .then(ex.a("noon").executes($$0x -> a((ew)$$0x.getSource(), 6000))))
                              .then(ex.a("night").executes($$0x -> a((ew)$$0x.getSource(), 13000))))
                           .then(ex.a("midnight").executes($$0x -> a((ew)$$0x.getSource(), 18000))))
                        .then(ex.a("time", gl.a()).executes($$0x -> a((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(ex.a("add").then(ex.a("time", gl.a()).executes($$0x -> b((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("query")
                        .then(ex.a("daytime").executes($$0x -> c((ew)$$0x.getSource(), a(((ew)$$0x.getSource()).e())))))
                     .then(ex.a("gametime").executes($$0x -> c((ew)$$0x.getSource(), (int)(((ew)$$0x.getSource()).e().aa() % 2147483647L)))))
                  .then(ex.a("day").executes($$0x -> c((ew)$$0x.getSource(), (int)(((ew)$$0x.getSource()).e().ab() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(arq $$0) {
      return (int)($$0.ab() % 24000L);
   }

   private static int c(ew $$0, int $$1) {
      $$0.a(() -> xl.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ew $$0, int $$1) {
      for (arq $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> xl.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ew $$0, int $$1) {
      for (arq $$2 : $$0.l().L()) {
         $$2.b($$2.ab() + (long)$$1);
      }

      int $$3 = a($$0.e());
      $$0.a(() -> xl.a("commands.time.set", $$3), true);
      return $$3;
   }
}
