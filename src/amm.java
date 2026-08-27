import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class amm {
   public static void a(CommandDispatcher<ec> $$0) {
      final LiteralArgumentBuilder<ec> $$1 = (LiteralArgumentBuilder<ec>)ed.a("gamerule").requires($$0x -> $$0x.c(2));
      czq.a(
         new czq.c() {
            @Override
            public <T extends czq.g<T>> void a(czq.e<T> $$0, czq.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)ed.a($$0.a()).executes($$1xxx -> amm.a((ec)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> amm.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends czq.g<T>> int a(CommandContext<ec> $$0, czq.e<T> $$1) {
      ec $$2 = (ec)$$0.getSource();
      T $$3 = $$2.l().aN().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> ws.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends czq.g<T>> int a(ec $$0, czq.e<T> $$1) {
      T $$2 = $$0.l().aN().a($$1);
      $$0.a(() -> ws.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
