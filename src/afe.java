import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class afe {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ec.d()).then(dt.a("message", eg.a()).executes($$0x -> {
            Collection<aig> $$1x = ec.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               eg.a($$0x, "message", $$2 -> a((ds)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dt.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dt.a("w").redirect($$1));
   }

   private static void a(ds $$0, Collection<aig> $$1, tl $$2) {
      ss.a $$3 = ss.a(ss.e, $$0);
      tk $$4 = tk.a($$2);
      boolean $$5 = false;

      for (aig $$6 : $$1) {
         ss.a $$7 = ss.a(ss.f, $$0).c($$6.H_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(alk.f);
      }
   }
}
