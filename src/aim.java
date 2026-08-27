import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aim {
   public static void a(CommandDispatcher<du> $$0) {
      final LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("gamerule").requires($$0x -> $$0x.c(2));
      cro.a(
         new cro.c() {
            @Override
            public <T extends cro.g<T>> void a(cro.e<T> $$0, cro.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dv.a($$0.a()).executes($$1xxx -> aim.a((du)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> aim.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cro.g<T>> int a(CommandContext<du> $$0, cro.e<T> $$1) {
      du $$2 = (du)$$0.getSource();
      T $$3 = $$2.m().aI().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> ur.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cro.g<T>> int a(du $$0, cro.e<T> $$1) {
      T $$2 = $$0.m().aI().a($$1);
      $$0.a(() -> ur.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
