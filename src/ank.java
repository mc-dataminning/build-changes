import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ank {
   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register(
         (LiteralArgumentBuilder)eu.a("msg").then(eu.a("targets", fg.d()).then(eu.a("message", fk.a()).executes($$0x -> {
            Collection<aqv> $$1x = fg.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fk.a($$0x, "message", $$2 -> a((et)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)eu.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)eu.a("w").redirect($$1));
   }

   private static void a(et $$0, Collection<aqv> $$1, xp $$2) {
      wv.a $$3 = wv.a(wv.g, $$0);
      xo $$4 = xo.a($$2);
      boolean $$5 = false;

      for (aqv $$6 : $$1) {
         wv.a $$7 = wv.a(wv.h, $$0).c($$6.S_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(aur.e);
      }
   }
}
