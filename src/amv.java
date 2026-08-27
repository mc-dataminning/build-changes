import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class amv {
   public static void a(CommandDispatcher<du> $$0) {
      RequiredArgumentBuilder<du, gg> $$1 = (RequiredArgumentBuilder<du, gg>)((RequiredArgumentBuilder)dv.a("targets", eh.d())
            .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), null, null)))
         .then(dv.a("*").then(dv.a("sound", ev.a()).suggests(hp.c).executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), null, ev.e($$0x, "sound")))));

      for (atl $$2 : atl.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dv.a($$2.a()).executes($$1x -> a((du)$$1x.getSource(), eh.f($$1x, "targets"), $$2, null)))
               .then(dv.a("sound", ev.a()).suggests(hp.c).executes($$1x -> a((du)$$1x.getSource(), eh.f($$1x, "targets"), $$2, ev.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(du $$0, Collection<aow> $$1, @Nullable atl $$2, @Nullable aiy $$3) {
      aeb $$4 = new aeb($$3, $$2);

      for (aow $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> vq.a("commands.stopsound.success.source.sound", vq.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> vq.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> vq.a("commands.stopsound.success.sourceless.sound", vq.a($$3)), true);
      } else {
         $$0.a(() -> vq.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
