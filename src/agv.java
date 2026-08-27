import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class agv {
   public static void a(CommandDispatcher<ds> $$0) {
      final LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("gamerule").requires($$0x -> $$0x.c(2));
      cpg.a(
         new cpg.c() {
            @Override
            public <T extends cpg.g<T>> void a(cpg.e<T> $$0, cpg.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dt.a($$0.a()).executes($$1xxx -> agv.a((ds)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> agv.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends cpg.g<T>> int a(CommandContext<ds> $$0, cpg.e<T> $$1) {
      ds $$2 = (ds)$$0.getSource();
      T $$3 = $$2.l().aI().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> te.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends cpg.g<T>> int a(ds $$0, cpg.e<T> $$1) {
      T $$2 = $$0.l().aI().a($$1);
      $$0.a(() -> te.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
