import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class ane {
   public static void a(CommandDispatcher<du> $$0) {
      RequiredArgumentBuilder<du, gi> $$1 = (RequiredArgumentBuilder<du, gi>)((RequiredArgumentBuilder)dv.a("targets", eh.d())
            .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), null, null)))
         .then(dv.a("*").then(dv.a("sound", ev.a()).suggests(hr.c).executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), null, ev.e($$0x, "sound")))));

      for (atz $$2 : atz.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dv.a($$2.a()).executes($$1x -> a((du)$$1x.getSource(), eh.f($$1x, "targets"), $$2, null)))
               .then(dv.a("sound", ev.a()).suggests(hr.c).executes($$1x -> a((du)$$1x.getSource(), eh.f($$1x, "targets"), $$2, ev.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(du $$0, Collection<apg> $$1, @Nullable atz $$2, @Nullable ajh $$3) {
      aei $$4 = new aei($$3, $$2);

      for (apg $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> vu.a("commands.stopsound.success.source.sound", vu.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> vu.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> vu.a("commands.stopsound.success.sourceless.sound", vu.a($$3)), true);
      } else {
         $$0.a(() -> vu.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
