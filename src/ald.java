import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class ald {
   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, ge> $$1 = (RequiredArgumentBuilder<ds, ge>)((RequiredArgumentBuilder)dt.a("targets", ef.d())
            .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), null, null)))
         .then(dt.a("*").then(dt.a("sound", et.a()).suggests(hn.c).executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), null, et.e($$0x, "sound")))));

      for (ars $$2 : ars.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dt.a($$2.a()).executes($$1x -> a((ds)$$1x.getSource(), ef.f($$1x, "targets"), $$2, null)))
               .then(dt.a("sound", et.a()).suggests(hn.c).executes($$1x -> a((ds)$$1x.getSource(), ef.f($$1x, "targets"), $$2, et.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ds $$0, Collection<ane> $$1, @Nullable ars $$2, @Nullable ahg $$3) {
      acu $$4 = new acu($$3, $$2);

      for (ane $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> vf.a("commands.stopsound.success.source.sound", vf.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> vf.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> vf.a("commands.stopsound.success.sourceless.sound", vf.a($$3)), true);
      } else {
         $$0.a(() -> vf.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
