import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class akc {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), Collections.singleton(((du)$$0x.getSource()).h()), hx.a(((du)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.d())
                     .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), hx.a(((du)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("pos", fm.a()).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), fm.c($$0x, "pos"), 0.0F)))
                        .then(dv.a("angle", dz.a()).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), fm.c($$0x, "pos"), dz.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(du $$0, Collection<amj> $$1, hx $$2, float $$3) {
      agl<csf> $$4 = $$0.e().ad();

      for (amj $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
