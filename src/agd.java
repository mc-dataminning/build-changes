import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class agd {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     aog $$1 = ((dt)$$0x.getSource()).l().ac();
                     return a((dt)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(du.a("ips").executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).l().ac().g().d()))))
            .then(du.a("players").executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).l().ac().f().d())))
      );
   }

   private static int a(dt $$0, Collection<? extends aob<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> tl.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> tl.a("commands.banlist.list", $$1.size()), false);

         for (aob<?> $$2 : $$1) {
            $$0.a(() -> tl.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
