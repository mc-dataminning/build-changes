import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aoc {
   public static void a(CommandDispatcher<ec> $$0) {
      RequiredArgumentBuilder<ec, gr> $$1 = (RequiredArgumentBuilder<ec, gr>)((RequiredArgumentBuilder)ed.a("targets", ep.d())
            .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), null, null)))
         .then(ed.a("*").then(ed.a("sound", fd.a()).suggests(ia.c).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), null, fd.e($$0x, "sound")))));

      for (ava $$2 : ava.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ed.a($$2.a()).executes($$1x -> a((ec)$$1x.getSource(), ep.f($$1x, "targets"), $$2, null)))
               .then(ed.a("sound", fd.a()).suggests(ia.c).executes($$1x -> a((ec)$$1x.getSource(), ep.f($$1x, "targets"), $$2, fd.e($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(ec $$0, Collection<aqf> $$1, @Nullable ava $$2, @Nullable akf $$3) {
      afg $$4 = new afg($$3, $$2);

      for (aqf $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> ws.a("commands.stopsound.success.source.sound", ws.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> ws.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> ws.a("commands.stopsound.success.sourceless.sound", ws.a($$3)), true);
      } else {
         $$0.a(() -> ws.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
