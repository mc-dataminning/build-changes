import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class apd {
   public static void a(CommandDispatcher<eu> $$0) {
      RequiredArgumentBuilder<eu, hj> $$1 = (RequiredArgumentBuilder<eu, hj>)((RequiredArgumentBuilder)ev.a("targets", fh.d())
            .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), null, null)))
         .then(ev.a("*").then(ev.a("sound", fv.a()).suggests(iu.c).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), null, fv.c($$0x, "sound")))));

      for (awh $$2 : awh.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ev.a($$2.a()).executes($$1x -> a((eu)$$1x.getSource(), fh.f($$1x, "targets"), $$2, null)))
               .then(ev.a("sound", fv.a()).suggests(iu.c).executes($$1x -> a((eu)$$1x.getSource(), fh.f($$1x, "targets"), $$2, fv.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(eu $$0, Collection<ark> $$1, @Nullable awh $$2, @Nullable ale $$3) {
      aga $$4 = new aga($$3, $$2);

      for (ark $$5 : $$1) {
         $$5.c.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xe.a("commands.stopsound.success.source.sound", xe.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xe.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xe.a("commands.stopsound.success.sourceless.sound", xe.a($$3)), true);
      } else {
         $$0.a(() -> xe.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
