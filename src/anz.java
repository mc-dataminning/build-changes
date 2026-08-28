import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anz {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ej)$$0x.getSource(), ImmutableList.of(((ej)$$0x.getSource()).g()))))
            .then(ek.a("targets", ew.b()).executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"))))
      );
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1) {
      for (bwt $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.kill.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xa.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
