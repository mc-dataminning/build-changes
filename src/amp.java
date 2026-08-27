import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class amp {
   public static void a(CommandDispatcher<ed> $$0) {
      final LiteralArgumentBuilder<ed> $$1 = (LiteralArgumentBuilder<ed>)ee.a("gamerule").requires($$0x -> $$0x.c(2));
      czz.a(
         new czz.c() {
            @Override
            public <T extends czz.g<T>> void a(czz.e<T> $$0, czz.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)ee.a($$0.a()).executes($$1xxx -> amp.a((ed)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> amp.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends czz.g<T>> int a(CommandContext<ed> $$0, czz.e<T> $$1) {
      ed $$2 = (ed)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wu.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends czz.g<T>> int a(ed $$0, czz.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> wu.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
