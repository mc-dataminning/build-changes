import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class afw {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("say").requires($$0x -> $$0x.c(2))).then(dt.a("message", eg.a()).executes($$0x -> {
         eg.a($$0x, "message", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            alk $$3 = $$2.l().ac();
            $$3.a($$1, $$2, ss.a(ss.d, $$2));
         });
         return 1;
      })));
   }
}
