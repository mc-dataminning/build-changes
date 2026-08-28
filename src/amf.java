import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amf {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avd $$1 = ((ex)$$0x.getSource()).l().ag();
                     return a((ex)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ey.a("ips").executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).l().ag().g().d()))))
            .then(ey.a("players").executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ex $$0, Collection<? extends auy<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wp.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wp.a("commands.banlist.list", $$1.size()), false);

         for (auy<?> $$2 : $$1) {
            $$0.a(() -> wp.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
