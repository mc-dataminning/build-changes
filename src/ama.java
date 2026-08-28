import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ama {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     auq $$1 = ((et)$$0x.getSource()).l().ah();
                     return a((et)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(eu.a("ips").executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).l().ah().g().d()))))
            .then(eu.a("players").executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(et $$0, Collection<? extends aul<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.banlist.list", $$1.size()), false);

         for (aul<?> $$2 : $$1) {
            $$0.a(() -> wy.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
