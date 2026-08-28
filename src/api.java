import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class api {
   public static void a(CommandDispatcher<ei> $$0) {
      RequiredArgumentBuilder<ei, gy> $$1 = (RequiredArgumentBuilder<ei, gy>)((RequiredArgumentBuilder)ej.a("targets", ev.d())
            .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), null, null)))
         .then(ej.a("*").then(ej.a("sound", fj.a()).suggests(ij.b).executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), null, fj.a($$0x, "sound")))));

      for (awo $$2 : awo.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ej.a($$2.a()).executes($$1x -> a((ei)$$1x.getSource(), ev.f($$1x, "targets"), $$2, null)))
               .then(ej.a("sound", fj.a()).suggests(ij.b).executes($$1x -> a((ei)$$1x.getSource(), ev.f($$1x, "targets"), $$2, fj.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ei $$0, Collection<arr> $$1, @Nullable awo $$2, @Nullable alg $$3) {
      afx $$4 = new afx($$3, $$2);

      for (arr $$5 : $$1) {
         $$5.f.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wy.a("commands.stopsound.success.source.sound", wy.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wy.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wy.a("commands.stopsound.success.sourceless.sound", wy.a($$3)), true);
      } else {
         $$0.a(() -> wy.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
