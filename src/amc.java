import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class amc {
   public static void a(CommandDispatcher<dv> $$0) {
      final LiteralArgumentBuilder<dv> $$1 = (LiteralArgumentBuilder<dv>)dw.a("gamerule").requires($$0x -> $$0x.c(2));
      czc.a(
         new czc.c() {
            @Override
            public <T extends czc.g<T>> void a(czc.e<T> $$0, czc.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)dw.a($$0.a()).executes($$1xxx -> amc.a((dv)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> amc.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends czc.g<T>> int a(CommandContext<dv> $$0, czc.e<T> $$1) {
      dv $$2 = (dv)$$0.getSource();
      T $$3 = $$2.l().aN().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wi.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends czc.g<T>> int a(dv $$0, czc.e<T> $$1) {
      T $$2 = $$0.l().aN().a($$1);
      $$0.a(() -> wi.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
