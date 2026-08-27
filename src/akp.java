import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class akp {
   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, gc> $$1 = (RequiredArgumentBuilder<ds, gc>)((RequiredArgumentBuilder)dt.a("targets", ee.d())
            .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), null, null)))
         .then(dt.a("*").then(dt.a("sound", es.a()).suggests(hl.c).executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), null, es.e($$0x, "sound")))));

      for (ard $$2 : ard.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dt.a($$2.a()).executes($$1x -> a((ds)$$1x.getSource(), ee.f($$1x, "targets"), $$2, null)))
               .then(dt.a("sound", es.a()).suggests(hl.c).executes($$1x -> a((ds)$$1x.getSource(), ee.f($$1x, "targets"), $$2, es.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ds $$0, Collection<amq> $$1, @Nullable ard $$2, @Nullable agt $$3) {
      ach $$4 = new ach($$3, $$2);

      for (amq $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> vb.a("commands.stopsound.success.source.sound", vb.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> vb.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> vb.a("commands.stopsound.success.sourceless.sound", vb.a($$3)), true);
      } else {
         $$0.a(() -> vb.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
