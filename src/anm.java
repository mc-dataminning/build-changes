import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anm {
   public static void a(CommandDispatcher<et> $$0) {
      final LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("gamerule").requires($$0x -> $$0x.c(2));
      new dec(cqp.f.a())
         .a(
            new dec.c() {
               @Override
               public <T extends dec.g<T>> void a(dec.e<T> $$0, dec.f<T> $$1x) {
                  LiteralArgumentBuilder<et> $$2 = eu.a($$0.a());
                  if (!$$1.b().b()) {
                     $$2.requires($$1xxx -> $$1.b().a($$1xxx.w()));
                  }

                  $$1.then(
                     ((LiteralArgumentBuilder)$$2.executes($$1xxx -> anm.a((et)$$1xxx.getSource(), $$0)))
                        .then($$1.a("value").executes($$1xxx -> anm.a($$1xxx, $$0)))
                  );
               }
            }
         );
      $$0.register($$1);
   }

   static <T extends dec.g<T>> int a(CommandContext<et> $$0, dec.e<T> $$1) {
      et $$2 = (et)$$0.getSource();
      T $$3 = $$2.l().aL().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xd.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dec.g<T>> int a(et $$0, dec.e<T> $$1) {
      T $$2 = $$0.l().aL().a($$1);
      $$0.a(() -> xd.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
