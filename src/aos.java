import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aos {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("say").requires($$0x -> $$0x.c(2))).then(ey.a("message", fo.a()).executes($$0x -> {
         fo.a($$0x, "message", $$1 -> {
            ex $$2 = (ex)$$0x.getSource();
            avn $$3 = $$2.l().ag();
            $$3.a($$1, $$2, wr.a(wr.f, $$2));
         });
         return 1;
      })));
   }
}
