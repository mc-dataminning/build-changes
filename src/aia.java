import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aia {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("say").requires($$0x -> $$0x.c(2))).then(ds.a("message", eg.a()).executes($$0x -> {
         eg.a($$0x, "message", $$1 -> {
            dr $$2 = (dr)$$0x.getSource();
            anz $$3 = $$2.l().ac();
            $$3.a($$1, $$2, tb.a(tb.d, $$2));
         });
         return 1;
      })));
   }
}
