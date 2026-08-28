import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aov {
   public static void a(CommandDispatcher<ex> $$0) {
      RequiredArgumentBuilder<ex, hm> $$1 = (RequiredArgumentBuilder<ex, hm>)((RequiredArgumentBuilder)ey.a("targets", fk.d())
            .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), null, null)))
         .then(ey.a("*").then(ey.a("sound", fy.a()).suggests(ix.b).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), null, fy.a($$0x, "sound")))));

      for (awa $$2 : awa.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ey.a($$2.a()).executes($$1x -> a((ex)$$1x.getSource(), fk.f($$1x, "targets"), $$2, null)))
               .then(ey.a("sound", fy.a()).suggests(ix.b).executes($$1x -> a((ex)$$1x.getSource(), fk.f($$1x, "targets"), $$2, fy.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ex $$0, Collection<ard> $$1, @Nullable awa $$2, @Nullable aku $$3) {
      afo $$4 = new afo($$3, $$2);

      for (ard $$5 : $$1) {
         $$5.f.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wo.a("commands.stopsound.success.source.sound", wo.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wo.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wo.a("commands.stopsound.success.sourceless.sound", wo.a($$3)), true);
      } else {
         $$0.a(() -> wo.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
