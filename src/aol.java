import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aol {
   public static void a(CommandDispatcher<ee> $$0) {
      RequiredArgumentBuilder<ee, gt> $$1 = (RequiredArgumentBuilder<ee, gt>)((RequiredArgumentBuilder)ef.a("targets", er.d())
            .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), null, null)))
         .then(ef.a("*").then(ef.a("sound", ff.a()).suggests(ic.c).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), null, ff.c($$0x, "sound")))));

      for (avj $$2 : avj.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ef.a($$2.a()).executes($$1x -> a((ee)$$1x.getSource(), er.f($$1x, "targets"), $$2, null)))
               .then(ef.a("sound", ff.a()).suggests(ic.c).executes($$1x -> a((ee)$$1x.getSource(), er.f($$1x, "targets"), $$2, ff.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ee $$0, Collection<aqo> $$1, @Nullable avj $$2, @Nullable akn $$3) {
      afn $$4 = new afn($$3, $$2);

      for (aqo $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wx.a("commands.stopsound.success.source.sound", wx.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wx.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wx.a("commands.stopsound.success.sourceless.sound", wx.a($$3)), true);
      } else {
         $$0.a(() -> wx.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
