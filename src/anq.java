import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anq {
   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      final LiteralArgumentBuilder<ej> $$2 = (LiteralArgumentBuilder<ej>)ek.a("gamerule").requires($$0x -> $$0x.c(2));
      new djd($$1.a()).a(new djd.c() {
         @Override
         public <T extends djd.g<T>> void a(djd.e<T> $$0, djd.f<T> $$1) {
            LiteralArgumentBuilder<ej> $$2 = ek.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> anq.a((ej)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> anq.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends djd.g<T>> int a(CommandContext<ej> $$0, djd.e<T> $$1) {
      ej $$2 = (ej)$$0.getSource();
      T $$3 = $$2.l().aL().b($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wy.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends djd.g<T>> int a(ej $$0, djd.e<T> $$1) {
      T $$2 = $$0.l().aL().b($$1);
      $$0.a(() -> wy.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
