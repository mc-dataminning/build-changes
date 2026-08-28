import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class aob {
   public static void a(CommandDispatcher<ev> $$0) {
      LiteralCommandNode<ev> $$1 = $$0.register(
         (LiteralArgumentBuilder)ew.a("msg").then(ew.a("targets", fi.d()).then(ew.a("message", fm.a()).executes($$0x -> {
            Collection<arn> $$1x = fi.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fm.a($$0x, "message", $$2 -> a((ev)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)ew.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ew.a("w").redirect($$1));
   }

   private static void a(ev $$0, Collection<arn> $$1, xx $$2) {
      xd.a $$3 = xd.a(xd.g, $$0);
      xw $$4 = xw.a($$2);
      boolean $$5 = false;

      for (arn $$6 : $$1) {
         xd.a $$7 = xd.a(xd.h, $$0).c($$6.S_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(avn.e);
      }
   }
}
