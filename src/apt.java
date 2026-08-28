import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apt {
   public static void a(CommandDispatcher<ek> $$0) {
      RequiredArgumentBuilder<ek, ha> $$1 = (RequiredArgumentBuilder<ek, ha>)((RequiredArgumentBuilder)el.a("targets", ex.d())
            .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), null, null)))
         .then(el.a("*").then(el.a("sound", fl.a()).suggests(il.b).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), null, fl.a($$0x, "sound")))));

      for (awz $$2 : awz.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)el.a($$2.a()).executes($$1x -> a((ek)$$1x.getSource(), ex.f($$1x, "targets"), $$2, null)))
               .then(el.a("sound", fl.a()).suggests(il.b).executes($$1x -> a((ek)$$1x.getSource(), ex.f($$1x, "targets"), $$2, fl.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ek $$0, Collection<asc> $$1, @Nullable awz $$2, @Nullable alr $$3) {
      agi $$4 = new agi($$3, $$2);

      for (asc $$5 : $$1) {
         $$5.f.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xg.a("commands.stopsound.success.source.sound", xg.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xg.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xg.a("commands.stopsound.success.sourceless.sound", xg.a($$3)), true);
      } else {
         $$0.a(() -> xg.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
