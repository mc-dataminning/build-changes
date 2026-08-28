import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aoc {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), Collections.singleton(((eq)$$0x.getSource()).h()), ja.a(((eq)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)er.a("targets", fd.d())
                     .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), ja.a(((eq)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)er.a("pos", gm.a()).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), gm.c($$0x, "pos"), 0.0F)))
                        .then(er.a("angle", ew.a()).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), gm.c($$0x, "pos"), ew.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(eq $$0, Collection<aql> $$1, ja $$2, float $$3) {
      akj<dcd> $$4 = $$0.e().af();

      for (aql $$5 : $$1) {
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
