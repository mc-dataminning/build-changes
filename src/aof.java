import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aof {
   public static void a(CommandDispatcher<ed> $$0) {
      RequiredArgumentBuilder<ed, gs> $$1 = (RequiredArgumentBuilder<ed, gs>)((RequiredArgumentBuilder)ee.a("targets", eq.d())
            .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), null, null)))
         .then(ee.a("*").then(ee.a("sound", fe.a()).suggests(ib.c).executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), null, fe.c($$0x, "sound")))));

      for (avd $$2 : avd.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ee.a($$2.a()).executes($$1x -> a((ed)$$1x.getSource(), eq.f($$1x, "targets"), $$2, null)))
               .then(ee.a("sound", fe.a()).suggests(ib.c).executes($$1x -> a((ed)$$1x.getSource(), eq.f($$1x, "targets"), $$2, fe.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ed $$0, Collection<aqi> $$1, @Nullable avd $$2, @Nullable akh $$3) {
      afi $$4 = new afi($$3, $$2);

      for (aqi $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wu.a("commands.stopsound.success.source.sound", wu.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wu.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wu.a("commands.stopsound.success.sourceless.sound", wu.a($$3)), true);
      } else {
         $$0.a(() -> wu.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
