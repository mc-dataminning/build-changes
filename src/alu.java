import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class alu {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), ImmutableList.of(((du)$$0x.getSource()).g()))))
            .then(dv.a("targets", eh.b()).executes($$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"))))
      );
   }

   private static int a(du $$0, Collection<? extends bow> $$1) {
      for (bow $$2 : $$1) {
         $$2.al();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
