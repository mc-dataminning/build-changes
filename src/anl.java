import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class anl {
   public static void a(CommandDispatcher<eh> $$0) {
      LiteralCommandNode<eh> $$1 = $$0.register(
         (LiteralArgumentBuilder)ei.a("msg").then(ei.a("targets", eu.d()).then(ei.a("message", ey.a()).executes($$0x -> {
            Collection<aqu> $$1x = eu.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ey.a($$0x, "message", $$2 -> a((eh)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ei.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ei.a("w").redirect($$1));
   }

   private static void a(eh $$0, Collection<aqu> $$1, xu $$2) {
      xa.a $$3 = xa.a(xa.e, $$0);
      xt $$4 = xt.a($$2);
      boolean $$5 = false;

      for (aqu $$6 : $$1) {
         xa.a $$7 = xa.a(xa.f, $$0).c($$6.P_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(auq.f);
      }
   }
}
