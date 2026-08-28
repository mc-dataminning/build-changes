import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aof {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), ImmutableList.of(((ew)$$0x.getSource()).g()))))
            .then(ex.a("targets", fj.b()).executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"))))
      );
   }

   private static int a(ew $$0, Collection<? extends bvb> $$1) {
      for (bvb $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.kill.success.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
