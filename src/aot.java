import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aot {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), Collections.singleton(((ep)$$0x.getSource()).h()), iz.a(((ep)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)eq.a("targets", fc.d())
                     .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), iz.a(((ep)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("pos", gl.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), gl.c($$0x, "pos"), 0.0F)))
                        .then(eq.a("angle", ev.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), gl.c($$0x, "pos"), ev.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ep $$0, Collection<arc> $$1, iz $$2, float $$3) {
      ala<dbt> $$4 = $$0.e().af();

      for (arc $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xl.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
