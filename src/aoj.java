import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aoj {
   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      final LiteralArgumentBuilder<ew> $$2 = (LiteralArgumentBuilder<ew>)ex.a("gamerule").requires($$0x -> $$0x.c(2));
      new dhd($$1.a()).a(new dhd.c() {
         @Override
         public <T extends dhd.g<T>> void a(dhd.e<T> $$0, dhd.f<T> $$1) {
            LiteralArgumentBuilder<ew> $$2 = ex.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> aoj.a((ew)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> aoj.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends dhd.g<T>> int a(CommandContext<ew> $$0, dhd.e<T> $$1) {
      ew $$2 = (ew)$$0.getSource();
      T $$3 = $$2.l().aL().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xv.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dhd.g<T>> int a(ew $$0, dhd.e<T> $$1) {
      T $$2 = $$0.l().aL().a($$1);
      $$0.a(() -> xv.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
