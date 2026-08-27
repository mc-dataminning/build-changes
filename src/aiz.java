import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aiz {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), ImmutableList.of(((du)$$0x.getSource()).g()))))
            .then(dv.a("targets", eg.b()).executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"))))
      );
   }

   private static int a(du $$0, Collection<? extends bkv> $$1) {
      for (bkv $$2 : $$1) {
         $$2.al();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.kill.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
