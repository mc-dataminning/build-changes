import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class ape {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), Collections.singleton(((ew)$$0x.getSource()).h()), jh.a((ka)((ew)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ex.a("targets", fj.d())
                     .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), jh.a((ka)((ew)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("pos", gs.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), gs.c($$0x, "pos"), 0.0F)))
                        .then(ex.a("angle", fc.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), gs.c($$0x, "pos"), fc.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<arr> $$1, jh $$2, float $$3) {
      alk<dff> $$4 = $$0.e().ag();

      for (arr $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xl.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
