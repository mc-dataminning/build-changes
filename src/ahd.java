import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ahd {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).g()))))
            .then(ds.a("targets", ec.b()).executes($$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"))))
      );
   }

   private static int a(dr $$0, Collection<? extends bii> $$1) {
      for (bii $$2 : $$1) {
         $$2.aj();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.kill.success.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
