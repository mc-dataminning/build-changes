import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class anj {
   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register(
         (LiteralArgumentBuilder)eu.a("msg").then(eu.a("targets", fg.d()).then(eu.a("message", fk.a()).executes($$0x -> {
            Collection<aqu> $$1x = fg.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fk.a($$0x, "message", $$2 -> a((et)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)eu.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)eu.a("w").redirect($$1));
   }

   private static void a(et $$0, Collection<aqu> $$1, xo $$2) {
      wu.a $$3 = wu.a(wu.g, $$0);
      xn $$4 = xn.a($$2);
      boolean $$5 = false;

      for (aqu $$6 : $$1) {
         wu.a $$7 = wu.a(wu.h, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(auq.e);
      }
   }
}
