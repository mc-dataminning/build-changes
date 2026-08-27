import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aim {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)dv.a("msg").then(dv.a("targets", eg.d()).then(dv.a("message", ek.a()).executes($$0x -> {
            Collection<alr> $$1x = eg.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               ek.a($$0x, "message", $$2 -> a((du)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dv.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dv.a("w").redirect($$1));
   }

   private static void a(du $$0, Collection<alr> $$1, uy $$2) {
      ue.a $$3 = ue.a(ue.e, $$0);
      ux $$4 = ux.a($$2);
      boolean $$5 = false;

      for (alr $$6 : $$1) {
         ue.a $$7 = ue.a(ue.f, $$0).c($$6.O_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.i();
      }

      if ($$5) {
         $$0.a(apg.f);
      }
   }
}
