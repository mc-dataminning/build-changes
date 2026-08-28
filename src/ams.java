import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ams {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     avn $$1 = ((ev)$$0x.getSource()).l().ag();
                     return a((ev)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ew.a("ips").executes($$0x -> a((ev)$$0x.getSource(), ((ev)$$0x.getSource()).l().ag().g().d()))))
            .then(ew.a("players").executes($$0x -> a((ev)$$0x.getSource(), ((ev)$$0x.getSource()).l().ag().f().d())))
      );
   }

   private static int a(ev $$0, Collection<? extends avi<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> xh.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> xh.a("commands.banlist.list", $$1.size()), false);

         for (avi<?> $$2 : $$1) {
            $$0.a(() -> xh.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
