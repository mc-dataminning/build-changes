import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class amz {
   public static void a(CommandDispatcher<ed> $$0) {
      LiteralCommandNode<ed> $$1 = $$0.register(
         (LiteralArgumentBuilder)ee.a("msg").then(ee.a("targets", eq.d()).then(ee.a("message", eu.a()).executes($$0x -> {
            Collection<aqi> $$1x = eq.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               eu.a($$0x, "message", $$2 -> a((ed)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ee.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ee.a("w").redirect($$1));
   }

   private static void a(ed $$0, Collection<aqi> $$1, xk $$2) {
      wq.a $$3 = wq.a(wq.e, $$0);
      xj $$4 = xj.a($$2);
      boolean $$5 = false;

      for (aqi $$6 : $$1) {
         wq.a $$7 = wq.a(wq.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(aue.f);
      }
   }
}
