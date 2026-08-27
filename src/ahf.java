import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ahf {
   public static void a(CommandDispatcher<dt> $$0) {
      final LiteralArgumentBuilder<dt> $$1 = (LiteralArgumentBuilder<dt>)du.a("gamerule").requires($$0x -> $$0x.c(2));
      cpx.a(
         new cpx.c() {
            @Override
            public <T extends cpx.g<T>> void a(cpx.e<T> $$0, cpx.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)du.a($$0.a()).executes($$1xxx -> ahf.a((dt)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> ahf.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cpx.g<T>> int a(CommandContext<dt> $$0, cpx.e<T> $$1) {
      dt $$2 = (dt)$$0.getSource();
      T $$3 = $$2.l().aI().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> tl.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cpx.g<T>> int a(dt $$0, cpx.e<T> $$1) {
      T $$2 = $$0.l().aI().a($$1);
      $$0.a(() -> tl.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
