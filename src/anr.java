import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class anr {
   public static void a(CommandDispatcher<ev> $$0) {
      final LiteralArgumentBuilder<ev> $$1 = (LiteralArgumentBuilder<ev>)ew.a("gamerule").requires($$0x -> $$0x.c(2));
      new der(crc.f.a())
         .a(
            new der.c() {
               @Override
               public <T extends der.g<T>> void a(der.e<T> $$0, der.f<T> $$1x) {
                  LiteralArgumentBuilder<ev> $$2 = ew.a($$0.a());
                  if (!$$1.b().b()) {
                     $$2.requires($$1xxx -> $$1.b().a($$1xxx.w()));
                  }

                  $$1.then(
                     ((LiteralArgumentBuilder)$$2.executes($$1xxx -> anr.a((ev)$$1xxx.getSource(), $$0)))
                        .then($$1.a("value").executes($$1xxx -> anr.a($$1xxx, $$0)))
                  );
               }
            }
         );
      $$0.register($$1);
   }

   static <T extends der.g<T>> int a(CommandContext<ev> $$0, der.e<T> $$1) {
      ev $$2 = (ev)$$0.getSource();
      T $$3 = $$2.l().aL().a($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xh.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends der.g<T>> int a(ev $$0, der.e<T> $$1) {
      T $$2 = $$0.l().aL().a($$1);
      $$0.a(() -> xh.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
