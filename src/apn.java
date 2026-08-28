import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class apn {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).h()), iw.a((jq)((ek)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ex.d())
                     .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), iw.a((jq)((ek)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("pos", gh.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), gh.c($$0x, "pos"), 0.0F)))
                        .then(el.a("angle", eq.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), gh.c($$0x, "pos"), eq.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<asc> $$1, iw $$2, float $$3) {
      alq<dkj> $$4 = $$0.e().aj();

      for (asc $$5 : $$1) {
         $$5.a(new asc.a($$4, $$2, $$3, true), false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xg.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
