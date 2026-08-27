import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class anw {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ec)$$0x.getSource(), Collections.singleton(((ec)$$0x.getSource()).h()), im.a(((ec)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ed.a("targets", ep.d())
                     .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), im.a(((ec)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ed.a("pos", fx.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), fx.c($$0x, "pos"), 0.0F)))
                        .then(ed.a("angle", ei.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), fx.c($$0x, "pos"), ei.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ec $$0, Collection<aqf> $$1, im $$2, float $$3) {
      ake<czu> $$4 = $$0.e().ae();

      for (aqf $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
