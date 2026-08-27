import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ane {
   public static void a(CommandDispatcher<ee> $$0) {
      LiteralCommandNode<ee> $$1 = $$0.register(
         (LiteralArgumentBuilder)ef.a("msg").then(ef.a("targets", er.d()).then(ef.a("message", ev.a()).executes($$0x -> {
            Collection<aqn> $$1x = er.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ev.a($$0x, "message", $$2 -> a((ee)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ef.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ef.a("w").redirect($$1));
   }

   private static void a(ee $$0, Collection<aqn> $$1, xn $$2) {
      wt.a $$3 = wt.a(wt.e, $$0);
      xm $$4 = xm.a($$2);
      boolean $$5 = false;

      for (aqn $$6 : $$1) {
         wt.a $$7 = wt.a(wt.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(auj.f);
      }
   }
}
