import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ald {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     atr $$1 = ((dv)$$0x.getSource()).l().ah();
                     return a((dv)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(dw.a("ips").executes($$0x -> a((dv)$$0x.getSource(), ((dv)$$0x.getSource()).l().ah().g().d()))))
            .then(dw.a("players").executes($$0x -> a((dv)$$0x.getSource(), ((dv)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(dv $$0, Collection<? extends atm<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wi.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wi.a("commands.banlist.list", $$1.size()), false);

         for (atm<?> $$2 : $$1) {
            $$0.a(() -> wi.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
