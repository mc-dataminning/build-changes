import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aoq {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), Collections.singleton(((ex)$$0x.getSource()).h()), ji.a((kb)((ex)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                     .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), ji.a((kb)((ex)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("pos", gt.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), gt.c($$0x, "pos"), 0.0F)))
                        .then(ey.a("angle", fd.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), gt.c($$0x, "pos"), fd.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<are> $$1, ji $$2, float $$3) {
      aku<dgh> $$4 = $$0.e().ai();

      for (are $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> wp.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
