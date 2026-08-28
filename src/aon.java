import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aon {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("say").requires($$0x -> $$0x.c(2))).then(eu.a("message", fk.a()).executes($$0x -> {
         fk.a($$0x, "message", $$1 -> {
            et $$2 = (et)$$0x.getSource();
            avg $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wz.a(wz.f, $$2));
         });
         return 1;
      })));
   }
}
