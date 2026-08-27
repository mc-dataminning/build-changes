import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class ajr {
   public static void a(CommandDispatcher<du> $$0) {
      RequiredArgumentBuilder<du, ge> $$1 = (RequiredArgumentBuilder<du, ge>)((RequiredArgumentBuilder)dv.a("targets", eg.d())
            .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), null, null)))
         .then(dv.a("*").then(dv.a("sound", eu.a()).suggests(hj.c).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), null, eu.e($$0x, "sound")))));

      for (aqe $$2 : aqe.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dv.a($$2.a()).executes($$1x -> a((du)$$1x.getSource(), eg.f($$1x, "targets"), $$2, null)))
               .then(dv.a("sound", eu.a()).suggests(hj.c).executes($$1x -> a((du)$$1x.getSource(), eg.f($$1x, "targets"), $$2, eu.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(du $$0, Collection<alr> $$1, @Nullable aqe $$2, @Nullable afw $$3) {
      abn $$4 = new abn($$3, $$2);

      for (alr $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> ui.a("commands.stopsound.success.source.sound", ui.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> ui.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> ui.a("commands.stopsound.success.sourceless.sound", ui.a($$3)), true);
      } else {
         $$0.a(() -> ui.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
