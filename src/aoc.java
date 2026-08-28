import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aoc {
   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register(
         (LiteralArgumentBuilder)ek.a("msg").then(ek.a("targets", ew.d()).then(ek.a("message", fa.a()).executes($$0x -> {
            Collection<arr> $$1x = ew.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fa.a($$0x, "message", $$2 -> a((ej)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ek.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ek.a("w").redirect($$1));
   }

   private static void a(ej $$0, Collection<arr> $$1, xo $$2) {
      wu.a $$3 = wu.a(wu.g, $$0);
      xn $$4 = xn.a($$2);
      boolean $$5 = false;

      for (arr $$6 : $$1) {
         wu.a $$7 = wu.a(wu.h, $$0).c($$6.m_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avq.e);
      }
   }
}
