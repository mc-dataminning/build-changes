import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anu {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eu)$$0x.getSource(), ImmutableList.of(((eu)$$0x.getSource()).g()))))
            .then(ev.a("targets", fh.b()).executes($$0x -> a((eu)$$0x.getSource(), fh.b($$0x, "targets"))))
      );
   }

   private static int a(eu $$0, Collection<? extends btr> $$1) {
      for (btr $$2 : $$1) {
         $$2.ar();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.kill.success.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
