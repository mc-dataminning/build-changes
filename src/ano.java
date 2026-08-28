import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ano {
   public static void a(CommandDispatcher<eu> $$0) {
      final LiteralArgumentBuilder<eu> $$1 = (LiteralArgumentBuilder<eu>)ev.a("gamerule").requires($$0x -> $$0x.c(2));
      new def(cqs.f.a())
         .a(
            new def.c() {
               @Override
               public <T extends def.g<T>> void a(def.e<T> $$0, def.f<T> $$1x) {
                  LiteralArgumentBuilder<eu> $$2 = ev.a($$0.a());
                  if (!$$1.b().b()) {
                     $$2.requires($$1xxx -> $$1.b().a($$1xxx.w()));
                  }

                  $$1.then(
                     ((LiteralArgumentBuilder)$$2.executes($$1xxx -> ano.a((eu)$$1xxx.getSource(), $$0)))
                        .then($$1.a("value").executes($$1xxx -> ano.a($$1xxx, $$0)))
                  );
               }
            }
         );
      $$0.register($$1);
   }

   static <T extends def.g<T>> int a(CommandContext<eu> $$0, def.e<T> $$1) {
      eu $$2 = (eu)$$0.getSource();
      T $$3 = $$2.l().aL().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xe.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends def.g<T>> int a(eu $$0, def.e<T> $$1) {
      T $$2 = $$0.l().aL().a($$1);
      $$0.a(() -> xe.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
