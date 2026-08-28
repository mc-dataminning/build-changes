import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anv {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ei)$$0x.getSource(), ImmutableList.of(((ei)$$0x.getSource()).g()))))
            .then(ej.a("targets", ev.b()).executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"))))
      );
   }

   private static int a(ei $$0, Collection<? extends bwa> $$1) {
      for (bwa $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.kill.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
