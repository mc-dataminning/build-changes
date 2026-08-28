import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amy {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), ImmutableList.of(((eq)$$0x.getSource()).g()))))
            .then(er.a("targets", fd.b()).executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"))))
      );
   }

   private static int a(eq $$0, Collection<? extends bsg> $$1) {
      for (bsg $$2 : $$1) {
         $$2.ao();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
