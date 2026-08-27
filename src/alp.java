import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class alp {
   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)dv.a("msg").then(dv.a("targets", eh.d()).then(dv.a("message", el.a()).executes($$0x -> {
            Collection<aow> $$1x = eh.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               el.a($$0x, "message", $$2 -> a((du)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)dv.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)dv.a("w").redirect($$1));
   }

   private static void a(du $$0, Collection<aow> $$1, wg $$2) {
      vm.a $$3 = vm.a(vm.e, $$0);
      wf $$4 = wf.a($$2);
      boolean $$5 = false;

      for (aow $$6 : $$1) {
         vm.a $$7 = vm.a(vm.f, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(asn.f);
      }
   }
}
