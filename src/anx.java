import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anx {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ev)$$0x.getSource(), ImmutableList.of(((ev)$$0x.getSource()).g()))))
            .then(ew.a("targets", fi.b()).executes($$0x -> a((ev)$$0x.getSource(), fi.b($$0x, "targets"))))
      );
   }

   private static int a(ev $$0, Collection<? extends btz> $$1) {
      for (btz $$2 : $$1) {
         $$2.at();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.kill.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
