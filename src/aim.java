import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aim {
   public static void a(CommandDispatcher<dr> $$0) {
      RequiredArgumentBuilder<dr, ga> $$1 = (RequiredArgumentBuilder<dr, ga>)((RequiredArgumentBuilder)ds.a("targets", ec.d())
            .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), null, null)))
         .then(ds.a("*").then(ds.a("sound", eq.a()).suggests(gk.c).executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), null, eq.e($$0x, "sound")))));

      for (aox $$2 : aox.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ds.a($$2.a()).executes($$1x -> a((dr)$$1x.getSource(), ec.f($$1x, "targets"), $$2, null)))
               .then(ds.a("sound", eq.a()).suggests(gk.c).executes($$1x -> a((dr)$$1x.getSource(), ec.f($$1x, "targets"), $$2, eq.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(dr $$0, Collection<akl> $$1, @Nullable aox $$2, @Nullable aer $$3) {
      aaj $$4 = new aaj($$3, $$2);

      for (akl $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> tf.a("commands.stopsound.success.source.sound", $$3, $$2.a()), true);
         } else {
            $$0.a(() -> tf.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> tf.a("commands.stopsound.success.sourceless.sound", $$3), true);
      } else {
         $$0.a(() -> tf.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
