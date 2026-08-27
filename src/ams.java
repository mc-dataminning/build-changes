import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ams {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ec)$$0x.getSource(), ImmutableList.of(((ec)$$0x.getSource()).g()))))
            .then(ed.a("targets", ep.b()).executes($$0x -> a((ec)$$0x.getSource(), ep.b($$0x, "targets"))))
      );
   }

   private static int a(ec $$0, Collection<? extends bql> $$1) {
      for (bql $$2 : $$1) {
         $$2.al();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
