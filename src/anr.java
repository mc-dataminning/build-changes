import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anr {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((et)$$0x.getSource(), ImmutableList.of(((et)$$0x.getSource()).g()))))
            .then(eu.a("targets", fg.b()).executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"))))
      );
   }

   private static int a(et $$0, Collection<? extends btj> $$1) {
      for (btj $$2 : $$1) {
         $$2.ar();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.kill.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
