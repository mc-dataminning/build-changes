import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoq {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("say").requires($$0x -> $$0x.c(2))).then(ev.a("message", fl.a()).executes($$0x -> {
         fl.a($$0x, "message", $$1 -> {
            eu $$2 = (eu)$$0x.getSource();
            avj $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xa.a(xa.f, $$2));
         });
         return 1;
      })));
   }
}
