import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aov {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((et)$$0x.getSource(), Collections.singleton(((et)$$0x.getSource()).h()), je.a((jx)((et)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)eu.a("targets", fg.d())
                     .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), je.a((jx)((et)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("pos", gp.a()).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), gp.c($$0x, "pos"), 0.0F)))
                        .then(eu.a("angle", ez.a()).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), gp.c($$0x, "pos"), ez.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(et $$0, Collection<ari> $$1, je $$2, float $$3) {
      alb<deg> $$4 = $$0.e().ag();

      for (ari $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
