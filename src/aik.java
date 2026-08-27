import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aik {
   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, gb> $$1 = (RequiredArgumentBuilder<ds, gb>)((RequiredArgumentBuilder)dt.a("targets", ed.d())
            .executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), null, null)))
         .then(dt.a("*").then(dt.a("sound", er.a()).suggests(gl.c).executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), null, er.e($$0x, "sound")))));

      for (aov $$2 : aov.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dt.a($$2.a()).executes($$1x -> a((ds)$$1x.getSource(), ed.f($$1x, "targets"), $$2, null)))
               .then(dt.a("sound", er.a()).suggests(gl.c).executes($$1x -> a((ds)$$1x.getSource(), ed.f($$1x, "targets"), $$2, er.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ds $$0, Collection<akj> $$1, @Nullable aov $$2, @Nullable aep $$3) {
      aai $$4 = new aai($$3, $$2);

      for (akj $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> te.a("commands.stopsound.success.source.sound", $$3, $$2.a()), true);
         } else {
            $$0.a(() -> te.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> te.a("commands.stopsound.success.sourceless.sound", $$3), true);
      } else {
         $$0.a(() -> te.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
