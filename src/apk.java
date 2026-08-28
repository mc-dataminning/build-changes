import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apk {
   public static void a(CommandDispatcher<ew> $$0) {
      RequiredArgumentBuilder<ew, hl> $$1 = (RequiredArgumentBuilder<ew, hl>)((RequiredArgumentBuilder)ex.a("targets", fj.d())
            .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), null, null)))
         .then(ex.a("*").then(ex.a("sound", fx.a()).suggests(iw.c).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), null, fx.c($$0x, "sound")))));

      for (awp $$2 : awp.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ex.a($$2.a()).executes($$1x -> a((ew)$$1x.getSource(), fj.f($$1x, "targets"), $$2, null)))
               .then(ex.a("sound", fx.a()).suggests(iw.c).executes($$1x -> a((ew)$$1x.getSource(), fj.f($$1x, "targets"), $$2, fx.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ew $$0, Collection<arr> $$1, @Nullable awp $$2, @Nullable all $$3) {
      agh $$4 = new agh($$3, $$2);

      for (arr $$5 : $$1) {
         $$5.g.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xl.a("commands.stopsound.success.source.sound", xl.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xl.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xl.a("commands.stopsound.success.sourceless.sound", xl.a($$3)), true);
      } else {
         $$0.a(() -> xl.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
