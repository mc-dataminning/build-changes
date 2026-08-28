import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aog {
   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)el.a("msg").then(el.a("targets", ex.d()).then(el.a("message", fb.a()).executes($$0x -> {
            Collection<arv> $$1x = ex.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fb.a($$0x, "message", $$2 -> a((ek)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)el.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)el.a("w").redirect($$1));
   }

   private static void a(ek $$0, Collection<arv> $$1, xs $$2) {
      wy.a $$3 = wy.a(wy.g, $$0);
      xr $$4 = xr.a($$2);
      boolean $$5 = false;

      for (arv $$6 : $$1) {
         wy.a $$7 = wy.a(wy.h, $$0).c($$6.m_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avu.e);
      }
   }
}
