import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class afa {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), ImmutableList.of(((ds)$$0x.getSource()).g()))))
            .then(dt.a("targets", ec.b()).executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"))))
      );
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1) {
      for (bfj $$2 : $$1) {
         $$2.ah();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.kill.success.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
