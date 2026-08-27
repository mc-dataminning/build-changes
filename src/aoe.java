import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoe {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("say").requires($$0x -> $$0x.c(2))).then(ei.a("message", ey.a()).executes($$0x -> {
         ey.a($$0x, "message", $$1 -> {
            eh $$2 = (eh)$$0x.getSource();
            auq $$3 = $$2.l().ah();
            $$3.a($$1, $$2, xa.a(xa.d, $$2));
         });
         return 1;
      })));
   }
}
