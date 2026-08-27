import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class anx {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("say").requires($$0x -> $$0x.c(2))).then(ef.a("message", ev.a()).executes($$0x -> {
         ev.a($$0x, "message", $$1 -> {
            ee $$2 = (ee)$$0x.getSource();
            auj $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wt.a(wt.d, $$2));
         });
         return 1;
      })));
   }
}
