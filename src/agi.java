import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class agi {
   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, ga> $$1 = (RequiredArgumentBuilder<ds, ga>)((RequiredArgumentBuilder)dt.a("targets", ec.d())
            .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), null, null)))
         .then(dt.a("*").then(dt.a("sound", eq.a()).suggests(gk.c).executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), null, eq.e($$0x, "sound")))));

      for (ami $$2 : ami.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dt.a($$2.a()).executes($$1x -> a((ds)$$1x.getSource(), ec.f($$1x, "targets"), $$2, null)))
               .then(dt.a("sound", eq.a()).suggests(gk.c).executes($$1x -> a((ds)$$1x.getSource(), ec.f($$1x, "targets"), $$2, eq.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ds $$0, Collection<aig> $$1, @Nullable ami $$2, @Nullable acq $$3) {
      yn $$4 = new yn($$3, $$2);

      for (aig $$5 : $$1) {
         $$5.c.a($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> sw.a("commands.stopsound.success.source.sound", $$3, $$2.a()), true);
         } else {
            $$0.a(() -> sw.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> sw.a("commands.stopsound.success.sourceless.sound", $$3), true);
      } else {
         $$0.a(() -> sw.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
