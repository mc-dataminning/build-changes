import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class amz {
   public static void a(CommandDispatcher<et> $$0) {
      final LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("gamerule").requires($$0x -> $$0x.c(2));
      dcq.a(
         new dcq.c() {
            @Override
            public <T extends dcq.g<T>> void a(dcq.e<T> $$0, dcq.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)eu.a($$0.a()).executes($$1xxx -> amz.a((et)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> amz.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dcq.g<T>> int a(CommandContext<et> $$0, dcq.e<T> $$1) {
      et $$2 = (et)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wy.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dcq.g<T>> int a(et $$0, dcq.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> wy.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
