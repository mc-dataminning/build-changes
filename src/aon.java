import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aon {
   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)el.a("msg").then(el.a("targets", ex.d()).then(el.a("message", fb.a()).executes($$0x -> {
            Collection<asc> $$1x = ex.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fb.a($$0x, "message", $$2 -> a((ek)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)el.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)el.a("w").redirect($$1));
   }

   private static void a(ek $$0, Collection<asc> $$1, xw $$2) {
      xc.a $$3 = xc.a(xc.g, $$0);
      xv $$4 = xv.a($$2);
      boolean $$5 = false;

      for (asc $$6 : $$1) {
         xc.a $$7 = xc.a(xc.h, $$0).c($$6.P_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(awb.e);
      }
   }
}
