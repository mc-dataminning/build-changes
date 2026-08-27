import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ajw {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("say").requires($$0x -> $$0x.c(2))).then(dv.a("message", ek.a()).executes($$0x -> {
         ek.a($$0x, "message", $$1 -> {
            du $$2 = (du)$$0x.getSource();
            apy $$3 = $$2.l().ae();
            $$3.a($$1, $$2, ur.a(ur.d, $$2));
         });
         return 1;
      })));
   }
}
