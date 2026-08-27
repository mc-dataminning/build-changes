import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ajk {
   public static void a(CommandDispatcher<ds> $$0) {
      final LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("gamerule").requires($$0x -> $$0x.c(2));
      cte.a(
         new cte.c() {
            @Override
            public <T extends cte.g<T>> void a(cte.e<T> $$0, cte.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dt.a($$0.a()).executes($$1xxx -> ajk.a((ds)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> ajk.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cte.g<T>> int a(CommandContext<ds> $$0, cte.e<T> $$1) {
      ds $$2 = (ds)$$0.getSource();
      T $$3 = $$2.l().aK().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> vd.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cte.g<T>> int a(ds $$0, cte.e<T> $$1) {
      T $$2 = $$0.l().aK().a($$1);
      $$0.a(() -> vd.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
