import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apq {
   public static void a(CommandDispatcher<ew> $$0) {
      RequiredArgumentBuilder<ew, hl> $$1 = (RequiredArgumentBuilder<ew, hl>)((RequiredArgumentBuilder)ex.a("targets", fj.d())
            .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), null, null)))
         .then(ex.a("*").then(ex.a("sound", fx.a()).suggests(iw.b).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), null, fx.a($$0x, "sound")))));

      for (aww $$2 : aww.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ex.a($$2.a()).executes($$1x -> a((ew)$$1x.getSource(), fj.f($$1x, "targets"), $$2, null)))
               .then(ex.a("sound", fx.a()).suggests(iw.b).executes($$1x -> a((ew)$$1x.getSource(), fj.f($$1x, "targets"), $$2, fx.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ew $$0, Collection<ary> $$1, @Nullable aww $$2, @Nullable alp $$3) {
      agk $$4 = new agk($$3, $$2);

      for (ary $$5 : $$1) {
         $$5.f.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xk.a("commands.stopsound.success.source.sound", xk.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xk.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xk.a("commands.stopsound.success.sourceless.sound", xk.a($$3)), true);
      } else {
         $$0.a(() -> xk.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
