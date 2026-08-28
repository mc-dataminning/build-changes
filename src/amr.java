import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class amr {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avq $$1 = ((ei)$$0x.getSource()).l().ag();
                     return a((ei)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ej.a("ips").executes($$0x -> a((ei)$$0x.getSource(), ((ei)$$0x.getSource()).l().ag().g().d()))))
            .then(ej.a("players").executes($$0x -> a((ei)$$0x.getSource(), ((ei)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ei $$0, Collection<? extends avl<?>> $$1) {
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
