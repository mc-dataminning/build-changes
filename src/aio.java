import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aio {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     aqu $$1 = ((ds)$$0x.getSource()).l().ae();
                     return a((ds)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(dt.a("ips").executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).l().ae().g().d()))))
            .then(dt.a("players").executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).l().ae().f().d())))
      );
   }

   private static int a(ds $$0, Collection<? extends aqp<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> vf.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> vf.a("commands.banlist.list", $$1.size()), false);

         for (aqp<?> $$2 : $$1) {
            $$0.a(() -> vf.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
