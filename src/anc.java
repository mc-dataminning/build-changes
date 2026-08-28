import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class anc {
   public static void a(CommandDispatcher<eq> $$0) {
      LiteralCommandNode<eq> $$1 = $$0.register(
         (LiteralArgumentBuilder)er.a("msg").then(er.a("targets", fd.d()).then(er.a("message", fh.a()).executes($$0x -> {
            Collection<aqn> $$1x = fd.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fh.a($$0x, "message", $$2 -> a((eq)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)er.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)er.a("w").redirect($$1));
   }

   private static void a(eq $$0, Collection<aqn> $$1, xk $$2) {
      wq.a $$3 = wq.a(wq.e, $$0);
      xj $$4 = xj.a($$2);
      boolean $$5 = false;

      for (aqn $$6 : $$1) {
         wq.a $$7 = wq.a(wq.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(auj.e);
      }
   }
}
