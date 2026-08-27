import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ami {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dv)$$0x.getSource(), ImmutableList.of(((dv)$$0x.getSource()).g()))))
            .then(dw.a("targets", ei.b()).executes($$0x -> a((dv)$$0x.getSource(), ei.b($$0x, "targets"))))
      );
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1) {
      for (bqa $$2 : $$1) {
         $$2.al();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
