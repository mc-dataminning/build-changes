import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ahd {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     apg $$1 = ((du)$$0x.getSource()).m().ac();
                     return a((du)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(dv.a("ips").executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).m().ac().g().d()))))
            .then(dv.a("players").executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).m().ac().f().d())))
      );
   }

   private static int a(du $$0, Collection<? extends apb<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> ui.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> ui.a("commands.banlist.list", $$1.size()), false);

         for (apb<?> $$2 : $$1) {
            $$0.a(() -> ui.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
