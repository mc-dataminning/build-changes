import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aoh {
   public static void a(CommandDispatcher<eq> $$0) {
      RequiredArgumentBuilder<eq, hf> $$1 = (RequiredArgumentBuilder<eq, hf>)((RequiredArgumentBuilder)er.a("targets", fd.d())
            .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), null, null)))
         .then(er.a("*").then(er.a("sound", fr.a()).suggests(ip.c).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), null, fr.c($$0x, "sound")))));

      for (avi $$2 : avi.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)er.a($$2.a()).executes($$1x -> a((eq)$$1x.getSource(), fd.f($$1x, "targets"), $$2, null)))
               .then(er.a("sound", fr.a()).suggests(ip.c).executes($$1x -> a((eq)$$1x.getSource(), fd.f($$1x, "targets"), $$2, fr.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(eq $$0, Collection<aqn> $$1, @Nullable avi $$2, @Nullable akk $$3) {
      afk $$4 = new afk($$3, $$2);

      for (aqn $$5 : $$1) {
         $$5.c.b($$4);
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
