import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aly {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)dv.a("msg").then(dv.a("targets", eh.d()).then(dv.a("message", el.a()).executes($$0x -> {
            Collection<apg> $$1x = eh.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               el.a($$0x, "message", $$2 -> a((du)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dv.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dv.a("w").redirect($$1));
   }

   private static void a(du $$0, Collection<apg> $$1, wk $$2) {
      vq.a $$3 = vq.a(vq.e, $$0);
      wj $$4 = wj.a($$2);
      boolean $$5 = false;

      for (apg $$6 : $$1) {
         vq.a $$7 = vq.a(vq.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(atb.f);
      }
   }
}
