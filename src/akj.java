import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class akj {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).h()), hv.a(((ds)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ee.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), hv.a(((ds)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fk.a()).executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), fk.c($$0x, "pos"), 0.0F)))
                        .then(dt.a("angle", dx.a()).executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), fk.c($$0x, "pos"), dx.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<amq> $$1, hv $$2, float $$3) {
      ags<csy> $$4 = $$0.e().ad();

      for (amq $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
