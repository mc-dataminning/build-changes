import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class alw {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("banlist").requires($$0x -> $$0x.c(3)))
                  .executes($$0x -> {
                     auk $$1 = ((ee)$$0x.getSource()).l().ah();
                     return a((ee)$$0x.getSource(), Lists.newArrayList(Iterables.concat($$1.f().d(), $$1.g().d())));
                  }))
               .then(ef.a("ips").executes($$0x -> a((ee)$$0x.getSource(), ((ee)$$0x.getSource()).l().ah().g().d()))))
            .then(ef.a("players").executes($$0x -> a((ee)$$0x.getSource(), ((ee)$$0x.getSource()).l().ah().f().d())))
      );
   }

   private static int a(ee $$0, Collection<? extends auf<?>> $$1) {
      if ($$1.isEmpty()) {
         $$0.a(() -> wx.c("commands.banlist.none"), false);
      } else {
         $$0.a(() -> wx.a("commands.banlist.list", $$1.size()), false);

         for (auf<?> $$2 : $$1) {
            $$0.a(() -> wx.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
         }
      }

      return $$1.size();
   }
}
