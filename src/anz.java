import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class anz {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ed)$$0x.getSource(), Collections.singleton(((ed)$$0x.getSource()).h()), in.a(((ed)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ee.a("targets", eq.d())
                     .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), in.a(((ed)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ee.a("pos", fz.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), fz.c($$0x, "pos"), 0.0F)))
                        .then(ee.a("angle", ej.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), fz.c($$0x, "pos"), ej.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ed $$0, Collection<aqi> $$1, in $$2, float $$3) {
      akg<dad> $$4 = $$0.e().ae();

      for (aqi $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
