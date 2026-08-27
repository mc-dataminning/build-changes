import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class amw {
   public static void a(CommandDispatcher<ec> $$0) {
      LiteralCommandNode<ec> $$1 = $$0.register(
         (LiteralArgumentBuilder)ed.a("msg").then(ed.a("targets", ep.d()).then(ed.a("message", et.a()).executes($$0x -> {
            Collection<aqf> $$1x = ep.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               et.a($$0x, "message", $$2 -> a((ec)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ed.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ed.a("w").redirect($$1));
   }

   private static void a(ec $$0, Collection<aqf> $$1, xi $$2) {
      wo.a $$3 = wo.a(wo.e, $$0);
      xh $$4 = xh.a($$2);
      boolean $$5 = false;

      for (aqf $$6 : $$1) {
         wo.a $$7 = wo.a(wo.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(aub.f);
      }
   }
}
