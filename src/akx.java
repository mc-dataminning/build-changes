import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class akx {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).h()), hx.a(((ds)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ef.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), hx.a(((ds)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fm.a()).executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), fm.c($$0x, "pos"), 0.0F)))
                        .then(dt.a("angle", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), fm.c($$0x, "pos"), dy.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<ane> $$1, hx $$2, float $$3) {
      ahf<cto> $$4 = $$0.e().ae();

      for (ane $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
