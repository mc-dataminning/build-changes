import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class any {
   public static void a(CommandDispatcher<eu> $$0) {
      LiteralCommandNode<eu> $$1 = $$0.register(
         (LiteralArgumentBuilder)ev.a("msg").then(ev.a("targets", fh.d()).then(ev.a("message", fl.a()).executes($$0x -> {
            Collection<ark> $$1x = fh.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fl.a($$0x, "message", $$2 -> a((eu)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ev.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ev.a("w").redirect($$1));
   }

   private static void a(eu $$0, Collection<ark> $$1, xu $$2) {
      xa.a $$3 = xa.a(xa.g, $$0);
      xt $$4 = xt.a($$2);
      boolean $$5 = false;

      for (ark $$6 : $$1) {
         xa.a $$7 = xa.a(xa.h, $$0).c($$6.R_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avj.e);
      }
   }
}
