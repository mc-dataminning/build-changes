import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anp {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("say").requires($$0x -> $$0x.c(2))).then(ed.a("message", et.a()).executes($$0x -> {
         et.a($$0x, "message", $$1 -> {
            ec $$2 = (ec)$$0x.getSource();
            aub $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wo.a(wo.d, $$2));
         });
         return 1;
      })));
   }
}
