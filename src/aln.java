import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aln {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     aub $$1 = ((ec)$$0x.getSource()).l().ah();
                     return a((ec)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ed.a("ips").executes($$0x -> a((ec)$$0x.getSource(), ((ec)$$0x.getSource()).l().ah().g().d()))))
            .then(ed.a("players").executes($$0x -> a((ec)$$0x.getSource(), ((ec)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(ec $$0, Collection<? extends atw<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> ws.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> ws.a("commands.banlist.list", $$1.size()), false);

         for (atw<?> $$2 : $$1) {
            $$0.a(() -> ws.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
