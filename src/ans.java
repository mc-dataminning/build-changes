import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class ans {
   public static void a(CommandDispatcher<dv> $$0) {
      RequiredArgumentBuilder<dv, gk> $$1 = (RequiredArgumentBuilder<dv, gk>)((RequiredArgumentBuilder)dw.a("targets", ei.d())
            .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), null, null)))
         .then(dw.a("*").then(dw.a("sound", ew.a()).suggests(ht.c).executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), null, ew.e($$0x, "sound")))));

      for (aup $$2 : aup.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)dw.a($$2.a()).executes($$1x -> a((dv)$$1x.getSource(), ei.f($$1x, "targets"), $$2, null)))
               .then(dw.a("sound", ew.a()).suggests(ht.c).executes($$1x -> a((dv)$$1x.getSource(), ei.f($$1x, "targets"), $$2, ew.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(dv $$0, Collection<apv> $$1, @Nullable aup $$2, @Nullable ajv $$3) {
      aew $$4 = new aew($$3, $$2);

      for (apv $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> wi.a("commands.stopsound.success.source.sound", wi.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> wi.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> wi.a("commands.stopsound.success.sourceless.sound", wi.a($$3)), true);
      } else {
         $$0.a(() -> wi.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
