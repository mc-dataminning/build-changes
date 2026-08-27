import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amv {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ed)$$0x.getSource(), ImmutableList.of(((ed)$$0x.getSource()).g()))))
            .then(ee.a("targets", eq.b()).executes($$0x -> a((ed)$$0x.getSource(), eq.b($$0x, "targets"))))
      );
   }

   private static int a(ed $$0, Collection<? extends brh> $$1) {
      for (brh $$2 : $$1) {
         $$2.al();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
