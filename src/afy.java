import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class afy {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     anz $$1 = ((dr)$$0x.getSource()).l().ac();
                     return a((dr)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ds.a("ips").executes($$0x -> a((dr)$$0x.getSource(), ((dr)$$0x.getSource()).l().ac().g().d()))))
            .then(ds.a("players").executes($$0x -> a((dr)$$0x.getSource(), ((dr)$$0x.getSource()).l().ac().f().d())))
      );
   }

   private static int a(dr $$0, Collection<? extends anu<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> tf.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> tf.a("commands.banlist.list", $$1.size()), false);

         for (anu<?> $$2 : $$1) {
            $$0.a(() -> tf.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
