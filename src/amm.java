import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amm {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avg $$1 = ((et)$$0x.getSource()).l().ag();
                     return a((et)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(eu.a("ips").executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).l().ag().g().d()))))
            .then(eu.a("players").executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(et $$0, Collection<? extends avb<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xd.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xd.a("commands.banlist.list", $$1.size()), false);

         for (avb<?> $$2 : $$1) {
            $$0.a(() -> xd.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
