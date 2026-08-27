import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class ais {
   public static void a(CommandDispatcher<dt> $$0) {
      RequiredArgumentBuilder<dt, gc> $$1 = (RequiredArgumentBuilder<dt, gc>)((RequiredArgumentBuilder)du.a("targets", ee.d())
            .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), null, null)))
         .then(du.a("*").then(du.a("sound", es.a()).suggests(gm.c).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), null, es.e($$0x, "sound")))));

      for (apf $$2 : apf.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)du.a($$2.a()).executes($$1x -> a((dt)$$1x.getSource(), ee.f($$1x, "targets"), $$2, null)))
               .then(du.a("sound", es.a()).suggests(gm.c).executes($$1x -> a((dt)$$1x.getSource(), ee.f($$1x, "targets"), $$2, es.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(dt $$0, Collection<aks> $$1, @Nullable apf $$2, @Nullable aex $$3) {
      aaq $$4 = new aaq($$3, $$2);

      for (aks $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> tl.a("commands.stopsound.success.source.sound", $$3, $$2.a()), true);
         } else {
            $$0.a(() -> tl.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> tl.a("commands.stopsound.success.sourceless.sound", $$3), true);
      } else {
         $$0.a(() -> tl.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
