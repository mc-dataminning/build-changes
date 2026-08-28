import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ams {
   public static void a(CommandDispatcher<eq> $$0) {
      final LiteralArgumentBuilder<eq> $$1 = (LiteralArgumentBuilder<eq>)er.a("gamerule").requires($$0x -> $$0x.c(2));
      dcb.a(
         new dcb.c() {
            @Override
            public <T extends dcb.g<T>> void a(dcb.e<T> $$0, dcb.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)er.a($$0.a()).executes($$1xxx -> ams.a((eq)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> ams.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dcb.g<T>> int a(CommandContext<eq> $$0, dcb.e<T> $$1) {
      eq $$2 = (eq)$$0.getSource();
      T $$3 = $$2.l().aN().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wu.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dcb.g<T>> int a(eq $$0, dcb.e<T> $$1) {
      T $$2 = $$0.l().aN().a($$1);
      $$0.a(() -> wu.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
