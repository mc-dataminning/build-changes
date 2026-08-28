import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amr {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avq $$1 = ((ej)$$0x.getSource()).l().ag();
                     return a((ej)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ek.a("ips").executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).l().ag().g().d()))))
            .then(ek.a("players").executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ej $$0, Collection<? extends avl<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.banlist.list", $$1.size()), false);

         for (avl<?> $$2 : $$1) {
            $$0.a(() -> wy.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
