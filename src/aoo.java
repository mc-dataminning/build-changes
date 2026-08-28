import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aoo {
   public static void a(CommandDispatcher<et> $$0) {
      RequiredArgumentBuilder<et, hi> $$1 = (RequiredArgumentBuilder<et, hi>)((RequiredArgumentBuilder)eu.a("targets", fg.d())
            .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), null, null)))
         .then(eu.a("*").then(eu.a("sound", fu.a()).suggests(is.c).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), null, fu.c($$0x, "sound")))));

      for (avp $$2 : avp.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)eu.a($$2.a()).executes($$1x -> a((et)$$1x.getSource(), fg.f($$1x, "targets"), $$2, null)))
               .then(eu.a("sound", fu.a()).suggests(is.c).executes($$1x -> a((et)$$1x.getSource(), fg.f($$1x, "targets"), $$2, fu.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(et $$0, Collection<aqu> $$1, @Nullable avp $$2, @Nullable akq $$3) {
      afq $$4 = new afq($$3, $$2);

      for (aqu $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wy.a("commands.stopsound.success.source.sound", wy.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wy.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wy.a("commands.stopsound.success.sourceless.sound", wy.a($$3)), true);
      } else {
         $$0.a(() -> wy.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
