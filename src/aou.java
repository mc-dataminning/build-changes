import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aou {
   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register(
         (LiteralArgumentBuilder)ex.a("msg").then(ex.a("targets", fj.d()).then(ex.a("message", fn.a()).executes($$0x -> {
            Collection<asi> $$1x = fj.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fn.a($$0x, "message", $$2 -> a((ew)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ex.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ex.a("w").redirect($$1));
   }

   private static void a(ew $$0, Collection<asi> $$1, yl $$2) {
      xr.a $$3 = xr.a(xr.g, $$0);
      yk $$4 = yk.a($$2);
      boolean $$5 = false;

      for (asi $$6 : $$1) {
         xr.a $$7 = xr.a(xr.h, $$0).c($$6.p_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(awi.e);
      }
   }
}
