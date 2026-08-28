import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anu {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      final LiteralArgumentBuilder<ek> $$2 = (LiteralArgumentBuilder<ek>)el.a("gamerule").requires($$0x -> $$0x.c(2));
      new djv($$1.a()).a(new djv.c() {
         @Override
         public <T extends djv.g<T>> void a(djv.e<T> $$0, djv.f<T> $$1) {
            LiteralArgumentBuilder<ek> $$2 = el.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> anu.a((ek)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> anu.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends djv.g<T>> int a(CommandContext<ek> $$0, djv.e<T> $$1) {
      ek $$2 = (ek)$$0.getSource();
      T $$3 = $$2.l().aL().b($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xc.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends djv.g<T>> int a(ek $$0, djv.e<T> $$1) {
      T $$2 = $$0.l().aL().b($$1);
      $$0.a(() -> xc.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
