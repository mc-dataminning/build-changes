import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aja {
   public static void a(CommandDispatcher<ds> $$0) {
      final LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("gamerule").requires($$0x -> $$0x.c(2));
      csu.a(
         new csu.c() {
            @Override
            public <T extends csu.g<T>> void a(csu.e<T> $$0, csu.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dt.a($$0.a()).executes($$1xxx -> aja.a((ds)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> aja.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends csu.g<T>> int a(CommandContext<ds> $$0, csu.e<T> $$1) {
      ds $$2 = (ds)$$0.getSource();
      T $$3 = $$2.l().aK().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> vb.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends csu.g<T>> int a(ds $$0, csu.e<T> $$1) {
      T $$2 = $$0.l().aK().a($$1);
      $$0.a(() -> vb.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
