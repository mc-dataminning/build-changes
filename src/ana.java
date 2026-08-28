import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ana {
   public static void a(CommandDispatcher<et> $$0) {
      final LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("gamerule").requires($$0x -> $$0x.c(2));
      dcs.a(
         new dcs.c() {
            @Override
            public <T extends dcs.g<T>> void a(dcs.e<T> $$0, dcs.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)eu.a($$0.a()).executes($$1xxx -> ana.a((et)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> ana.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dcs.g<T>> int a(CommandContext<et> $$0, dcs.e<T> $$1) {
      et $$2 = (et)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wz.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dcs.g<T>> int a(et $$0, dcs.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> wz.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
