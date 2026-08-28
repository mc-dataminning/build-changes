import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class ape {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ej)$$0x.getSource(), Collections.singleton(((ej)$$0x.getSource()).h()), iv.a((jp)((ej)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ek.a("targets", ew.d())
                     .executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), iv.a((jp)((ej)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ek.a("pos", gg.a()).executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), gg.c($$0x, "pos"), 0.0F)))
                        .then(ek.a("angle", ep.a()).executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), gg.c($$0x, "pos"), ep.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ej $$0, Collection<art> $$1, iv $$2, float $$3) {
      alh<djx> $$4 = $$0.e().aj();

      for (art $$5 : $$1) {
         $$5.a(new art.a($$4, $$2, $$3, true), false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xa.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
