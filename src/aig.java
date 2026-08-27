import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aig {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dr)$$0x.getSource(), Collections.singleton(((dr)$$0x.getSource()).h()), gu.a(((dr)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", ec.d())
                     .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), gu.a(((dr)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ds.a("pos", fi.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), fi.c($$0x, "pos"), 0.0F)))
                        .then(ds.a("angle", dv.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), fi.c($$0x, "pos"), dv.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<akl> $$1, gu $$2, float $$3) {
      aeq<cpl> $$4 = $$0.e().ac();

      for (akl $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
