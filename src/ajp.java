import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ajp {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("say").requires($$0x -> $$0x.c(2))).then(dv.a("message", ek.a()).executes($$0x -> {
         ek.a($$0x, "message", $$1 -> {
            du $$2 = (du)$$0x.getSource();
            apq $$3 = $$2.m().ac();
            $$3.a($$1, $$2, un.a(un.d, $$2));
         });
         return 1;
      })));
   }
}
