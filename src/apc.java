import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apc {
   public static void a(CommandDispatcher<ep> $$0) {
      RequiredArgumentBuilder<ep, he> $$1 = (RequiredArgumentBuilder<ep, he>)((RequiredArgumentBuilder)eq.a("targets", fc.d())
            .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), null, null)))
         .then(eq.a("*").then(eq.a("sound", fq.a()).suggests(io.c).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), null, fq.c($$0x, "sound")))));

      for (awa $$2 : awa.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)eq.a($$2.a()).executes($$1x -> a((ep)$$1x.getSource(), fc.f($$1x, "targets"), $$2, null)))
               .then(eq.a("sound", fq.a()).suggests(io.c).executes($$1x -> a((ep)$$1x.getSource(), fc.f($$1x, "targets"), $$2, fq.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ep $$0, Collection<arf> $$1, @Nullable awa $$2, @Nullable ale $$3) {
      age $$4 = new age($$3, $$2);

      for (arf $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xo.a("commands.stopsound.success.source.sound", xo.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xo.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xo.a("commands.stopsound.success.sourceless.sound", xo.a($$3)), true);
      } else {
         $$0.a(() -> xo.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
