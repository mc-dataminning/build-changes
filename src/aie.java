import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aie {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).h()), gv.a(((ds)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ed.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), gv.a(((ds)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fj.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), fj.c($$0x, "pos"), 0.0F)))
                        .then(dt.a("angle", dw.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), fj.c($$0x, "pos"), dw.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<akj> $$1, gv $$2, float $$3) {
      aeo<cpk> $$4 = $$0.e().ac();

      for (akj $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
