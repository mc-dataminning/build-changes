import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agr {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register((LiteralArgumentBuilder)du.a("me").then(du.a("action", ei.a()).executes($$0x -> {
         ei.a($$0x, "action", $$1 -> {
            dt $$2 = (dt)$$0x.getSource();
            aoc $$3 = $$2.l().ac();
            $$3.a($$1, $$2, te.a(te.i, $$2));
         });
         return 1;
      })));
   }
}
