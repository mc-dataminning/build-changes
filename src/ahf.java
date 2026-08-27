import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ahf {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ed.d()).then(dt.a("message", eh.a()).executes($$0x -> {
            Collection<akj> $$1x = ed.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               eh.a($$0x, "message", $$2 -> a((ds)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dt.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dt.a("w").redirect($$1));
   }

   private static void a(ds $$0, Collection<akj> $$1, tt $$2) {
      ta.a $$3 = ta.a(ta.e, $$0);
      ts $$4 = ts.a($$2);
      boolean $$5 = false;

      for (akj $$6 : $$1) {
         ta.a $$7 = ta.a(ta.f, $$0).c($$6.H_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(anx.f);
      }
   }
}
