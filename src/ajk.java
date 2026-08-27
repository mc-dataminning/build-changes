import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ajk {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ee.d()).then(dt.a("message", ei.a()).executes($$0x -> {
            Collection<amq> $$1x = ee.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ei.a($$0x, "message", $$2 -> a((ds)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dt.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dt.a("w").redirect($$1));
   }

   private static void a(ds $$0, Collection<amq> $$1, vr $$2) {
      ux.a $$3 = ux.a(ux.e, $$0);
      vq $$4 = vq.a($$2);
      boolean $$5 = false;

      for (amq $$6 : $$1) {
         ux.a $$7 = ux.a(ux.f, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(aqf.f);
      }
   }
}
