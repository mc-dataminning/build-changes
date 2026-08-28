import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apk {
   public static void a(CommandDispatcher<ej> $$0) {
      RequiredArgumentBuilder<ej, gz> $$1 = (RequiredArgumentBuilder<ej, gz>)((RequiredArgumentBuilder)ek.a("targets", ew.d())
            .executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), null, null)))
         .then(ek.a("*").then(ek.a("sound", fk.a()).suggests(ik.b).executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), null, fk.a($$0x, "sound")))));

      for (awq $$2 : awq.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ek.a($$2.a()).executes($$1x -> a((ej)$$1x.getSource(), ew.f($$1x, "targets"), $$2, null)))
               .then(ek.a("sound", fk.a()).suggests(ik.b).executes($$1x -> a((ej)$$1x.getSource(), ew.f($$1x, "targets"), $$2, fk.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ej $$0, Collection<art> $$1, @Nullable awq $$2, @Nullable ali $$3) {
      afz $$4 = new afz($$3, $$2);

      for (art $$5 : $$1) {
         $$5.f.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xa.a("commands.stopsound.success.source.sound", xa.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xa.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xa.a("commands.stopsound.success.sourceless.sound", xa.a($$3)), true);
      } else {
         $$0.a(() -> xa.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
