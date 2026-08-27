import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class alq {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     aue $$1 = ((ed)$$0x.getSource()).l().ah();
                     return a((ed)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ee.a("ips").executes($$0x -> a((ed)$$0x.getSource(), ((ed)$$0x.getSource()).l().ah().g().d()))))
            .then(ee.a("players").executes($$0x -> a((ed)$$0x.getSource(), ((ed)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(ed $$0, Collection<? extends atz<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wu.a("commands.banlist.list", $$1.size()), false);

         for (atz<?> $$2 : $$1) {
            $$0.a(() -> wu.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
