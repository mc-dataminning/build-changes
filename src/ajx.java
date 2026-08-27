import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class ajx {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ef.d()).then(dt.a("message", ej.a()).executes($$0x -> {
            Collection<ane> $$1x = ef.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ej.a($$0x, "message", $$2 -> a((ds)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dt.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dt.a("w").redirect($$1));
   }

   private static void a(ds $$0, Collection<ane> $$1, vv $$2) {
      vb.a $$3 = vb.a(vb.e, $$0);
      vu $$4 = vu.a($$2);
      boolean $$5 = false;

      for (ane $$6 : $$1) {
         vb.a $$7 = vb.a(vb.f, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(aqu.f);
      }
   }
}
