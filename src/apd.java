import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apd {
   public static void a(CommandDispatcher<ep> $$0) {
      RequiredArgumentBuilder<ep, he> $$1 = (RequiredArgumentBuilder<ep, he>)((RequiredArgumentBuilder)eq.a("targets", fc.d())
            .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), null, null)))
         .then(eq.a("*").then(eq.a("sound", fq.a()).suggests(io.c).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), null, fq.c($$0x, "sound")))));

      for (awb $$2 : awb.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)eq.a($$2.a()).executes($$1x -> a((ep)$$1x.getSource(), fc.f($$1x, "targets"), $$2, null)))
               .then(eq.a("sound", fq.a()).suggests(io.c).executes($$1x -> a((ep)$$1x.getSource(), fc.f($$1x, "targets"), $$2, fq.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ep $$0, Collection<arg> $$1, @Nullable awb $$2, @Nullable alf $$3) {
      agf $$4 = new agf($$3, $$2);

      for (arg $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xp.a("commands.stopsound.success.source.sound", xp.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xp.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xp.a("commands.stopsound.success.sourceless.sound", xp.a($$3)), true);
      } else {
         $$0.a(() -> xp.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
