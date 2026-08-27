import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class akq {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("say").requires($$0x -> $$0x.c(2))).then(dt.a("message", ej.a()).executes($$0x -> {
         ej.a($$0x, "message", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            aqu $$3 = $$2.l().ae();
            $$3.a($$1, $$2, vb.a(vb.d, $$2));
         });
         return 1;
      })));
   }
}
