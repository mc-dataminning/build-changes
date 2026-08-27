import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class agx {
   public static void a(CommandDispatcher<dr> $$0) {
      final LiteralArgumentBuilder<dr> $$1 = (LiteralArgumentBuilder<dr>)ds.a("gamerule").requires($$0x -> $$0x.c(2));
      cph.a(
         new cph.c() {
            @Override
            public <T extends cph.g<T>> void a(cph.e<T> $$0, cph.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)ds.a($$0.a()).executes($$1xxx -> agx.a((dr)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> agx.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cph.g<T>> int a(CommandContext<dr> $$0, cph.e<T> $$1) {
      dr $$2 = (dr)$$0.getSource();
      T $$3 = $$2.l().aI().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> tf.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cph.g<T>> int a(dr $$0, cph.e<T> $$1) {
      T $$2 = $$0.l().aI().a($$1);
      $$0.a(() -> tf.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
