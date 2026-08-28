import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anc {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     awb $$1 = ((ek)$$0x.getSource()).l().ag();
                     return a((ek)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(el.a("ips").executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).l().ag().g().d()))))
            .then(el.a("players").executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ek $$0, Collection<? extends avw<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xg.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xg.a("commands.banlist.list", $$1.size()), false);

         for (avw<?> $$2 : $$1) {
            $$0.a(() -> xg.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
