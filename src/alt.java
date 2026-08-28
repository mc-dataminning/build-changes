import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class alt {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     auh $$1 = ((eq)$$0x.getSource()).l().ah();
                     return a((eq)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(er.a("ips").executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).l().ah().g().d()))))
            .then(er.a("players").executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(eq $$0, Collection<? extends auc<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wu.a("commands.banlist.list", $$1.size()), false);

         for (auc<?> $$2 : $$1) {
            $$0.a(() -> wu.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
