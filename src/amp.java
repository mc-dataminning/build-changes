import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amp {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avj $$1 = ((eu)$$0x.getSource()).l().ag();
                     return a((eu)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ev.a("ips").executes($$0x -> a((eu)$$0x.getSource(), ((eu)$$0x.getSource()).l().ag().g().d()))))
            .then(ev.a("players").executes($$0x -> a((eu)$$0x.getSource(), ((eu)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(eu $$0, Collection<? extends ave<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.banlist.list", $$1.size()), false);

         for (ave<?> $$2 : $$1) {
            $$0.a(() -> xe.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
