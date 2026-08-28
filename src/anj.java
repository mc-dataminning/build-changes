import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anj {
   public static void a(CommandDispatcher<ep> $$0) {
      final LiteralArgumentBuilder<ep> $$1 = (LiteralArgumentBuilder<ep>)eq.a("gamerule").requires($$0x -> $$0x.c(2));
      dbp.a(
         new dbp.c() {
            @Override
            public <T extends dbp.g<T>> void a(dbp.e<T> $$0, dbp.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)eq.a($$0.a()).executes($$1xxx -> anj.a((ep)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> anj.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dbp.g<T>> int a(CommandContext<ep> $$0, dbp.e<T> $$1) {
      ep $$2 = (ep)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xl.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dbp.g<T>> int a(ep $$0, dbp.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> xl.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
