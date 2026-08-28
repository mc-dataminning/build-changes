import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anq {
   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      final LiteralArgumentBuilder<ei> $$2 = (LiteralArgumentBuilder<ei>)ej.a("gamerule").requires($$0x -> $$0x.c(2));
      new diw($$1.a()).a(new diw.c() {
         @Override
         public <T extends diw.g<T>> void a(diw.e<T> $$0, diw.f<T> $$1) {
            LiteralArgumentBuilder<ei> $$2 = ej.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> anq.a((ei)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> anq.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends diw.g<T>> int a(CommandContext<ei> $$0, diw.e<T> $$1) {
      ei $$2 = (ei)$$0.getSource();
      T $$3 = $$2.l().aL().b($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wy.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends diw.g<T>> int a(ei $$0, diw.e<T> $$1) {
      T $$2 = $$0.l().aL().b($$1);
      $$0.a(() -> wy.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
