import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aoz {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), Collections.singleton(((ex)$$0x.getSource()).h()), jj.a((kc)((ex)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                     .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), jj.a((kc)((ex)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("pos", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), gu.c($$0x, "pos"), 0.0F)))
                        .then(ey.a("angle", fd.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), gu.c($$0x, "pos"), fd.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<aro> $$1, jj $$2, float $$3) {
      alc<dhp> $$4 = $$0.e().aj();

      for (aro $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wv.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
