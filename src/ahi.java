import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ahi {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dt)$$0x.getSource(), ImmutableList.of(((dt)$$0x.getSource()).g()))))
            .then(du.a("targets", ee.b()).executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"))))
      );
   }

   private static int a(dt $$0, Collection<? extends biq> $$1) {
      for (biq $$2 : $$1) {
         $$2.aj();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.kill.success.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
