import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class anv {
   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register(
         (LiteralArgumentBuilder)eu.a("msg").then(eu.a("targets", fg.d()).then(eu.a("message", fk.a()).executes($$0x -> {
            Collection<arh> $$1x = fg.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fk.a($$0x, "message", $$2 -> a((et)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)eu.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)eu.a("w").redirect($$1));
   }

   private static void a(et $$0, Collection<arh> $$1, xt $$2) {
      wz.a $$3 = wz.a(wz.g, $$0);
      xs $$4 = xs.a($$2);
      boolean $$5 = false;

      for (arh $$6 : $$1) {
         wz.a $$7 = wz.a(wz.h, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avg.e);
      }
   }
}
