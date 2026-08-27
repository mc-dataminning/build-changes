import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ahy {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("say").requires($$0x -> $$0x.c(2))).then(dt.a("message", eh.a()).executes($$0x -> {
         eh.a($$0x, "message", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            anx $$3 = $$2.l().ac();
            $$3.a($$1, $$2, ta.a(ta.d, $$2));
         });
         return 1;
      })));
   }
}
