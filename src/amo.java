import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amo {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avd $$1 = ((ep)$$0x.getSource()).l().ah();
                     return a((ep)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(eq.a("ips").executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).l().ah().g().d()))))
            .then(eq.a("players").executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(ep $$0, Collection<? extends auy<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xp.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xp.a("commands.banlist.list", $$1.size()), false);

         for (auy<?> $$2 : $$1) {
            $$0.a(() -> xp.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
