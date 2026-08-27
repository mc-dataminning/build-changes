import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ama {
   public static void a(CommandDispatcher<du> $$0) {
      final LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("gamerule").requires($$0x -> $$0x.c(2));
      cyt.a(
         new cyt.c() {
            @Override
            public <T extends cyt.g<T>> void a(cyt.e<T> $$0, cyt.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dv.a($$0.a()).executes($$1xxx -> ama.a((du)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> ama.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cyt.g<T>> int a(CommandContext<du> $$0, cyt.e<T> $$1) {
      du $$2 = (du)$$0.getSource();
      T $$3 = $$2.l().aN().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wg.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cyt.g<T>> int a(du $$0, cyt.e<T> $$1) {
      T $$2 = $$0.l().aN().a($$1);
      $$0.a(() -> wg.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
