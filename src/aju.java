import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aju {
   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ef.d()).then(dt.a("message", ej.a()).executes($$0x -> {
            Collection<ana> $$1x = ef.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ej.a($$0x, "message", $$2 -> a((ds)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dt.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dt.a("w").redirect($$1));
   }

   private static void a(ds $$0, Collection<ana> $$1, vt $$2) {
      uz.a $$3 = uz.a(uz.e, $$0);
      vs $$4 = vs.a($$2);
      boolean $$5 = false;

      for (ana $$6 : $$1) {
         uz.a $$7 = uz.a(uz.f, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(aqp.f);
      }
   }
}
