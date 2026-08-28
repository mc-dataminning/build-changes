import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ant {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), ImmutableList.of(((ep)$$0x.getSource()).g()))))
            .then(eq.a("targets", fc.b()).executes($$0x -> a((ep)$$0x.getSource(), fc.b($$0x, "targets"))))
      );
   }

   private static int a(ep $$0, Collection<? extends bsw> $$1) {
      for (bsw $$2 : $$1) {
         $$2.an();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xp.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
