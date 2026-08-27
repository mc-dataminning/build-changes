import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ahh {
   public static void a(CommandDispatcher<dr> $$0) {
      LiteralCommandNode<dr> $$1 = $$0.register(
         (LiteralArgumentBuilder)ds.a("msg").then(ds.a("targets", ec.d()).then(ds.a("message", eg.a()).executes($$0x -> {
            Collection<akl> $$1x = ec.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               eg.a($$0x, "message", $$2 -> a((dr)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ds.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ds.a("w").redirect($$1));
   }

   private static void a(dr $$0, Collection<akl> $$1, tu $$2) {
      tb.a $$3 = tb.a(tb.e, $$0);
      tt $$4 = tt.a($$2);
      boolean $$5 = false;

      for (akl $$6 : $$1) {
         tb.a $$7 = tb.a(tb.f, $$0).c($$6.H_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(anz.f);
      }
   }
}
