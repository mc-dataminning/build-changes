import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ahn {
   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register(
         (LiteralArgumentBuilder)du.a("msg").then(du.a("targets", ee.d()).then(du.a("message", ei.a()).executes($$0x -> {
            Collection<aks> $$1x = ee.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ei.a($$0x, "message", $$2 -> a((dt)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)du.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)du.a("w").redirect($$1));
   }

   private static void a(dt $$0, Collection<aks> $$1, ua $$2) {
      th.a $$3 = th.a(th.e, $$0);
      tz $$4 = tz.a($$2);
      boolean $$5 = false;

      for (aks $$6 : $$1) {
         th.a $$7 = th.a(th.f, $$0).c($$6.N_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(aoh.f);
      }
   }
}
