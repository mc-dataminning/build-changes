import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ajb {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)dt.a("me").then(dt.a("action", ej.a()).executes($$0x -> {
         ej.a($$0x, "action", $$1 -> {
            ds $$2 = (ds)$$0x.getSource();
            aqp $$3 = $$2.l().ae();
            $$3.a($$1, $$2, uz.a(uz.i, $$2));
         });
         return 1;
      })));
   }
}
