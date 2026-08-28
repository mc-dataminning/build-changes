import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apg {
   public static void a(CommandDispatcher<ev> $$0) {
      RequiredArgumentBuilder<ev, hk> $$1 = (RequiredArgumentBuilder<ev, hk>)((RequiredArgumentBuilder)ew.a("targets", fi.d())
            .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), null, null)))
         .then(ew.a("*").then(ew.a("sound", fw.a()).suggests(iv.c).executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), null, fw.c($$0x, "sound")))));

      for (awl $$2 : awl.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ew.a($$2.a()).executes($$1x -> a((ev)$$1x.getSource(), fi.f($$1x, "targets"), $$2, null)))
               .then(ew.a("sound", fw.a()).suggests(iv.c).executes($$1x -> a((ev)$$1x.getSource(), fi.f($$1x, "targets"), $$2, fw.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ev $$0, Collection<arn> $$1, @Nullable awl $$2, @Nullable alh $$3) {
      agd $$4 = new agd($$3, $$2);

      for (arn $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xh.a("commands.stopsound.success.source.sound", xh.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xh.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xh.a("commands.stopsound.success.sourceless.sound", xh.a($$3)), true);
      } else {
         $$0.a(() -> xh.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
