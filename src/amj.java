import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class amj {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register((LiteralArgumentBuilder)er.a("me").then(er.a("action", fh.a()).executes($$0x -> {
         fh.a($$0x, "action", $$1 -> {
            eq $$2 = (eq)$$0x.getSource();
            auh $$3 = $$2.l().ah();
            $$3.a($$1, $$2, wq.a(wq.i, $$2));
         });
         return 1;
      })));
   }
}
