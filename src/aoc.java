import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aoc {
   public static void a(CommandDispatcher<ei> $$0) {
      LiteralCommandNode<ei> $$1 = $$0.register(
         (LiteralArgumentBuilder)ej.a("msg").then(ej.a("targets", ev.d()).then(ej.a("message", ez.a()).executes($$0x -> {
            Collection<arr> $$1x = ev.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ez.a($$0x, "message", $$2 -> a((ei)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ej.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ej.a("w").redirect($$1));
   }

   private static void a(ei $$0, Collection<arr> $$1, xo $$2) {
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
