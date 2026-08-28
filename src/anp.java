import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class anp {
   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register(
         (LiteralArgumentBuilder)ey.a("msg").then(ey.a("targets", fk.d()).then(ey.a("message", fo.a()).executes($$0x -> {
            Collection<ard> $$1x = fk.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fo.a($$0x, "message", $$2 -> a((ex)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ey.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ey.a("w").redirect($$1));
   }

   private static void a(ex $$0, Collection<ard> $$1, xe $$2) {
      wk.a $$3 = wk.a(wk.g, $$0);
      xd $$4 = xd.a($$2);
      boolean $$5 = false;

      for (ard $$6 : $$1) {
         wk.a $$7 = wk.a(wk.h, $$0).c($$6.p_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avd.e);
      }
   }
}
