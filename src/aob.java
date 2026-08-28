import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aob {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("say").requires($$0x -> $$0x.c(2))).then(eu.a("message", fk.a()).executes($$0x -> {
         fk.a($$0x, "message", $$1 -> {
            et $$2 = (et)$$0x.getSource();
            auq $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wu.a(wu.f, $$2));
         });
         return 1;
      })));
   }
}
