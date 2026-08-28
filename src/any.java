import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class any {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), ImmutableList.of(((ew)$$0x.getSource()).g()))))
            .then(ex.a("targets", fj.b()).executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"))))
      );
   }

   private static int a(ew $$0, Collection<? extends bue> $$1) {
      for (bue $$2 : $$1) {
         $$2.au();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.kill.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
