import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anl {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), ImmutableList.of(((ex)$$0x.getSource()).g()))))
            .then(ey.a("targets", fk.b()).executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"))))
      );
   }

   private static int a(ex $$0, Collection<? extends bul> $$1) {
      for (bul $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.kill.success.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> wp.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
