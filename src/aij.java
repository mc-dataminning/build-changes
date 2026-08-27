import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aij {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dt)$$0x.getSource(), Collections.singleton(((dt)$$0x.getSource()).h()), gw.a(((dt)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.d())
                     .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), gw.a(((dt)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)du.a("pos", fk.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), fk.c($$0x, "pos"), 0.0F)))
                        .then(du.a("angle", dx.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), fk.c($$0x, "pos"), dx.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<ako> $$1, gw $$2, float $$3) {
      aet<cpq> $$4 = $$0.e().ac();

      for (ako $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> ti.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> ti.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
