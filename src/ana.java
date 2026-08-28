import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ana {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avy $$1 = ((ew)$$0x.getSource()).l().ag();
                     return a((ew)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ex.a("ips").executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).l().ag().g().d()))))
            .then(ex.a("players").executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ew $$0, Collection<? extends avt<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xk.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xk.a("commands.banlist.list", $$1.size()), false);

         for (avt<?> $$2 : $$1) {
            $$0.a(() -> xk.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
