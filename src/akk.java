import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class akk {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     ass $$1 = ((du)$$0x.getSource()).l().ah();
                     return a((du)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(dv.a("ips").executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).l().ah().g().d()))))
            .then(dv.a("players").executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(du $$0, Collection<? extends asn<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> vs.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> vs.a("commands.banlist.list", $$1.size()), false);

         for (asn<?> $$2 : $$1) {
            $$0.a(() -> vs.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
