import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aoi {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).g()))))
            .then(el.a("targets", ex.b()).executes($$0x -> a((ek)$$0x.getSource(), ex.b($$0x, "targets"))))
      );
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1) {
      for (bxe $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.kill.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xg.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
