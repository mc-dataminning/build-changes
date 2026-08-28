import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ans {
   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      final LiteralArgumentBuilder<ej> $$2 = (LiteralArgumentBuilder<ej>)ek.a("gamerule").requires($$0x -> $$0x.c(2));
      new djt($$1.a()).a(new djt.c() {
         @Override
         public <T extends djt.g<T>> void a(djt.e<T> $$0, djt.f<T> $$1) {
            LiteralArgumentBuilder<ej> $$2 = ek.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> ans.a((ej)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> ans.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends djt.g<T>> int a(CommandContext<ej> $$0, djt.e<T> $$1) {
      ej $$2 = (ej)$$0.getSource();
      T $$3 = $$2.l().aL().b($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xa.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends djt.g<T>> int a(ej $$0, djt.e<T> $$1) {
      T $$2 = $$0.l().aL().b($$1);
      $$0.a(() -> xa.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
