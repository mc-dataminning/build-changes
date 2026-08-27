import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aof {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), Collections.singleton(((ee)$$0x.getSource()).h()), io.a(((ee)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ef.a("targets", er.d())
                     .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), io.a(((ee)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ef.a("pos", ga.a()).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), ga.c($$0x, "pos"), 0.0F)))
                        .then(ef.a("angle", ek.a()).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), ga.c($$0x, "pos"), ek.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ee $$0, Collection<aqo> $$1, io $$2, float $$3) {
      akm<daz> $$4 = $$0.e().ae();

      for (aqo $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
