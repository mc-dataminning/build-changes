import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class apc {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ei)$$0x.getSource(), Collections.singleton(((ei)$$0x.getSource()).h()), iu.a((jo)((ei)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ej.a("targets", ev.d())
                     .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), iu.a((jo)((ei)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ej.a("pos", gf.a()).executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), gf.c($$0x, "pos"), 0.0F)))
                        .then(ej.a("angle", eo.a()).executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), gf.c($$0x, "pos"), eo.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<arr> $$1, iu $$2, float $$3) {
      alf<dja> $$4 = $$0.e().aj();

      for (arr $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wy.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
