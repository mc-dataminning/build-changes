import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ant {
   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register(
         (LiteralArgumentBuilder)eq.a("msg").then(eq.a("targets", fc.d()).then(eq.a("message", fg.a()).executes($$0x -> {
            Collection<arc> $$1x = fc.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fg.a($$0x, "message", $$2 -> a((ep)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)eq.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)eq.a("w").redirect($$1));
   }

   private static void a(ep $$0, Collection<arc> $$1, yb $$2) {
      xh.a $$3 = xh.a(xh.e, $$0);
      ya $$4 = ya.a($$2);
      boolean $$5 = false;

      for (arc $$6 : $$1) {
         xh.a $$7 = xh.a(xh.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(auz.e);
      }
   }
}
