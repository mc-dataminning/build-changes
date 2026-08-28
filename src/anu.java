import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anu {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("say").requires($$0x -> $$0x.c(2))).then(er.a("message", fh.a()).executes($$0x -> {
         fh.a($$0x, "message", $$1 -> {
            eq $$2 = (eq)$$0x.getSource();
            auj $$3 = $$2.l().ai();
            $$3.a($$1, $$2, wq.a(wq.f, $$2));
         });
         return 1;
      })));
   }
}
