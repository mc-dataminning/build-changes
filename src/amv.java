import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class amv {
   public static void a(CommandDispatcher<ee> $$0) {
      final LiteralArgumentBuilder<ee> $$1 = (LiteralArgumentBuilder<ee>)ef.a("gamerule").requires($$0x -> $$0x.c(2));
      dav.a(
         new dav.c() {
            @Override
            public <T extends dav.g<T>> void a(dav.e<T> $$0, dav.f<T> $$1x) {
               $$1.then(
                  ((LiteralArgumentBuilder)ef.a($$0.a()).executes($$1xxx -> amv.a((ee)$$1xxx.getSource(), $$0)))
                     .then($$1.a("value").executes($$1xxx -> amv.a($$1xxx, $$0)))
               );
            }
         }
      );
      $$0.register($$1);
   }

   static <T extends dav.g<T>> int a(CommandContext<ee> $$0, dav.e<T> $$1) {
      ee $$2 = (ee)$$0.getSource();
      T $$3 = $$2.l().aM().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> wx.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dav.g<T>> int a(ee $$0, dav.e<T> $$1) {
      T $$2 = $$0.l().aM().a($$1);
      $$0.a(() -> wx.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
