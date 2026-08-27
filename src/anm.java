import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class anm {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dv)$$0x.getSource(), Collections.singleton(((dv)$$0x.getSource()).h()), id.a(((dv)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)dw.a("targets", ei.d())
                     .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), id.a(((dv)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)dw.a("pos", fq.a()).executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), fq.c($$0x, "pos"), 0.0F)))
                        .then(dw.a("angle", eb.a()).executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), fq.c($$0x, "pos"), eb.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(dv $$0, Collection<apv> $$1, id $$2, float $$3) {
      aju<czg> $$4 = $$0.e().ae();

      for (apv $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
