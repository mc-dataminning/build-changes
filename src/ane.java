import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ane {
   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      final LiteralArgumentBuilder<ex> $$2 = (LiteralArgumentBuilder<ex>)ey.a("gamerule").requires($$0x -> $$0x.c(2));
      new dgv($$1.a()).a(new dgv.c() {
         @Override
         public <T extends dgv.g<T>> void a(dgv.e<T> $$0, dgv.f<T> $$1) {
            LiteralArgumentBuilder<ex> $$2 = ey.a($$0.a());
            $$2.then(((LiteralArgumentBuilder)$$2.executes($$1x -> ane.a((ex)$$1x.getSource(), $$0))).then($$1.a("value").executes($$1x -> ane.a($$1x, $$0))));
         }
      });
      $$0.register($$2);
   }

   static <T extends dgv.g<T>> int a(CommandContext<ex> $$0, dgv.e<T> $$1) {
      ex $$2 = (ex)$$0.getSource();
      T $$3 = $$2.l().aL().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wp.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dgv.g<T>> int a(ex $$0, dgv.e<T> $$1) {
      T $$2 = $$0.l().aL().a($$1);
      $$0.a(() -> wp.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
