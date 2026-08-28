import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aoa {
   public static void a(CommandDispatcher<ei> $$0) {
      LiteralCommandNode<ei> $$1 = $$0.register(
         (LiteralArgumentBuilder)ej.a("msg").then(ej.a("targets", ev.d()).then(ej.a("message", ez.a()).executes($$0x -> {
            Collection<arp> $$1x = ev.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ez.a($$0x, "message", $$2 -> a((ei)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ej.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ej.a("w").redirect($$1));
   }

   private static void a(ei $$0, Collection<arp> $$1, xm $$2) {
      ws.a $$3 = ws.a(ws.g, $$0);
      xl $$4 = xl.a($$2);
      boolean $$5 = false;

      for (arp $$6 : $$1) {
         ws.a $$7 = ws.a(ws.h, $$0).c($$6.m_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avo.e);
      }
   }
}
