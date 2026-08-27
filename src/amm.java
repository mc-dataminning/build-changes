import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class amm {
   public static void a(CommandDispatcher<dv> $$0) {
      LiteralCommandNode<dv> $$1 = $$0.register(
         (LiteralArgumentBuilder)dw.a("msg").then(dw.a("targets", ei.d()).then(dw.a("message", em.a()).executes($$0x -> {
            Collection<apv> $$1x = ei.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               em.a($$0x, "message", $$2 -> a((dv)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dw.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dw.a("w").redirect($$1));
   }

   private static void a(dv $$0, Collection<apv> $$1, wy $$2) {
      we.a $$3 = we.a(we.e, $$0);
      wx $$4 = wx.a($$2);
      boolean $$5 = false;

      for (apv $$6 : $$1) {
         we.a $$7 = we.a(we.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(atr.f);
      }
   }
}
