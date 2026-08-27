import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anh {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), ImmutableList.of(((eh)$$0x.getSource()).g()))))
            .then(ei.a("targets", eu.b()).executes($$0x -> a((eh)$$0x.getSource(), eu.b($$0x, "targets"))))
      );
   }

   private static int a(eh $$0, Collection<? extends brv> $$1) {
      for (brv $$2 : $$1) {
         $$2.an();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.kill.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
