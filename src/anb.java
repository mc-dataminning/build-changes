import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anb {
   public static void a(CommandDispatcher<eh> $$0) {
      final LiteralArgumentBuilder<eh> $$1 = (LiteralArgumentBuilder<eh>)ei.a("gamerule").requires($$0x -> $$0x.c(2));
      dbw.a(
         new dbw.c() {
            @Override
            public <T extends dbw.g<T>> void a(dbw.e<T> $$0, dbw.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)ei.a($$0.a()).executes($$1xxx -> anb.a((eh)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> anb.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dbw.g<T>> int a(CommandContext<eh> $$0, dbw.e<T> $$1) {
      eh $$2 = (eh)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xe.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dbw.g<T>> int a(eh $$0, dbw.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> xe.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
