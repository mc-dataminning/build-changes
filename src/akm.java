import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akm {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("time").requires($$0x -> $$0x.c(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("set")
                                    .then(dv.a("day").executes($$0x -> a((du)$$0x.getSource(), 1000))))
                                 .then(dv.a("noon").executes($$0x -> a((du)$$0x.getSource(), 6000))))
                              .then(dv.a("night").executes($$0x -> a((du)$$0x.getSource(), 13000))))
                           .then(dv.a("midnight").executes($$0x -> a((du)$$0x.getSource(), 18000))))
                        .then(dv.a("time", ff.a()).executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(dv.a("add").then(dv.a("time", ff.a()).executes($$0x -> b((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("query")
                        .then(dv.a("daytime").executes($$0x -> c((du)$$0x.getSource(), a(((du)$$0x.getSource()).f())))))
                     .then(dv.a("gametime").executes($$0x -> c((du)$$0x.getSource(), (int)(((du)$$0x.getSource()).f().W() % 2147483647L)))))
                  .then(dv.a("day").executes($$0x -> c((du)$$0x.getSource(), (int)(((du)$$0x.getSource()).f().X() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(ame $$0) {
      return (int)($$0.X() % 24000L);
   }

   private static int c(du $$0, int $$1) {
      $$0.a(() -> ur.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(du $$0, int $$1) {
      for (ame $$2 : $$0.m().H()) {
         $$2.b((long)$$1);
      }

      $$0.a(() -> ur.a("commands.time.set", $$1), true);
      return a($$0.f());
   }

   public static int b(du $$0, int $$1) {
      for (ame $$2 : $$0.m().H()) {
         $$2.b($$2.X() + (long)$$1);
      }

      int $$3 = a($$0.f());
      $$0.a(() -> ur.a("commands.time.set", $$3), true);
      return $$3;
   }
}
