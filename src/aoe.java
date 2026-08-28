import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aoe {
   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register(
         (LiteralArgumentBuilder)ek.a("msg").then(ek.a("targets", ew.d()).then(ek.a("message", fa.a()).executes($$0x -> {
            Collection<art> $$1x = ew.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fa.a($$0x, "message", $$2 -> a((ej)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ek.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ek.a("w").redirect($$1));
   }

   private static void a(ej $$0, Collection<art> $$1, xq $$2) {
      ww.a $$3 = ww.a(ww.g, $$0);
      xp $$4 = xp.a($$2);
      boolean $$5 = false;

      for (art $$6 : $$1) {
         ww.a $$7 = ww.a(ww.h, $$0).c($$6.m_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avs.e);
      }
   }
}
