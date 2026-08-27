import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ahk {
   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register(
         (LiteralArgumentBuilder)du.a("msg").then(du.a("targets", ee.d()).then(du.a("message", ei.a()).executes($$0x -> {
            Collection<ako> $$1x = ee.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ei.a($$0x, "message", $$2 -> a((dt)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)du.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)du.a("w").redirect($$1));
   }

   private static void a(dt $$0, Collection<ako> $$1, tx $$2) {
      te.a $$3 = te.a(te.e, $$0);
      tw $$4 = tw.a($$2);
      boolean $$5 = false;

      for (ako $$6 : $$1) {
         te.a $$7 = te.a(te.f, $$0).c($$6.H_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(aoc.f);
      }
   }
}
